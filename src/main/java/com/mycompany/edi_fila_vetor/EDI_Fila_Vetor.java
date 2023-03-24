/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.edi_fila_vetor;

/**
 *
 * @author nando
 */
public class EDI_Fila_Vetor {

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.criarFila();
        
        System.out.println("Inserindo elementos na Fila");
        
        for(int i=0;i<=10;i++){
           fila.inserirElemento(i);
        }
        
        System.out.println("------------");
        
        fila.imprimirFila();
        
        fila.removeElemento();
        fila.imprimirFila();
        
        fila.removeElemento();
        fila.imprimirFila();
        
        fila.removeElemento();
        fila.imprimirFila();
        
        fila.inserirElemento(100);
        fila.imprimirFila();
        fila.removeElemento();
        fila.imprimirFila();
        
        fila.inserirElemento(200);
        fila.imprimirFila();
        fila.removeElemento();
        fila.imprimirFila();
        
        fila.inserirElemento(300);
        fila.imprimirFila();
        fila.removeElemento();
        fila.imprimirFila();
        
        System.out.println("Pesquisando o elemento 1 na Fila "+fila.localizarElemento(1));
        System.out.println("Pesquisando o elemento 10 na Fila "+fila.localizarElemento(10));
        System.out.println("Pesquisando o elemento 100 na Fila "+fila.localizarElemento(100));
        
        fila.destroiFila();
        
        
        
        
    }
}
