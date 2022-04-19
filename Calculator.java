public class Calculator {
    public Calculator(){

    }
    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public int divide(int x, int y){
        return x / y;
    }

    public int modulo(int x, int y){
        return x % y;
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();


        System.out.println(myCalculator.add(9, 5));

        System.out.println(myCalculator.subtract(39, 4));

        System.out.println(myCalculator.multiply(12, 6));

        System.out.println(myCalculator.divide(35, 7));

        System.out.println(myCalculator.modulo(58, 3));
    }
}
