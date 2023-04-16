package zaktaw.MarvelChampionsMatchTracker.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Test {
    @Id
    @SequenceGenerator(name = "test_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_sequence")
    private Integer id;
    private String name;
}
