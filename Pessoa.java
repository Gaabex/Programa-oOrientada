
package aula08;

public abstract class Pessoa {
    //atributss
    private String nome;
    
    //Contrutores
    public Pessoa(){};
    
    //metodos de acesso
    public String getNome (){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public abstract String mostraClasse();
}
