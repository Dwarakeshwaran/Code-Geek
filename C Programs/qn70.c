#include <stdio.h>
#include<math.h>
void main()
{
    int n,i,power,res;
    
    scanf("%d",&n);
    
    for(i=0;i<=1000;i++)
    {
    	power=pow(n,i);
    	if(power==n)
    	res=power*2;
	}
    
    printf("%d",res);
}
