package pt.jpborges.salarycalculator.portugal.model.database;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pt.jpborges.salarycalculator.model.database.Coin;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class IRSTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String year;
    private boolean married;
    private boolean handicap;
    private int dependents;
    private double income;
    private double irsTax;
    @OneToOne(fetch = FetchType.EAGER)
    private Coin coin;

}
