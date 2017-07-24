package math;

public class Math {
     public static void main( String[] args ) {
         int p,q,r,s,t,u;
          double a,b,c;
          String first, second, third, four, five, together;
 
          p = 8;
          q = 25;
          c = 6;
          t = 4;
         System.out.println( "p is " + p + ", q is " + q );
 
         c+= 4;
         System.out.println("c+4 is " + c);
         t-= 4;
         System.out.println("t-4 is " + t);
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         first = "Peanut butter";
         second = " and ";
         third = "jelly";
         four = " are ";
         five = "so disgusting.";
         together = first + second + third + four + five;
         System.out.println( together );
     }
}