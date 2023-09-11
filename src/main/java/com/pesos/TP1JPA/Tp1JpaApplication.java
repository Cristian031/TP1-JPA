package com.pesos.TP1JPA;

import com.pesos.TP1JPA.Entidades.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Tp1JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1JpaApplication.class, args);
		System.out.println("HOLAA");
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceAppPU");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			Cliente cliente = new Cliente("Cristian" , "Magallanes" , "2613016662" , "prueba@gmail.com" );
			em.persist(cliente);
			em.flush();
			em.getTransaction().commit();
		}catch(Exception e){
			em.getTransaction().rollback();
		}

		em.close();
		emf.close();


*/
	}
}


