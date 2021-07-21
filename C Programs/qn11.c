#include<stdio.h>
#include<conio.h>
void main()
{
int num,deg,res,i;
clrscr();
printf("Enter the Number:");
scanf("%d",&num);
printf("Enter the Degree:");
scanf("%d",&deg);
if(deg==0)
{
printf("The result is 1");
}
else if(deg==1)
{
printf("The result is %d",num);
}
else
{
for(i=0;i<=deg;i++)
{
res=num*num;
}
}
printf("%d",res);
getch();
}
