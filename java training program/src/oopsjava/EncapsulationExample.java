package oopsjava;

public class EncapsulationExample {
    public static void main(String[] args) {
        //add the student info
        StudentProfile s = new StudentProfile();
        s.setName("Thor");
        s.setEmail("ad@gmail.com");
        s.setAddress("lucknow");
        s.setMobile("786889865");
        //get and print student info
        System.out.println(s.getName());
        System.out.println(s.getEmail());
        System.out.println(s.getAddress());
        System.out.println(s.getMobile());
    }
}

class StudentProfile {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    String name;
    String email;
    String address;
    String mobile;
}
