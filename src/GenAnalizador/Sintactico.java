/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenAnalizador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Jordy Gonzalez
 */
public class Sintactico { 
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
                try{
		Runtime runtime = Runtime.getRuntime();
		String[] cmd = new String[4];
		cmd[0] = "cmd.exe" ;
                cmd[1] = "/C";
                cmd[2] = "javacc";
                cmd[3] =  "C:\\Users\\Jordy Gonzalez\\Desktop\\AuxCompi\\Parte practica\\PruebasJavacc\\ASTJavaCC\\src\\CCAnalizador\\Analizador.jj";
                    /*
                        para poder ejecutar esta clase es necesario setear JavaCC a las varibles de entorno del sistema 
                        de tal forma que el simbolo del sistema (la terminal) reconozca el comando javacc o jjtree
                    */
		Process proc = runtime.exec(cmd);
		InputStream is = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
                }catch(IOException e){
                    System.out.print(e.toString());
                }
    }
    
}