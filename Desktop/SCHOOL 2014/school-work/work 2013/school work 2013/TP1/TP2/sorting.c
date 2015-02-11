/*author: z
date: 27 feb*/

#include<stdio.h>

int main()
{
	int i,j, k, temp;
	k = 1;
	int sort[5] = {20, 9, 12, 5, 1};

	for(i = 1; i < 5 && k == 1; i++)
	  {
	    k = 0;
	     for(j = 0; j < 5 - i; j++)
		{
		  if( sort[j] > sort[j+1])
		     {
   	  		temp = sort[j];
			sort[j] = sort[j+1];
			sort[j+1] = temp;
			k = 1;
	              }
		    /*  printf("%d", sort[j]);*/ 
	          }
		   /*   printf("\n");*/
	    }

	for(i = 0; i < 5; i++)
	printf("   %d", sort[i]);
	printf("\n");
}  
