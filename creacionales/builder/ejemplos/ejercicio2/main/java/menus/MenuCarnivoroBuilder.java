package menus;

import builder.Menu;
import builder.MenuBuilder;

public class MenuCarnivoroBuilder implements MenuBuilder {

    private Menu menu = new Menu();

    @Override
    public void construirPlatoPrincipal() {
        menu.setPlatoPrincipal("Filete a la parrilla");
    }

    @Override
    public void construirBebida() {
        menu.setBebida("Vino tinto reserva");
    }

    @Override
    public void construirPostre() {
        menu.setPostre("Tiramisú casero");
    }

    @Override
    public Menu build() {
        return menu;
    }

}
