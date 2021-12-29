
import db.Connect;
import domain.Appointment;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Walter
 */
public class NewClass {
    public  static void main(String [] args){
    Session ses = Connect.getSessionFactory().openSession();
    ses.beginTransaction();
    Criteria criteria = ses.createCriteria(Appointment.class);
    criteria.setProjection(Projections.property("date"));
    List<Date> all = criteria.list();

    for (Date d: all)
       System.out.println(LocalDate.parse(d.toString()));
        
    }
    
}
