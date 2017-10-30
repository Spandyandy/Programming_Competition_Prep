import java.util.HashMap;
import java.util.Map;

public class template2 {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 7, d = 4, e = 5, f = 8;
        System.out.println(minClockTime(a, b, c, d, e ,f));
    }

    public static String minClockTime(int a, int b, int c, int d, int e, int f) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.containsKey(a) ? map.get(a) + 1 : 1);
        map.put(b, map.containsKey(b) ? map.get(b) + 1 : 1);
        map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        map.put(d, map.containsKey(d) ? map.get(d) + 1 : 1);
        map.put(e, map.containsKey(e) ? map.get(e) + 1 : 1);
        map.put(f, map.containsKey(f) ? map.get(f) + 1 : 1);
        for(int i = 0; i <= 23; i++) {
            for(int j = 0; j <= 59; j++) {
                for(int k = 0; k <= 59; k++) {
                    String hour = i + "", min = j + "", sec = k + "";
                    if(i < 10) {
                        hour = "0" + i;
                    }
                    if(j < 10) {
                        min = "0" + j;
                    }
                    if(k < 10) {
                        sec = "0" + k;
                    }
                    if(isEq(map, (hour + min + sec).toCharArray())) {
                        return (hour + ":" + min + ":" + sec);
                    }
                }
            }
        }
        return "Not Valid";
    }

    public static boolean isEq(Map<Integer, Integer> m, char[] a) {
        Map<Integer, Integer> map = new HashMap<>(m);
        for (char anA : a) {
            int ci = Character.digit(anA, 10);
            if (map.get(ci) == null || map.get(ci) == 0) {
                return false;
            }
            map.put(ci, map.get(ci) - 1);
        }
        return true;
    }
}