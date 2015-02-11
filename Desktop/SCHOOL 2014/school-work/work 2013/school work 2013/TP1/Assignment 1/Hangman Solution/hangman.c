/* File: hangman-gettingStarted.c
   This is assignment 1 */

#include <stdio.h>
#include <string.h>
#include <malloc.h>

typedef unsigned int bool;
#define true 1
#define false 0

void flush(FILE *in, const char delim)
{
	int c;
	do
	{
		c = getc(in);
	} while (c != delim && c != EOF);
}

void initialiseDisplayWord(char dw[100], int len)
{
	int j;
	for (j = 0; j < len; j++)
		dw[j] = '_';
}

void drawHangman(int tries)
{
	switch (tries)
	{
		case 9 : printf("|----------| \n");
			 printf("|          | \n");
			 printf("|          0 \n");
			 printf("|         /|\\\n");
			 printf("|          | \n");
			 printf("|         / \\\n");
			 printf("|            \n");
			 break; 
                case 8 : printf("|----------| \n");
                         printf("|          | \n");
                         printf("|          0 \n");
                         printf("|         /|\\\n");
                         printf("|          | \n");
                         printf("|         /  \n");
                         printf("|            \n");
                         break;
                case 7 : printf("|----------| \n");
                         printf("|          | \n");
                         printf("|          0 \n");
                         printf("|         /|\\\n");
                         printf("|          | \n");
                         printf("|            \n");
                         printf("|            \n");
                         break;
                case 6 : printf("|----------| \n");
                         printf("|          | \n");
                         printf("|          0 \n");
                         printf("|         /| \n");
                         printf("|          | \n");
                         printf("|            \n");
                         printf("|            \n");
                         break;
                case 5 : printf("|----------| \n");
                         printf("|          | \n");
                         printf("|          0 \n");
                         printf("|          | \n");
                         printf("|          | \n");
                         printf("|            \n");
                         printf("|            \n");
                         break;
                case 4 : printf("|----------| \n");
                         printf("|          | \n");
                         printf("|          0 \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         break;
                case 3 : printf("|----------| \n");
                         printf("|          | \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         break;
                case 2 : printf("|----------  \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         break;
                case 1 : printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         printf("|            \n");
                         break;
	}
}

void main()
{
	const int ARRAY_SIZE = 100;
	
	char *data, *words[ARRAY_SIZE];
	int count = 0;
	FILE *fp;
	int i, k, index, wordLength;
	char wordToGuess[100];
	char displayWord[100];
	char letter;
	bool gameOver = false;
	bool userWins = false;
	bool hit;
	int tries = 0;

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
		printf("Words successfully read from the file...\n"); 
		
		/* generate random number - index */
		srand(time(NULL));
		index = rand() % count;
		strcpy(wordToGuess, words[index]);
		strcpy(displayWord, wordToGuess);	/* cheat */
		wordLength = strlen(wordToGuess);
		
		/* Play game */
		initialiseDisplayWord(displayWord, wordLength);
		do
		{
			system("clear");
			drawHangman(tries);
			for (i = 0; i < wordLength; i++)
				printf("%c ", displayWord[i]);
			printf("\n\nEnter letter: ");
			scanf("%c", &letter);
			flush(stdin, '\n');
			hit = false;
			for (k = 0; k < wordLength; k++)
			{
				if (wordToGuess[k] == letter)
				{
					displayWord[k] = letter;
					hit = true;	
				}
			}
			if (!hit)
			{
				tries++;	
				drawHangman(tries);
				if (tries == 9)
					gameOver = true;
			}
			if (strcmp(wordToGuess, displayWord) == 0)
				userWins = true;
			printf("Press any key to continue...");
			getchar();
		} while (!((gameOver) || (userWins))); 
		printf("\n\n%s - ", wordToGuess); 
		if (userWins)
			printf("Well done!\n");
		else
			printf("Better luck next time\n");
	}
	else 
	{
		printf("Error: File not found\n");
	}
}
