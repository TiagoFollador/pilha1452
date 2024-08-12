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
        if (!isCheia()){
            this.topo = this.topo + 1;
            this.dados[topo] = valor;
            System.out.println("Dado inserido com sucesso");
        }
        else{
            System.out.println("Pilha cheia");
        }
    }
    public String Cheia(){
        return (this.topo == this.capacidade - 1) ? "A pilha esta cheia" : "A pilha nao esta cheia"; //ternary expression
    }
    public String Vazia(){
        return (this.topo == -1) ? "A pilha esta vazia" : "A pilha nao esta vazia";
    }


    public boolean isCheia(){
        return (this.topo == this.capacidade - 1);
    }
    
    public boolean isVazia(){
        return (this.topo == -1);
    }
    
    public void remove(){
        if(!isVazia()){
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

            } while(counter < this.topo+1);
        }
        else{
            System.out.println("A pilha esta vazia");
        }
    }
    
    
    
    
}


