package co.edureka.students;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.students.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		//--- create SessionFactory
		Configuration config = new Configuration();
		config.configure("co/edureka/students/configs/hibernate.cfg.xml"); //XML parsing
		SessionFactory sfactory = config.buildSessionFactory();
		
		//-- get a Session (a connection with DB)
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setStudid(101);
		st.setSname("Sunil Joseph");
		st.setEmail("sunil@hotmail.com");
		st.setMobile("9848586878");
		
		//-- save student object with hibernate
		session.save(st);
		
		System.out.println("-------------------------------------------------------");
		tx.commit();
		
		session.close();
		sfactory.close();
	}
}
