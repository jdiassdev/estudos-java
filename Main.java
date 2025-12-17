import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
          // Tipos inteiros
          // byte -> 8 bits => -128 a 127
          // short -> 16 bits => -32.768 a 32.767
          // int -> 32 bits => -2.147.483.648 a 2.147.483.647
          // long -> 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

          // Tipos decimais
          // float => 32 bits => precisao simples
          // double => 64 bits => precisao dupla

          // Tipo de texto
          // String => palavras e frases chave""
          // char => unico caractere chave ''

          // Tipo Booleano
          // boolean => true e false

          byte b = 100;
          short s = 10000;
          int i = 100000;
          long l = 100L;
          float f = 10.5f;
          double d = 20.5;
          char c = 'A';
          String str = "Joao";
          boolean bool = true;

          // Condiciconais

          if (!bool) {
               System.out.println("true");
          } else {
               System.out.println("false");
          }

          if (b > 99) {
               System.out.println("maior que 99, o valor é " + b);
          } else if (b == 100) {
               System.out.println("igual a " + b);
          } else {
               System.out.println("menor que 99, o valor é" + b);
          }

          if (str == "Dias") {
               System.out.println("Dias");
          } else if (str.length() > 5) {
               System.out.println("Seu nome é " + str);
          } else {
               System.out.println("Hellow");
          }

          /* Colecao se refere a [] depois do tipo => array */

          int[] colectionInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

          System.out.println(colectionInt[2]);

          String[] nomesArray = new String[10];

          nomesArray[0] = "Joao";

          nomesArray[1] = "Victor";

          nomesArray[2] = "Dias";

          System.out.println(nomesArray[1]);

          /* Lista de arry para trabalhar dinamicamente */
          ArrayList<String> nomes = new ArrayList<>();
          nomes.add("Joao");
          nomes.add("Victor");
          nomes.add("Tavares");
          nomes.add("Dias");

          System.out.println(nomes.get(1));

          nomes.remove(0);
          // nomes.remove("Dias");

          // Laços de repetiçao
          for (int numero = 0; numero < 15; numero++) {
               System.out.println(numero);
          }

          for (String nome : nomes) {
               System.out.println(nome);
          }

          int count = 0;
          while (count < 10) {
                System.out.println("Estou em exec");
                count++;
                
          }

     }
}