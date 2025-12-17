public class Car {

     public static void main(String[] args) {

          // Tipo dele é a classe carro entao ele recebe o construtor obrigatoriamente
          Carro novoCarro = new Carro("Gol", "Volkswagen");

          String result = novoCarro.acelerar();

          System.out.println(result);

          novoCarro.manuntencao();
     }
}

class Carro {
     String modelo;
     String marca;

     public Carro(String modelo, String marca) {
          this.modelo = modelo;
          this.marca = marca;
     }

     public String acelerar() {
          System.out.println("Acelerando o carro" + this.modelo);
          return "Acelerado";
     }

     public void manuntencao() {
          System.out.println(this.marca + " em manutençao");
          // return "Em manutençao";
     }

}
