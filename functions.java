// to print sum of first n natural number using function//
import java.util.*;

public class functions {
    public static void addittion(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
           
           sum =sum+i;
           
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        addittion(n);
        
            
        } 
}
