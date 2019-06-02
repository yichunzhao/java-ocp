/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;



/**
 *
 * @author YNZ
 */
enum imageTypes {
    jpeg, JPG, PNG, GIF
}

public class EnumValues {
    
    private static String type = "jpeg";
    
    public static void main(String[] args) {
        boolean yes = type.equalsIgnoreCase(imageTypes.jpeg.name());
        System.out.println("is same? " + yes);
        
        boolean ok = type.contains(imageTypes.jpeg.name());
        System.out.println("contains? " + ok);
        
    }
    
}


