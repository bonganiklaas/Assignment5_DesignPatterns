/* File: hangman-gettingStarted.c
   This is assignment 1 */

#include <stdio.h>
#include <string.h>
#include <malloc.h>

void main()
{
	const int ARRAY_SIZE = 100;
	
	char *data, *words[ARRAY_SIZE];
	int count = 0;
	FILE *fp;
	int i;

	data = (char *) malloc(25);
	fp = fopen("words.txt", "r");
	if (fp)
	{
		fscanf(fp, "%s", data);
		while (!feof(fp))
		{
			words[count] = malloc(25);
			strcpy(words[count], data);	
			count++;
			fscanf(fp, "%s", data);
		}
		fclose(fp);
		printf("Words read from the file:\n"); 
		for (i = 0; i < count; i++) 
			printf("%s\n", words[i]);
	}
	else 
	{
		printf("Error: File not found\n");
	}
}
