#include<stdio.h>
void main()
{
    int num[50],i=1,sum=0;
    
    if(i<=1)
    {
    scanf("%d",&num[i]);
    sum=sum+num[i];
    i--;  
    scanf("%d",&num[i]);
    sum=sum+num[i];
    }
    
    printf("%d",sum);
    
}
