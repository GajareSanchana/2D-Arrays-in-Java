//Spiral matrices
import java.util.Scanner;
public class Spiralmatrices {
    public static void spiralMatrix(int matrix[][]){
        int starRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix.length-1; 

        while(starRow<=endRow && startCol<=endCol){
            //top
            // here i for row , j for col
            for(int j=startCol; j<=endCol;j++){
                System.out.print(matrix[starRow][j]+" ");
            }starRow++;

            //right
            if(starRow>endRow || startCol>endCol)break;
            for(int i=starRow;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }endCol--;

            //bottom
            if(starRow>endRow || startCol>endCol)break;
            for(int j=endCol; j>=startCol;j--){
                
                System.out.print(matrix[endRow][j]+" ");
            }endRow--;

            //left
            if(starRow>endRow || startCol>endCol)break;
            for(int i=endRow; i>=starRow;i--){
                
                System.out.print(matrix[i][startCol]+" ");
            }
        }
           System.out.println();
    } 
     public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        //input
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
       spiralMatrix(matrix);
       }
    }

