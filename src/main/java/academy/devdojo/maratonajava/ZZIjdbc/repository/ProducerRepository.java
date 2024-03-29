package academy.devdojo.maratonajava.ZZIjdbc.repository;

import academy.devdojo.maratonajava.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.ZZIjdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Database rows '{}' affected '{}'", producer.getName(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' affected '{}'", id, rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
            e.printStackTrace();
        }
    }


    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update producer '{}' affected '{}'", producer.getName(), rowsAffected);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getName(), e);
            e.printStackTrace();
        }
    }


    public static List<Producer> findAll() {
        log.info("Finding All Producers");
        return findByName("");
//        String sql = "SELECT id, name FROM anime_store.producer;";
//        List<Producer> producers = new ArrayList<>();
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                var id = rs.getInt("id");
//                var name = rs.getString("name");
//                Producer producer = Producer.builder().id(id).name(name).build();
//                producers.add(producer);
//            }
//        } catch (SQLException e) {
//            log.error("Error while trying to Find producer");
//            e.printStackTrace();
//        }
//        return producers;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding All Producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to Find producer");
            e.printStackTrace();
        }
        return producers;
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding All Producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE ?;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);

             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to Find producer");
            e.printStackTrace();
        }
        return producers;
    }



    public static void showProducerMetadata() {
        log.info("Showing Producer Metadata");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", rsMetaData.getTableName(i));
                log.info("Column name '{}'", rsMetaData.getColumnName(i));
                log.info("Column size '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", rsMetaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing Driver Metadata");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And Supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And Supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And Supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            log.info("Last row? '{}'", rs.last());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("First row? '{}'", rs.first());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Absolute? '{}'", rs.absolute(2));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row relative ? '{}'", rs.relative(-1));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("is last? '{}'", rs.isLast());
            log.info("Row number '{}'", rs.getRow());

            log.info("is first? '{}'", rs.isFirst());
            log.info("Row number '{}'", rs.getRow());

            log.info("Last row? '{}'", rs.last());
            log.info("------------------");
            rs.next();
            log.info("After last row? '{}'", rs.isAfterLast());
            while(rs.previous()){
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }

    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding Producer by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding Producer by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return producers;

            insertNewProducer(name, rs);

            producers.add(getProducer(rs));
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Finding Producer by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    }
}
