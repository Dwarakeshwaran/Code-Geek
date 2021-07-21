#include<stdio.h>
void main()
{
int n,i=0,sum=0;
printf("Enter the Range: ");
scanf("%d",&n);
while(i<=n)
{
sum=sum+i;
i++;
}
printf("The sum is %d",sum);
}
