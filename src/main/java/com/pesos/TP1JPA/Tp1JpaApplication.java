package com.pesos.TP1JPA;

import com.pesos.TP1JPA.Entidades.Cliente;
import com.pesos.TP1JPA.Entidades.DetallePedido;
import com.pesos.TP1JPA.Entidades.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Tp1JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1JpaApplication.class, args);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceAppPU");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			Cliente cliente = new Cliente("Cristian" , "Magallanes" , "2613016662" , "prueba@gmail.com" );
			em.persist(cliente);
			DetallePedido detallePedido = new DetallePedido(40, 595.50);
			em.flush();
			em.getTransaction().commit();
		}catch(Exception e){
			em.getTransaction().rollback();
		}

		em.close();
		emf.close();



	}
}


