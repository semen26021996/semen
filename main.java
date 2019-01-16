import java.util.stream.IntStream;
public class main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        System.out.println(isPalindrome("palindrom"));
        System.out.println(isPalindrome("palindromordnilap"));
        for (int i = 0; i < 100; i++)
        {
            if (isPrime(i))
                System.out.println(i);
        }
    }
    public static boolean isPalindrome(String string)
    {
        return new StringBuilder(string).reverse().toString().equals(string);
    }

    public static boolean isPrime(final int num)
    {
        return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
    }
}
