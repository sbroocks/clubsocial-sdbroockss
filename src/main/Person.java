package main;



import java.util.Calendar;
import java.util.Date;
public class Person {
    public String name;
    protected int edad;
    protected Date birthday;

    public Person(String name, int edad, Date birthday){
        this.name = name;
        this.edad = edad;
        this.birthday = birthday;
    }
    public void  show(Person persona){
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(persona.birthday);
     
        
        System.out.println("El nombre de la persona es " + persona.name );
        
    }
    public void aa(String aa){
    }


}


