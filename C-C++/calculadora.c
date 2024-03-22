#include <stdio.h>

int main(){
	char operation;
	float num1, num2, result;\
	
	printf("Digite a operacao (+, -, *, /, %%):");
	scanf("%c", &operation);
	
	printf("Digite o primeiro numero: ");
	scanf("%f", &num1);
	
	printf("Digite o segundo numero: ");
	scanf("%f", &num2);
	
	
	switch(operation)
	{
		case '+':
			result = num1 + num2;
			printf("Resultado: %.2f", result);
			break;
		
		case '-':
			result = num1 - num2;
			printf("Resultado: %.2f", result);
			break;
			
		case '*':
			result = num1 * num2;
			printf("Resultado: %.2f", result);
			break;
		
		case '/':
			//VERIFICANDO PRA NAO EXISTIR UMA DIVISAO POR 0
			if(num2 != 0)
			{
				result = num1 / num2;
				printf("Resultado: %.2f", result);	
			}
			else{
				printf("ERROR: Divisao por 0");	
			}
			break;
		
		default:
		printf("Operacao Invalida");
	}
	
	return 0;
}