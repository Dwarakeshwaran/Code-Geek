#include<stdio.h>
#include<conio.h>
void main()
{
long num,res=0;
clrscr();
printf("Enter the Number:");
scanf("%lld",&num);
while(num!=0)
{
num=num/10;
res++;
}
printf("%d",res);
getch();
}

