package com.data.structure.array;

/**
 * @Author: XuanDaddy
 * @Description:
 * @Date: 2020/6/14
 */
public class Array<E> {

    private E[] data;

    private int size;

    /**
     * 构造方法
     *
     * @param capacity 容量，初始化数组的大小
     */
    public Array(int capacity) {
        //泛型E不能直接new，通过Object构建再转换
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参数构建方法，默认容量capacity = 10
     */
    public Array() {
        data = (E[]) new Object[10];
    }

    /**
     * 获取数组的元素个数
     *
     * @return 元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组的容量
     *
     * @return 数组容量
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 返回数组是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向数组头添加一个新元素
     *
     * @param e 新元素
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 向数组末尾添加一个新元素
     *
     * @param e 新元素
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 在指定的索引位置添加元素
     *
     * @param index 索引
     * @param e     元素
     */
    public void add(int index, E e) {
        if (size == data.length) {
            throw new IllegalArgumentException("addLast failed. Array is full");
        }

        //判断索引是否合法
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("addLast failed. ");
        }

        //插入元素的位置后面的元素向后移动
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        //添加元素
        data[index] = e;
        size++;
    }

    /**
     * 获取index索引位置的元素
     *
     * @param index 索引
     * @return 元素
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index is illegal");
        }
        return data[index];
    }

    /**
     * 获取最后一个元素
     *
     * @return 返回结果
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 获取第一个元素
     *
     * @return 返回结果
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 修改index索引位置的元素
     *
     * @param index 修改位置的索引
     * @param e     修改后的元素
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index is illegal");
        }
        data[index] = e;
    }

    /**
     * 查询数组中是否存在元素e
     *
     * @param e 查询的元素
     * @return 是否包含
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查询元素e的索引，如果存在多个元素e，只会找到第一个元素
     *
     * @param e 元素
     * @return 索引位置，未找到时返回-1
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 从数组中删除index位置的元素，返回删除的元素
     *
     * @param index 删除位置的索引
     * @return 被删除的元素
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index is illegal");
        }

        E ret = data[index];
        //注意：不能以index位置开始，最后一个元素越界
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        return ret;
    }

    /**
     * 刪除第一个元素
     *
     * @return 返回第一个元素
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 删除最后一个元素
     *
     * @return 返回最后一个元素
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除元素，如果存在多个元素e，只会删除第一个
     *
     * @param e 待删除的元素
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            if (i != size - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");

        return builder.toString();
    }
}
