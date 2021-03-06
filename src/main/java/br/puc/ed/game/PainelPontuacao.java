package br.puc.ed.game;
import java.util.Random;

public class PainelPontuacao {
  private RegistroPontuacao[] registros;
  private int quantidadeRegistros;
  private int capacidade;

  public PainelPontuacao(int capacidade) {
    registros = new RegistroPontuacao[capacidade];
    quantidadeRegistros = 0;
    this.capacidade = capacidade;
  }

  public void adicionar(RegistroPontuacao rp) {
    if (quantidadeRegistros>0) {
      for (int i=0; i<quantidadeRegistros; i++) {
        
        if (rp.getPontuacao() > registros[i].getPontuacao()) {

          for (int j=quantidadeRegistros; j > 0; j--) {
            registros[j] = registros[j - 1];
          }
          registros[i] = rp;
          break;
        }
      }
    } else {
      registros[0] = rp;
    }

    this.quantidadeRegistros++;
  }

  public void imprimir() {
    for (int i=0; i<=quantidadeRegistros; i++) {
      System.out.println("Nome: " + registros[i].getNome() + "   " + "Pontuação: " + registros[i].getPontuacao());
    }
  }

  public void limpar() {
    this.registros = new RegistroPontuacao[this.capacidade];
  }

  public void excluirAleatorio() {
    Random random = new Random();
    int qtdRandom = quantidadeRegistros;

    for(int i=0; i<=quantidadeRegistros; i++) {
      registros[random.nextInt(qtdRandom)] = null;
    }
  }

}
