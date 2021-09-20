package org.sayner.sandbox.soap.repository;

import org.sayner.sandbox.soap.generated.Country;
import org.sayner.sandbox.soap.generated.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
        final Country russia=new Country();
        russia.setName("Russakaja");
        russia.setPopulation(127);
        russia.setCapital("Moscow");
        russia.setCurrency(Currency.EUR);
        countries.put(russia.getName(),russia);

        final Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
