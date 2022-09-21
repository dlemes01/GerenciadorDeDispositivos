
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Teste{
public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("GerenciadorDeDispositivoPU");
    
    EntityManager em = factory.createEntityManager();
    
    GerenciadorDeDispositivo d = new GerenciadorDeDispositivo();
    d.setCod_dispositivo(0);
    d.setDescricao("Notebook IdeaPad 3i Intel)");
    d.setMarca("Lenovo");
    d.setImei_sn("312JK3BH42JG40327");
    d.setVlrDispositivo("R$3.200,00");
    d.setDisponivel("Sim");
    d.setCondicao("Novo");
    
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(d);
    tx.commit();
    em.close();
    factory.close();
    
    

    
}

    private static Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (Exception e) {
             throw new IllegalArgumentException(e);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
}
