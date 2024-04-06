#include <stdio.h>

int main()
{
	int value, valueInvertido;
	
	printf("Digite um valor: ");
	scanf("%i", &value);
	
	valueInvertido = value * (-10);
	
	if (value > 0){
		printf("O valor digitado foi %d", value);
	}
	else{
		printf("O valor digitado foi %d", valueInvertido);
	}
	
	return 0;
}