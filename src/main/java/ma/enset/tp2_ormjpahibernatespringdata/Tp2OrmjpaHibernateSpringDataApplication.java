package ma.enset.tp2_ormjpahibernatespringdata;

import ma.enset.tp2_ormjpahibernatespringdata.entities.JPAPatient;
import ma.enset.tp2_ormjpahibernatespringdata.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class Tp2OrmjpaHibernateSpringDataApplication implements CommandLineRunner {
    @Autowired
	private PatientRepository patientRepository;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) {

		SpringApplication.run(Tp2OrmjpaHibernateSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		patientRepository.save(new JPAPatient(null,"aitchrif1",sdf.parse("2004-02-16"),false,16));
		patientRepository.save(new JPAPatient(null,"aitchrif2",sdf.parse("2004-02-17"),false,17));
		patientRepository.save(new JPAPatient(null,"aitchrif3",sdf.parse("2004-02-18"),false,18));
        List<JPAPatient> patients = patientRepository.findAll();
        patients.forEach(p->{
			System.out.println(p.toString());
				}

		);
	}
}
