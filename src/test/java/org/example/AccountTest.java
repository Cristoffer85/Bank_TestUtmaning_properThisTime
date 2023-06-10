package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;

    //--------------------------------
    //Hittade en BeforeEach-test modell, vilken börjar varje @Test-metod med denna BeforeEach,
    //Tyckte den passade bra i just detta case: Där initialCash var tvunget att implementeras. På så sätt instansieras den i början i varje @Test-metod innan det övriga drar igång. Som en grundsetup.
    //Tutorial/vart jag läste mer om den finns uppe på imports.
    @BeforeEach
    public void Setup() {
        account = new Account(100.0, 12345);
    }
    //Arrange:n här, i varje separat metod@testcase sätts i början automagiskt av varje metod, med ett initial värde av 100 (ändras lättast och centralt härifrån alltså med) så därför är den inte med i varje @test-metod.
    //--------------------------------

    @Test
    public void testInitBalance() {
        // Act
        double balance = account.getBalance();
        // Assert
        assertEquals(100.0, balance, 0.1);
    }

    @Test
    public void testgetAccountNr() {
        // Act
        int accountNr = account.getAccountNr();
        // Assert
        assertEquals(12345, accountNr);
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(50.0);
        // Assert
        assertEquals(150.0, account.getBalance(), 0.1);
    }

    @Test
    public void testDepositNegativeAmount() {
        // Act
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50.0));
        //Samma med assertThrows, det finns en guide på howtodoinjava.com med,
        // = betyder i princip att koden som skall ingå i exception och skicka det är den som läggs efter "->....."
        //IllegalArgument betyder att det är fel värde inmatat = kan inte mata in minusvärde..

        // Assert
        assertEquals(100.0, account.getBalance(), 0.1);
    }

    @Test
    public void testWithdrawSufficientFunds() {
        // Act
        account.withdraw(30.0);
        // Assert
        assertEquals(70.0, account.getBalance(), 0.1);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        // Act
        assertThrows(IllegalStateException.class, () -> account.withdraw(150.0));
        //IllegalState = betyder att det valet inte är möjligt, kontot/metoden har inte den möjligheten att ta ut pengar ifrån ett tomt konto..

        // Assert
        assertEquals(100.0, account.getBalance(), 0.1);
    }

    @Test
    public void testWithdrawNegativeAmount() {
        // Act
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-30.0));
        //Samma IllegalArgument-förklaring ovan som på depositNegativeAmount, gick att implementera på båda som var negative/försöka på att mata in minusvärden i koden.

        // Assert
        assertEquals(100.0, account.getBalance(), 0.1);
    }
}