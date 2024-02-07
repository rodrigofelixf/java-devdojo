package academy.devdojo.maratonajava.ZZIjdbc.test;


import academy.devdojo.maratonajava.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.ZZIjdbc.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("STUDIO DEEN");
        log.info(producers);
    }
}
