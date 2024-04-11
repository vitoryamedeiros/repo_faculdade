#include <stdio.h>

int main(){
	char operation, situacao;
	int n1, n2, result;
	

	
	if(nota >= 7){
		printf("Aprovado!!");
		scanf("%c", &situacao);	
	}
	else{
		printf("Reprovado!!");
		scanf("%c", &situacao);		
	}
	
	switch(situacao)
	{
	case "aprovado":
		printf("Voce sera matriculado no proximo periodo");
		break;
	
	case "reprovado":
		printf("Voce vai repetir o periodo");
		break;
	
	default:
		printf("Voce vai repetir o periodo");
		break;
	}
	return 0;
}