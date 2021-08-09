import java.util.*;

public class DuplicateElementsInTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        int[][] arr = new int[n][n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (hm.containsKey(arr[i][j])) {
                    count = hm.get(arr[i][j]);
                    count++;
                } else count = 1;
                hm.put(arr[i][j], count);
            }
        }

        int dupCount=0;
        for (Map.Entry<Integer, Integer> map : hm.entrySet()){
            if (map.getValue()>1) dupCount++;
        }

            System.out.println(dupCount);
    }
}