import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UberSimulationRestController {
    @GetMapping("/")
    public String UberSimulationRest(){
        return "Hello Spring boot";
    }
}
