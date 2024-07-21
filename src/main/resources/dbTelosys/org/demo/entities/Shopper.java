/*
 * Created on 2024-07-21 ( 18:11:22 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Shopper"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="shopper", schema="public" )
public class Shopper implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id ;

    //--- ENTITY DATA FIELDS 
    @Column(name="code", nullable=false, length=10)
    private String     code ;

    @Column(name="name", nullable=false, length=80)
    private String     name ;

    @Column(name="phone_number")
    private Long       phoneNumber ;

    @Column(name="sex")
    private Boolean    sex ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="shopper")
    private List<Batch> listOfBatch ; 


    /**
     * Constructor
     */
    public Shopper() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    public void setCode( String code ) {
        this.code = code ;
    }
    public String getCode() {
        return this.code;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setPhoneNumber( Long phoneNumber ) {
        this.phoneNumber = phoneNumber ;
    }
    public Long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setSex( Boolean sex ) {
        this.sex = sex ;
    }
    public Boolean getSex() {
        return this.sex;
    }

    //--- GETTERS FOR LINKS
    public List<Batch> getListOfBatch() {
        return this.listOfBatch;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(code);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(phoneNumber);
        sb.append("|");
        sb.append(sex);
        return sb.toString(); 
    } 

}
