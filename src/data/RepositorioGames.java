package data;

import Model.ExceptionGames;
import Model.Games;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



public class RepositorioGames implements Model.Metodos{
    
    private Map game = new LinkedHashMap();
    
    @Override
    public int inserir(Games g) {
        if (game.containsKey(g.getCodigo())) {
            return -1;
        }
        game.put(g.getCodigo(), g);
        
        return 0;
    }

    @Override
    public int alterar(Games g) {
        game.put(g.getCodigo(), g);
        return 0;
    }

    @Override
    public boolean remover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Games buscar() throws ExceptionGames {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Games buscar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
