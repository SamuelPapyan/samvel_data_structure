package com.company;

import dataStructure.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("ArrayList example");
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Of");
        arrayList.add("IT");
        arrayList.add("Programmers");
        for(String item : arrayList){
            System.out.print(item + " ");
        }
        System.out.println();


        System.out.println("LinkedList Example");
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("5");
        linkedList.add("8");
        linkedList.remove(2);
        for(String item : linkedList){
            System.out.println(item);
        }

        System.out.println("Exercise *");

        MyStack<Character> charStack = new MyStack<Character>();
            //String sentence = "(x + [y - z] * {7+m})";
            String sentence = "(x + {y * [z} + 8])";
            char[] charArr = sentence.toCharArray();
            boolean isRightSentence = true;
            charStack.push(charArr[0]);
            for (int i = 1; i < sentence.length(); i++) {
                if (charArr[i] == ')')
                    if (charStack.peek() != '(')
                        isRightSentence = false;
                    else
                        charStack.pop();
                if (charArr[i] == '}')
                    if (charStack.peek() != '{')
                        isRightSentence = false;
                    else
                        charStack.pop();
                if (charArr[i] == ']')
                    if (charStack.peek() != '[')
                        isRightSentence = false;
                    else
                        charStack.pop();
                if (charArr[i] == '(' || charArr[i] == '{' || charArr[i] == '[')
                    charStack.push(charArr[i]);
            }

        System.out.println(sentence);
        System.out.println(isRightSentence);

        System.out.println("MyQueue example");
        MyQueue<Character> queue = new MyQueue<Character>();
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        queue.enqueue('d');
        queue.enqueue('e');
        for(char item : queue){
            System.out.println(item);
        }

        System.out.println("MyStack example");
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for(int item : stack){
            System.out.println(item);
        }


        System.out.println("MyHashMap example");
        Person p1 = new Person("Gagik",17,Gender.MALE);
        Person p2 = new Person("Anna",18,Gender.FEMALE);
        Person p3 = new Person("Andrey",10,Gender.MALE);
        MyHashMap<Person, Double> salary = new MyHashMap<>();
        salary.put(p1,1245.66);
        salary.put(p2,2345.77);
        salary.put(p3,3456.88);
        System.out.println(p1 + " | " + salary.get(p1));
        System.out.println(p2 + " | " + salary.get(p2));
        System.out.println(p3 + " | " + salary.get(p3));
    }
}
