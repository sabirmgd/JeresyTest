package sabir.test.jms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import sabir.test.jms.entity.Message;

	
	public class DatabaseService {

		private static final String PERSISTENCE_UNIT_NAME = "testJPA";
		private static EntityManagerFactory factory   = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		
	    public static Message getMessage(String id){
	        EntityManager em = factory.createEntityManager();
	        Message message = new Message();
	       message =  em.find(Message.class, id);
	      em.close();
	      return message;
	      }
	    
	    
		}

		

	
