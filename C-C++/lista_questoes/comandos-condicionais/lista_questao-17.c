#include <stdio.h>

int main(){
	
	int n1, n2;
	
	printf("Digite um numero: ");
	scanf("%i", &n1);
	
	printf("Digite outro numero: ");
	scanf("%i", &n2);
	
	if (n1 == n2){
		printf("Os numeros sao enguais");
	}
	else if (n1 > n2){
		printf("Os numeros sao diferentes, e o maior entre eles eh %d", n1);
	}
	else{
		printf("Os numeros sao diferentes, e o maior entre eles eh %d", n2);
	}
	
	return 0;
}