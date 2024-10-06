import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,4,5,6,7,8};

        for(int e : arr){
            System.out.print(e + " ");
        }

        Map<Integer, Integer> map = new TreeMap<>();
        for(Integer num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);




    }
}