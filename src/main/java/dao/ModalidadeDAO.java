package dao;

import domain.Modalidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModalidadeDAO implements DAO<Modalidade>{

    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    public void begin() {
        this.entityManagerFactory= Persistence.createEntityManagerFactory("reserva-pu");
        this.entityManager=entityManagerFactory.createEntityManager();
    }


    public void close(){
        if (entityManager != null){

            entityManager.close();
        }
        if (entityManagerFactory != null){
            entityManagerFactory.close();
        }
    }

    @Override
    public void salvar(Modalidade domain) {
    entityManager.getTransaction().begin();
    entityManager.persist(domain);
    close();

    }

    @Override
    public void update(Modalidade domain) {

    }

    @Override
    public void deletar(Modalidade domain) {
        begin();
        this.entityManager.remove(domain);
        close();
    }

    @Override
    public List<Modalidade> listartodos() {

        begin();
        Query modalidade = this.entityManager.createQuery("select m from Modalidade m");
        close();


        return null;
    }
}
