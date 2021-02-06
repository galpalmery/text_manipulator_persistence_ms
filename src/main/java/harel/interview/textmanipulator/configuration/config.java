package harel.interview.textmanipulator.configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import harel.interview.textmanipulator.repository.DataPersistenceService;
import harel.interview.textmanipulator.services.PersistToDBApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    PersistToDBApplicationService actionSwitcherApplicationService() {
        return new PersistToDBApplicationService();
    }

    @Bean
    DataPersistenceService mongoDataPersistance() {
        return new DataPersistenceService();
    }

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017");
    }

}
