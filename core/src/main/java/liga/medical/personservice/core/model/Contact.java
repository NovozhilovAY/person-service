package liga.medical.personservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "contact")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "phone_number", nullable = false, length = 32)
    private String phoneNumber;

    @Column(name = "email", nullable = false, length = 128)
    private String email;

    @Lob
    @Column(name = "profile_link")
    private String profileLink;

    @OneToMany
    @JoinColumn(name = "contact_id")
    private Set<Address> addresses = new LinkedHashSet<>();

}