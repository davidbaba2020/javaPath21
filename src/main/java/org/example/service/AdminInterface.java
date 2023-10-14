package org.example.service;

import org.example.models.Applicant;
import org.example.models.Result;
import org.example.models.School;
import org.example.models.Student;

import java.util.List;

public interface AdminInterface {
   List<Student> admitApplicant(Applicant applicant, School school);
}




