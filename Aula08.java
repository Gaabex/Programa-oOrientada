/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

import javax.swing.JOptionPane;

public class Aula08 {
    
    public static void main(String[] args) {
        Pessoa p = null;
        
        while(true){
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção: "
        +"\n1-Aluno"
        +"\n2-Professor"
        +"\n3-Funcionario"
        +"\n4-Sair"
        ));
        
        switch (tipo){
            case 1:
                p = new Aluno();
                break;
            case 2:
                p = new Professor();
                break;
            case 3:
                p = new Funcionario();
                break;
            case 4:
                System.out.println("Saindo da Aplicação");
                System.exit(0);  
            default:
                System.out.println("Opção Inválida");
                System.exit(0);
        }
            System.out.println(p.mostraClasse());
                }
        
        
}
    
}
