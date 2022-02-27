package co.edureka.students.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static Session session = null;
	
	public static Session getSession() {
	  if(session == null) 
	  {	
		Configuration config = new Configuration();
		config.configure("co/edureka/students/configs/hibernate.cfg.xml"); //XML parsing
		
		SessionFactory sfactory = config.buildSessionFactory();
		session = sfactory.openSession();
	  }
	  return session;
	}
}
