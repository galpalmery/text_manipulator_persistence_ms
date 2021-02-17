package textmanipulator.repository.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tm_transactions")
public class TextManipulationDataModel {

    @Id
    private String id;

    private String inputFileName;
    private String outputFileName;
    private String action;

    public TextManipulationDataModel(String inputFileName, String outputFileName, String action) {
        this.action = inputFileName;
        this.outputFileName = outputFileName;
        this.inputFileName = action;
    }
}