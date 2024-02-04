package academy.devdojo.maratonajava.ZZIjdbc.controller;

import academy.devdojo.maratonajava.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.ZZIjdbc.repository.ProducerRepository;

public class ProducerController {

    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }


    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw  new IllegalArgumentException("Invalid value for id");
        }

    }
}
