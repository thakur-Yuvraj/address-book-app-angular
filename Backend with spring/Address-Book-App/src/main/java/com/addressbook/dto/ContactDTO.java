package com.addressbook.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO {
    @NotEmpty
    @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$")
    String name;
    String email;
    String phone;
}
