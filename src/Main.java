import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> word = new ArrayList<>(List.of("лес", "лог", "лес", "поле", "гол"));

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
    }

    public static void firstTask() {
        for (int x : nums) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    public static void secondTask() {
        Collections.sort(nums);
        int unicum = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x % 2 == 0 && x != unicum) {
                System.out.println(x);
            }
        }
    }
    public static void thirdTask() {
        Set<String> unicum = new HashSet<>(word);
        System.out.println(unicum);
    }

    public static void fourthTask() {
        Set<String> unicum = new HashSet<>(word);
        System.out.println(word.size() - unicum.size());
    }
}



