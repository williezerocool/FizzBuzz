/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author kendrabooker
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i =1; i <= 20; i++){
        
            if(i % 5 == 0 && i % 3 == 0){
            
                System.out.println("fuzzbuzz");
            }else if(i % 5 == 0){
            
                System.out.println("buzz");
            }else if( i % 3 == 0){
            
                System.out.println("fuzz");
            }else{
            
                System.out.println(i);
            }
        }
    }
    
}
