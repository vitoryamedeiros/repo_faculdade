
#include <stdio.h>

int main(){
	int n1, n2;
	char modDiv;
	
	printf("Write the first number: ");
	scanf("%d", &n1);
	
	printf("Write the second number: ");
	scanf("%d", &n2);
	
	modDiv = n1 % n2;
	
	if(modDiv == 0){
		printf("A divisao do numero %d com o numero %d eh EXATA", n1, n2);
	}
	else{
		printf("A divisao do numero %d com o numero %d NAO eh EXATA", n1, n2);
	}
	
	return 0;
}