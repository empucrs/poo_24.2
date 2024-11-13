import java.util.ArrayList;
import java.util.List;

public class Cadastro<T extends Pessoa> implements ICadastro<T> {

    List<T> listaDePessoas;

    public Cadastro() {
        listaDePessoas = new ArrayList<T>();
    }

    @Override
    public void adicionar(T obj) {
        listaDePessoas.add(obj);        
    }

    @Override
    public T buscarPorNome(String n) {
        listaDePessoas.stream().filter(e -> (e.getNome()).equals(n)).findAny().ifPresentOrElse(
            pessoa -> 
                {
                    if(pessoa instanceof Funcionario){
                        Funcionario f = (Funcionario) pessoa;
                        return new Funcionario(f.getNome(), f.getIdade(), f.getCargo(), f.getSalario());
                    }                        
                    else if(pessoa instanceof Professor){
                        Professor p = (Professor) pessoa;
                        return new Professor(p.getNome(), p.getIdade(), p.getDepartamento(), p.getTitulacao());
                    }
                    else if(pessoa instanceof Aluno){
                        Aluno a = (Aluno) pessoa;
                        return new Aluno(a.getNome(), a.getIdade(), a.getMatricula(), a.getCurso());
                    }
                    else{
                        return pessoa;
                    }

                }
            ,
            () -> null
            );

        
        return null;
    }

    @Override
    public List listarTodos() {
        List<T> lista = listaDePessoas.stream().toList();
        return lista;
    }

    @Override
    public void remover(T obj) {
        listaDePessoas = listaDePessoas.stream().filter(e -> ! e.getNome().equals(obj.getNome())).toList();        
    }
    
}
