import java.util.regex.Pattern;

public class Placa{
    private String pais;
    private String codigo; // LLLNLNN

    public Placa(String pais,String codigo){
        this.pais = pais;
        if (Pattern.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}", codigo) == true){
            this.codigo = codigo;
        }else{
            this.codigo = "AAA0A00";
        }
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getPais(){
        return pais;
    }

    public String getCodigo(){
        return codigo;
    }

    public String toString(){
        if (codigo.equals("AAA0A00")){
            return("Invalida!");
        }else{
            return(codigo+":"+pais);
        }
    }
}