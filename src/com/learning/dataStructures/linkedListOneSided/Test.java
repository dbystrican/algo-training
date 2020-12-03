package com.learning.dataStructures.linkedListOneSided;

public class Test {
    public static void main(String[] args) {
        LinkedListOneSided<Integer> list1 = new LinkedListOneSided<>();
        Integer[] nums1 = {1, 2, 35, 6, 3, 9};
        for (int num : nums1) {
            list1.push(num);
        }
        System.out.println("List 1: ");
        System.out.println("List1 has 2: " + list1.has(2));
        System.out.println("List1 has 1421: " + list1.has(1421));
        System.out.println("Removing 6 from list1");
        list1.remove(Integer.valueOf(6));
        System.out.println("Removing 1 from list1");
        list1.remove(Integer.valueOf(1));
        System.out.println("List 1: \n\n" + list1);

        LinkedListOneSided<Integer> list2 = new LinkedListOneSided<>();
        Integer[] nums2 = {12, 13, 356, 231, 123};
        for (int num : nums2) {
            list2.push(num);
        }
        System.out.println("List 2: \n\n" + list2);
        System.out.println("Adding list2 to list1");
        list1.add(list2);
        list1.remove(1);
        System.out.println(list1);
        System.out.println("List one first element " + list1.get(0));

        LinkedListOneSided<Integer> list3 = new LinkedListOneSided<>();
        Integer[] nums3 = {2, 35, 356, 123};
        for (int num : nums3) {
            list3.push(num);
        }
        System.out.println("List 3: \n\n" + list3);
        System.out.println("Subtracting list3 to list1");
        list1.subtract(list3);
        System.out.println(list1);
        System.out.println("Popped last item " + list1.pop());
        System.out.println("Is list 1 empty? " + list1.isEmpty());
    }
}
