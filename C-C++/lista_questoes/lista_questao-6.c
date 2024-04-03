#include <stdint.h>

int main()
{
	int raio, area;
	
	printf("Digite o valor do raio do circulo: ");
	scanf("%i", &raio);
		
	area = (raio*raio) * 3,14;
	
	printf("O valor da area do circulo eh: %d", area);
	
	return 0;
}