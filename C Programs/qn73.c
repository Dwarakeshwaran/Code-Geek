#include <stdio.h>
void main()
{
	int l,r,n;
	printf("Enter the n value to be checked: \t")
	scanf("%d",&n);
	
	printf("Enter L and R values: \n\n");
	scanf("%d\t%d",&l,&r);
	
	if(n>l&&n<r)
	printf("yes");
	else
	printf("no");
}
