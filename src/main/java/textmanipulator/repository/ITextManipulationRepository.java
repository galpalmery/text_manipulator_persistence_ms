package textmanipulator.repository;

import textmanipulator.repository.model.TextManipulationDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITextManipulationRepository extends MongoRepository<TextManipulationDataModel, String> {
}
