package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String name;
    private int codigoConvite;

    public Convidado(String name, int codigoConvite) {
        this.name = name;
        this.codigoConvite = codigoConvite;
    }

    public String getName() {
        return name;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}

