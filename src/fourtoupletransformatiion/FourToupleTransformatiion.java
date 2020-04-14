/*
 * Karl Butler
 * 4/14/2020
 * Four Touple Transformation
 * this program repetivly does (a,b,c,d) → (|a−b|,|b−c|,|c−d|,|d−a|)
 */
package fourtoupletransformatiion;
import javax.swing.JOptionPane;
/**
 *
 * @author Karl Butler
 */
public class FourToupleTransformatiion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * declaring variables
         * gNum is used to get the numbers the user wants to do the calculations on 
         * num1-4 are the numbers the user has selected just as a integer
         * i is used to keep track of the number of times the function does the recursive sequence
         */
        
        String gNum;
        int num1,num2,num3,num4;
         int i=0;
        //getting the users input
        gNum=JOptionPane.showInputDialog("input your first non negative number");
        num1=Integer.parseInt(gNum);
        
        gNum=JOptionPane.showInputDialog("input your second non negative number");
        num2=Integer.parseInt(gNum);
        
        gNum=JOptionPane.showInputDialog("input your third non negative number");
        num3=Integer.parseInt(gNum);
        
        gNum=JOptionPane.showInputDialog("input your fourth non negative number");
        num4=Integer.parseInt(gNum);
        
//putting the numbers in the recrsive sequence

        math(num1,num2,num3,num4,i);
        
    }
    
   public static void math(int a,int b, int c, int d,int i){
  /*
   * declaring new variables
   * iOld is used to count the the number of times the function does the recursive sequence
   * aOld is used because d needs a unchanged for the math
   */
   int iOld=i;
   int aOld=a;
   
   //this if statment recalls the function and checks if the numbers are equal to zero aswell the mathis inside this function
   
       if(a<=0||b<=0||c<=0||d<=0){
        System.out.println("number of recursion = "+i+"("+a+","+b+","+ c +"," +d+")");
    }else{
           a=Math.abs(a-b);
           b=Math.abs(b-c);
           c=Math.abs(c-d);
           d=Math.abs(d-aOld);
           i= iOld+1;
           math(a,b,c,d,i);
          
       }
}
    
}
