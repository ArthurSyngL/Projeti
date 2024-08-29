import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Pagamento;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pagamentosPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Pagamento pg = new Pagamento();
        pg.setId(11);
        pg.setValor(500);
        pg.setData(new Date());
        System.out.println(pg );
    }
}
