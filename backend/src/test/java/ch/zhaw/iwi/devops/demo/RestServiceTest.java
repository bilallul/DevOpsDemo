package ch.zhaw.iwi.devops.demo;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RestServiceTest {

    
    @Test
    public void getPersonTest() {
        PersonController personController = new PersonController();
        personController.init();
        Integer id = 1;
        Person person = personController.getPerson(id);
        Assertions.assertNotNull(person.getName());
    }
    
    @Test
    public void getAllPersonsTest() {
        PersonController personController = new PersonController();
        personController.init();
        Map<Integer, Person> list = personController.getAllPersons();
        Assertions.assertEquals(3, list.size());
    }
    
    @Test
    public void newPersonTest() {
        PersonController personController = new PersonController();
        personController.init();
        Integer id = 4;
        Person person = new Person(id, "George Washington");
        personController.createPerson(person);
        Map<Integer, Person> list = personController.getAllPersons();
        Assertions.assertEquals(4, list.size());
    }
    
    
    @Test
    public void deletePersonTest() {
        PersonController personController = new PersonController();
        personController.init();
        Integer id = 3;
        personController.deletePerson(id);
        Person personCheck = personController.getPerson(id);
        Assertions.assertNull(personCheck);
    }

}
