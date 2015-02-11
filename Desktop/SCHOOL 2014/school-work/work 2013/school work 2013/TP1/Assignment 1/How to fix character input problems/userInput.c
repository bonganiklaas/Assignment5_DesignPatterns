/* File: userInput.c
   This program shows how to flush/clear the buffer after character input */

#include <stdio.h>

/* copy and paste the function below */
void flush(FILE *in, const char delim)
{
	int c;
	do
	{
		c = getc(in);
	} while (c != delim && c != EOF);
}

void main()
{
	/* No constants */

	char input;

	do 
	{
		system("clear");			/* clears the screen */
		printf("Enter a letter: ");
		scanf("%c", &input);
		flush(stdin, '\n');				/* first parameter is the input stream (keyboard) - second parameter \n is the enter key */
		printf("Press any key to continue...");
		getchar();				/* pause the run screen */
	} while (input != 'Z');

}