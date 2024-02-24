//in that we cover arraylist,set concept

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collection {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // Add elements to the collection using add() method

        // List<Integer> nums = new ArrayList<Integer>();

        // Set<Integer> nums = new HashSet<Integer>();
        // A collection that contains no duplicate elements.
        // More precisely, sets are collections that contain no pair of equal elements.
        // It also supports adding and removing elements.

        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        // nums.add(6);
        // System.out.println(nums.indexOf(5));
        // System.out.println(nums.get(2)); // Output: 8

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
