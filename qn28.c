#include<stdio.h>
void main()
{
int i,size,num[size];
printf("Enter the Array Size: ");
scanf("%d",&size);
printf("Enter the Array Elements:\n");
for(i=0;i<size;i++)
{
scanf("%d",&num[i]);

}
for(i=0;i<size;i++)
{
printf("n[%d]\t",i);
printf("%d\n",num[i]);

}

}
