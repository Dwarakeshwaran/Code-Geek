#include <stdio.h>

void main()
{
int num1,num2,remainder,lcm,gcd,a,b;
printf("\n Number 1:");
scanf("%d",&num1);
printf("\n Number 2:");
scanf("%d",&num2);
a=num1;
b=num2;
do
{
remainder=num1%num2;
if(remainder==0)
break;
num1=num2;
num2=remainder;
}while(remainder!=0);
gcd=num2;
lcm=(a*b)/gcd;
printf("\n the lcm of the given number is: %d",lcm);

}
