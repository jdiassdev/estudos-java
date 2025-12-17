public class Car {

     public static void main(String[] args) {

          Carro novoCarro = new Carro("Gol", "Volkswagen");

          String result = novoCarro.acelerar();
          System.out.println(result);

          novoCarro.manutencao();
     }
}

class Carro {
     private String modelo;
     private String marca;
     private boolean situacaoPagamento;

     public Carro(String modelo, String marca) {
          this.modelo = modelo;
          this.marca = marca;
          this.situacaoPagamento = false;
     }

     public String acelerar() {
          System.out.println("Acelerando o carro " + this.modelo);
          return "Acelerado";
     }

     public void manutencao() {
          if (!situacaoPagamento) {
               pagando();
          }
          System.out.println(this.marca + " em manutenção");
     }

     private void pagando() {
          this.situacaoPagamento = true;
          System.out.println(
                    "Pagamento realizado do carro " + this.modelo + " da marca " + this.marca);
     }

}
