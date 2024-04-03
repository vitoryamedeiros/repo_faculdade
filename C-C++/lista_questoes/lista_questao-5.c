#include <stdio.h>

int main()
{
	int centimetros, polegadas;
	
	printf("Digite o valor em CM: ");
	scanf("%i", &centimetros);
	
	polegadas = centimetros / 2,54;
	
	printf("o valor em polegadas eh de %d", polegadas);
	return 0;
}