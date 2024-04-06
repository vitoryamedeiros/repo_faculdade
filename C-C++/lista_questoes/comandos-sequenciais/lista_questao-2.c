#include <stdio.h>

int main()
{
	int num;
	char antecessor;
	char sucessor;
	
	printf("Digite o numero");
	scanf("%i", &num);

	antecessor = num--;
	sucessor = num++;
	
	printf("O numero antecessor eh %.2i ", antecessor);
	printf("e o numero sucessor eh %.2i ", sucessor);

	
	return 0;
}