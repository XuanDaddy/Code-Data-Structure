package com.data.structure.linkedlist;

/**
 * @Author: XuanDaddy
 * @Description: 链表
 * @Date: 2020/6/29
 */
class LinkedList<E> {

    //虚拟头节点
    private Node<E> dummyHead;

    /**
     * 构造方法，初始化一个节点作为虚拟头结点
     */
    public LinkedList() {
        dummyHead = new Node<>();
    }

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

        //找到待添加位置的前一个节点
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        prev.next = new Node<>(e, prev.next);

        size++;
    }

    /**
     * 在链表头添加新的元素
     *
     * @param e 添加的元素
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 在链表末尾添加元素e
     *
     * @param e 待添加的元素e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 查询链表index(0-based)位置的元素
     * 在链表中理论上不存在索引，练习使用
     *
     * @param index 索引
     * @return 查询到的元素
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index is invalid");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return (E) cur.e;
    }

    /**
     * 获取第一个元素
     *
     * @return 第一个元素结果
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获取最后一个元素
     *
     * @return 最后一个元素
     */
    public E getLast() {
        return get(size);
    }

    /**
     * 查找链表中是否存在元素e
     *
     * @param e 待查找的元素
     * @return 存在结果
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;

        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    /**
     * 修改链表index(0-based)位置的元素
     * 在链表中理论上不存在索引，练习使用
     *
     * @param index 索引位置
     * @param e     新的元素
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index is invalid");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        cur.e = e;
    }

    /**
     * 删除修改链表index(0-based)位置的元素
     * 在链表中理论上不存在索引，练习使用
     *
     * @param index 待删除元素的位置
     * @return 刪除的元素
     */
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index is invalid");
        }

        //找到待删除节点的前一个节点
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        //将前一个节点的next连接到待删除节点的下一个节点
        Node retNode = prev.next;
        prev.next = retNode.next;
        //移除引用
        retNode.next = null;

        size--;

        return (E) retNode;
    }

    /**
     * 从链表中删除第一个元素，返回删除的元素
     *
     * @return 刪除的元素
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 从链表中删除最后的元素，返回删除的元素
     *
     * @return 刪除的元素
     */
    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node node = dummyHead.next;
        while (node != null) {
            builder.append(node.e).append("->");
            node = node.next;
        }
        builder.append("NULL");
        return builder.toString();
    }
}
