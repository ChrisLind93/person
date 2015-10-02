package controller;

import Facade.Facade.IPersonFacade;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonController implements IPersonFacade {
    
    EntityManagerFactory emf;
    EntityManager em;

    public PersonController() {
        emf = Persistence.createEntityManagerFactory("PU");
        em = emf.createEntityManager();
    }

    @Override
    public Person addPerson(Person p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        return p;
    }

    @Override
    public Person deletePerson(int id) {
        em.remove(id);
        return null;
    }

    @Override
    public Person getPerson(int id) {
        return em.find(Person.class, id);
    }

    @Override
    public List<Person> getPersons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person editPerson(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}