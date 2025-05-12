package recrusion;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class CharHashing
{
    public static void main(String[] args) {
        String str ="thangaprathapkumar";

        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++) {
            char key=str.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println("The key is :"+entry.getKey() + "---> " + entry.getValue());
        }

    }
}
