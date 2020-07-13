public class Runner {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(8, 3);
        System.out.println(calculator.getNum1());
        System.out.println(calculator.getNum2());
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());

    }
}
