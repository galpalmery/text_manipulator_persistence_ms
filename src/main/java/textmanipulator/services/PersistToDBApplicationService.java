package textmanipulator.services;

import textmanipulator.repository.DataPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class PersistToDBApplicationService {
    @Autowired
    private DataPersistenceService dataPersistenceService;

    public ResponseEntity<Object> execute(String inputFileName, String outputFileName, String action)  {

        //commit an entry to MongoDB
        dataPersistenceService.persist(inputFileName, outputFileName, action);

        //send response 200 - OK
        return ResponseEntity.ok().build();
    }
}
