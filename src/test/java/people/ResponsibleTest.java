package people;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ResponsibleTest {

    Responsible responsible1;
    Responsible responsible2;
    Responsible responsible3;

    @BeforeEach
    void setUp() {
        responsible1 = new Responsible("rodrigo","448","aaa","454");
        responsible2 = new Responsible("patricia","555","bbb","111");
        responsible3 = new Responsible("rodrigo","448","aaa","454");
    }

    @Test
    void getPayments() {
        Assertions.assertNotNull(responsible1.getPayments());
        Assertions.assertNotNull(responsible2.getPayments());
        Assertions.assertNotNull(responsible3.getPayments());
        responsible1.mensalPayments(1,true);
        responsible2.mensalPayments(2,false);
        responsible3.mensalPayments(3,true);
        Assertions.assertEquals(responsible1.getPayments()[0], true);
        Assertions.assertEquals(responsible2.getPayments()[1], false);
        Assertions.assertEquals(responsible3.getPayments()[2], true);
        responsible1.mensalPayments(4,true);
        responsible2.mensalPayments(5,false);
        responsible3.mensalPayments(6,true);
        Assertions.assertEquals(responsible1.getPayments()[3], true);
        Assertions.assertEquals(responsible2.getPayments()[4], false);
        Assertions.assertEquals(responsible3.getPayments()[5], true);

    }

    @Test
    void setPayments() {
        boolean[] newPayments = {true, false, true, false, true, false, true, false, true, false, true, false};
        responsible1.setPayments(newPayments);
        Assertions.assertArrayEquals(responsible1.getPayments(), newPayments);
    }

    @Test
    void mensalPayments() {
        responsible1.mensalPayments(1,true);
        Assertions.assertTrue(responsible1.getPayments()[0]);
        responsible2.mensalPayments(12,false);
        Assertions.assertFalse(responsible2.getPayments()[11]);
        responsible3.mensalPayments(6,true);
        Assertions.assertTrue(responsible3.getPayments()[5]);
    }
    @Test
    void convertsListOnString() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        assertEquals("1, 3, 5, ", responsible1.convertsListOnString(list));
    }

    @Test
    void paymentsMade() {
        boolean[] payments = {true, false, true, false, true, false, true, false, true, false, true, false};
        responsible1.setPayments(payments);
        assertEquals("1, 3, 5, 7, 9, 11, ", responsible1.paymentsMade());
    }


    @Test
    void situation() {
        responsible1.mensalPayments(1,true);
        Assertions.assertEquals("payment already made in the month 1", responsible1.situation(1));
        Assertions.assertEquals("payment not made in the month 2", responsible2.situation(2));
        Assertions.assertEquals("Invalid month index: 13", responsible3.situation(13));
    }

    @Test
    void report() {
        responsible1.mensalPayments(1,true);
        responsible1.mensalPayments(3,true);
        responsible1.mensalPayments(5,true);
        responsible1.mensalPayments(7,true);
        responsible1.mensalPayments(9,true);
        responsible1.mensalPayments(11,true);
        Assertions.assertEquals("rodrigo\nData:\nID:448\nEMAIL:aaa\nPHONE:454\nPAID MONTHS:1, 3, 5, 7, 9, 11, ", responsible1.report());
    }

    @AfterEach
    void tearDown() {
        responsible1 = null;
        responsible2 = null;
        responsible3 = null;
    }
}
