package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    // TODO: Replace these lines with your tests
    @Test
    void testPasswordLength(){
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.passwordLengthValid("Abcdefgh1!"));
    }
    @Test
    void testPasswordLengthInvalid(){
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.passwordLengthValid("Abcdefg"));
    }
    @Test
    void testPasswordUppercase(){
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.passwordUppercase("abcdefgh"));
    }
    @Test
    void testPasswordLowercase(){
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.passwordLowercase("ABCDEFG"));
    }
    @Test
    void testPasswordNumber(){
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.passwordNumber("abcdefg"));
    }
    @Test
    void testPasswordSpecial(){
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.passwordSpecial("abcdefg"));
    }
    @Test
    void testIsValid(){
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.isValid("Abcdefgh1!"));
    }
//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
