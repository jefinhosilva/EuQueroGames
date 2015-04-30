package Model;

public class Genero extends Plataforma{
    
    private int CodGenero;
    private String TipoGenero;

    public Genero(int CodGenero, String tipoGenero) throws ExceptionGames {
        this.setCodGenero(CodGenero);
        this.setTipoGenero(tipoGenero);
    }

    public Genero() {
        
    }

    

    public int getCodGenero() {
        return CodGenero;
    }

    public void setCodGenero(int CodGenero) {
        this.CodGenero = CodGenero;
    }

    public String getTipoGenero() {
        return TipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.TipoGenero = tipoGenero;
    }
    
    
    
}
