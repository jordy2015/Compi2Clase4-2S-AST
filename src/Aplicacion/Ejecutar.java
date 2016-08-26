/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import CCAnalizador.nodo;

/**
 *
 * @author Jordy Gonzalez
 */
public class Ejecutar {
    Integer Recorrido(nodo raiz) {
            int retorno = 0;
            switch (raiz.getEtiqueta()) {
            case "inicio":
                    retorno=Recorrido(raiz.getHijos().get(0));
                     break;
            case "-":
                    retorno=Recorrido(raiz.getHijos().get(0))-Recorrido(raiz.getHijos().get(1));
                    break;
            case "+":
                    retorno=Recorrido(raiz.getHijos().get(0))+Recorrido(raiz.getHijos().get(1));
                    break;
            case "*":
                    retorno=Recorrido(raiz.getHijos().get(0))*Recorrido(raiz.getHijos().get(1));
                    break;
            case "/":
                    retorno=(int)(Recorrido(raiz.getHijos().get(0))/Recorrido(raiz.getHijos().get(1)));
                    break;
            case "numero":
                retorno=raiz.getValor();
                break;
            default: 
                System.out.println("Error");
                retorno = -1;
                break;
            }
            return retorno;         
    }   
}
