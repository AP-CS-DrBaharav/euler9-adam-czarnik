
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
 * Answer: 31875000
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
    
        // aa and bb need to go only up to perimter/2, as out assumption was
        // aa<bb<cc
        for (int aa=1; aa<perimeter/2 ; ++aa){
            for (int bb=aa; bb<perimeter/2; ++bb) {
                int cc = perimeter - aa - bb;
                if (cc>bb)
                    if (aa*aa+bb*bb-cc*cc ==0)
                        return (new int[] {aa,bb,cc}) ;
            }
        }
        return (new int[3]) ;
    }
        
    
}
