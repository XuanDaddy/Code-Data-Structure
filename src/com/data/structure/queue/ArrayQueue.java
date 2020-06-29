package com.data.structure.queue;

import com.data.structure.array.Array;

/**
 * @Author: XuanDaddy
 * @Description: 动态数组实现的队列
 * @Date: 2020/6/28
 */
class ArrayQueue<E> implements Queue<E> {

    Array<E> array;

    /**
     * 使用动态数组构建队列
     */
    public ArrayQueue() {
        array = new Array<>();
    }

    /**
     * 使用动态数组构建栈
     *
     * @param capacity 队列容量
     */
    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
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
        builder.append("Queue: ");
        builder.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            builder.append(array.get(i));
            if (i != array.getSize() - 1) {
                builder.append(", ");
            }
        }
        builder.append("] tail");
        return builder.toString();
    }
}
