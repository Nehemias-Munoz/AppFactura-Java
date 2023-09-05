package org.marvic.appFacturas;

import org.marvic.appFacturas.models.Customer;
import org.marvic.appFacturas.models.Factura;
import org.marvic.appFacturas.models.ItemFactura;
import org.marvic.appFacturas.models.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        customer.setName("Nehemias");
        customer.setRut(1234567);

        //Factura
        Factura factura = new Factura();
        factura.setCustomer(customer);
        factura.setDate(Date.from(Instant.now()));
        factura.setDescription("Compra hogar");
        //Producto
        Product product = new Product();
        product.setName("Papel");
        product.setPrice(200.0f);
        //Añadir como item
        ItemFactura itemFactura = new ItemFactura(1,product);
        //Añadir item a la factura
        factura.addItemFactura(itemFactura);
        System.out.println(factura.getDetails());
        //solicitar productos
    }
}
