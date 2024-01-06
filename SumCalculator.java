public class SumCalculator {
    public int sum;

    public SumCalculator() {
        sum = 0;
    }

    public int calculateSum(int num1, int num2, int num3) {
        sum = num1 + num2 + num3;
        return sum;
    }
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.calculateSum(5, 10, 15);
        System.out.println("The sum of three numbers is: " + result);
    }
}
