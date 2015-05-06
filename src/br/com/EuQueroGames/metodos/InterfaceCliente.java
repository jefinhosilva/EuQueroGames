package br.com.EuQueroGames.metodos;

import br.com.EuQueroGames.ClassesBasicas.Cliente;
import br.com.EuQueroGames.ClassesBasicas.ExceptionGames;



public interface InterfaceCliente {
        
    public boolean inserirCliente(Cliente cliente) throws ExceptionGames;
    public void alterarCliente(Cliente cliente) throws ExceptionGames;
    public void removerCliente(String CPF)throws ExceptionGames;
    public Cliente buscarCliente(String CPF) throws ExceptionGames;
    public void listarCliente() throws ExceptionGames;
    public void exibirCliente(Cliente cliente) throws ExceptionGames;
    
}
