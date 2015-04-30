package Model;

import java.util.Objects;

public class Fornecedor {

    private String CNPJ;
    private String RSocial;
    private String telFornecedor;

    public Fornecedor(String CNPJ, String RSocial, String telFornecedor) throws ExceptionGames {

        this.setCNPJ(CNPJ);
        this.setRSocial(RSocial);
        this.setTelFornecedor(telFornecedor);
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

    public String getTelFornecedor() {
        return telFornecedor;
    }

    public void setTelFornecedor(String telFornecedor) {
        this.telFornecedor = telFornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.CNPJ);
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
