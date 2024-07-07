package com.workintech.s18d1.util;

import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {

    public static void isIdNotValid(Long id){
        if(id < 0){
            throw new BurgerException("Id is not valid", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkName(String name){
        if(name == null || name.isEmpty()){
            throw new BurgerException("Name is null or empty", HttpStatus.BAD_REQUEST);
        }
    }


}
