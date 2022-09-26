import java.util.*;

public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> word = new ArrayList<>(List.of("лес", "лог", "лес", "поле", "лог"));

    public static void main(String[] args) {
        firstTask();
        fourthTask(word);
        secondTask();
        thirdTask(word);
    }

    public static Integer firstTask() {
        Set<Integer> num = new HashSet<>(nums);
        for (Integer x : num) {
            if (x % 2 != 0) {
                System.out.print(x);
            }
        }
        System.out.println();
        return null;
    }


    public static Integer secondTask() {
        Set<Integer> num = new HashSet<>(nums);
        Collections.sort(nums);
        for (int x : num) {
            if (x % 2 == 0) {
                System.out.print(x);
            }
        }
        System.out.println();
        return null;
    }

    public static String thirdTask(List<String> word) {
        HashSet<String> words = new HashSet<>();
        words.addAll(Main.word);
        Main.word.clear();
        Main.word.addAll(words);
        System.out.println(words);
        return null;
    }


    public static String fourthTask(List<String> word) {
        Set<String> unique = new HashSet<>(Main.word);
        System.out.println(Main.word.size() - unique.size());
        return null;
    }
}



