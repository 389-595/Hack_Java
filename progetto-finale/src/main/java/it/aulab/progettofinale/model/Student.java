package it.aulab.progettofinale.model;

import java.security.PrivilegedActionException;
import java.util.List;

import org.hibernate.internal.util.type.PrimitiveWrapperHelper.PrimitiveWrapperDescriptor;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "firstname" , column = @Column(name = "firstname" , nullable = false)),
        @AttributeOverride(name = "lastname" , column = @Column(name = "lastname" , nullable = false)),
    })
    private Person data;

    @Column(length = 1000, nullable = false, unique = true) 
    private String email;

    @ManyToMany(mappedBy = "students")
    private List<Course> course;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
    
    


}
