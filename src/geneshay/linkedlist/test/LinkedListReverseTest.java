package geneshay.linkedlist.test;

import geneshay.linkedlist.main.SinglyLinkedList;
import org.junit.Test;

public class LinkedListReverseTest {

    @Test
    public void linkedListReverseTest() {

        SinglyLinkedList<String> stringList = new SinglyLinkedList<>();
        String[] strings = {"one","two","three","four","five"};
        for(String s : strings){
            stringList.add(s);
        }
        stringList.reverse();
        assert stringList.getHead().equals("five");
        assert stringList.getTail().equals("one");

        SinglyLinkedList<Integer> integerList = new SinglyLinkedList<>();
        Integer[] integers = {1,2,3,4,5};
        for(Integer i : integers){
            integerList.add(i);
        }
        integerList.reverse();
        assert integerList.getHead() == 5;
        assert integerList.getTail() == 1;
    }

}
