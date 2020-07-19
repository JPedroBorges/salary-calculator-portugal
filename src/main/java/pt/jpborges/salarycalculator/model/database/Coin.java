package pt.jpborges.salarycalculator.model.database;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String description;
    private String code;
    private double conversionRate;
    private boolean defaultCoin;
    private boolean active;


}
