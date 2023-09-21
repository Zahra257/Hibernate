package hebernate;


import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  hebernate p = new hebernate("zahra", "najem", 10); 
		  
		  SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		  
		  Session session=sessionFactory.openSession();
		  Transaction tx=session.beginTransaction();

			/*//////////// insert *///////////////////////
			/*
			 * session.save(p); 
			 * tx.commit();
			 * 
			 * session.close();
			 */
		 
		
	
			/*/////////////get//////////////////////
			 * 
			 * hebernate get =(hebernate) session.get(hebernate.class , 1 );
			 *  tx.commit();
			 *; 
			 * System.out.println(get.getAge());
			   session.close()*/

		  
		      ///////////////// update ///////////////
			/*
			 * hebernate post =(hebernate) session.get(hebernate.class , 1 );
			 * 
			 * post.setAge(120);
			 *  session.update(post);
			 *   tx.commit(); 
			 *   session.close();
			 */
			   
	      ///////////dalete//////////////////////////
		 
			/*
			 * hebernate delete =(hebernate) session.get(hebernate.class , 1 );
			 * session.delete(delete);
			 *  tx.commit(); 
			 *  session.close();
			 */
	
		
          
          
          
       
	}

}
