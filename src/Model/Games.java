package Model;

public class Games extends Genero{

    private String nomeGame, codigo , descricao, desenvolvedor;
    private double preco;
    private int ano;
    
    

    public Games(String nomeGame, String codigo, String descricao, String desenvolvedor, double preco, int ano) throws ExceptionGames {
        this.nomeGame = nomeGame;
        this.codigo = codigo;
        this.descricao = descricao;
        this.desenvolvedor = desenvolvedor;
        this.preco = preco;
        this.ano = ano;
    }

  

    public Games() {
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
