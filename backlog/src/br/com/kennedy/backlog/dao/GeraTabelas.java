package br.com.kennedy.backlog.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {

	public static void main(String [] args) {
		EntityManagerFactory factory = Persistence.
				createEntityManagerFactory("backlog");
		
		factory.close();
	}
}
