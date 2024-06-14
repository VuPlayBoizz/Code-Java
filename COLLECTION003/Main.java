package COLLECTION003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < parts.length; j += 2) {
                map.put(parts[j], Integer.parseInt(parts[j + 1]));
            }
            int rarestAge = rarest(map);
            System.out.println(rarestAge);
        }
    }

    public static int rarest(Map<String, Integer> map) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer age : map.values()) {
            frequencyMap.put(age, frequencyMap.getOrDefault(age, 0) + 1);
        }

        int rarestValue = Integer.MAX_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int age = entry.getKey();
            int frequency = entry.getValue();

            if (frequency < minFrequency || (frequency == minFrequency && age < rarestValue)) {
                minFrequency = frequency;
                rarestValue = age;
            }
        }

        return rarestValue;
    }
}

