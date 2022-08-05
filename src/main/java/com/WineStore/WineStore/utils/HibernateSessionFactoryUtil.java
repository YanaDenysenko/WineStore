package com.WineStore.WineStore.utils;
import com.WineStore.WineStore.exeption.SessionFactoryConnectionException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;
    private HibernateSessionFactoryUtil() {}
    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
//                configuration.addAnnotatedClass(User.class);
//                configuration.addAnnotatedClass(Ticket.class);
//                configuration.addAnnotatedClass(MovieSession.class);
//                configuration.addAnnotatedClass(CinemaHall.class);
                StandardServiceRegistryBuilder builder =
                        new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                throw new SessionFactoryConnectionException("Connection exception with reason - "
                        + e.getMessage());
            }
        }
        return sessionFactory;
    }
}