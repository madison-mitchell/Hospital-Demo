package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    Nurse underTest = new Nurse("1", "name", 1);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevel1OfPatientTo15From10WhenProvidingCare(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(15, patientHealthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevelFrom20to15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }

    @Test
    public void shouldReturnSalaryOf50k(){
        int salary = underTest.calculatePay();
        assertEquals(50000, salary);
    }


}
