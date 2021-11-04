package com.rogue.cockroachdbupsert;

import com.rogue.cockroachdbupsert.repositories.ExtendedJpaRepositoryImpl;
import com.rogue.cockroachdbupsert.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = ExtendedJpaRepositoryImpl.class)
public class CockroachDbUpsertApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(CockroachDbUpsertApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userService.upsert();
		userService.upsertAll(2500);
//		userService.save();
		userService.saveAll(2500);
	}
}
