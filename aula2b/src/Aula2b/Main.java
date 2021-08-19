

package Aula2b;

public class Main {
  public static void main(String[] args){
    Caneta c1 = new Caneta();
    c1.modelo = "DB001";
    c1.cor = "azul";
    c1.ponta = 0.7f;
    c1.carga = 100;
    c1.tampar();
    c1.rabiscar();

    c1.status();

    Caneta c2 = new Caneta();
    c2.modelo = "VVDRE6";
    c2.cor = "preta";
    c2.ponta = 0.5f;
    c2.carga = 12;
    c2.destampar();
    c2.rabiscar();

    c2.status();

  }
}
