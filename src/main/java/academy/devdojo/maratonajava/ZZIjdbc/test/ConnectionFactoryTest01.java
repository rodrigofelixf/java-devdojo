package academy.devdojo.maratonajava.ZZIjdbc.test;

import academy.devdojo.maratonajava.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.ZZIjdbc.controller.ProducerController;
import academy.devdojo.maratonajava.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.ZZIjdbc.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("Editora Abril").build();
//        ProducerController.save(producer);

        Producer producer = Producer.builder().id(1).name("SBT").build();
        ProducerController.update(producer);
    }
}
