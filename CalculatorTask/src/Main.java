public class Main {
    public static void main(String[] args) {
        double n1 = 10.0;
        double n2 = 15.0;

        // OOP-based calculator
        CalculatorOOP calculatorOOP = new CalculatorOOP();
        System.out.println("------ OOP Calculator ------");
        System.out.println("Addition: " + calculatorOOP.add(n1, n2));
        System.out.println("Subtraction: " + calculatorOOP.sub(n1, n2));
        System.out.println("Multiplication: " + calculatorOOP.multi(n1, n2));
        System.out.println("Division: " + calculatorOOP.div(n1, n2));
        System.out.println("Modulus: " + calculatorOOP.mod(n1, n2));

        // Functional calculator using lambda expressions calculator
        System.out.println("\n------Functional Calculator ------");
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator multi = (a, b) -> a * b;
        Calculator div = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by 0");
            }
            return a / b;
        };
        Calculator mod = (a, b) -> a % b;

        // Test functional calculator
        System.out.println("Addition: " + add.calculate(n1, n2));
        System.out.println("Subtraction: " + sub.calculate(n1, n2));
        System.out.println("Multiplication: " + multi.calculate(n1, n2));
        try {
            System.out.println("Division: " + div.calculate(n1, n2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Modulus: " + mod.calculate(n1, n2));
    }
}
