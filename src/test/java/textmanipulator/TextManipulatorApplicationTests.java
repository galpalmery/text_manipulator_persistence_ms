package textmanipulator;

import textmanipulator.repository.ITextManipulationRepository;
import textmanipulator.repository.model.TextManipulationDataModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TextManipulatorApplicationTests {

	@Autowired
	ITextManipulationRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void test() {
		deleteAll();
        addSampleData();
        listAll();
	}

	public void deleteAll() {
		System.out.println("Deleting all records..");
		repository.deleteAll();
	}

	public void addSampleData() {
		System.out.println("Adding sample data");
		repository.save(new TextManipulationDataModel("sample_in1.txt", "sample_out1.txt", "sort"));
		repository.save(new TextManipulationDataModel("sample_in2.txt", "sample_out2.txt", "shuffle"));
		repository.save(new TextManipulationDataModel("sample_in3.txt", "sample_out.txt", "reverse"));
	}

	public void listAll() {
		System.out.println("Listing sample data");
		repository.findAll().forEach(u -> System.out.println(u));
	}

}
