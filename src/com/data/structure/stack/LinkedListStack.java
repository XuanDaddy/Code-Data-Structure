package com.data.structure.stack;

import com.data.structure.linkedlist.LinkedList;

/**
 * @Author: XuanDaddy
 * @Description: 使用链表实现栈
 * @Date: 2020/7/12
 */
class LinkedListStack<E> implements Stack<E> {

    //链表数据
    private LinkedList<E> list;

    public LinkedListStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Stack: top ");
        builder.append(list);
        return list.toString();
    }
}
