//Swapping using Call by Value
#include<stdio.h>

int swap(int,int);
void main()
{
	int a,b;
	
	scanf("%d%d",&a,&b);
	swap(a,b);
}

int swap(int x,int y)
{
    int temp;
    temp=x;
    x=y;
    y=temp;
    
    printf("%d\t%d",x,y);
}
