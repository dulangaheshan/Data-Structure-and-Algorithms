package LinkedList;

import BFSImplement.Vertex;

import java.util.Queue;

public class LinkedList {

    public static void main(String[] args) {

        Implement list = new Implement();

        list.insertdata(52);
        list.insertdata(844);
        list.insertdata(454);
        list.print();
        System.out.println("after remove");
        list.remove(52);
        list.print();


    }

}