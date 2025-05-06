from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
import time
import os
from pathlib import Path

CAMINHO_ARQUIVO = Path(__file__).parent / "login.html"
CAMINHO_ARQUIVO = CAMINHO_ARQUIVO.resolve().as_uri()


casos_teste = [
    {"email": "", "senha": "", "descricao": "TS01 – Campos vazios"},
    {"email": "usuarioemail.com", "senha": "1@Bc", "descricao": "TS02 – Email inválido (sem @)"},
    {"email": "usuario@com", "senha": "1Abc#", "descricao": "TS03 – Email inválido (formato incorreto)"},
    {"email": "usuario @email.com", "senha": "1Abc#", "descricao": "TS04 – Email inválido (contém espaços)"},
    {"email": "usuario@@email.com", "senha": "1Abc#", "descricao": "TS05 – Email inválido (dois @)"},
    {"email": "usuario@email.", "senha": "1Abc#", "descricao": "TS06 – Email inválido (sem domínio válido)"},
    {"email": "usuario@email", "senha": "1Abc#", "descricao": "TS07 – Email inválido (domínio sem ponto final válido)"},
    {"email": "teste@email.com", "senha": "123abc", "descricao": "TS08 – Senha sem caractere especial"},
    {"email": "teste@email.com", "senha": "abc", "descricao": "TS09 – Senha curta demais"},
    {"email": "teste@email.com", "senha": "Abcdefgh1#", "descricao": "TS10 – Senha muito longa"},
    {"email": "teste@email.com", "senha": "abc123#", "descricao": "TS11 – Senha sem letra maiúscula"},
    {"email": "teste@email.com", "senha": "ABC123#", "descricao": "TS12 – Senha sem letra minúscula"},
    {"email": "teste@email.com", "senha": "Abc#123", "descricao": "TS13 – Senha sem número"},
    {"email": "fulano@email.com", "senha": "1@Bc", "descricao": "TS14 – Credenciais válidas, mas incorretas"},
    {"email": "teste@email.com", "senha": "1@Bc", "descricao": "TS15 – Login bem-sucedido"},
]

options = Options()
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=options)

driver.get(CAMINHO_ARQUIVO)
time.sleep(1)

def testar_login(email, senha, descricao):
    print(f"\nExecutando: {descricao}")

    try:
        campo_email = driver.find_element(By.ID, "email")
        campo_email.clear()
        campo_email.send_keys(email)

        campo_senha = driver.find_element(By.ID, "password") 
        campo_senha.clear()
        campo_senha.send_keys(senha)

        driver.find_element(By.ID, "btn").click() 
        time.sleep(1)

        if "sucesso.html" in driver.current_url:
            print("✅ Resultado: Login bem-sucedido")
        else:
            email_alert = driver.find_element(By.ID, "emailAlert").text
            senha_alert = driver.find_element(By.ID, "passwordAlert").text
            if email_alert or senha_alert:
                print(f"⚠️  Alertas → Email: '{email_alert}' | Senha: '{senha_alert}'")
            else:
                print("❌ Resultado: Credenciais inválidas")

    except Exception as e:
        print(f"Erro durante o teste: {e}")

for caso in casos_teste:
    testar_login(caso["email"], caso["senha"], caso["descricao"])

input("Pressione Enter para fechar o navegador...")

driver.quit()