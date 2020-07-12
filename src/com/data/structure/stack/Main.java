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

        Stack<Integer> linkedListStack  = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }

        linkedListStack.pop();
        System.out.println(linkedListStack);
    }

}
