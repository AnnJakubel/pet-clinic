package ee.annjakubel.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    // Multiple mappings to be user-friendly
    // ie someone types in localhost:8080/vets/index
    // instead of just /vets
    @RequestMapping({"/vets", "vets/index", "vets/index.html"})
    public String listVets() {

        // inside templates' folder this corresponds
        // to the path vets/index.html
        return "vets/index";
    }
}
