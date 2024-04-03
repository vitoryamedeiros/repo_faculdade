#include <stdio.h>

int main()
{
	int primaryNumber, secondNumber, quociente;
	
	printf("digite o primeiro numero");
	scanf("%i", &primaryNumber);
	
	printf("digite o primeiro numero");
	scanf("%i", &secondNumber);
	
	quociente = primaryNumber / secondNumber;
	
	printf("o quociente da divisao entre %d / %d = %d. \n", primaryNumber,secondNumber,quociente);
	return 0;
}