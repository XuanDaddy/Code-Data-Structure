package com.data.structure.queue;

/**
 * @Author: XuanDaddy
 * @Description: 循环队列
 * @Date: 2020/6/28
 */
class LoopQueue<E> implements Queue<E> {

    private E[] data;

    //队首和队尾（下一个元素）的位置
    private int front, tail;

    private int size;

    public LoopQueue(int capacity) {
        //有意浪费掉一个空间
        data = (E[]) new Object[capacity + 1];
    }

    public LoopQueue() {
        this(10);
    }

    @Override
    public void enqueue(E e) {
        //队列已满
        if ((tail + 1) % data.length == front) {
            //扩容，之前容量2倍
            resize(getCapacity() * 2);
        }

        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * 扩容，浪费一个空间
     *
     * @param newCapacity 新的容量
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            //循环队列偏移
            newData[i] = data[(i + front) % data.length];
        }

        data = newData;

        //更新队首和队尾
        front = 0;
        tail = size;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }

        //取出队首元素
        E ret = data[front];
        data[front] = null;
        //移动队首指向
        front = (front + 1) % data.length;
        //维护元素个数
        size--;

        //缩容
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty");
        }
        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 返回队列容量
     *
     * @return 队列容量
     */
    public int getCapacity() {
        return data.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
        builder.append("front [");
        //从队首到队尾的循环
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            builder.append(data[i]);
            if ((i + 1) % data.length != tail) {
                builder.append(", ");
            }
        }
        builder.append("] tail");

        return builder.toString();
    }
}
