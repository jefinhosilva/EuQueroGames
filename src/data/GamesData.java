
package data;

import Model.Games;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GamesData {
    
    public boolean incluir(Games obj)throws SQLException{
        Conexao con = new Conexao();
        String SQL = "insert  into faculdades values(?,?,?)";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, obj.getCodigo());
        ps.setString(2, obj.getNomeGame());
        ps.setString(3, obj.getDesenvolvedor());
        ps.setInt(4,obj.getAno());
        ps.setDouble(5,obj.getPreco());
        ps.setInt(6,obj.getCodGenero());
        ps.setInt(7,obj.getCodPlat());
        ps.setString(8,obj.getDescricao());
        
        int registros = ps.executeUpdate();
        if(registros>0){
            return true;
        }else{
            return false;
        }
       
    
}
}
