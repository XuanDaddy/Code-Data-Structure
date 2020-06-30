package com.data.structure.linkedlist;

/**
 * @Author: XuanDaddy
 * @Description:
 * @Date: 2020/6/29
 */
class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.add(1,3);
        linkedList.add(3,4);
        System.out.println(linkedList);
    }

}
