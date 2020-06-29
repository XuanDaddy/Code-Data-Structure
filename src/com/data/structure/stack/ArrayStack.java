package com.data.structure.stack;

import com.data.structure.array.Array;

/**
 * @Author: XuanDaddy
 * @Description: 动态数组实现栈
 * @Date: 2020/6/28
 */
class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    /**
     * 使用动态数组构建栈
     */
    public ArrayStack() {
        array = new Array<>();
    }

    /**
     * 使用动态数组构建栈
     *
     * @param capacity 栈容量
     */
    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    /**
     * 获取容量
     *
     * @return 容量大小
     */
    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Stack: ");
        builder.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            builder.append(array.get(i));
            if (i != array.getSize() - 1) {
                builder.append(", ");
            }
        }
        builder.append("] top");
        return builder.toString();
    }
}
