//Program to Check whether the given Number is Armstrong or not
#include<stdio.h>
#include<conio.h>
void main()
{
int num,onum,rem,cube,res=0;
clrscr();
printf("Enter the Number: ");
scanf("%d",&num);
onum=num;
do
{
rem=num%10;
num=num/10;
cube=rem*rem*rem;
res=res+cube;
}
while(num!=0);
if(onum==res)
printf("%d is an Armstrong number",onum);
else
printf("%d is not an Armstrong Number",onum);
getch();
}
