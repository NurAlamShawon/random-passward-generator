package com.mycompany.mavenproject4;
public class random_pass_generator {
    
    public static void main(String[] args) {
     
       for(int i=0;i<4;i++){
           
           double a = 97 + Math.random()* (122-97+1);
           int b= (int)a;
           char cha = (char)b ;
       
          System.out.print(cha );
          
       }
        
        
    }
}
