/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorService;

import DoctorService.*;
import dao.GeneralDao;
import domain.Doctor;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Planet Innovation
 */
public class DoctorAuthImpl implements DoctorAuth{

    GeneralDao<Doctor> doctorDao = new GeneralDao<>(Doctor.class);
    Doctor doctor = new Doctor();
 
    
    private boolean isValidDoctor(String email){
        if(doctorDao.findBySTRING_PK(email) == null){
            return false;
        }
        
        return true;
    }
    
    public Doctor findDoctor(String email){
        doctor = doctorDao.findBySTRING_PK(email);
        if(doctor == null){
            throw new RuntimeException("Doctor Not Found");
        }else{
            return doctor;
        }
    }
    
     //   START OF Hash Password PROCCESS
    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        byte[] hash = digest.digest(password.getBytes());
        return bytesToStringHex(hash);
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToStringHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    @Override
    public Doctor login(String email, String password) {
        if(!isValidDoctor(email)){
            throw new RuntimeException("Account Not Found");
        }  
        
        try {
            
            doctor = doctorDao.findBySTRING_PK(email);
            if(doctor.getPassword().toString().equals(hashPassword(password))){
                return doctor;
            }
            throw new RuntimeException("Wrong Password");           
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    @Override
    public Doctor signup(Doctor doctor){
        if(isValidDoctor(doctor.getEmail())){
            throw new RuntimeException("Doctor Arleady Exist");
        }
        
        
        try {
            doctor.setPassword(hashPassword(doctor.getPassword()));
            doctorDao.create(doctor);
            return doctor;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    
}
