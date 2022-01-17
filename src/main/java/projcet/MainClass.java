package projcet;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        String text = "Меня зовут Андрей. Мне 18 лет, я учусь в колледлже, мне нравится изучать Джаву";
        String [] words = text.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if (count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
        for (String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}
