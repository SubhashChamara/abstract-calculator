import com.mycal.*;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Shape rect = new Rectangle(5,10);
        System.out.println("Rectangular area:"+calc.area(rect));

        Shape rond = new Round(10);
        System.out.println("Round area:"+calc.area(rond));

        Shape tri = new Triangle(5,10);
        System.out.println("Triangle area:"+calc.area(tri));



    }
}