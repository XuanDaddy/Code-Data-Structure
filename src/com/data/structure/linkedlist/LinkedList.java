package com.data.structure.linkedlist;

/**
 * @Author: XuanDaddy
 * @Description: 链表
 * @Date: 2020/6/29
 */
class LinkedList<E> {

    //链表头
    private Node<E> head;

    //链表中元素个数
    private int size;

    /**
     * 获取链表中元素个数
     *
     * @return 元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 链表是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表头添加新的元素
     *
     * @param e 添加的元素
     */
    public void addFirst(E e) {
        Node<E> node = new Node<>(e);
        node.next = head;
        head = node;

        //简易写法
//    head = new Node<>(e, head);

        size++;
    }

    /**
     * 在链表index(0-based)位置添加新的元素e
     * 在链表中理论上不存在索引，练习使用
     *
     * @param index 链表位置
     * @param e     待添加元素
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index is invalid");
        }

        //在表头添加元素
        if (index == 0) {
            addFirst(e);
        } else {
            //找到待添加位置的前一个节点
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

            //待添加的节点
//        Node<E> node = new Node<>(e);
//        node.next = prev.next;
//        prev.next = node;

            prev.next = new Node<>(e, prev.next);
        }

        size++;
    }

/**
 * 在链表末尾添加元素e
 *
 * @param e 待添加的元素e
 */
public void addLast(E e) {
    add(size, e);
}

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node node = head;
        builder.append("head [ ");
        while (node != null) {
            builder.append(node.e).append(",");
            node = node.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
