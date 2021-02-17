package textmanipulator.repository;

import textmanipulator.repository.model.TextManipulationDataModel;
import org.springframework.beans.factory.annotation.Autowired;

public class DataPersistenceService {
    @Autowired
    ITextManipulationRepository repository;

    public void persist(String inputFileName, String outputFileName, String action) {
        System.out.println("saving new entry to collection, " +
                "inputFileName: " + inputFileName + ", outputFileName" + outputFileName + ", action: " + action);
        repository.save(new TextManipulationDataModel(inputFileName, outputFileName, action));
    }
}
