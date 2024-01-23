package com.flightSearchTest.flightsearchtest.DataAccess;

import com.flightSearchTest.flightsearchtest.Entities.Flight;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightDal implements IFlightDal {

    private final EntityManager entityManager;

    @Autowired
    public FlightDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Flight> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Flight> flights = session.createQuery("from Flight", Flight.class).getResultList();

        return flights;
    }

    @Override
    @Transactional
    public void add(Flight flight) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(flight);
    }

    @Override
    @Transactional
    public void update(Flight flight) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(flight);
    }

    @Override
    @Transactional
    public void delete(Flight flight) {
        Session session = entityManager.unwrap(Session.class);
        Flight flightToDelete = session.get(Flight.class, flight.getId());
        session.remove(flightToDelete);
    }

    @Override
    @Transactional
    public Flight getById(long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Flight.class, id);
    }
}
