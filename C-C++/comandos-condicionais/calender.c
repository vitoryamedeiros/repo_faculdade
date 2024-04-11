#include <stdio.h>

int main(){
	
	int valor;
	
	printf("Digite um valor numerico de 1 a 6: ");
	scanf("%i", &valor);
	
	switch(valor)
	{
	case 1:
		printf("Janeiro");
		break;
	case 2:
		printf("Fevereiro");
		break;
	case 3:
		printf("Março");
		break;
	case 4:
		printf("Abril");
		break;
	case 5:
		printf("Maio");
		break;
	case 6:
		printf("Junho");
		break;
	default:
		printf("invalido");
		break;
	}
	return 0;
	
}