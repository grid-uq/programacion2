package menus;

import builder.Menu;
import builder.MenuBuilder;

public class MenuVeganoBuilder implements MenuBuilder {

    private final Menu menu = new Menu();

    @Override
    public void construirPlatoPrincipal() {
        menu.setPlatoPrincipal("Ensalada de quinoa y verduras");
    }

    @Override
    public void construirBebida() {
        menu.setBebida("Jugo de frutas naturales");
    }

    @Override
    public void construirPostre() {
        menu.setPostre("Tarta de frutas sin lácteos");
    }

    @Override
    public Menu build() {
        return menu;
    }


}
