package academy.devdojo.maratonajava.ZZIjdbc.test;

import academy.devdojo.maratonajava.ZZIjdbc.service.ProducerService;
import academy.devdojo.maratonajava.ZZIjdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.save(producer);
//        ProducerService.delete(5);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showProducerMetadata();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        log.info("Producers found '{}'", producers);

//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}'", producers);
//        ProducerService.findByNameAndDelete("A-1 pictures");
        List<Producer> producers = ProducerService.findByNamePreparedStatement("Rodrigo");
        log.info("Producers found '{}'", producers);

    }
}
