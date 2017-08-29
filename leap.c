#include<stdio.h>
#include<conio.h>
void main()
{
int year;
clrscr();
printf("Enter:");
scanf("%d",&year);
if(year%4==0)
printf("%d is a Leap year");
else
printf("%d is not a leap year");
getch();
}
