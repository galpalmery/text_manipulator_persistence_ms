package harel.interview.textmanipulator.controllers;

import harel.interview.textmanipulator.services.PersistToDBApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextManipulatorPersistenceController {

    @Autowired
    private PersistToDBApplicationService persistToDBApplicationService;

    @PostMapping("/textmanipulator/inputfilename/{inputfilename}/outputfilename/{outputfilename}/action/{action}")
    public ResponseEntity<Object> runTextManipulationAction(@PathVariable("inputfilename") String inputFileName,
                                                            @PathVariable("outputfilename") String outputFileName,
                                                            @PathVariable("action") String action) {
        return persistToDBApplicationService.execute(inputFileName, outputFileName, action);
    }
}
