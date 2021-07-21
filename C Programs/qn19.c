#include<stdio.h>
#include<conio.h>
void main()
{
int num,i,fact=1;
clrscr();
printf("Enter the Number:");
scanf("%d",&num);
for(i=0;i<=num;i++)
{
fact=fact*num;
num=num-1;
}
printf("%d",fact);
getch();
}
