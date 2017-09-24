package sample.simple.repositories;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "sample")
public class SampleEntity implements Serializable {

  @Id
  @GeneratedValue
  @Column(name = "id")
  public Integer id;

  @Column(name = "name")
  public String name;

  @Column(name = "created_at")
  public Timestamp createdAt;
}
