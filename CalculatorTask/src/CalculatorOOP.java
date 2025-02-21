class CalculatorOOP {
    public double add(double a,double b){
        return a + b;
    }
    public double sub(double a, double b) {
        return a - b;
    }
    public double multi(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    public double mod(double a, double b) {
        return a % b;
    }
}