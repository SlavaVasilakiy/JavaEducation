public class Palindrome {
    public static void main(String[] args) {
        Start.start();
    }
}

/**
 * Инициализируем переменные left и right для того что бы шагать по строке слева и справа
 * затем проверяем, если текущий символ не буква или цифра, то двигаем индекс
 * создаем переменные char, куда кладём символы по текущим индексам и сравниваем их,
 * если они не равны, то сразу возвращаем false
 * если равны то двигаем индексы дальше
 */
class SolutionPolindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class Start {
    public static void start() {
        Boolean start = new SolutionPolindrome().isPalindrome(" ava    ava    ");
        System.out.println(start);
    }
}

