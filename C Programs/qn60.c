#include<stdio.h>
void main()
{
	int n,a=1,b=1,c,i;
	scanf("%d",&n);
	printf("%d\n%d\n",a,b);
	for(i=0;i<n-2;i++)
	{
		c=a+b;
		a=b;
		b=c;
		printf("%d\n",c);
	}
}
