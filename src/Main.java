import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            Integer x = nums.get(i);
            if (x % 2 != 0) {
                System.out.print(x);
            }
        }
        System.out.println();
        // Задание 2
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums1.size(); i++) {
            Collections.sort(nums1);
            Integer x = nums1.get(i);
            if (x % 2 == 0) {
                System.out.print(x);
            }
        }
        System.out.println();
        // Задание 3
        Set<String> s = new HashSet<>();
        s.add("лес");
        s.add("сел");
        s.add("лес");
        s.add("река");
        s.add("гора");
        s.add("река");
        for (String set : s) {
            System.out.println(set);
        }
        //Задание 4

        Set<String> n = new HashSet<>();
        n.add("лес");
        n.add("сел");
        n.add("лес");
        n.add("река");
        n.add("гора");
        n.add("река");
        for (String set : n) {
            if ()
            System.out.println(set);
        }
    }

}
