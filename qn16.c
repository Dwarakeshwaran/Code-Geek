#include <stdio.h>
void main()
{
int r1,r2,i,temp;
printf("Enter two Range: ");
scanf("%d %d",&r1,&r2);
printf("Prime numbers between %d and %d are: ",r1,r2);
while(r1<r2)
{
temp=0;
for(i=2;i<=r1/2;++i)
{
if(r1%i==0)
{
temp=1;
break;
}
}
if(temp==0)
printf("%d ",r1);
++r1;
}
}
