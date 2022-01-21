import java.util.Scanner;

public class Functions {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
//        int b=in.nextInt();
//        int c=in.nextInt()


//        --------------------------------
//        if(prime(a))
//            System.out.println("is prime");
//        else
//            System.out.println("not prime");
//        --------------------------------
//        vote(a);
//        oddeven(a);
//        min(a,b,c);
//        max(a,b,c);

    }
//--------------------------------------------------------------------------------------
    //the method to print whether a number is prime or not

    static boolean prime(int x) {
        if (x < 1 || x == 1) {
            System.out.println("The number is not prime");
        }

        for (int i = 2; i < x; i++){
            if (x % 2 == 0){
            return false;
            }
        }
        return true;
    }

//--------------------------------------------------------------------------------------
    //the method to find whether a person is eligible to vote or not

    static void vote(int x){
        if(x>18||x==18){
            System.out.println("The candidate is eligible to vote");
        }
        else
            System.out.println("The candidate is not eligible to vote");
    }

//--------------------------------------------------------------------------------------
    //the method to print whether the number is odd or even

    static void oddeven(int x){
        if(x%2==0){
            System.out.println("The number is EVEN "+x);
        }
        else
            System.out.println("The number is ODD "+x);
    }


// --------------------------------------------------------------------------------------
    //the method to print minimum number

    static void min(int x,int y,int z){
        if(x<y){
            if(x<z){
                System.out.println("the smallest is x "+x);
            }
            else{
                System.out.println("the smallest is z" +z);
            }
        }
        else if(y<z){
            System.out.println("the smallest is y "+y );
        }
        else System.out.println("the smallest is z " +z);
    }

//--------------------------------------------------------------------------------------
    //the method to print the largest number

    static void max(int x,int y,int z){
       if(x>y){
           if(x>z){
               System.out.println("the largest is x "+x);
           }
           else{
               System.out.println("the largest is z" +z);
           }
       }
       else if(y>z){
           System.out.println("the largest is y "+y );
       }
       else System.out.println("the largest is z " +z);
    }

}







