import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args){
        Map<String, Object> x = new HashMap<>();
        Map<String, Object> y = new HashMap<>();
        Set<Map<String, Object>> xy = new HashSet<>();
        System.out.println(x.equals(y));

        x.put("hello", "Hello");
        y.put("hello", "Hello");
        x.put("hello2", 1);
        y.put("hello2", 4);

        xy.add(x);
        xy.add(y);
        System.out.println(x.equals(y));
        System.out.println(xy);

        x.putAll(y);
        System.out.println(x);

    }
}
