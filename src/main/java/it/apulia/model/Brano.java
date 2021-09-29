package it.apulia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.security.sasl.SaslServer;
import java.lang.annotation.Documented;
import java.util.ArrayList;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Brano {

    @Id
            @SequenceGenerator(
                    name = "brano_sequence",
                     sequenceName = "brano_sequence",
                      allocationSize = 1
            )
            @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "brano_sequence"
            )

    Long branoId;
    String Titolo ;
    String Cantante;
    String Album;
    int AnnoUscita;
    double voto;








}
