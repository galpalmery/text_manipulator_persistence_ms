package textmanipulator.controllers;

import textmanipulator.repository.model.TextManipulationDataModel;
import textmanipulator.services.PersistToDBApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextManipulatorPersistenceController {

    @Autowired
    private PersistToDBApplicationService persistToDBApplicationService;

    //keeping this for testing purposes
//    @PostMapping("/textmanipulator/inputfilename/{inputfilename}/outputfilename/{outputfilename}/action/{action}")
//    public ResponseEntity<Object> persitToDBwithPathParams(@PathVariable("inputfilename") String inputFileName,
//                                                           @PathVariable("outputfilename") String outputFileName,
//                                                           @PathVariable("action") String action) {
//        return persistToDBApplicationService.execute(inputFileName, outputFileName, action);
//    }

    //this is intercepted from feign client
    @PostMapping("/textmanipulator")
    public ResponseEntity<Object> persistToDB(@RequestBody TextManipulationDataModel textManipulationDataModel) {
        System.out.println("inside persistToDB");

        return persistToDBApplicationService.execute(textManipulationDataModel.getInputFileName(),
                textManipulationDataModel.getOutputFileName(), textManipulationDataModel.getAction());
    }
}
