package by.it.akhmelev.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("333333");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        List<String> list2=new ListA<>();
        list2.add("One");
        list2.add("Two");
        list2.add("333333");
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);
    }
}
