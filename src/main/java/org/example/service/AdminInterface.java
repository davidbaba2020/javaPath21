package org.example.service;

import org.example.models.Applicant;
import org.example.models.Result;
import org.example.models.School;

public interface AdminInterface {
   Result admitApplicant(Applicant applicant, School school);
}


//S  - Single responsibility
//O  - Open to extension close to modification
//L -  Liskov substitution
//I -  interface segregation
//D -  dependency inversion


//D - Don't
//R - Repeat
//Y - Yourself