/**
 * code to write "Hello world!" in prompt command
 * @author guiruyz
 */
public class HelloWorld {
    /**
     * @param args
     */
    public static void main (String[] args) {
        System.out.println("Hello world!");
        System.out.println("It is my first code in Java");
        String name = "Guilherme";
        int age = 18;
        float next_year = age + 1; 
        boolean learning = true;
        System.out.printf("Name: " + name + "\nAge: " + age + " \n\rIn next year i will be: "+ next_year + "\n\rI'm learning? " + learning);
    }
}