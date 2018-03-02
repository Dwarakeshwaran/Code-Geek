#include<stdio.h>

void main()
{
    int num;
    
    scanf("%d",&num);
    
    if(num%2==0)
    printf("%d",num);
    else if(num%2!=0)
    {
        num=num-1;
        printf("%d",num);
    }
}
