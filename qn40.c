#include<stdio.h>
void main()
{
	int a=1,b=1,c,i,n;
	scanf("%d",&n);
	printf("%d\t%d\t",a,b);
	for(i=0;i<n-2;i++)
	{
	   
	    c=a+b;
	    a=b;
	    b=c;
	    printf("%d\t",c);
	}
	
}
