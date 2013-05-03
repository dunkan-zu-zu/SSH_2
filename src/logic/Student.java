package logic;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="Student")
public class Student implements Serializable{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")

    @Column(name="id")
    private Long id;




    @Column(name="age")
    private Long age;


    @Column(name="name")
    private String name;


    public Long getId() {
        return id;
    }


    public String getName(){
        return name;
    }


    public Long getAge(){
        return age;
    }

    public void setId(Long i){
        id = i;
    }

    public void setName(String s){
        name = s;
    }

    public void setAge(Long l){
        age = l;
    }
}