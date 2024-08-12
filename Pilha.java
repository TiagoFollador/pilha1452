/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiago
 */
public class Pilha {
    public int capacidade;
    public int topo;
    public int[] dados;
    
    public Pilha(int capacidade){
        this.topo = -1;
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
    }

    public void insere(int valor){
        if (!cheia()){
            this.topo = this.topo + 1;
            this.dados[topo] = valor;
            System.out.println("Dado inserido com sucesso");
        }
        else{
            System.out.println("Pilha cheia");
        }
    }
    
    public boolean cheia(){
        return (this.topo == this.capacidade - 1) ? true : false; //ternary expression
    }
    
    public boolean vazia(){
        return (this.topo == -1) ? true : false;
    }
    
    public void remove(){
        if(!vazia()){
            System.out.println("Removendo valor: " + this.dados[topo]);
            this.topo --;
            System.out.println("Valor removido com sucesso");
        }
        else{
            System.out.println("Pilha vazia");
        }
    }
    
    public void imprime() {
        int counter = 0;
        if(this.topo != -1){
            do{
                System.out.println("Posicao: " + counter + "\nDado: " + this.dados[counter]);
                counter++;
            } while(counter < this.topo);
        }
        else{
            System.out.println("A pilha esta vazia");
        }
    }
    
    
    
    
}


