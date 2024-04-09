#include <stdio.h>

int main()
{
	int i=0, num=0;
	
	printf("Digite um numero para ver sua tabuada: ");
	scanf("%i",&num);
	
	while( i <= 9 )
	{
		i++;
		printf("%d + %d = %d\t", i, num, num+i);
    	printf ("%d - %d = %d\t", i, num, num-i);
        printf ("%d X %d = %d\n", i, num, num*i);
	}
	return 0;
}