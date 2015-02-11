
#include <stdio.h>
#include <stdlib.h>

int main (void)
{
//	Local Declarations 
	FILE* spIn;
	FILE* spOut;
	int   numIn;
	int   closeResult;
	
//	Statements 
	printf("Running file copy\n");
	spIn = fopen("File.DAT", "r");
	if (!spIn)
	   {
	    printf("Could not open input file\a\n");
	    exit  (101);
	   } // if open fail 
	
	spOut = fopen("FILE2.DAT", "w");
	if (!spOut)
	   {
	    printf("Could not open output file\a\n");
	    exit  (102);
	   } // if open fail 

	while ((fscanf(spIn, "%d", &numIn)) == 1)
	   fprintf(spOut, "%d\n", numIn);
	
	closeResult = fclose(spOut);
	if (closeResult == EOF)
	   {
	    printf("Could not close output file\a\n");
	    exit  (201);
	   } // if close fail 
	
	printf("File copy complete\n");
	return 0;
}	// main 