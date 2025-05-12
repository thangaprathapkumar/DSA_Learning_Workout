package recrusion;

import java.util.HashMap;
import java.util.Map;

public class Hasing {

    // Recommended

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,3,3,2,1};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            int key = arr[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println("The key is :"+entry.getKey() + "---> " + entry.getValue());
        }
    }

}
