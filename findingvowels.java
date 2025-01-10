import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class findingvowels {
    public static void main(String[] args) {
        char[] charArray = {'a', 'z', '4', 'i', 'm', '7'};

        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                numbers.add(c);
            } else if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
                vowels.add(c);
            } else if (Character.isLetter(c)) {
                consonants.add(c);
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Numbers: " + numbers);
    }
}
