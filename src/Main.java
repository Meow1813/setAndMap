import java.util.*;


public class Main {
    public static void task1(List<Integer> list) {
        for (int num : list) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> list) {
        for (int num : new HashSet<>(list)) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task3(String words) {
        for (String word : new HashSet<>(List.of(words.split(" ")))) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public static void task4(String words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        List<String> wordsList = new ArrayList<>(List.of(words.split(" ")));
        for (String word : wordsList) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        for (Integer wordCount : wordsMap.values()) {
            if (wordCount != 1) {
                System.out.print(wordCount + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        String words = "В мире горы есть и долины есть " +
                "В мире хоры есть и низины есть " +
                "В мире море есть и лавины есть " +
                "В мире боги есть и богини есть";
        task1(nums);
        task2(nums);
        task3(words);
        task4(words);

    }

}

