package sample.simple.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SampleRepository extends CrudRepository<SampleEntity, Integer> {

  @Query("select s from Sample s where s.name = :name")
  List<SampleEntity> findByName(@Param("name") String name);
}
