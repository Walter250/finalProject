package domain;
// Generated 25-Dec-2021 21:04:15 by Hibernate Tools 4.3.1



/**
 * Doctor generated by hbm2java
 */
public class Doctor  implements java.io.Serializable {


     private String email;
     private String names;
     private String phone;
     private String password;

    public Doctor() {
    }

    public Doctor(String names, String email, String phone, String password) {
       this.email = email;
       this.names = names;
       this.phone = phone;
       this.password = password;
    }
   
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNames() {
        return this.names;
    }
    
    public void setNames(String names) {
        this.names = names;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


