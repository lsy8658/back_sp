import java.util.ArrayList;

public class ArrList {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("김");
        list.add("이");
        // list.remove("김");
        // list.remove("김");
        
        // System.out.println(list.get(0));
        // System.out.println(list.contains("이"));
        // list.clear();

        // System.out.println(list.size());
        list.set(0,"최");
        System.out.println(list.get(0));
    }
}
