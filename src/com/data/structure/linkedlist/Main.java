package com.data.structure.linkedlist;

/**
 * @Author: XuanDaddy
 * @Description:
 * @Date: 2020/6/29
 */
class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.addLast(i);
            System.out.println(linkedList);
        }

        linkedList.set(3,20);
        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

    }

}
