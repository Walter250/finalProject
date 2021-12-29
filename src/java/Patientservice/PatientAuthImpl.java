/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patientservice;

import dao.GeneralDao;
import domain.Patient;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Planet Innovation
 */
public class PatientAuthImpl implements PatientAuth{

    GeneralDao<Patient> patientDao = new GeneralDao<>(Patient.class);
    Patient patient = new Patient();
 
    
    private boolean isValidPatient(String email){
        if(patientDao.findBySTRING_PK(email) == null){
            return false;
        }
        
        return true;
    }
    
    public Patient findPatient(String email){
        patient = patientDao.findBySTRING_PK(email);
        if(patient == null){
            throw new RuntimeException("Patient Not Found");
        }else{
            return patient;
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
    public Patient login(String email, String password) {
        if(!isValidPatient(email)){
            throw new RuntimeException("Account Not Found");
        }  
        
        try {
            
            patient = patientDao.findBySTRING_PK(email);
            if(patient.getPassword().toString().equals(hashPassword(password))){
                return patient;
            }
            throw new RuntimeException("Wrong Password");           
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    @Override
    public Patient signup(Patient patient){
        if(isValidPatient(patient.getEmail())){
            throw new RuntimeException("Patient Arleady Exist");
        }
        
        
        try {
            patient.setPassword(hashPassword(patient.getPassword()));
            patientDao.create(patient);
            return patient;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    
}
