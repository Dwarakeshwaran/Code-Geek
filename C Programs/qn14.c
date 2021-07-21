#include<stdio.h>
void main()
{
int num1,num2,i,odd;

printf("Enter the 1st Number:\t");
scanf("%d",&num1);
printf("Enter the 2nd Number:\t");
scanf("%d",&num2);

for(i=num1+1;i<num2;i++)
{
if(i%2!=0)
printf("%d\n",i);
}

}
