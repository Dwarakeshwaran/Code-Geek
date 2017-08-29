#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
char alpha;
int up,low;
printf("Enter the Alphabet:");
scanf("%c",alpha);
up=(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U');
low=(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u');
if (low||up)
printf("%c is a vowel.", alpha);
else
printf("%c is a consonant.", alpha);
getch();
}
