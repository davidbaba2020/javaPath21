package org.example.excepptions;

import lombok.*;

import java.math.BigDecimal;

//@Getter
//@Setter
//@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Dev {
//    @NonNull
    private String name;
    private String emaIL;
    private int age;
    private BigDecimal allowance;

}
