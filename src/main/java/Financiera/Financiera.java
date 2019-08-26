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
    public static Empleado e1 = new Empleado("juan", "juan");
    
    public static void main(String[] args) {
        listaempleado.add(e1);
        new VentanaLogin().setVisible(true);
    }
    
    public static void ObtenerEstado() {
        try { // Call Web Service Operation
            org.tempuri.ServicioPublicoCredito service = new org.tempuri.ServicioPublicoCredito();
            org.tempuri.IServicioPublicoCredito port = service.getSGEBusService();
            // TODO initialize WS operation arguments here
            java.lang.String codigoFinanciera = "";
            java.lang.Integer dni = Integer.valueOf(33000000);
            // TODO process result here
            org.datacontract.schemas._2004._07.sge_service_contracts.ResultadoEstadoCliente result = port.obtenerEstadoCliente(codigoFinanciera, dni);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.err.println("eia");
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
