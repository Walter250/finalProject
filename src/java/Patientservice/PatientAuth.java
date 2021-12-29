/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patientservice;

import domain.Patient;


/**
 *
 * @author Planet Innovation
 */
public interface PatientAuth {
    public Patient login(String email, String password);
    public Patient signup(Patient patient);
    
}
