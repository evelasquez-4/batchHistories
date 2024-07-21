/*
 * Created on 2024-07-16 ( 17:05:54 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Customer"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="customer", schema="public" )
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long       id ;

    //--- ENTITY DATA FIELDS 
    @Column(name="name", nullable=false, length=100)
    private String     name ;

    @Column(name="is_good_tipper")
    private Boolean    isGoodTipper ;

    @Column(name="is_suspicious")
    private Boolean    isSuspicious ;

    @Temporal(TemporalType.DATE)
    @Column(name="register_date")
    private Date       registerDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="customer")
    private List<Order> listOfOrder ; 


    /**
     * Constructor
     */
    public Customer() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setId( Long id ) {
        this.id = id ;
    }
    public Long getId() {
        return this.id;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setIsGoodTipper( Boolean isGoodTipper ) {
        this.isGoodTipper = isGoodTipper ;
    }
    public Boolean getIsGoodTipper() {
        return this.isGoodTipper;
    }

    public void setIsSuspicious( Boolean isSuspicious ) {
        this.isSuspicious = isSuspicious ;
    }
    public Boolean getIsSuspicious() {
        return this.isSuspicious;
    }

    public void setRegisterDate( Date registerDate ) {
        this.registerDate = registerDate ;
    }
    public Date getRegisterDate() {
        return this.registerDate;
    }

    //--- GETTERS FOR LINKS
    public List<Order> getListOfOrder() {
        return this.listOfOrder;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(isGoodTipper);
        sb.append("|");
        sb.append(isSuspicious);
        sb.append("|");
        sb.append(registerDate);
        return sb.toString(); 
    } 

}
