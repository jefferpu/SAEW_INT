/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author paul
 */
@WebService(serviceName = "operacion")
public class operacion {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        
        return num1+num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public String factorial(@WebParam(name = "numero") String numero) {
        //TODO write your implementation code here:
        return null;
    }
    

}
