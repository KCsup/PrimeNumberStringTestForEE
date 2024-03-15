import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 500; i++)
            System.out.println(getPrimeString(i));
    }



    private static String getPrimeString(int n) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);

        String primeConcat = "2";

        for(int i = 0; i < (n + 5); i++) {
            int nextPrime = primes.get(i) + 1; // since primes start at 2

            boolean primeFound = false;
            
            while(!primeFound) {
                for (int c = 2; c < nextPrime; c++) {
                    if(nextPrime % c == 0) {
                        nextPrime += 1;
                        break;
                    }
                    else if(c == nextPrime - 1) {
                        primeFound = true;
                        break;
                    }
                }
            }

            primes.add(nextPrime);
            primeConcat += nextPrime;
        }

        return primeConcat.substring(n, n + 5);
    }
}
