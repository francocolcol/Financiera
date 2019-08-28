package Financiera;

import dominio.Empleado;
import java.util.ArrayList;
import vista.VentanaLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alech
 */
public class Financiera {

    public static ArrayList<Empleado> listaempleado = new ArrayList<Empleado>();
    public static Empleado e1 = new Empleado(1233,"Juan Martín","juan", "juan");
    
    public static void main(String[] args) {
        listaempleado.add(e1);
        new VentanaLogin().setVisible(true);
    }
    
    public static org.datacontract.schemas._2004._07.sge_service_contracts.ResultadoEstadoCliente CantidadDeCreditos(int dniIn) {
        try { // Call Web Service Operation
            org.tempuri.ServicioPublicoCredito service = new org.tempuri.ServicioPublicoCredito();
            org.tempuri.IServicioPublicoCredito port = service.getSGEBusService();
            // TODO initialize WS operation arguments here
            java.lang.String codigoFinanciera = "39dc848b-b500-4e7e-b5d4-980c3a3ca9eb";
            java.lang.Integer dni = Integer.valueOf(dniIn);
            // TODO process result here
            org.datacontract.schemas._2004._07.sge_service_contracts.ResultadoEstadoCliente result = port.obtenerEstadoCliente(codigoFinanciera, dni);
            System.out.println("Result = " + result.getCantidadCreditosActivos());
            return result;
        } catch (Exception ex) {
            System.out.println("hola");
            return null;
        }
    }
    
    public static boolean login(String usu, String clave) {
        
        for(Empleado  e:listaempleado){
            if(usu.equals(e.getClaveEmpleado()) && clave.equals(e.getClaveEmpleado())){
                /*logueado=e;
                Turno t = new Turno();
                e.addTurno(t);
                turnoactual = t;*/
                return true;
            }
        }
        
        return false;
    }
}
