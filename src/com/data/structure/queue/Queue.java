package com.data.structure.queue;

/**
 * @Author: XuanDaddy
 * @Description: 队列接口
 * @Date: 2020/6/28
 */
interface Queue<E> {

    /**
     * 入队
     *
     * @param e 加入队尾的元素
     */
    void enqueue(E e);

    /**
     * 出队
     *
     * @return 返回队首的元素
     */
    E dequeue();

    /**
     * 获取队首的元素
     *
     * @return 返回队首的元素
     */
    E getFront();

    /**
     * 队列元素个数
     *
     * @return 元素数量
     */
    int getSize();

    /**
     * 队列是否为空
     *
     * @return 是否为空
     */
    boolean isEmpty();

}
