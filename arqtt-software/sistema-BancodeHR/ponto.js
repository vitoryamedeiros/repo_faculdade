// Função para obter a diferença em horas entre dois horários
function calcularHoras(dataInicio, dataFim) {
    const diff = new Date(`1970-01-01T${dataFim}:00`) - new Date(`1970-01-01T${dataInicio}:00`);
    return diff / (1000 * 60 * 60); // Convertendo milissegundos para horas
}

// Função para calcular horas diárias (de entrada, almoço e saída)
function calcularHorasDiarias(entrada, idaAlmoço, voltaAlmoço, saída) {
    const horasManha = calcularHoras(entrada, idaAlmoço);
    const horasTarde = calcularHoras(voltaAlmoço, saída);
    return horasManha + horasTarde;
}

function calcularHorasSemanal() {
    const dias = ['Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta'];
    const horasNormais = 8;
    const limiteHorasExtras = 20;

    let totalHorasExtras = 0;

    for (const dia of dias) {
        const entrada = document.getElementById(`entrada${dia}`).value;
        const idaAlmoço = document.getElementById(`idaAlmoço${dia}`).value;
        const voltaAlmoço = document.getElementById(`voltaAlmoço${dia}`).value;
        const saída = document.getElementById(`saída${dia}`).value;

        // Verifica se os campos estão preenchidos antes de calcular
        if (entrada && idaAlmoço && voltaAlmoço && saída) {
            const horasTrabalhadas = calcularHorasDiarias(entrada, idaAlmoço, voltaAlmoço, saída);
            const horasExtras = horasTrabalhadas > horasNormais ? horasTrabalhadas - horasNormais : 0;
            totalHorasExtras += horasExtras;
        }
    }

    let resultado = `Total de Horas Extras na Semana: ${totalHorasExtras.toFixed(2)} horas.`;

    // Exibe alerta se ultrapassar o limite de horas extras
    if (totalHorasExtras > limiteHorasExtras) {
        alert("Você ultrapassou o limite de 20 horas extras na semana.");
    }

    document.getElementById('resultado').textContent = resultado;
}
