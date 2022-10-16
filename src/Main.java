import javax.swing.*;
import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("adg", "fag", "gnk", "adg", "rt"));
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1(){
        for (int num : nums) {
            if (num % 2 != 0){
                System.out.println(num);
            }
        }
    }

    public static void task2(){
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0){
                if (num != prevNum) {
                    prevNum = num;
                    System.out.println(num);
                }
            }
        }
    }

    public static void task3(){
        Set<String> wordsUnique = new HashSet<>(words);
        System.out.println(wordsUnique);
    }

    public static void task4() {
        Set<String> wordsUnique = new HashSet<>(words);
        for (String s: wordsUnique) {
            if (Collections.frequency(words, s) > 1) {
                System.out.println(s + ": " + Collections.frequency(words, s));
            }
        }
    }
}

