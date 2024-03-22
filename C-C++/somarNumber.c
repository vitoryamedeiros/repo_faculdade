
#include <stdio.h>

int main(){
	   	int number;
	   	
	   	printf("Write a number: ");
	   	scanf("%i", &number);
	   	
	   	if(number >= 100){
		 number = (number+150);
		 printf("o novo valor eh %i", number);
	   }
		   
	return 0;
}