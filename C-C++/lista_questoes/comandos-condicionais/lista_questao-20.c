#include <stdio.h>

int main(){
	
	int n1, n2, n3;
	
	printf("Digite um numero: ");
	scanf("%i", &n1);
	
	printf("Digite outro numero: ");
	scanf("%i", &n2);

	printf("Digite outro numero: ");
	scanf("%i", &n3);
	
	if (n1 > n2 && n2 > n3){
		printf("A ordem crescente dos numeros digitado eh %d, %d e %d", n1, n2,n3 );
	}
	else if (n2 > n1 && n1 > n3){
		printf("A ordem crescente dos numeros digitado eh %d, %d e %d", n3, n1, n2);
	}
	else{
		printf("A ordem crescente dos numeros digitado eh %d, %d e %d", n3, n2, n1);
	}
	
	return 0;
}