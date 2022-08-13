package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) throws Exception {
	        String fecha, nombre;
	        int edad;

	        Scanner scan = new Scanner(System.in);
	        System.out.println("Nombre de empleado");
	        nombre = scan.next();
	        String msj1 = nombre + "Ingrese fecha de nacimiento Ej: dd/mm/yyyy \n" + "Incluyendo los '/'\n";
	        System.out.println(msj1);
	        fecha = scan.next();

	        System.out.println("Ingrese edad");
	        edad = scan.nextInt();



	            System.out.println("Aquí");
	            do{
	                try {
	                    System.out.println("Edad no valida con fecha");
	                    System.out.println(msj1.substring(nombre.length(), 2));
	                    fecha = scan.next();
	                    System.out.println("Ingrese edad");
	                    edad = scan.nextInt();
	                }catch (Exception err) {
	                    System.out.println(err.getMessage() + "Error originado" + err.getLocalizedMessage());
	                }
	            }while (edad != calcular(frmtDate(edad,fecha)));

	            System.out.println("aquí pasó ");

	    }

	    public static Calendar frmtDate(int edad, String fecha) throws ParseException {
	        Calendar calendar ;
	        calendar = Calendar.getInstance();
	    try {
	        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        Date date = format.parse(fecha);

	        calendar.setTime(date);
	        Calendar calendarM = calendar;
	        return calendar;
	    }catch (ParseException e){
	        System.out.println("originada" + e.getMessage() + " " + e.getLocalizedMessage()
	        + "Codigo " + e.hashCode()
	        );
	        if(e.hashCode() == 692404036){
	            System.out.println("\nLa fecha tiene un mal formato\nFormato de fecha dia/mes/año");
	        }

	    }

	        return calendar;
	    }


	    public static int calcular(Calendar fechaNac) {
	        Calendar fechaActual = Calendar.getInstance();

	     
	        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
	        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
	        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

	        if (months < 0 || (months == 0 && days < 0)) { // 
	            years--;
	        }
	        return years;
	    }


	}

