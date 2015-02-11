
#include <stdio.h>
#include <stdlib.h>

int main (void)
{
	FILE* spIn;
	int   numIn;
	
	spIn = fopen("FILE.DAT", "r");
	if (!spIn)
	   {
	    printf("Could not open file\a\n");
	    exit  (101);
	   } // if open fail 
	
	while ((fscanf(spIn, "%d", &numIn)) == 1)
	   printf("%d ", numIn);
	   
	printf("\n");

	return 0;
}	// main 
