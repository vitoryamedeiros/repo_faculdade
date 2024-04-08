#include <stdio.h>

int main()
{
	int salarioFixo=2000, totalVendas=100, comissao, salarioFinal;
	
	comissao = totalVendas * 0.15;
	salarioFinal = salarioFixo + comissao;
	
	printf("O salario final com o valor da comissao ficara: %d" ,salarioFinal);
	
	getchar();
	return 0;
}