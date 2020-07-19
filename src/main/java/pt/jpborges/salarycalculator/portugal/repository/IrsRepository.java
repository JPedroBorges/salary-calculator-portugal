package pt.jpborges.salarycalculator.portugal.repository;

import org.springframework.data.repository.CrudRepository;
import pt.jpborges.salarycalculator.model.database.Coin;
import pt.jpborges.salarycalculator.portugal.model.database.IRSTable;

import java.util.Optional;

public interface IrsRepository extends CrudRepository<IRSTable, Long> {

}
