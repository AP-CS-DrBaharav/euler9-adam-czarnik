
/*
 * https://projecteuler.net/problem=9
 *
 * Special Pythagorean triplet
 * Problem 9 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Answer: ____31875000____  <== You fill in (you can check on Euler Project)
 */


public class Euler9 {  
        
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        
        int[] sides = euler9(1000);        
        
        System.out.println("(a,b,c) = (" + sides[0] + "," + sides[1] + "," + sides[2] + ")");
        System.out.println("Their product: (a*b*c) = " + sides[0]* sides[1]*sides[2]);
        
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Time: " + (elapsedTime / 1000000)  + "[msec]");
        
    }        
    
    /**
     * 
     * @param perimeter : Sum of all sides
     * @return three sides of triangle
     */

    public static int[] euler9(int perimeter) {
    
        // ToDo: Your code here
        int[] out = new int[3];
        for (int a=0; a<333; ++a) {
            for (int b=a; b<1000; ++b) {
                int c = (int) perimeter - a - b;
                if ((a*a)+(b*b) == (c*c)) {
                    out[0] = a;
                    out[1] = b;
                    out[2] = c;
                }
            }
        }
        return (out);
    }
        
    
}
