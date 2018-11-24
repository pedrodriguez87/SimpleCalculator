public class Calculator {

    public static void main(String[] args) {

        SimpleCalculator cal = new SimpleCalculator(0);

        cal.add(2);
        cal.add(1);
        cal.multiply(4);
        cal.substract(3);
        cal.divide(2);

        int x = cal.value;

        System.out.println(x);

    }



}
