
#include <stdio.h>
#include <stdlib.h>
// ...

int main (void)
{ 
        FILE* spTemps;
	if ((spTemps = fopen("TEMPS.DAT", "r")) == NULL)
	   {
	    printf("\aERROR opening TEMPS.DAT\n");
	    exit (100);
	   } // if open 

	if (fclose(spTemps) == EOF)
	   {
	    printf("\aERROR closing TEMPS.DAT\n");
	    exit (102);
	   } // if close 

}	