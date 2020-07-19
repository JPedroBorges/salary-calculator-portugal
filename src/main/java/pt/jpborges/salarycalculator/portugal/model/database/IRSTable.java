package pt.jpborges.salarycalculator.portugal.model.database;

import lombok.Data;
import pt.jpborges.salarycalculator.model.database.Coin;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Entity
public class IRSTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String year;
    private boolean married;
    private boolean handicap;
    private int dependents;
    private double income;
    private double irsTax;
    @OneToOne(fetch = FetchType.EAGER)
    private Coin coin;

    public IRSTable() {}
    public IRSTable(String aYear, boolean aMarried, boolean aHandicap, int aDependents, double aIncome, double aIrsTax, Coin aCoin) {
        year = aYear;
        married = aMarried;
        handicap = aHandicap;
        dependents = aDependents;
        income = aIncome;
        irsTax = aIrsTax;
        coin = aCoin;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public boolean isMarried() { return married; }
    public void setMarried(boolean married) { this.married = married; }

    public boolean isHandicap() { return handicap; }
    public void setHandicap(boolean handicap) { this.handicap = handicap; }

    public int getDependents() { return dependents; }
    public void setDependents(int dependents) { this.dependents = dependents; }

    public double getIncome() { return income; }
    public void setIncome(double income) { this.income = income; }

    public double getIrsTax() { return irsTax; }
    public void setIrsTax(double irsTax) { this.irsTax = irsTax; }

    public Coin getCoin() { return coin; }
    public void setCoin(Coin coin) { this.coin = coin; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IRSTable irsTable = (IRSTable) o;

        return id != null ? id.equals(irsTable.id) : irsTable.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "IRSTable{" +
                "id=" + id +
                ", year=" + year +
                ", married=" + married +
                ", handicap=" + handicap +
                ", dependents=" + dependents +
                ", income=" + income +
                ", irsTax=" + irsTax +
                ", coin=" + coin +
                '}';
    }
}
