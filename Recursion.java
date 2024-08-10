
//print number from 5 to 1
/*import java.util.*;

public class Recursion {
    public static void printNumber(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        printNumber(n);
    }

}*/
//loop through
/*public class Recursion {
    public static void main(String args[]) {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}*/

//Print numbers 1 t0 5
/*import java.util.*;

public class Recursion {
    public static void printnumb(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printnumb(n + 1);
    }

    public static void main(String args[]) {
        int n = 1;
        printnumb(n);
    }
}*/

//print sum of first n natural numbers

/*import java.util.*;

public class Recursion {
    public static void printSum(int n,int i,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum=(i+1,n,sum);
    }

    public static void main(String args[]) {
        printSum(1, 5, 0);
    }

}*/

//print factorial of a number n

/*import java.util.*;

public class Recursion {
    public static int calcfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int number = calcfactorial(n - 1);
        int fact = n * number;
        return fact;
    }

    public static void main(String args[]) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}
*/
//print the fibinacci sequence till the nth term*

/*import java.util.*;

public class Recursion {
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n - 2);
    }
}
*/

//print x^n(Stack height=n)

import java.util.*;

public class Recursion {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;// base1
        }
        if (x == 0) {
            return 0;// base2
        }
        int xPownm1 = calcPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}