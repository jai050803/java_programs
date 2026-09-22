public class calculator {
    public int sum, difference,product,quotient,remainder ;
    public double division;

    public calculator(){
        sum = product = difference = quotient = remainder = 0;
        division = 0;
    }

    public int Sum(int a, int b, int c){
            sum = a+b+c;
        return sum;
    }

    public int difference(int a, int b){
        difference = a-b;
        return difference;
    }

    public int product(int a, int b, int c){
        product = a*b*c;
        return product;
    }
    public double division_of_numbers(double a, double b){
        division = (double) a/b;
        return division;
    }
    public int floor_division(int a, int b){
        quotient = a/b;
        return quotient;
    }

    public int remainder(int a , int b){
        int remainder = a % b;
        return remainder;
    }

    public static void main(String[] args) {
        calculator calculate = new calculator();
        int sumNumber = calculate.Sum(5,10,12);
        int minus = calculate.difference(50,30);
        int multiply = calculate.product(45,50,30);
        double divide = calculate.division_of_numbers(34,16);
        int floor = calculate.floor_division(34,10);
        int remainderNumber = calculate.remainder(sumNumber, floor);
        System.out.println("the results are: \n " + 
        "sum: " + sumNumber + "\n" +
        "difference: " + minus + "\n" +
        "product: " + multiply + "\n" +
        "division: " + divide + "\n" +
        "quotient: " + floor  + "\n" + 
        "Remainder: " + remainderNumber);
    }
}
