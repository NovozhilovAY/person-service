package liga.medical.personservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "country_id", nullable = false)
    private Long countryId;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "index")
    private Integer index;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "building", nullable = false, length = 32)
    private String building;

    @Column(name = "flat", length = 32)
    private String flat;

}