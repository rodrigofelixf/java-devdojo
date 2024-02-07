package academy.devdojo.maratonajava.ZZIjdbc.service;

import academy.devdojo.maratonajava.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }
}
