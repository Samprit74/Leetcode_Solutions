
import java.util.*;

public class SortByFreq2 {
    public static void main(String asss[]) {
        Integer arr[] = { 1, 3, 4, 2, 5, 3, 8, 5, 9, 0, 1, 3, 4, 7, 5, 2 };
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr)
            map.merge(i, 1, Integer::sum);

        List<Integer> list[] = new List[arr.length + 1];

        for (int i : map.keySet()) {
            int freq = map.get(i);
            if (list[freq] == null)
                list[freq] = new ArrayList<>();
            list[freq].add(i);
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                 for(int val : list[i]){
                    for(int j=0;j<i;j++){
                        System.out.print(val+" ");
                    }
                 }
            }
        }

    }
}
