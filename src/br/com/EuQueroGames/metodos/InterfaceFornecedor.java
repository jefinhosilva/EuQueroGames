package br.com.EuQueroGames.metodos;

import br.com.EuQueroGames.ClassesBasicas.ExceptionGames;
import br.com.EuQueroGames.ClassesBasicas.Fornecedor;
import java.util.LinkedHashSet;
import java.util.Set;

public interface InterfaceFornecedor {
    Set<Fornecedor> fornecedor = new LinkedHashSet();
    
    public int inserirFornecedor(Fornecedor fornecedor) throws ExceptionGames;
    public int alterarFornecedor(Fornecedor fornecedor) throws ExceptionGames;
    public boolean removerFornecedor()throws ExceptionGames;
    public Fornecedor buscarFornecedor() throws ExceptionGames;
    
}
