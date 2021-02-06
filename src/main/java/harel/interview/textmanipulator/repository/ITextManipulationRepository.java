package harel.interview.textmanipulator.repository;

import harel.interview.textmanipulator.repository.model.TextManipulationDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITextManipulationRepository extends MongoRepository<TextManipulationDataModel, String> {
}
