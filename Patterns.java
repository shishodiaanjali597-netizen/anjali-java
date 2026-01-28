// BUTTERLFY 

/*      *
**    **
***  ***
********
********
***  ***
**    **
*      */

/*import java.util.*;
public class Patterns{
    public static void main(String[] args){
        int n=4;
        //UPPER HALF
        for(int i=1;i<=n;i++){
            //1st Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACES
            int spaces =2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd PART
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //LOWER HALF
        for(int i=n;i>=1;i--){
            //1st Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACES
            int spaces =2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd PART
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}*/

   
//HOLLOW BUTTERFLY!!
/*      *
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
*      */
/*import java.util.*;
public class Patterns{
    public static void main(String[] args){
        int n=4;
        //UPPER HALF
        for(int i=1;i<=n;i++){
            //1st Part
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                 System.out.print("*");   
                }
                else{
                    System.out.print(" ");
                }
            }
            //SPACES
            int spaces =2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd PART
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                 System.out.print("*");   
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }
        //LOWER HALF
        for(int i=n;i>=1;i--){
            //1st Part
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                 System.out.print("*");   
                }
                else{
                    System.out.print(" ");
                }
            }
            //SPACES
            int spaces =2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd PART
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                 System.out.print("*");   
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}*/
