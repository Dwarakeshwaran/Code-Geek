#include<stdio.h>

void main()
{
	int n1,n2,i,square,res,temp;
	
	scanf("%d",&n1);
	scanf("%d",&n2);
	
	res=n1*n2;
	
	for(i=0;i<=10000;i++)
	{
		
			square=i*i;
			if(res==square)
			temp=1;		
		
	}
	if(temp==1)
	printf("yes");
	else
	printf("no");
}
