package liga.medical.personservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Table(name = "person_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonData {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "birth_dt", nullable = false)
    private LocalDate birthDt;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex", nullable = false, length = 1)
    private String sex;

    @OneToOne
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;

    @OneToOne
    @JoinColumn(name = "medical_card_id", nullable = false)
    private MedicalCard medicalCard;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PersonData parent;

}