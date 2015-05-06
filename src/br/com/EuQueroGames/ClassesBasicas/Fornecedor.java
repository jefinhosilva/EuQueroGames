package br.com.EuQueroGames.ClassesBasicas;

import java.util.Objects;

public class Fornecedor {

    private String CNPJ, RSocial, dataCadastro, contato, nomeFantasia, endereco, bairro, cidade, CEP, Email, nomeRep;
    private int UF;

    public Fornecedor(String CNPJ, String RSocial, String dataCadastro, String contato, String nomeFantasia, String endereco, String bairro, String cidade, String CEP, String Email, String nomeRep, int UF) {
        this.CNPJ = CNPJ;
        this.RSocial = RSocial;
        this.dataCadastro = dataCadastro;
        this.contato = contato;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = CEP;
        this.Email = Email;
        this.nomeRep = nomeRep;
        this.UF = UF;
    }

    public Fornecedor() {
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNomeRep() {
        return nomeRep;
    }

    public void setNomeRep(String nomeRep) {
        this.nomeRep = nomeRep;
    }

    public int getUF() {
        return UF;
    }

    public void setUF(int UF) {
        this.UF = UF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRSocial() {
        return RSocial;
    }

    public void setRSocial(String RSocial) {
        this.RSocial = RSocial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.CNPJ);
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
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        return true;
    }

}
