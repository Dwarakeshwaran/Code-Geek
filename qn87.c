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
x=y;
y=remainder;
}while(remainder!=0);
gcd=y;
printf("\n GCD: %d",gcd);

}
