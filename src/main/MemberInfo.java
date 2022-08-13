package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MemberInfo {
	 FileWriter datosHistorial;
	    FileReader leerHistorial;
	    BufferedReader contenido;
	    private String textoHistorial;

	    public void Historial() throws IOException {
	       
	        datosHistorial = new FileWriter("historial.txt", true);
	        leerHistorial = new FileReader("historial.txt");
	        contenido = new BufferedReader(leerHistorial);
	    }

	    public void almacenarHistorial(String nombre, int puntaje) {
	        try {
	            datosHistorial.append("* " + nombre + " ");
	            datosHistorial.append(" -> Puntaje: " + Integer.toString(puntaje) + "\n"); //la hizo la juanes
	            datosHistorial.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

	    public void leerHistorial() {
	        try {

	            while ((textoHistorial = contenido.readLine()) != null)

	                imprimirMesaje(textoHistorial + " \n");


	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

		private void imprimirMesaje(String string) {
			// TODO Auto-generated method stub
			
		}
	}