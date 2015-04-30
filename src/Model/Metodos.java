package Model;

public interface Metodos {
    
    public int inserir(Games g);
    public int alterar(Games g);
    public boolean remover();
    public Games buscar() throws ExceptionGames;
    
}
