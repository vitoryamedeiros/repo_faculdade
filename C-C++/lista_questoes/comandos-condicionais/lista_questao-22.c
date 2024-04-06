#include <stdio.h>

int main()
{
	int n1, n2, total;
	char operation;
	
	printf("Escolha a operacao matematica (+, -, *, /): ");
	scanf("%c", &operation);
	
	printf("Digite um numero: ");
	scanf("%i", &n1);
	
	printf("Digite outro numero: ");
	scanf("%i", &n2);
	
	switch(operation)
	{
	case '+':
		total = n1 + n2;
		printf("O resultado da soma eh %d ", total);
		break;
	
	case '-':
		total = n1 - n2;
 	 	 printf("O resultado da subtracao eh %d ", total);
		break;
	
	case '*':
		total = n1 * n2;
		printf("O resultado da multiplicacao eh %d ", total);
		break;
	
	case '/':
		total = n1 / n2;
 	 	 printf("O resultado da divisao eh %d ", total);
		break;
	
	default:
		printf("ERROR 404!!! Valor invalido!");
		break;
	}
	
	getchar();
	return 0;
}