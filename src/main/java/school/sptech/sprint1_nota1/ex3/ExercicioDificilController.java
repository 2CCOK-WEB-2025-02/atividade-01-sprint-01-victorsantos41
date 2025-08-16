package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {

        ExercicioDificilResponse ex = new ExercicioDificilResponse();

        double enesimoTermo = 0.0;
        double soma = 0.0;

        for (int i = 1; i <= n ; i++) {
            enesimoTermo = 1 / Math.sqrt(5) * ((Math.pow(((1 + Math.sqrt(5))/2),i)) - (Math.pow(((1 - Math.sqrt(5))/2),i)));
            soma += enesimoTermo;
        }
        ex.setEnesimoTermo(Math.floor(enesimoTermo));
        ex.setSoma(Math.floor(soma));
        return ex;
    }
}
