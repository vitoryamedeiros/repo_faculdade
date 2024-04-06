#include <stdio.h>

int main()
{
	// declarando as variaveis
	int n1, n2, soma, produto, quociente;
	
	// armazenando os numeros
	printf("Digite o primeiro numero: ");
	scanf("%i", &n1);
	
	printf("Digite o segundo numero: ");
	scanf("%i", &n2);
	
	// operacoes
	soma = n1 + n2;
	produto = n1 * n2;
	quociente = n1 / n2;
	
	// mostrando o resultado
	printf("Resultado da soma entre %d + %d = %d. \n", n1,n2,soma);
	printf("Resultado do quociente entre %d / %d = %d. \n", n1,n2,quociente);
	
	return 0;
}