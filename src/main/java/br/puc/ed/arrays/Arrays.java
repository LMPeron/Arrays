package br.puc.ed.arrays;

import br.puc.ed.game.PainelPontuacao;
import br.puc.ed.game.RegistroPontuacao;

public class Arrays {

  public static void main(String[] args) {
    int[] intArray;
    intArray = new int[10];
    intArray[0] = 56;
    intArray[1] = 34;
    for(int i = 0; i < intArray.length; i++) {
      System.out.println(i + ": " + intArray[i]);
    }


    // RegistroPontuacao rpLeo = new RegistroPontuacao("Leonardo", 100);
    // RegistroPontuacao rpNeto = new RegistroPontuacao("Neto", 10);
    // RegistroPontuacao rpGabriel = new RegistroPontuacao("Gabriel", 80);
    // RegistroPontuacao rpMatheus = new RegistroPontuacao("Matheus", 20);


    // PainelPontuacao painel = new PainelPontuacao(10);
    // painel.adicionar(rpMatheus);
    // painel.adicionar(rpNeto);
    // painel.adicionar(rpNeto);
    // painel.adicionar(rpGabriel);
    // painel.adicionar(rpLeo);

    // painel.imprimir();

  }

}
