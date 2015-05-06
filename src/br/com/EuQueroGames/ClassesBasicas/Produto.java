package br.com.EuQueroGames.ClassesBasicas;

import java.util.Objects;

public class Produto {

    private String nomeGame, codigo, descricao, desenvolvedor, dataCadatro, fornecedor, foto;
    private double preco;
    private int ano, genero, plataforma;

    public Produto(String nomeGame, String codigo, String descricao, String desenvolvedor, String dataCadatro, String fornecedor, String foto, double preco, int ano, int genero, int plataforma, int CodGenero, String tipoGenero) throws ExceptionGames {
        this.nomeGame = nomeGame;
        this.codigo = codigo;
        this.descricao = descricao;
        this.desenvolvedor = desenvolvedor;
        this.dataCadatro = dataCadatro;
        this.fornecedor = fornecedor;
        this.foto = foto;
        this.preco = preco;
        this.ano = ano;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public Produto() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codigo);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(int plataforma) {
        this.plataforma = plataforma;
    }

    public String getDataCadatro() {
        return dataCadatro;
    }

    public void setDataCadatro(String dataCadatro) {
        this.dataCadatro = dataCadatro;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNomeGame() {
        return nomeGame;
    }

    public void setNomeGame(String nomeGame) {
        this.nomeGame = nomeGame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
