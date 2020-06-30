package com.data.structure.linkedlist;

/**
 * @Author: XuanDaddy
 * @Description: 链表节点
 * @Date: 2020/6/29
 */
class Node<E> {

    //节点中存储的元素
    public E e;

    //下一个节点
    public Node next;

    public Node(E e, Node next) {
        this.e = e;
        this.next = next;
    }

    public Node(E e) {
        this(e, null);
    }

    public Node() {
        this(null, null);
    }
}
