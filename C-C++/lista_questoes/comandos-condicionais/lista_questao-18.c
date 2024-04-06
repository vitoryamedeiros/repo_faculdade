#include <stdio.h>

int main()
{
	int qtdMacas;
	
	printf("Quantas macas vc vai comprar?");
	scanf("%i", &qtdMacas);
	
	float valorVarejo = (0.30 * qtdMacas);
	float valorAtacado =(0.25 * qtdMacas);
	
	if (qtdMacas < 12){
		printf("O valor da sua compra eh %2.0lf reais", valorVarejo);
	}
	else{
		printf("O valor da sua compra eh %2.0lf reais", valorAtacado);
	}
	
	return 0;
}