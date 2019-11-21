package ru.itvitality.sbrf.cu.library.dao.utils;

import org.hibernate.Hibernate;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ru.itvitality.sbrf.cu.library.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManageContext {

    public static EntityManager getInstance() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "library" );
        return emf.createEntityManager();
    }
}
