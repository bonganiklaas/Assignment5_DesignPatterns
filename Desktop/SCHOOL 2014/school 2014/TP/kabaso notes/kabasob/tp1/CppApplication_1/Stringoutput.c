#include <stdio.h>
#include <stdlib.h>

int main (void) 
{
//	Local Declarations
	char  str[100];
	FILE* spOut;
	
//	Statements
	if (!(spOut = fopen ("FILE.TXT", "w")))
	   {
	    printf("\aCould not open output file.\n");
	    exit (100);
	   } // if

	printf("Enter some text and then enter <EOF> (Ctrl + d) when you finish:\n");

	while (fgets(str, sizeof (str), stdin))
	   fputs(str,  spOut); 
	fclose (spOut);
	return 0;
}	// main
