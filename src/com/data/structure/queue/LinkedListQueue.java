package com.data.structure.queue;

import com.data.structure.linkedlist.Node;

/**
 * @Author: XuanDaddy
 * @Description: 使用链表实现队列
 * @Date: 2020/7/12
 */
class LinkedListQueue<E> implements Queue<E> {

    //同时维护头尾指针，可以在tail添加元素，head删除元素
    private Node<E> head, tail;

    private int size;

    @Override
    public void enqueue(E e) {
        //链表为空
        if (head == null) {
            head = new Node<>(e);
            tail = head;
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }

        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");
        }

        Node retNode = head;
        head = head.next;
        retNode.next = null;
        //只有一节点时
        if (head == null) {
            tail = null;
        }

        size--;
        return (E) retNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot get from an empty queue");
        }
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queue: ");
        builder.append("front ");
        Node node = head;
        while (node != null) {
            builder.append(node.e).append("->");
            node = node.next;
        }
        builder.append("NULL tail");
        return builder.toString();
    }
}
