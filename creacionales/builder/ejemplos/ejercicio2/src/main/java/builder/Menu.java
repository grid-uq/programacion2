package builder;

public class Menu {
    private String platoPrincipal;
    private String bebida;
    private String postre;

    public Menu(String platoPrincipal, String bebida, String postre) {
        this.platoPrincipal = platoPrincipal;
        this.bebida = bebida;
        this.postre = postre;
    }

    public Menu(){}

    public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    public void setPlatoPrincipal(String platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
}
