package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			System.out.println("Creating new Student Object.");
			Student tempStudent = new Student("Lemank", "Jhunpang", "lemank@bio.com");
			
			session.beginTransaction();
			System.out.println("Saving Student Object.");
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			System.out.println("We're done.");
		}finally {
			factory.close();
		}
	}

}
