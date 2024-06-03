package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//Component para inicializar a classe no bean
@Component
public class MyApp implements CommandLineRunner {
    //O Autowired vai fazer a injeção de independencia na classe Calculadora ou seja vai instanciar a classe
    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("o resultado é " + calculadora.somar(2,7));
    }
}
