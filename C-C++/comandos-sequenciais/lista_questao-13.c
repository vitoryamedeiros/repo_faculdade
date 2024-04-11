#include <stdio.h>

int main()
{
	float valorFabrica, impostos, percentoVendedor, precoFinal;
	
	printf("Digite o valor de fabrica do automovel: ");
	scanf("%f", &valorFabrica);
	
	impostos = valorFabrica * 0.45;
	percentoVendedor = valorFabrica * 0.28;
	precoFinal = valorFabrica + impostos + percentoVendedor;
	
	printf("O preco final do automovel eh de %2.2f reais", precoFinal);
	
	return 0;
}