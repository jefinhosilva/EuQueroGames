package br.com.EuQueroGames.metodos;

import br.com.EuQueroGames.ClassesBasicas.ExceptionGames;
import br.com.EuQueroGames.ClassesBasicas.Produto;
import java.util.LinkedHashSet;
import java.util.Set;

public interface InterfaceGames {
    Set<Produto> game = new LinkedHashSet();
    
    public int inserirGames(Produto game) throws ExceptionGames;
    public int alterarGames(Produto game) throws ExceptionGames;
    public boolean removerGames()throws ExceptionGames;
    public Produto buscarGames() throws ExceptionGames;
    
}   

