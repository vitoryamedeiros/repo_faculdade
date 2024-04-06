
#include <stdio.h>

int
main ()
{
  int valor;

  printf ("Digite um valor: ");
  scanf ("%i", &valor);

  if (valor == 0)
	{
	  printf ("O valor eh ZERO");
	}
  else if (valor < 0)
	{
	  printf ("O valor eh NEGATIVO");
	}
  else
	{
	  printf ("O valor eh POSITIVO");
	}
	
	return 0;
}
