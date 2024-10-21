document.addEventListener('DOMContentLoaded', function() {
    const clientesList = document.getElementById('clientes-list');
    const filaAtendimentoList = document.getElementById('fila-atendimento-list');

    let clientes = [];
    let filaAtendimento = [];

    // Função para carregar dados dos clientes na tabela
    function loadClientes() {
        clientesList.innerHTML = '';
        clientes.forEach(cliente => {
            const tr = document.createElement('tr');
            tr.innerHTML = `
                <td>${cliente.cliente_id}</td>
                <td>${cliente.nome}</td>
                <td>${cliente.cpf}</td>
                <td>${cliente.prioridade === '1' ? 'Prioritário' : 'Normal'}</td>
            `;
            clientesList.appendChild(tr);
        });
    }

    // Função para carregar a fila de atendimento
    function loadFilaAtendimento() {
        filaAtendimentoList.innerHTML = '';
        filaAtendimento.forEach(filaItem => {
            const tr = document.createElement('tr');
            tr.innerHTML = `
                <td>${filaItem.senha_id}</td>
                <td>${filaItem.cliente_nome}</td>
                <td>${filaItem.prioridade === '1' ? 'Prioritário' : 'Normal'}</td>
                <td>${filaItem.chamada ? 'Chamada' : 'Aguardando'}</td>
            `;
            filaAtendimentoList.appendChild(tr);
        });
    }

    // Função para adicionar cliente na fila
    function addToFila(cliente) {
        const senha_id = filaAtendimento.length + 1;  // Gerar um ID único para a senha
        const clienteFila = {
            senha_id: senha_id,
            cliente_id: cliente.cliente_id,
            cliente_nome: cliente.nome,
            prioridade: cliente.prioridade,
            chamada: false
        };

        filaAtendimento.push(clienteFila);  // Adiciona o cliente à fila
        filaAtendimento.sort((a, b) => b.prioridade - a.prioridade);  // Ordena a fila pela prioridade
        loadFilaAtendimento();  // Atualiza a visualização da fila
    }

    // Função para cadastrar um novo cliente
    const formCliente = document.getElementById('form-cliente');
    formCliente.addEventListener('submit', function(e) {
        e.preventDefault();

        const nome = document.getElementById('nome').value;
        const cpf = document.getElementById('cpf').value;
        const dataNascimento = document.getElementById('data_nascimento').value;
        const prioridade = document.getElementById('prioridade').value;

        const cliente_id = clientes.length + 1;  // Gerar ID único para o cliente

        const cliente = {
            cliente_id: cliente_id,
            nome: nome,
            cpf: cpf,
            data_nascimento: dataNascimento,
            prioridade: prioridade,
        };

        clientes.push(cliente);  // Adiciona o cliente à lista de clientes
        loadClientes();  // Atualiza a lista de clientes

        addToFila(cliente);  // Adiciona o cliente à fila de atendimento
    });

    // Função para chamar a senha
    const formSenha = document.getElementById('form-senha');
    formSenha.addEventListener('submit', function(e) {
        e.preventDefault();

        const senhaId = document.getElementById('senha-id').value;

        // Encontrar o cliente na fila com a senha
        const clienteFila = filaAtendimento.find(filaItem => filaItem.senha_id === parseInt(senhaId));

        if (clienteFila) {
            clienteFila.chamada = true;  // Marca a senha como chamada
            loadFilaAtendimento();  // Atualiza a visualização da fila
            console.log(`Senha ${senhaId} chamada para atendimento.`);
        } else {
            console.log('Senha não encontrada na fila.');
        }
    });

    // Carregar os dados iniciais (se necessário)
    loadClientes();
    loadFilaAtendimento();
});
