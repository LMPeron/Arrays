package br.puc.ed.game;

public class GameApp {

  public static void main(String[] args) {
    PainelPontuacao painelPontuacao = new PainelPontuacao(5);
    painelPontuacao.adicionar(new RegistroPontuacao("Lúcia", 57));
    painelPontuacao.adicionar(new RegistroPontuacao("Ricardo", 79));  
    painelPontuacao.adicionar(new RegistroPontuacao("Maria", 42));
    painelPontuacao.adicionar(new RegistroPontuacao("Erick", 50));
    painelPontuacao.imprimir();
    System.out.println("///////// ORGANIZADO ///////////////");

    PainelPontuacao painelPontuacaoDesorganizado = new PainelPontuacao(5);
    painelPontuacaoDesorganizado.adicionarDesorganizado(new RegistroPontuacao("Lúcia", 57));
    painelPontuacaoDesorganizado.adicionarDesorganizado(new RegistroPontuacao("Ricardo", 79));  
    painelPontuacaoDesorganizado.adicionarDesorganizado(new RegistroPontuacao("Maria", 42));
    painelPontuacaoDesorganizado.adicionarDesorganizado(new RegistroPontuacao("Erick", 50));
    painelPontuacaoDesorganizado.adicionarDesorganizado(new RegistroPontuacao("Leo", 20));
    painelPontuacaoDesorganizado.adicionarDesorganizado(new RegistroPontuacao("Substituto", 50));
    painelPontuacaoDesorganizado.imprimir();
    System.out.println("///////// DESORGANIZADO ///////////////");





    painelPontuacao.imprimir();
    System.out.println("////////////////////////////////////");
    painelPontuacao.imprimir();
    painelPontuacao.excluirOne(6);
    System.out.println("////////////////////////////////////");



    painelPontuacao.excluirAleatorio();
    System.out.println("/////////////////////////////////////");
    painelPontuacao.imprimir();
    System.out.println("////////////////////////////////////");
    painelPontuacao.adicionar(new RegistroPontuacao("Vinícius", 55));
    painelPontuacao.imprimir();
    System.out.println("////////////////////////////////////");
    painelPontuacao.adicionar(new RegistroPontuacao("João", 43));
    painelPontuacao.imprimir();
    System.out.println("///////////////////////////////////");
    painelPontuacao.adicionar(new RegistroPontuacao("Rafael", 35));
    painelPontuacao.imprimir();
  }
}
