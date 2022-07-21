package edu.pdx.cs410J.Calculator;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    if(args.length == 0)
      System.err.println("Missing command line arguments");
    Stack<Integer> rpn = new Stack<>();
    for(String arg : args) {
      if(arg.matches("-?\\d+")) {
        rpn.push(Integer.parseInt(arg));
      }

      else {
        try {
          switch (arg) {
            case "+":
              rpn.push(rpn.pop() + rpn.pop());
              break;
            case "*":
              rpn.push(rpn.pop() * rpn.pop());
              break;
            case "/":
              int denom = rpn.pop();
              int numer = rpn.pop();
              rpn.push(numer / denom);
              break;
            case "-":
              int first = rpn.pop();
              int sec = rpn.pop();
              rpn.push(sec - first);
              break;
            case "sqrt":
              rpn.push((int)Math.sqrt(rpn.pop()));
              break;
            default:
              System.err.println("Invalid operator found.");
              return;
          }
        }
        catch (EmptyStackException ex)
        {
          System.err.println("Not enough numbers for operation");
          return;
        }
      }
    }

    if (rpn.size() > 1) {
      System.err.println("Not enough operands for numbers");
      return;
    }

    System.out.println(rpn.pop());
  }
}