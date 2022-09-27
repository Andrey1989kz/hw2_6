import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> word = new ArrayList<>(List.of("лес", "лог", "лес", "поле", "лог"));

        firstTask(nums);
        fourthTask(word);
        secondTask(nums);
        thirdTask(word);
    }

    public static void firstTask(List<Integer> nums) {
        Set<Integer> num = new HashSet<>(nums);
        for (Integer x : num) {
            if (x % 2 != 0) {
                System.out.print(x);
            }
        }
        System.out.println();
    }


    public static void secondTask(List<Integer> nums) {
        Set<Integer> num = new HashSet<>(nums);
        TreeSet<Integer> numTree = new TreeSet<>(num);
        for (int x : numTree) {
            if (x % 2 == 0) {
                System.out.print(x);
            }
        }
    }

    public static void thirdTask(List<String> word) {
        HashSet<String> words = new HashSet<>();
        words.addAll(word);
        word.clear();
        word.addAll(words);
        System.out.println(words);
    }


    public static void fourthTask(List<String> word) {
        Set<String> unique = new HashSet<>(word);
        System.out.println(word.size() - unique.size());
    }
}




