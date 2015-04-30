package Model;

public class Plataforma {

    private int CodPlat;
    private String TipoPlat;

    public Plataforma(int CodPlat, String TipoPlat) throws ExceptionGames {

        this.setCodPlat(CodPlat);
        this.setTipoPlat(TipoPlat);
    }

    public Plataforma() {
    }

    public int getCodPlat() {
        return CodPlat;
    }

    public void setCodPlat(int CodPlat) {
        this.CodPlat = CodPlat;
    }

    public String getTipoPlat() {
        return TipoPlat;
    }

    public void setTipoPlat(String TipoPlat) {
        this.TipoPlat = TipoPlat;
    }

}
