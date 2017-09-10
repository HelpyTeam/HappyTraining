package models;

import javax.persistence.*;

@Entity

@Table(name="b_course")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;

    public String name;
}


