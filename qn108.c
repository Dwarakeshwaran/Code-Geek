#include <stdio.h>
void main() 
{
	int n,a,d,s;
	int N,D,A,S;
	printf("Number of terms:");
	scanf("%d",&n);
	printf("\nStart value:");
	scanf("%d",&a);
	printf("\nDifference:");
	scanf("%d",&d);
	N=n-1;
	D=N*d;
	A=2*a;
	S=A+D;
	s=S*n/2;
	printf("\n%d",s);
}
