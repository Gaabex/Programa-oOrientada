
package aula08;

public class Professor extends Pessoa{
    private int matricula;
    private String campus;
    
    public Professor(){};
    
    //metodos de Acesso
    
    //metodos
    @Override
    public String mostraClasse(){
        return "Sou objeto do tipo Professor";
    }
    
}
