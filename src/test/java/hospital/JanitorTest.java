package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class JanitorTest {
    Janitor underTest = new Janitor("1", "name", "department", false);

    @Test
    public void shouldReturnFalseIfJanitorIsNotCleaning(){
        boolean cleaningStatus = underTest.cleaningStatus();
        assertFalse(cleaningStatus);
    }

    @Test
    public void shouldReturnSalaryOf40k(){
        int salary = underTest.calculatePay();
        assertEquals(40000, salary);
    }

}
