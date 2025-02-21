package org.example.javadb.models.services;

import org.example.javadb.models.Employee;
import org.example.javadb.models.interfaces.EmployeeDOA;
import org.example.javadb.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeDOAImp implements EmployeeDOA {
    HibernateUtil hibernateUtil;
    SessionFactory sessionFactory;

    public EmployeeDOAImp() {

        hibernateUtil = HibernateUtil.getInstance();
        sessionFactory = hibernateUtil.getSessionFactory();
    }


    public static Employee getEmployee(int id) {
        SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.get(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void update(Employee employee) {
        SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.beginTransaction().commit();
        sessionFactory.openSession().close();

    }

    public void delete(int id) {
        SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(session.get(Employee.class, id));
    }

    @Override
    public void delete(Employee employee) {


    }

    @Override
    public List<Employee> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.createQuery("select u from Employee u").list();
    }

    @Override
    public void findEmployee(Employee employee) {

    }

    public int insert(Employee employee) {
        SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        sessionFactory.openSession().close();
        return 1;
    }
}