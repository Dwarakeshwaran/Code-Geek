#include<stdio.h>
#include<conio.h>
void main()
{
int res,num,i;
clrscr();
printf("Enter the Number:");
scanf("%d",&num);
for(i=1;i<=5;i++)
{
res=num*i;
printf("%d\n",res);
}
getch();
}
