package br.com.eaugusto.FirstSpringBootProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.eaugusto.domain.Client;
import br.com.eaugusto.repository.IClientRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.eaugusto.repository")
@EntityScan("br.com.eaugusto.*")
@ComponentScan(basePackages = "br.com.eaugusto")
public class FirstSpringBootProjectApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(FirstSpringBootProjectApplication.class);

	@Autowired
	private IClientRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Client client = createClient();
		repository.save(client);
	}

	private Client createClient() {
		return Client.builder().name("Eduardo").cpf("12345678910").city("Java City").state("Springfield")
				.address("SQL Street").addressNumber("404").telephoneNumber("(10)12345-6789")
				.email("JavaEmail@gmail.com").build();
	}
}
