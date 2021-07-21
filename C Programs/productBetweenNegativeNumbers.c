#include<stdio.h>

void main(){
	int array[100];
	int number;
	int i;
	int product = 1;
	
	scanf("%d",&number);
	
	for(i=0 ; i<number ; i++)
		scanf("%d",&array[i]);

	for(i=0 ; i<number ; i++){
		
		if(i == number-1)
			break;
		if(array[i]<0){
			i++;
			while(array[i] > 0){
				product = product * array[i];
				i++;
			}
			printf("%d ",product);
			i--;
			product = 1;
		}
		
	}
	
}
