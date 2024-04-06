#include <stdio.h>

int main(){
	
	int n1, n2, n3;
	
	printf("Digite um numero: ");
	scanf("%i", &n1);
	
	printf("Digite outro numero: ");
	scanf("%i", &n2);

	printf("Digite outro numero: ");
	scanf("%i", &n3);
	
	if (n1 > n2 && n1 > n3){
		printf("Os o maior entre os numeros digitado eh %d", n1);
	}
	else if (n2 > n1 && n2 > n3){
		printf("Os o maior entre os numeros digitado eh %d", n2);
	}
	else{
		printf("Os o maior entre os numeros digitado eh %d", n3);
	}
	
	return 0;
}