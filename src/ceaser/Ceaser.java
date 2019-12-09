/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceaser;

/**
 *
 * @author Options
 */
public class Ceaser {

    /**
     * @param args the command line arguments
     */
    public static String encrypt(String plain , int key) {
        // TODO code application logic here
        String output="";
        for(int i=0; i<plain.length(); i++){
            
            if(plain.charAt(i)==' ')
            {
                output+=' ';
            }
            else if((char)(plain.charAt(i)+key )>'z')   
            {
                output+=(char)(plain.charAt(i) - (26-key));
            }
            else{
                output+= (char)(plain.charAt(i) + key);
            }
        }
        return output;
        
            
    }
     public static String decrypt(String plain , int key) {
        // TODO code application logic here
        String output="";
        for(int i=0; i<plain.length(); i++){
            
            if(plain.charAt(i)==' ')
            {
                output+=' ';
            }
            else if((char)(plain.charAt(i)+key )>'z')   
            {
                output+=(char)(plain.charAt(i) - (26+key));
            }
            else{
                output+= (char)(plain.charAt(i) + key);
            }
        }
        return output;
        
            
    }
}
