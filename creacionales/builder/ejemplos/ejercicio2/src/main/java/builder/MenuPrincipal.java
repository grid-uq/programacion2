package builder;

import builder.Menu;
import builder.MenuBuilder;

public class MenuPrincipal {

    private final MenuBuilder menuBuilder;

    public MenuPrincipal(MenuBuilder builder) {
        this.menuBuilder = builder;
    }

    public Menu build() {
        menuBuilder.construirPlatoPrincipal();
        menuBuilder.construirBebida();
        menuBuilder.construirPostre();
        return menuBuilder.build();
    }

}
