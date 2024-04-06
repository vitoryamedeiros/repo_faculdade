#include <stdint.h>

int main()
{
	int n1, n2, multiplicacao;
	
	printf("Escreva o primeiro numero: ");
	scanf("%i", &n1);
	
	printf("Escreva o segundo numero: ");
	scanf("%i", &n2);
		
	multiplicacao = n1 * n2;
	
	printf("Resultado da multiplicacao entre %d * %d = %d", n1, n2, multiplicacao);
	return 0;
}
