/**
 * Example:
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print 'Fizz' instead of the number and for
 * the multiples of five print 'Buzz'. For numbers which are multiples of both three and five print 'FizzBuzz'.
 * <p>
 * and compute:
 * a number of Fizz if it is divisible by 3 or if it has a 3 in it;
 * a number of Buzz if it is divisible by 5 or if it hash a 5 in it;
 * a number is FizzBuzz if it divisible by 3 or 5 or if it has a 3 or 5 in it;
 */
public class MiniCode {
    private int numberBy3 = 0;
    private int numberBy5 = 0;
    private int numberBy3And5 = 0;

    public String call(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (number % 5 == 0) {
            if (number % 3 == 0) {
                return "FizzBuzz";
            }
            return "Buzz";
        }
        return "" + number;
    }

    public void compute(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                numberBy3And5++;
                numberBy5++;
            }
            numberBy3++;
        } else if (number % 5 == 0) {
            if (number % 3 == 0) {
                numberBy3And5++;
                numberBy3++;
            }
            numberBy5++;
        }
    }

    public int getNumberBy3() {
        return numberBy3;
    }

    public int getNumberBy5() {
        return numberBy5;
    }

    public int getNumberBy3And5() {
        return numberBy3And5;
    }
}
