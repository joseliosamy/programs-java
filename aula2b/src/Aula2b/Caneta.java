

package Aula2b;

public class Caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status(){
    System.out.println("Uma caneta do modelo " + this.modelo + ".");
    System.out.println("Uma caneta da cor " + this.cor + ".");
    System.out.println("Uma caneta com a ponta " + this.ponta + ".");
    System.out.println("Uma caneta com " + this.ponta + "% de carga.");
    if(this.tampada) System.out.println("Essa caneta está tampada!");
    else System.out.println("Essa caneta está destampada");

    System.out.println("\n");
  }

  void tampar(){
    this.tampada = true;
  }

  void destampar(){
    this.tampada = false;
  }

  void rabiscar() {
    if (tampada) System.out.println("Erro");
    else System.out.println("Rabiscar");
  }
}

