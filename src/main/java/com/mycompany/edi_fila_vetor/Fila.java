/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edi_fila_vetor;

/**
 *
 * @author nando
 */
public class Fila {
    int[] elementos;
    int tamanho;
    int inicio;
    int fim;
    
    void criarFila(){
        this.elementos = new int[10];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
        System.out.println("Fila Criada com sucesso");
    }
    
    void destroiFila(){
        this.elementos = null;
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
        System.out.println("Fila Destruida com sucesso");
    }
    
    void inserirElemento(int elemento){
        if(this.tamanho == 10){
            System.out.println("Erro ao Inserir elemento.: "+elemento+"! Fila cheia");
        }else{
            this.fim++;
            if(this.fim == 10){
                this.fim = 0;
            }
            this.elementos[this.fim] = elemento;
            this.tamanho++;
            System.out.println("Elemento..: "+elemento+" inserido com sucesso na Fila");
        }
    }
    
    void removeElemento(){
        if(this.tamanho == 0){
            System.out.println("Erro ao remover elemento! Fila Vazia");
        }else{
            System.out.println("Removendo o elemento..: "+this.elementos[this.inicio]);
            System.out.println("-------------");
            this.inicio++;
            if(this.inicio == 10){
                this.inicio = 0;
            }
            this.tamanho--;
        }
    }
    
    boolean localizarElemento(int elemento){
        if(this.tamanho == 0){
            System.out.println("Erro! Fila Vazia");
            return false;
        }else{
            int posicao = this.inicio;
            for(int i=0;i<this.tamanho;i++){
                if(this.elementos[posicao] == elemento){
                    return true;
                }
                posicao++;
                if(posicao == 10){
                    posicao = 0;
                }
            }
            return false;
        }
    }
    
    void imprimirFila(){
        if(this.tamanho == 0){
            System.out.println("Erro! Fila Vazia");
        }else{
            System.out.println("Imprimindo dados da fila");
            int posicao = this.inicio;
            for(int i=0;i<tamanho;i++){
                System.out.println("Elementos na Fila..: "+this.elementos[posicao]);
                posicao++;
                if(posicao == 10){
                    posicao = 0;
                }
            }
            
        }
        
        System.out.println("--------------------");
    }
}
