#include<stdio.h>
void main()
{
int i,size,n[3],a,d,sum=0;

printf("Enter the n terms: ");
scanf("%d",&size);


printf("Enter the initial value: ");
scanf("%d",&a);

n[0]=a;


printf("Enter the Difference: ");
scanf("%d",&d);

for(i=0;i<size;i++)
{
    n[i+1]=n[i]+d;
} 
for(i=0;i<size;i++)
{

sum=sum+n[i];
  
}
  printf("%d\n",sum);
}
