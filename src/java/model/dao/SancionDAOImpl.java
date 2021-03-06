/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.util.ArrayList;
import model.entities.Sancion;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author agustin
 */
public class SancionDAOImpl implements SancionDAO{
    Transaction transaction = null;
    Session session;

    @Override
    public boolean agregar(Sancion sancion) {
        try{
            session= HibernateUtil.getSessionFactory().getCurrentSession();
            transaction= session.beginTransaction();
            session.save(sancion);
            transaction.commit();
            return true;
        }
        catch(HibernateException e){
            if(transaction != null)
                transaction.rollback();
            return false;
        }
    }

    @Override
    public ArrayList<Sancion> listar() {
        try{
            Session sessionLocal;
            sessionLocal=HibernateUtil.getSessionFactory().getCurrentSession();
            return (ArrayList<Sancion>)sessionLocal.createQuery("from Sancion").list();
        }
        catch(HibernateException e){
            return null;
        }
    }

}
