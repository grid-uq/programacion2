package app;

import builder.MenuPrincipal;
import builder.Menu;
import builder.MenuBuilder;
import menus.MenuCarnivoroBuilder;
import menus.MenuVeganoBuilder;

public class EjemploCreacionMenu {

    public static void main(String[] args) {
        MenuBuilder menuVeganoBuilder = new MenuVeganoBuilder();
        MenuPrincipal directorVegano = new MenuPrincipal(menuVeganoBuilder);
        Menu menuVegano = directorVegano.build();

        MenuBuilder menuCarnivoroBuilder = new MenuCarnivoroBuilder();
        MenuPrincipal directorCarnivoro = new MenuPrincipal(menuCarnivoroBuilder);
        Menu menuCarnivoro = directorCarnivoro.build();
    }

}
