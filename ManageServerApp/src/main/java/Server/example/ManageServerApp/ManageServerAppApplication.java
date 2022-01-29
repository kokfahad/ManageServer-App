package Server.example.ManageServerApp;

import Server.example.ManageServerApp.enumeration.Status;
import Server.example.ManageServerApp.model.Server;
import Server.example.ManageServerApp.repository.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static Server.example.ManageServerApp.enumeration.Status.SERVER_DOWN;
import static Server.example.ManageServerApp.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ManageServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageServerAppApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null,"192.168.1.160","Ubuntu Linux","16 GB","Personal PC","htt[://localhost:8080/server/image/server1.png", SERVER_UP));
			serverRepo.save(new Server(null,"192.168.1.150","Windows Vista","32 GB","Personal PC","htt[://localhost:8080/server/image/server2.png", SERVER_DOWN));
			serverRepo.save(new Server(null,"192.168.1.1300","Windows 10","8 GB","Office PC","htt[://localhost:8080/server/image/server3.png", SERVER_UP));
		};
	}

}
