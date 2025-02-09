public class recursion {
    public static void printdecreasing(int n)
    {
        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printdecreasing(n-1);
        //System.out.println(n);
    }
    public static int  fabonacchi (int n )
    {
        if(n==1||n==0)
        {
            return n;
        }
        return fabonacchi(n-1)+fabonacchi(n-2);
    }
    public static  int factorial(int n)
    {
        if(n==0)
        {
           // System.out.println(1);
             return 1;
        }
        return  n * factorial(n-1);
    }
    public static void printincreasing(int n)
    {
        if (n==1) {
            System.out.println(1);
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
     //printincreasing(6);
       // printdecreasing(6);
       // System.out.println(factorial(6));
        for (int i=0;i<6;i++)
        System.out.println(fabonacchi(i));
    }

}
