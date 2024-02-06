package people;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Guilherme", "123", "gui.bap@gamil.com", "555", "S12345");
    }

    @Test
    void getRegistration() {
        assertEquals("S12345", student.getRegistration());
    }

    @Test
    void setRegistration() {
        student.setRegistration("S67890");
        assertEquals("S67890", student.getRegistration());
    }

    @Test
    void getGrades() {
        double[] expectedGrades = {0.0, 0.0, 0.0, 0.0};
        assertArrayEquals(expectedGrades, student.getGrades());
    }

    @Test
    void setGrades() {
        double[] newGrades = {8.5, 7.0, 6.5, 9.0};
        student.setGrades(newGrades);
        assertArrayEquals(newGrades, student.getGrades());
    }

    @Test
    void consolidatedGrades() {
        student.consolidatedGrades(1, 8.5);
        assertEquals(8.5, student.getGrades()[0]);
        student.consolidatedGrades(2, 7.0);
        assertEquals(7.0, student.getGrades()[1]);
    }

    @Test
    void finalMedia() {
        double[] grades = {8.5, 7.0, 6.5, 9.0};
        student.setGrades(grades);
        assertEquals(7.75, student.finalMedia());
    }

    @Test
    void defineUnit() {
        assertEquals(1, student.defineUnit(2));
        assertEquals(2, student.defineUnit(4));
        assertEquals(3, student.defineUnit(7));
        assertEquals(4, student.defineUnit(11));
        assertEquals(0, student.defineUnit(13));
    }

    @Test
    void report() {
        double[] grades = {8.5, 7.0, 6.5, 9.0};
        student.setGrades(grades);
        assertEquals("Guilherme\nData:\nID:123\nEMAIL:gui.bap@gamil.com\nPHONE:555\nREGISTRATION:S12345\nFINAL MEDIA:7.75\n", student.report());
    }
    @Test
    void testConstructor() {
        Student student = new Student("Guilherme", "123", "gui.bap@gamil.com", "555", "S12345");
        assertNotNull(student);
        assertEquals("Guilherme", student.getName());
        assertEquals("123", student.getId());
        assertEquals("gui.bap@gamil.com", student.getEmail());
        assertEquals("555", student.getPhone());
        assertEquals("S12345", student.getRegistration());
        double[] expectedGrades = {0.0, 0.0, 0.0, 0.0};
        assertArrayEquals(expectedGrades, student.getGrades());
    }

    @Test
    void situation() {
        double[] grades = {8.5, 7.0, 6.5, 9.0};
        student.setGrades(grades);
        assertEquals("the student achieved above average in the unit 2 with the grade: 7.0\n", student.situation(4));
        assertEquals("below average in this unit\n", student.situation(7));
    }
    @AfterEach
    void tearDown() {
        student = null;
    }
}

