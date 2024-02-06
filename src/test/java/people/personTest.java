
package people;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class PersonTest {

        person person;

        @BeforeEach
        void setUp() {
            person = new Responsible("John Doe", "123", "john@example.com", "555-1234");
        }

        @Test
        void getName() {
            assertEquals("John Doe", person.getName());
        }

        @Test
        void setName() {
            person.setName("Jane Doe");
            assertEquals("Jane Doe", person.getName());
        }

        @Test
        void getId() {
            assertEquals("123", person.getId());
        }

        @Test
        void setId() {
            person.setId("456");
            assertEquals("456", person.getId());
        }

        @Test
        void getEmail() {
            assertEquals("john@example.com", person.getEmail());
        }

        @Test
        void setEmail() {
            person.setEmail("jane@example.com");
            assertEquals("jane@example.com", person.getEmail());
        }

        @Test
        void getPhone() {
            assertEquals("555-1234", person.getPhone());
        }

        @Test
        void setPhone() {
            person.setPhone("555-5678");
            assertEquals("555-5678", person.getPhone());
        }
        @AfterEach
        void tearDown() {
            person = null;
        }
    }
