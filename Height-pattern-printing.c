
#include <stdio.h>

int main()
{
    int max_row;
    int col_arr[100];
    int max_col;
    
    //Storing the maximum row number (Input 1)
    scanf("%d",&max_row);
    int col_iterator;
    
    //Storing the column values in an array (Input 2)
    for(col_iterator=0;col_iterator<max_row;col_iterator++)
    scanf("%d",&col_arr[col_iterator]);
    
    
    //Getting the highest element of the array
    int max_col_num=col_arr[0];
    
    for(col_iterator=0;col_iterator<max_row;col_iterator++)
    {
        if(col_arr[col_iterator]>max_col_num)
        max_col_num=col_arr[col_iterator];
    }
    
    
    //Storing the values in the matrix
    char hash_matrix[max_row][max_col_num];
    int row,col;
    int hash,dash;
    
    printf("\n\n");
    for(row=1;row<=max_row;row++,printf("\n"))
    {
        for(col=1;col<=max_col_num;)
        {
           for(hash=1;hash<=col_arr[row-1];hash++)
           hash_matrix[row][hash]='#';
           
           col = col_arr[row-1]+1;
           
           for(dash=col;dash<=max_col_num;dash++)
           hash_matrix[row][dash]='-';
           
           col = dash;
        }
    }
    
    //Rotating the matrix as per the output format
    for(col=max_col_num;col>=1;col--,printf("\n"))
    {
        for(row=1;row<=max_row;row++)
        {
            printf("%c",hash_matrix[row][col]);
        }
    }
    
    
    
    

    return 0;
}
