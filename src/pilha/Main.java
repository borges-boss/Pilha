/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author borge
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Pilha p=new Pilha();
        p.inserir(2);
        p.inserir(3);
        p.inserir(5);
        p.inserir(10);
        
        p.showElements();
        p.toFila(p.topo);
        
        //sSystem.out.println(p.getBiggestElementRec(p.topo, 0));
        //System.out.println(p.sumElementsRec(p.topo));
        
        
    }
    
}
