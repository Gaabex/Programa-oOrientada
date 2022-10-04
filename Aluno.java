
package aula08;

public class Aluno extends Pessoa{
    //Atributos
    private String rgm;
    
    //Construtores
    public Aluno(){};
    
    //metodo de acesso (set e get)
    public String getRgm(){
    return rgm;
    }
    
    public void setRgm(String r){
        rgm = r;
    }
    
    //metodos
    @Override
    public String mostraClasse(){
        return "Sou objeto do tipo Aluno";
    }
    
}
