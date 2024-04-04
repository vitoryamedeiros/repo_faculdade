#include <stdio.h>

int main()
{
	int pi, raio, raioQuadrado, altura, area, volume;
	
	pi = 3,14;
	
	printf("Digite o raio do cilindo: ");
	scanf("%i", &raio);
	
	printf("Digite a altura do cilindo: ");
	scanf("%i", &altura);
	
	raioQuadrado = raio * raio;
	area = 2 * pi * raio * (altura + raio);
	volume = pi * raioQuadrado * altura;
	
	printf("A area do cilindo e %d e o volume do cilindo eh %d", area, volume);
	return 0;
}