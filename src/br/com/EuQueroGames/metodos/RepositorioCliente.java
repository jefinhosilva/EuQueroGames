package br.com.EuQueroGames.metodos;

import br.com.EuQueroGames.ClassesBasicas.ExceptionGames;
import br.com.EuQueroGames.ClassesBasicas.Cliente;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepositorioCliente implements InterfaceCliente {

    //criar a lista de Clientes
    LinkedHashSet<Cliente> Clientes = new LinkedHashSet<>();
    //Variável para controle de quantidade
    private int qtdcliente = 0;

    @Override
    //Metodo para inserir cliente
    public boolean inserirCliente(Cliente cliente) throws ExceptionGames {
        //Verificar de a lista está vazia ou se contem algum cadastro
        if (cliente == null || Clientes.contains(cliente)) {
            return false;
            //Se não tiver vazia ele inclui um novo cliente
        } else {
            Clientes.add(cliente);
            qtdcliente++;
            return true;
        }
    }

    @Override
    //Metodo alterar cadastro
    public void alterarCliente(Cliente cliente) throws ExceptionGames {
        for (Cliente clienteCad : Clientes) {
            //Verificando de o cliente procurado existe
            if (clienteCad.getCPF() == cliente.getCPF()) {
                //Buscar o CPF cadastrado, selecionar o atributo que vai alterar com o "set", 
                //e utilizar o "get" para pegar o novo valor do atributo
                clienteCad.setDataCadastro(cliente.getDataCadastro());
                clienteCad.setCPF(cliente.getCPF());
                clienteCad.setNome(cliente.getNome());
                clienteCad.setSexo(cliente.getSexo());
                clienteCad.setEndereco(cliente.getEndereco());
                clienteCad.setUF(cliente.getUF());
                clienteCad.setBairro(cliente.getBairro());
                clienteCad.setCidade(cliente.getCidade());
                clienteCad.setCEP(cliente.getCEP());
                clienteCad.setEmail(cliente.getEmail());
                clienteCad.setRG(cliente.getRG());
                clienteCad.setContato(cliente.getContato());

            }
        }

        System.out.println("Cliente Atualizado com sucesso!!");
    }

    @Override
    public void removerCliente(String CPF) throws ExceptionGames {
        String msg = "Clienre não encontrado";
        //Iterator para consulta se existe cadastro  e apontar o próximo cadastro
        for (Iterator<Cliente> clienteIterator = Clientes.iterator(); clienteIterator.hasNext();) {
            Cliente clienteNext = clienteIterator.next();
            //se o cadastro existe a função removida sera ativada
            if (clienteNext.getCPF().equals(CPF)) {
                clienteIterator.remove();
                msg = "Cliente removido com sucesso!";
            }

        }

    }

    @Override
    public Cliente buscarCliente(String CPF) throws ExceptionGames {
        //For-each para pecorrer a lista
        for (Cliente clienteCad : Clientes) {
            //Buscar o cliente pelo CPF se achar retorno o cliente cadastrado se não retorna a exceção CPF não cadastrado
            if (clienteCad.getCPF().equals(CPF)) {
                return clienteCad;
            }

        }
        throw new ExceptionGames("CPF Informado não existe!");

    }

    @Override
    public void listarCliente() throws ExceptionGames {
        for (Cliente clienteCad : Clientes) {
            // dataCadastro, nome, contato, endereco, CEP, CPF, RG, bairro, email, cidade, sexo, UF
            System.out.println("Nome: " + clienteCad.getNome() + ", CPF: " + clienteCad.getCPF() + ", RG: " + clienteCad.getRG() + ", Sexo: " + clienteCad.getSexo() + ", e-mail: " + clienteCad.getEmail() + ", End: " + clienteCad.getEndereco() + ", Bairro: " + clienteCad.getBairro() + ", Cidade: " + clienteCad.getCidade() + ", UF:" + clienteCad.getUF() + ", Contato: " + clienteCad.getContato());

        }
    }

    @Override
    //metedo para exibir apenas um cadastro
    public void exibirCliente(Cliente cliente) throws ExceptionGames {
        System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCPF() + ", RG: " + cliente.getRG() + ", Sexo: " + cliente.getSexo() + ", e-mail: " + cliente.getEmail() + ", End: " + cliente.getEndereco() + ", Bairro: " + cliente.getBairro() + ", Cidade: " + cliente.getCidade() + ", UF:" + cliente.getUF() + ", Contato: " + cliente.getContato());
    }

}
