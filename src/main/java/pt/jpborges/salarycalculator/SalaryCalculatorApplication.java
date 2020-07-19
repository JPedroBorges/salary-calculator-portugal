package pt.jpborges.salarycalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.jpborges.salarycalculator.model.database.Coin;
import pt.jpborges.salarycalculator.repository.CoinRepository;

import java.util.Optional;

@SpringBootApplication
public class SalaryCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalaryCalculatorApplication.class, args);
    }
}
