package com.data.structure.stack;

/**
 * @Author: XuanDaddy
 * @Description: 栈接口，提供基本操作
 * @Date: 2020/6/28
 */
interface Stack<E> {

    /**
     * 获取栈元素个数
     *
     * @return 元素个数
     */
    int getSize();

    /**
     * 栈是否为空
     *
     * @return 是否为空
     */
    boolean isEmpty();

    /**
     * 入栈操作
     *
     * @param e 入栈元素
     */
    void push(E e);

    /**
     * 出栈操作
     *
     * @return 栈顶元素
     */
    E pop();

    /**
     * 查看栈顶元素
     *
     * @return 栈顶元素
     */
    E peek();

}
