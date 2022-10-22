package liga.medical.personservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "medical_card")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicalCard {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "client_status", length = 1)
    private String clientStatus;

    @Column(name = "med_status", length = 1)
    private String medStatus;

    @Column(name = "registry_dt")
    private LocalDate registryDt;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "comment")
    private String comment;

    @OneToMany
    @JoinColumn(name = "medical_card_id")
    private Set<Illness> illnesses = new LinkedHashSet<>();

}