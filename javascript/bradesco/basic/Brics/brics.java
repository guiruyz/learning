
package javascript.bradesco.Brics;
import java.util.Arrays;

public class brics {
    public static void main (String[] args) {   
    String[] country = {"Brazil", "India", "Russia", "China","South Africa"};
    System.out.println(country[0]); 
    System.out.println(Arrays.toString(country));

    int position = Arrays.binarySearch (country, "Brazil");
    System.out.println (position); 

    Arrays.sort (country, 0 , country.length);
    System.out.println (Arrays.toString (country));
    }
}
