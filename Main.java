/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiago
 */
public class Main {
    public static void main(String[] Args){
        Pilha pilha = new Pilha(5);
        
                pilha.imprime();

        pilha.insere(10);
                        pilha.imprime();

        pilha.insere(20);
        pilha.insere(30);
        pilha.insere(40);
        pilha.imprime();
        
        pilha.insere(50);
        pilha.insere(60);
        pilha.remove();
        pilha.insere(10);
        
                pilha.imprime();

        pilha.remove();
        pilha.remove();
        pilha.remove();
        
                pilha.imprime();

        pilha.remove();
        pilha.remove();
        pilha.remove();
  
    }
}
