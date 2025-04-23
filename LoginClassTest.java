/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package loginclass;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginClassTest {

    private String String;

    public LoginClassTest() {
    }
    @Test
    public void testUsernameCorrectFormat(){
         assertsTrue("Hello,Kyle_1");
    }

    @Test
    public void testUsernameIncorrectFormat() {
       assertsTrue ("it is great to see you ");
    }

    @Test
    public void testUsernameMessageCorrect() {
        String message = "KYL_1";
    
        assertEquals("Welcome John Doe, it is great to see you.", message);
    }

    @Test
    public void testUsernameMessageIncorrect() {
        String message = UserValidation.processUsername("KYL", "Kyle");
        assertEquals("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length.", message);
    }

    @Test
    public void testPasswordMeetsRequirements() {
        assertsTrue(isPasswordComplex("CHNNSEC@KE99"));
        assertEquals("Password successfully captured.", UserValidation.processPassword("CHNNSEC@KE99"));
    }

    @Test
    public void testPasswordFailseRequirements(){
            assertFalse(UserValidation.isCellNumberValid("password"));
        assertEquals("Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.",
                UserValidation.processPassword("password"));
    }

    @Test
    public void testCellPhoneCorrectFormat() {
        assertsTrue(isCellNumberValid("+27838968976"));
        assertEquals("Cell number successfully captured.", UserValidation.processCellNumber("+27815704512"));
    }

    @Test
    public void testCellPhoneIncorrectFormat() {
        assertFalse(UserValidation.isCellNumberValid("0838968976"));
        assertEquals("Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.",
                UserValidation.processCellNumber("08966553"));
    }

    @Test
    public void testLoginSuccess() {
        assertTrue(UserValidation.login("KYL_1", "CHNNSEC@KE99"));
    }

    @Test
    public void testLoginFailure() {
        assertFalse(UserValidation.login("KYL", "password"));
    }

    private void assertsTrue(String it_is_great_to_see_you_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String isPasswordComplex(String chnnseckE99) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String isCellNumberValid(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        fail("The test case is a prototype.");
    
    }
}

