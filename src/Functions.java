import java.util.Scanner;

public class Functions {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        nsum(a);


        primebtn(a,b);
        // --------------------------------------------------------------------------------------
        if(prime(a))
            System.out.println("is prime");
        else
            System.out.println("not prime");
        // --------------------------------------------------------------------------------------
        palindrome(a);
        System.out.println(factorial(a));
        vote(a);
        oddeven(a);
        min(a,b,c);
        max(a,b,c);

    }
    // --------------------------------------------------------------------------------------
    //method to find the sum of n natural numbers
    static void nsum(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
// --------------------------------------------------------------------------------------
//    method to find the prime number between two number

   static void primebtn(int x,int y){
        for(int i=x;i<y;i++){

            if(prime(i))
                System.out.println(i);
        }
   }

   // --------------------------------------------------------------------------------------
        //the method to print whether a number is prime or not

    static boolean prime(int x) {
        if (x < 1 || x == 1)
            return false;

        for (int i = 2; i<=x/2; i++){
            if (x % i == 0){
            return false;
            }
        }
        return true;
    }
//
// --------------------------------------------------------------------------------------
//    method to find the palindrome number

    static void palindrome(int x){
        int reverse=0,xcopy=x;
        while(xcopy>0){
            int modulas=xcopy%10;
            reverse=reverse*10+modulas;
            xcopy=xcopy/10;
        }
        if(x==reverse)
            System.out.println("The number is a palindrome number");
        else
            System.out.println("The number is not a palindrome number");
    }

//    method to find the factorial

    static int factorial(int x){
        int sum=1;
        if(x==0 || x==1){
            return 1;
        }
        for(int n=x;n>0;n--){
             sum=sum*n;
        }
        return sum;
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
                System.out.println(x);
            }
            else{
                System.out.println(z);
            }
        }
        else if(y<z){
            System.out.println(y);
        }
        else System.out.println(z);
    }

//--------------------------------------------------------------------------------------
    //the method to print the largest number

    static void max(int x,int y,int z){
       if(x>y){
           if(x>z){
               System.out.println(x);
           }
           else{
               System.out.println(z);
           }
       }
       else if(y>z){
           System.out.println(y);
       }
       else System.out.println(z);
    }

}







