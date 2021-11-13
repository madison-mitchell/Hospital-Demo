package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SurgeonTest {
    Surgeon underTest = new Surgeon("1", "name", "Spine", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldReturnTrueIfSurgeonIsOperating(){
        boolean operatingStatus = underTest.getOperationStatus();
        assertTrue(operatingStatus);
    }

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidingCare(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevelFrom20to15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }

    @Test
    public void shouldReturnSalaryOf120k(){
        int salary = underTest.calculatePay();
        assertEquals(120000, salary);
    }
}
