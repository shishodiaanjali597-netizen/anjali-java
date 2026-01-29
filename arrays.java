//Java program to add two matrix and store it into another matrix



import java.util.*;
public class arrays {
    public static void main(String[] args){
        int[] []a ={{1,2}, {3,4}};
        int[] []b ={{5,6},{7,8}};
        int[] []sum= {{0,0}, {0,0}};
        //Adding the matrix
        for (int i=0;i<a.length;i++){
            for(int j=0;j< a[i].length;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        //printing the resultant matrix 
        System.out.println("Resultant matrix;");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j< sum[i].length;j++){
                System.out.print(sum[i][j]+" ");
            
            }
            System.out.println();
        }


    }
}
