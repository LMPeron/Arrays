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
    if (this.quantidadeRegistros < capacidade) quantidadeRegistros++;
    if (this.quantidadeRegistros == 1) {
      registros[0] = rp;
      return;
    }
    for (int i=0; i<quantidadeRegistros - 1; i++) {
      if (rp.getPontuacao() > registros[i].getPontuacao()) {
        for (int j=quantidadeRegistros - 1; j > i; j--) {
          registros[j] = registros[j - 1];
        }
        registros[i] = rp;
        return;
      }
    }
    if (this.quantidadeRegistros < capacidade) {
      registros[quantidadeRegistros - 1] = rp;
    } else {
      if (rp.getPontuacao() > registros[quantidadeRegistros - 1].getPontuacao()) registros[quantidadeRegistros - 1] = rp;
    }
  }

  public void imprimir() {
    for (int i=0; i<this.quantidadeRegistros; i++) {
      System.out.println("Nome: " + registros[i].getNome() + "   " + "Pontuação: " + registros[i].getPontuacao());
    }
  }

  public void limpar() {
    this.registros = new RegistroPontuacao[this.capacidade];
  }

  public void excluirAleatorio() {
    Random random = new Random();
    int randomDel = random.nextInt(this.quantidadeRegistros);
    registros[randomDel] = null;
    for(int i=randomDel; i<this.quantidadeRegistros; i++) {
      registros[i] = registros[i + 1];
    }
    this.quantidadeRegistros--;
  }

}
