package Model;

import java.util.Objects;

public class Cliente {

    private String nome;
    private String telefone;
    private String dataNasc;
    private String CPF;
    private String email;
    private int sexo;

    public Cliente(String nome, String telefone, String dataNasc, String CPF, String email, int sexo) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.CPF = CPF;
        this.email = email;
        this.sexo = sexo;
    }

    
 

  public Cliente() {
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ExceptionGames{
        if(nome != null || !nome.isEmpty()){
        this.nome = nome;
        }else{
            throw new ExceptionGames("Nome deve ser diferente de vazio ou nulo!");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.CPF);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

}
