package JavaMemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class EX08 {
   public static void main(String[] args) {
      List<Integer> list = Arrays.asList(10, 20, 30);
  

      List a = list.stream()
      .filter(i -> i == 10).toList();

          System.out.println(a);
   } 
}

/*

   class Test<T> {
      T data;
      
      public  T getTestValue (T data) {
         return data;
      } 
   }

   Test<String> test = new Test();
   Test<Integer> test2 = new Test();
   System.out.println(test.getTestValue("ㅋㅋㅋ"));
   System.out.println(test2.getTestValue(123));
*/
/*
   ArrayList<Integer> list = new ArrayList<>();
      
   list.add(5);
   list.add(10);
   list.set(0, 50) // 0 번째 index를 50으로
   list.set(0, "hi");
   // System.out.println(list.get(1));
   // System.out.println(list.contains(10));
   // System.out.println(list.size());
   // list.clear();
   list.remove(0); // index로 접근
   System.out.println(list);
*/

/*
   LinkedList<String> list = new LinkedList<>();
   list.add("1");
   list.add("2");
   
   System.out.println(list.get(0));
   System.out.println(list.getFirst());
   System.out.println(list.getLast());
   list.addFirst("3");
   list.addLast("5");
   list.removeFirst();
   list.removeLast();
   list.remove(0);
   list.clear();
   System.out.println("list => " + list);     
   for(String i : list) {
      System.out.println(i);
   } 
*/

/* 
  HashSet<String> set = new HashSet<>();

   set.add("철수");
   set.add("영의"); 
   set.add("철수");
   set.remove("철수");
   // System.out.println(set.contains("영의"));
   set.size();
   set.clear();
   System.out.println(set);

   - 중복 허용 X
   - contains는 index가 아닌 값으로 검색한다.
*/

/* 
   HashMap<String, Integer> map = new HashMap<>();
   map.put("철수", 100);
   map.put("영희", 50);
   System.out.println("size => "+map.size());
   System.out.println("containsKey => " + map.containsKey("영희"));
   // map.remove("철수");
   System.out.println(map.get("영희")); // value를 가져옴
   System.out.println(map);
*/

/* 
   HashSet<String> list = new HashSet<>();

   list.add("cj");
   list.add("sk");
   list.add("kt");

   Iterator<String> it = list.iterator();

   while (it.hasNext()) {
      System.out.println(it.next());
   }
*/

/*
   @FunctionalInterface
   interface MyInter {
      int calc(int a, int b);
   }

   public class EX08 {
      public static void main(String[] args) {
         MyInter add = (a, b) -> a + b;

         System.out.println(add.calc(10,20));
      } 
   }
*/

/*
   List<Integer> list = Arrays.asList(10, 20, 30);
  

   List a = list.stream()
      .filter(i -> i == 10).toList();

          System.out.println(a);
*/

/*

*/

/*

*/

/*

*/

/*

*/