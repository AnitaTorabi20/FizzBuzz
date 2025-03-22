public class Main {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        for (int i = start; i <= end; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int number) {
        String result = "";

        if (isDivisibleBy(number, 3)) result += "Fizz";
        if (isDivisibleBy(number, 5)) result += "Buzz";

        return result.isEmpty() ? String.valueOf(number) : result;
    }

    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}