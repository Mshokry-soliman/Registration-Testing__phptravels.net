package Testcases;

import Pages.DonePage;

import Pages.RegisterPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestCases extends BaseTests {
    @Test
    public void ValidTest(){

       RegisterPage fill =homePage;

       fill.setFirstName("Test");
       fill.setLastName("Man");
       fill.setPhoneNumber("01012345678");
       fill.setEmailAddress("validbasic@gmap.com");
       fill.setPassword("Va12345678");
       fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }



    @Test
    public void invalidLowerFirstName(){

        RegisterPage fill =homePage;

        fill.setFirstName("test");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid1@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
        fill.clickSignUpButton();
        DonePage donepage= fill.clickSignUpButton();
        assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");

    }



    @Test
    public void invalidEmptyFirstName(){

        RegisterPage fill =homePage;

        fill.setFirstName("");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid2@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }



    @Test
    public void invalidNumbersFirstName(){

        RegisterPage fill =homePage;

        fill.setFirstName("123");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid3@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }

    @Test
    public void invalidLowerLastName    (){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid44@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertFalse(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }



    @Test
    public void invalidEmptyLastName(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid5@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }

    @Test
    public void invalidNumbersLastName(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("123");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid30@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
        DonePage donepage= fill.clickSignUpButton();
        assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }


    @Test
    public void invalid_First_equal_Last(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Test");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid6@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }



    @Test
    public void invalidPhoneShort(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Man");
        fill.setPhoneNumber("987");
        fill.setEmailAddress("valid7@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }

    @Test
    public void invalidPhoneNotNumber(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Man");
        fill.setPhoneNumber("zxc");
        fill.setEmailAddress("valid8@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }


    @Test
    public void invalidEmailName(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("asdf");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
        DonePage donepage= fill.clickSignUpButton();
        assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }


    @Test
    public void invalidEmailNotUnique(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("validbasic@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }


    @Test
    public void invalidPasswordNoCapital(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid9@gmau.com");
        fill.setPassword("xa12345678");
        fill.setConfirmPassword("xa12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }


    @Test
    public void invalidPasswordNoSmall(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid10@gmau.com");
        fill.setPassword("VS12345678");
        fill.setConfirmPassword("VS12345678");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }


    @Test
    public void invalidPasswordShort8(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid11@gmau.com");
        fill.setPassword("Va12345");
        fill.setConfirmPassword("Va12345");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }

    @Test
    public void invalidPassword_NOt_ConfirmPassword(){

        RegisterPage fill =homePage;

        fill.setFirstName("Test");
        fill.setLastName("Man");
        fill.setPhoneNumber("01012345678");
        fill.setEmailAddress("valid11@gmau.com");
        fill.setPassword("Va12345678");
        fill.setConfirmPassword("Va123456789");
       DonePage donepage= fill.clickSignUpButton();
       assertTrue(donepage.getAlertText().contains("Nothing Booked Yet"), "wrong");
    }



}