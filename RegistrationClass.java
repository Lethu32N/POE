/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationclass;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationClass {
    public static void main(String[]Args) { 
                
     RegistrationClass user = new registrationClass("Kyle", "pass1234" ,"user213467", "Kyle");
        
                try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            System.out.print("Enter SA ID number: ");
            String saNumber = scanner.nextLine();
            
            
            Account newAccount = new Account(username, password, saNumber);
            
            
            System.out.println("Account created successfully!");
            System.out.println("Username: " + newAccount.getUsername());
            System.out.println("SA ID Number: " + newAccount.getSaNumber());
        }
    }

    private static class registrationClass extends RegistrationClass {

        public registrationClass(String kyle, String pass1234, String user213467, String kyle0) {
        }
    }
}
class Account {
    private String username;
    private String password;
    private String saNumber;

    public Account(String username, String password, String saNumber) {
        this.username = username;
        this.password = password;
        this.saNumber = saNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getSaNumber() {
        return saNumber;
       
         }
    
}

        
        
    

