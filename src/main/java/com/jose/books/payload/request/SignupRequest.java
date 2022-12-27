package com.jose.books.payload.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
// import javax.validation.constraints.Size;

public class SignupRequest {

    @NotBlank(message = "Full name is required")
    // @Size(min = 3, max = 100)
    private String fullname;

    @NotBlank(message = "Name is required")
    private String username;

    // @NotBlank
    // @Size(max = 50)
    @Email
    private String email;

    private Set<String> roles;

    @NotBlank(message = "Password is required")
    // @Size(min = 4, max = 40)
    private String password;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
