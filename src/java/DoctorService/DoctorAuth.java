/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorService;

import domain.Doctor;


/**
 *
 * @author Planet Innovation
 */
public interface DoctorAuth {
    public Doctor login(String email, String password);
    public Doctor signup(Doctor doctor);
    
}
