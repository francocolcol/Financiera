/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Financiera;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;
import dominio.Cliente;
import dominio.Credito;
import dominio.Plan;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Nazareno
 */
public class Datos {
    private ArrayList <Cliente> listaClientes = new ArrayList<>();
    
    public Datos(){
        Cliente c1 = new Cliente(33000000, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c2 = new Cliente(33000001, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c3 = new Cliente(33000002, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c4 = new Cliente(33000003, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c5 = new Cliente(33000004, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c6 = new Cliente(33000005, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c7 = new Cliente(33000006, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c8 = new Cliente(33000007, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c9 = new Cliente(33000008, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c10 = new Cliente(33000009, "Pepe Juan", "Casa 32","$28.000","3816789123");
        Cliente c11 = new Cliente(33000010, "Pepe Juan", "Casa 32","$28.000","3816789123");
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        listaClientes.add(c4);
        listaClientes.add(c5);
        listaClientes.add(c6);
        listaClientes.add(c7);
        listaClientes.add(c8);
        listaClientes.add(c9);
        listaClientes.add(c10);
        listaClientes.add(c11);
    }
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
}
