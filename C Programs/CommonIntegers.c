#include<stdio.h>
#define MAX 1000


void main(){
	int size1, size2;
	
	int array1[MAX], array2[MAX];
	int i,j;
	
	int temp;
	
	int count = 0;
	
	scanf("%d%d",&size1, &size2);
	
	for(i=0 ; i<size1 ; i++)
		scanf("%d",&array1[i]);
		
	for(j=0 ; j<size2 ; j++)
		scanf("%d",&array2[j]);
		
	
	for(i=0 ; i<size1 ; i++)
	{
		for(j=i+1 ; j<size1; j++){
			if(array1[i] > array1[j]){
				
                temp = array1[i];
                array1[i] = array1[j];
                array1[j] = temp;
            }
		}
	}
	
	for(i=0 ; i<size2 ; i++)
	{
		for(j=i+1 ; j<size2 ; j++){
			if(array2[i] > array2[j]){
				
                temp = array2[i];
                array2[i] = array2[j];
                array2[j] = temp;
            }
		}
	}
	
		
	for(i=0 ; i<size1 ; i++)
	{
		for(j=0 ; j<size2 ; j++){
			if(array1[i] == array2[j])
			{
				printf("%d ",array2[j]);
				count++;
			}
				
		}
	}
	
	if(count == 0)
	printf("-1");
	
}

