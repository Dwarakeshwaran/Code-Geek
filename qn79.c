#include<stdio.h>
//#include<math.h>
void main()
{
	int n1,n2,i,j,square,res,temp;
	scanf("%d",&n1);
	scanf("%d",&n2);
	
	res=n1*n2;
	
	for(i=0;i<1000;i++)
	{
		for(j=0;j<1000;j++)
		{
			square=i*j;
			if(res==square)
			temp=1;		
		}
	}
	if(temp==1)
	printf("yes");
	else
	printf("no");
}
