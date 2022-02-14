
	import com.fasterxml.classmate.AnnotationConfiguration;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class HibernateUtil {
	    private static final SessionFactory sessionFactory;

	    static
	    {
	        try 
	        {
	            //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	            sessionFactory = new Configuration().configure().buildSessionFactory();
	        } 
	        catch (Throwable ex) 
	        {
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	
}
