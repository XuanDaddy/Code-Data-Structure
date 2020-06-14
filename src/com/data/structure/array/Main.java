package com.data.structure.array;

/**
 * @Author: XuanDaddy
 * @Description:
 * @Date: 2020/6/14
 */
class Main {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(3,50);
        System.out.println(arr);

        arr.addFirst(-10);
        System.out.println(arr);

        arr.remove(3);
        System.out.println(arr);

    }
}
