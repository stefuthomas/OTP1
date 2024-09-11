package Week3;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @org.junit.jupiter.api.Test
    void testDeposit() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testWithdraw() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(50.0, account.withdraw(50.0));
        assertEquals(50.0, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testWithdrawInsufficientFunds() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(0.0, account.withdraw(200.0));
        assertEquals(100.0, account.getBalance());
    }
}