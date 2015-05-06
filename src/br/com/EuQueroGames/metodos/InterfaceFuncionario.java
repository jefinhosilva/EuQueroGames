package br.com.EuQueroGames.metodos;

import br.com.EuQueroGames.ClassesBasicas.ExceptionGames;
import br.com.EuQueroGames.ClassesBasicas.Funcionario;
import java.util.LinkedHashSet;
import java.util.Set;


public interface InterfaceFuncionario {
    
    Set<Funcionario> funcionario = new LinkedHashSet();
    
    public int inserirFuncionario(Funcionario funcionario) throws ExceptionGames;
    public int alterarFuncionario(Funcionario funcionario) throws ExceptionGames;
    public boolean removerFuncionario()throws ExceptionGames;
    public Funcionario buscarFuncionario() throws ExceptionGames;
    
}
    

