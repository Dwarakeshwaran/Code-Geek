#include<stdio.h>

void main()
{
    int N,M,product;
    
    scanf("%d",&N);
    scanf("%d",&M);
    
    product=M*N;
    
    if(product%2==0)
    printf("Even");
    else
    printf("odd");
  
}
