/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

/**
 *
 * @author OMISTAJA
 */
public class Doge {
    private String name = "Musti";
    public Doge (String n) {
        name = n;
    }
    public void speak (String s){
       // System.out.println("Hei vaan " + s);
       System.out.println(s);
    }
    public String getName () {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    public void name (String a) {
        System.out.print(a + ": ");
    }
}
/*
public class Mainclass {

   
    public static void main(String[] args) {
        // TODO code application logic here
        String input1 = "Hau!";
        String input2 = "Vuh!"; 
        
       Dog dog1 = new Dog ("Rekku");
       Dog dog2 = new Dog ("Musti");
       System.out.println("Hey, my name is " + dog1.getName()+"!");
     
       System.out.println("Hey, my name is " + dog2.getName()+"!");
		dog1.speak(input1);
       dog2.speak(input2);
    }
    
}

public class Dog {
    private String name = "Mirri";
    public Dog (String n) {
        name = n;
    }
    public void speak (String s){
       // System.out.println("Hei vaan " + s);
       System.out.println(s);
    }
    public String getName () {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
}
 */
