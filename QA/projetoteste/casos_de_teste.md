1. Abrir o navegador
2. Acessar o arquivo file://./login.html
3. Testar form com campos vazios — Entrada: "" / "". Observar resultado
4. Testar email inválido (sem @) — Entrada: "usuarioemail.com" / "1@Bc". Observar resultado
5. Testar email inválido (formato incorreto) — Entrada: "usuario@com" / "1Abc#" . Observar resultado
6. Testar email inválido (contém espaços) — Entrada: "usuario @email.com" / "1Abc#" . Observar resultado
7. Testar email inválido (dois @) — Entrada: "usuario@@email.com" / "1Abc#" . Observar resultado
8. Testar email inválido (sem domínio válido) — Entrada: "usuario@email." / "1Abc#" . Observar resultado
9. Testar email inválido (domínio sem ponto final válido) — Entrada: "usuario@email" / "1Abc#" . Observar resultado
10. Testar senha inválida (sem caractere especial) — Entrada: "teste@email.com" / "123abc" . Observar resultado
11. Testar senha inválida (curta demais) — Entrada: "teste@email.com" / "abc" . Observar resultado
12. Testar senha inválida (muito longa) — Entrada: "teste@email.com" / "Abcdefgh1#" . Observar resultado
13. Testar senha inválida (sem letra maiúscula) — Entrada: "teste@email.com" / "abc123#" . Observar resultado
14. Testar senha inválida (sem letra minúscula) — Entrada: "teste@email.com" / "ABC123#" . Observar resultado
15. Testar senha inválida (sem número) — Entrada: "teste@email.com" / "Abc#" . Observar resultado
16. Testar login com credenciais válidas, mas incorretas — Entrada: "fulano@email.com" / "1@Bc" . Observar resultado
17. Testar login com credenciais corretas — Entrada: "teste@email.com" / "1@Bc" . Observar resultado