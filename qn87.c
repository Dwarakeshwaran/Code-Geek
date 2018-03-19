#include <stdio.h>

void main()
{
int num1,num2,remainder,gcd;
printf("\n Number 1:");
scanf("%d",&num1);
printf("\n Numebr 2:");
scanf("%d",&num2);
do
{
remainder=x%y;
if(remainder==0)
break;
num1=num2;
num2=remainder;
}while(remainder!=0);
gcd=num2;
printf("\n GCD: %d",gcd);

}
