package com.example.mrisk.collegeapp17_18;

/**
 * Created by mrisk on 1/5/2018.
 */

public class AgeException extends RuntimeException {
        public AgeException(String message){
            super(message);
        }

        public String joinMessageAndYear(String message, int year){
            return message + " " + String.valueOf(year);
        }
    }

