package test;

import controller.PersonController;
import entity.Person;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TestPerson {

    public TestPerson() {

    }

    @Before
    public void beforeTest() {

    }

    @Test
    public void testAddPerson() {
        PersonController personController = new PersonController();
        Person p = personController.addPerson(null);
    }
}