import java.util.List;

public interface ICadastro<T> {

    void adicionar(T obj);
    void remover(T obj);
    T buscarPorNome(String n);
    List<T> listarTodos();
    
}
