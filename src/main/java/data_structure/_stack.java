package data_structure;

import java.util.Stack;

/*
    stack comes from Vector which comes from AbstractLists which comes from Collections
 */

public class _stack {
    public static void main(String[] args) {
        Stack<String> colors = new Stack<>();
        colors.addElement("red");
        colors.push("blue");
        System.out.println(colors);
    }

}
