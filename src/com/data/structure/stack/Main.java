package com.data.structure.stack;

/**
 * @Author: XuanDaddy
 * @Description:
 * @Date: 2020/6/28
 */
class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }

}
