package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReceptionistTest {
    Receptionist underTest = new Receptionist("1", "name", "department", true);

    @Test
    public void shouldReturnSalaryOf45k(){
        int salary = underTest.calculatePay();
        assertEquals(45000, salary);
    }

    @Test
    public void shouldReturnTrueIfReceptionistIsOnPhone(){
        boolean onPhone = underTest.getPhoneStatus();
        assertTrue(onPhone);
    }
}
