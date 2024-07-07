package com.workintech.s18d1.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BurgerErrorResponse {
    private String message;
}
