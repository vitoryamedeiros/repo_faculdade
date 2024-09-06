function calcularHoras(dataInicio, dataFim) {
    const diff = new Date(dataFim) - new Date(dataInicio);
    return diff / (1000 * 60 * 60); // Convertendo milissegundos para horas
}

function calcularHorasDiarias(entrada, idaAlmoço, voltaAlmoço, saída) {
    const [entradaHora, entradaMinuto] = entrada.split(':').map(Number);
    const [idaHora, idaMinuto] = idaAlmoço.split(':').map(Number);
    const [voltaHora, voltaMinuto] = voltaAlmoço.split(':').map(Number);
    const [saidaHora, saídaMinuto] = saída.split(':').map(Number);

    const dataEntrada = new Date();
    dataEntrada.setHours(entradaHora, entradaMinuto, 0);

    const dataIdaAlmoço = new Date();
    dataIdaAlmoço.setHours(idaHora, idaMinuto, 0);

    const dataVoltaAlmoço = new Date();
    dataVoltaAlmoço.setHours(voltaHora, voltaMinuto, 0);

    const dataSaída = new Date();
    dataSaída.setHours(saidaHora, saídaMinuto, 0);

    const totalHorasTrabalhadas = 
        calcularHoras(dataEntrada, dataIdaAlmoço) +
        calcularHoras(dataVoltaAlmoço, dataSaída);

    return totalHorasTrabalhadas;
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

        if (entrada && idaAlmoço && voltaAlmoço && saída) {
            const horasTrabalhadas = calcularHorasDiarias(entrada, idaAlmoço, voltaAlmoço, saída);
            const horasExtras = horasTrabalhadas > horasNormais ? horasTrabalhadas - horasNormais : 0;
            totalHorasExtras += horasExtras;
        }
    }

    let resultado = `Total de Horas Extras na Semana: ${totalHorasExtras.toFixed(2)} horas.`;

    if (totalHorasExtras > limiteHorasExtras) {
        alert("Você ultrapassou o limite de 20 horas extras na semana.");
    }

    document.getElementById('resultado').textContent = resultado;
}
