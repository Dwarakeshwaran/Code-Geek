#include<stdio.h>
#inlcude<conio.h>
int main()
{
char alpha;
printf("Enter a character: ");
scanf("%c",&alpha);
if( (alpha>='a' && alpha<='z') || (alpha>='A' && alpha<='Z') )
printf("%c is an alphabet.",alpha);
else
printf("%c is not an alphabet.",alpha);
getch();
}
