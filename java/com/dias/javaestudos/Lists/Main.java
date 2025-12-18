package java.com.dias.javaestudos.Lists;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

     public static void main(String[] args) {
          System.out.println("Hello World");


          List<String> list = new ArrayList<>();
          list.add("apple");
          list.add("banana");
          list.add("cherry");
          list.add("pear");


          Set<String> setString = new HashSet<>();
          setString.add("apple");
          setString.add("apple");
          setString.add("apple");
          setString.add("apple");
          
          Map<String, String> map = new HashMap<>();
          map.put("name", "banana");

          map.get("name");


          Queue<String> queue = new LinkedList<>();
          queue.add("Joao");
          queue.add("Dias");

          // tira o primeiro
          queue.poll();

          // olha "espia" 
          queue.peek();

          // remove o primeiro da fila
          queue.remove();
     }


     

}
