package Containers;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Arr {
    public static void main(String[] arg){
        ArrayList<Integer> list = new ArrayList();
        list.add(123);
        list.add(12);
        list.add(1234);
        boolean b =  list.contains(123);
        for(int i = 0; i < list.size(); ++i){
            System.out.println(list.get(i));
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()){
          System.out.print(stack.pop() + " ");
        }


    }
}
