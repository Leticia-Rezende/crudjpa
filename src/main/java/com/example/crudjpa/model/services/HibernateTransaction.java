package com.example.crudjpa.model.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

    public class HibernateTransaction {
        private static final SessionFactory sessionFactory; // final: não pode ser alterado

        static {
            try {
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (Throwable ex) {
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static Session getSession() {
            return sessionFactory.openSession();
        }

        public static void closeSessionFactory() {
            sessionFactory.close();
        }
    }
