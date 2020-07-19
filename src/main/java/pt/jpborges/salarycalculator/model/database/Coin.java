package pt.jpborges.salarycalculator.model.database;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;
    private String code;
    private double conversionRate;
    private boolean defaultCoin;
    private boolean active;

    public Coin() {}
    public Coin(String aDescription, String aCode, double aConversionRate, boolean aDefaultCoin) {
        description = aDescription;
        code = aCode;
        conversionRate = aConversionRate;
        defaultCoin = aDefaultCoin;
        active = true;

    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public double getConversionRate() { return conversionRate; }
    public void setConversionRate(double conversionRate) { this.conversionRate = conversionRate; }

    public boolean isDefaultCoin() { return defaultCoin; }
    public void setDefaultCoin(boolean defaultCoin) { this.defaultCoin = defaultCoin; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active;  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        return id == coin.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Coin{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", conversionRate=" + conversionRate +
                ", defaultCoin=" + defaultCoin +
                ", active=" + active +
                '}';
    }
}
