#include<stdio.h>

void main()
{
    int size, num[size], i,max,min;
    
    scanf("%d",&size);
    
    for(i=0;i<size;i++)
    {
        scanf("%d",&num[i]);
    }
    max=num[0];
    for(i=0;i<size;i++)
    {
        if(num[i]>max)
        max=num[i];
    }
    min=num[0];
    for(i=0;i<size;i++)
    {
        if(num[i]<min)
        min=num[i];
    }
    
    printf("%d %d",min,max);
}
