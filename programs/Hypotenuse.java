import java.util.Scanner;

public class Hypotenuse {
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        
        System.out.println("Enter value for a: ");
        a = scanner.nextDouble();
        System.out.println("Enter value for b: ");
        b = scanner.nextDouble();
        
        c = Math.sqrt((a*a)+(b*b));
        
        System.out.println("The value of the hypotenuse is " + c);
        
    }
}
