package ma.enset.tp2_ormjpahibernatespringdata;

import ma.enset.tp2_ormjpahibernatespringdata.entities.JPAPatient;
import ma.enset.tp2_ormjpahibernatespringdata.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2OrmjpaHibernateSpringDataApplication implements CommandLineRunner {
    @Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {

		SpringApplication.run(Tp2OrmjpaHibernateSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
