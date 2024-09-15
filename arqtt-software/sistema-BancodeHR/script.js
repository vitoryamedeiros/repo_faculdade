// Função para simular o acesso ao sistema de controle
function acessarSistema() {
    document.getElementById("opcoes-ponto").classList.remove("hidden");
    alert("Sistema de controle de ponto acessado.");
  }
  
  // Função para simular o registro do ponto
  function baterPonto(acao) {
    alert(acao + " registrado com sucesso!");
  }
  
  // Função para verificar as horas extras
  function verificarHorasExtras() {
    const horasExtras = Math.floor(Math.random() * 10); // Gera um valor aleatório de horas extras
    const resultadoDiv = document.getElementById("resultado-horas");
  
    if (horasExtras > 19) {
      resultadoDiv.innerHTML = "Funcionário com " + horasExtras + " horas extras. Bloqueio ativado!";
    } else {
      resultadoDiv.innerHTML = "Funcionário com " + horasExtras + " horas extras. Nenhum bloqueio necessário.";
    }
  
    resultadoDiv.classList.remove("hidden");
  }
  
  function relogio() {
    const timeElement = document.getElementById('hora');
    const now = new Date();
    const horas = now.getHours().toString().padStart(2, '0');
    const minutos = now.getMinutes().toString().padStart(2, '0');
    const segundos = now.getSeconds().toString().padStart(2, '0');
    const horastring = `${horas}:${minutos}:${segundos}`;
    timeElement.textContent = horastring;

    function calendario() {
        const calendarElement = document.getElementById('data');
        const today = new Date();
        const dia = today.getUTCDate().toString().padStart(2, '0');
        const mesUTC = today.getUTCMonth();
        const mes = (mesUTC + 1).toString().padStart(2, '0');
        const ano = today.getUTCFullYear().toString().padStart(2, '0');
        const dataString = `${dia}/${mes}/${ano}`;
        calendarElement.textContent = dataString;
    }
}

setInterval(relogio, 1000);
calendario();
relogio();
