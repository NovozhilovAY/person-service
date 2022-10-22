package liga.medical.personservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "illness")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Illness {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "type_id")
    private Long typeId;

    @Column(name = "heaviness", length = 1)
    private String heaviness;

    @Column(name = "appearance_dttm", nullable = false)
    private Instant appearanceDttm;

    @Column(name = "recovery_dt")
    private LocalDate recoveryDt;

}