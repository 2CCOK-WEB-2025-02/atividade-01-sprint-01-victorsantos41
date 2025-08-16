package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        int contador = 0;
        Boolean palindromo = false;

        for (int i = palavra.length() - 1; i >= 0 ; i--) {
            if(palavra.toLowerCase().charAt(contador++) == palavra.toLowerCase().charAt(i)) {
                palindromo = true;
            } else {
                palindromo = false;
            }
        }
        return palindromo;
    }
}
