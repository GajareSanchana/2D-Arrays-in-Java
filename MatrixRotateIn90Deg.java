//Write a program to rotate the matrix by 90 degrees clockwise

public class MatrixRotateIn90Deg {
    public static void print(int[][]arr){
       int m=arr.length;
       int n=arr[0].length;
       for (int i = 0; i < m; i++) { //rows
           for (int j = 0; j < n; j++) { //cols
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
       System.out.println();
    }
     public static void main(String[] args) {
     int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
     print(arr);
     int m=arr.length;
     //int n=arr[0].length;

       //transposing
       for (int i = 0; i < m; i++) { //rows
           for (int j = 0; j <=i; j++) { //cols
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
        
       }
       print(arr);
       //rotate --> reverse each row
       for (int i=0;i<m;i++){
        int a=0,b=m-1;
        while(a<b){
            //swap arr[i][a];
           int temp= arr[i][a];
           arr[i][a]=arr[i][b];
           arr[i][b]=temp;
           a++;
           b--;
        }
       }
       print(arr);
 }   
}



