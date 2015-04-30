package data;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {

    private static Connection conexao;

    public Conexao() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:dbo.BDGames";
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão ok!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + erro.getMessage(), "Conexão", 3);
        }
    }

    public Connection getConexao() {
        return conexao;
    }
}
