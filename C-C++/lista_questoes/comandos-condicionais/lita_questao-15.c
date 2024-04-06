#include <stdio.h>

int main()
{
	int value, restoDiv;
	
	printf("Digite um valor: ");
	scanf("%i", &value);
	
	restoDiv = value / 2;
	if(restoDiv == 0){
		printf("O valor eh PAR");
	}
	else{
		printf("O valor eh IM PAR");
	}
	
	return 0;
}