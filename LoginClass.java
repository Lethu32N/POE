/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginclass;

/**
 *
 * @author RC_Student_lab
 */
public class LoginClass {





    static void main(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   private String firstname;
   private String lastname;
   private String username;
   private String password;
   private String cellnumber;
   
   
   public LoginClass(String firstname, String lastname, String username, String password, String cellnumber){
       this.firstname = firstname;
       this.lastname = lastname;
       this.username = username;
       this.password = password;
       this.cellnumber =cellnumber;
   }
  
   public boolean checkUsername(){
       return username.contains("_") && username.length()<=5;
             
   }
   
   public boolean checkPasswordComplex(String password){
       return password.length()>=8&&
               password.matches(".*[A-Z].*")&&
               password.matches(".*[a-z].*")&&
               password.matches(".*[0-8].*")&&
               password.matches(".*[!@#$^&()].*");
       
   }
   
   public boolean checkcellnumber(String password){
       return cellnumber.length()== 10 &&cellnumber.startsWith("+27");
       
   }
}


