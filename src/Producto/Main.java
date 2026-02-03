package Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = new Producto[5];

        productos[0] = new Producto("Fanta", 2);
        productos[1] = new Producto("Lays", 3);
        productos[2] = new Producto("Pistachos", 5);
        productos[3] = new Producto("Pizzas", 4);
        productos[4] = new Producto("Chuches", 1);

        Scanner escaner = new Scanner(System.in);

        System.out.print("\nIntroduce un precio: ");
        int precioEntrada = escaner.nextInt();

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getPrecio() > precioEntrada) {
                System.out.println("El producto " + productos[i].getNombre() + " cuesta " + productos[i].getPrecio() + "$");
            }
        }
    }
}
