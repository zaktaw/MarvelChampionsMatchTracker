package zaktaw.MarvelChampionsMatchTracker.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table
public class Match {
    @Id
    @SequenceGenerator(name = "test_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_sequence")
    private Integer id;
    private String hero;
    private String deck;
    private String villain;
    private boolean expertMode;
    private List<String> modules;
    private boolean won;
    private Date timestamp;
}
