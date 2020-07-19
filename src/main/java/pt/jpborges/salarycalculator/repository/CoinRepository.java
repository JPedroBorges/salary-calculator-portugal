package pt.jpborges.salarycalculator.repository;

import org.springframework.data.repository.CrudRepository;
import pt.jpborges.salarycalculator.model.database.Coin;
import pt.jpborges.salarycalculator.portugal.model.database.IRSTable;

import java.util.Optional;

public interface CoinRepository extends CrudRepository<Coin, Long> {
    Optional<Coin> findByCode(String code);
}
