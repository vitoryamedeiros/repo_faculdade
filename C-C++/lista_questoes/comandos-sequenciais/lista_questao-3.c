#include <stdio.h>

int main()
{
	// ------ VARIABLES DECLARATION ------- //
	int primaryNumber, secondNumber, quociente, restoDivisao;
	
	// ----- GET AND SAVE THE NUMBERS -----//
	printf("digite o primeiro numero: ");
	scanf("%i", &primaryNumber);
	
	printf("digite o primeiro numero: ");
	scanf("%i", &secondNumber);
	
	// ------ CALCULATE THE NUMBERS ------- //
	quociente = primaryNumber / secondNumber;
	restoDivisao = primaryNumber % secondNumber;
	
	// ------ PRINT THE RESULT ------- //
	printf("o quociente da divisao entre %d / %d = %d. \n", primaryNumber,secondNumber,quociente);
	printf("o resto da divisao entre %d / %d = %d. \n", primaryNumber,secondNumber,restoDivisao);
	
	return 0;
}