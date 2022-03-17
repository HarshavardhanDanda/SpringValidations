package com.demo;

import com.demo.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message="this field is required")
    @Size(min=1,message="is required")
    private String lastName;

    @NotNull(message="is required")
    @Min(value=0, message="must be greater than or equal to zero")
    @Max(value=10, message="must be less than or equal to 10")
    private Integer freePasses;//Integer is a wrapper class, so if we give null, it wont throw error

    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 characters/digits are allowed")
    private String postalCode;

    @Pattern(regexp="^[a-z0-9]{5,}@gmail.com$", message="not a valid email")
    private String email;

    @CourseCode
    private String courseCode;


    public Customer(){
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
