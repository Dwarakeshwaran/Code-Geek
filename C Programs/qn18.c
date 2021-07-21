#include <stdio.h>
#include <math.h>

void main()
{
int r1,r2,i,temp1,temp2,rem,n=0,res=0;
 
printf("Enter two Range: ");
scanf("%d %d",&r1,&r2);
printf("Armstrong numbers between %d and %d are: ",r1,r2);
for(i=r1+1;i<r2;++i)
{
temp2=i;
temp1=i;

while(temp1!=0)
{
temp1=temp1/10;
++n;
}

while(temp2!=0)
{
rem=temp2%10;
res=res+pow(rem,n);
temp2=temp2/10;
}
if(res==i)
{
printf("%d ", i);
}
n = 0;
res=0;
}
}
