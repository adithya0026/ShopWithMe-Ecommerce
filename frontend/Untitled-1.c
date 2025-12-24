#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
    int si=0,di=8,once=0;
    char src[100],dest[100];
    char flagbyte[]="01111110";

    printf("Enter the frame data in binary\n");
    gets(src);
    strcpy(dest,flagbyte);

    while(src[si]!='\0')
    {
        if (src[si]=='1')

        once++;
        else
            once=0;
        dest[di++]=src[si++];
        if(once==5)
        {
             dest[di++]='0';
             once=0;
        }
        }
        dest[di++]='\0';
        strcat(dest,flagbyte);
        printf("\n after stuffing \n");
        puts(dest);

        getch();
    }