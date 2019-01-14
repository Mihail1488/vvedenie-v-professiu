import java.util.stream.IntStream;
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world by Mihail Trachuk");

        System.out.println(isPalindrome("Хай"));

        System.out.println(isPalindrome("шалаш"));

        for (int i = 0; i < 200; i++) {

            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPalindrome(String string) {

        return new StringBuilder(string).reverse().toString().equals(string);
    }

    public static boolean isPrime(final int num) {

        return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
    }
}
