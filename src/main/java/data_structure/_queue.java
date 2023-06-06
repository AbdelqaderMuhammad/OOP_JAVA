package data_structure;

import java.util.LinkedList;
import java.util.Queue;

public class _queue {
    public static void main(String[] args) {
        Queue<Integer> nums = new LinkedList<>() ;
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        nums.remove();
        nums.forEach(System.out::println);

    }
}
