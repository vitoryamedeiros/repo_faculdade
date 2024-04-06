#include <stdint.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "portuguese");
	
	int n1 = 7;
	int n2 = 8;
	int n3 = 9;
	int mediaN = n1 + n2 + n3 / 3;
	
	int k1 = 4;
	int k2 = 5;
	int k3 = 6;
	int mediaK = k1 + k2 + k3 / 3;
	
	int soma = mediaN + mediaK;
	int total = soma / 2;
	
	printf("A soma é %d e a média é %d", soma, total);
	
	getchar();
	return 0;
}