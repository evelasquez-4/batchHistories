package com.app.batch.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="order", schema="public" )
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long       id ;

    //--- ENTITY DATA FIELDS 
    @Column(name="total_items")
    private Integer    totalItems ;

    @Temporal(TemporalType.DATE)
    @Column(name="date")
    private Date       date ;

    @Column(name="is_gift", nullable=false)
    private Boolean    isGift ;

    @Column(name="note", length=200)
    private String     note ;

    @Column(name="tip")
    private Double     tip ;

    @Column(name="customer_id")
    private Long    customerId ;

    @Column(name="store_id")
    private Long    storeId ;

    @Column(name="batch_id")
    private Long    batchId ;

    @Column(name="shopper_notes", length=250)
    private String     shopperNotes ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="due_date")
    private Date       dueDate ;

    @Column(name="number_order")
    private Integer    numberOrder ;

    @Column(name="address_id", nullable=false)
    private Long    addressId ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="store_id", referencedColumnName="id", insertable=false, updatable=false)
    private Store      store ; 

    @OneToMany(mappedBy="order")
    @JsonManagedReference
    private List<Image> listOfImage ; 

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="customer_id", referencedColumnName="id", insertable=false, updatable=false)
    private Customer   customer ; 

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="address_id", referencedColumnName="id", insertable=false, updatable=false)
    private Address    address ; 

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="batch_id", referencedColumnName="id", insertable=false, updatable=false)
    private Batch      batch ; 
    
    
    public Order() {}

	public Order(Long id, Integer totalItems, Date date, Boolean isGift, String note, Double tip, Long customerId,
			Long storeId, Long batchId, String shopperNotes, Date dueDate, Integer numberOrder, Long addressId,
			Store store, List<Image> listOfImage, Customer customer, Address address, Batch batch) {
	
		this.id = id;
		this.totalItems = totalItems;
		this.date = date;
		this.isGift = isGift;
		this.note = note;
		this.tip = tip;
		this.customerId = customerId;
		this.storeId = storeId;
		this.batchId = batchId;
		this.shopperNotes = shopperNotes;
		this.dueDate = dueDate;
		this.numberOrder = numberOrder;
		this.addressId = addressId;
		this.store = store;
		this.listOfImage = listOfImage;
		this.customer = customer;
		this.address = address;
		this.batch = batch;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getIsGift() {
		return isGift;
	}

	public void setIsGift(Boolean isGift) {
		this.isGift = isGift;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Double getTip() {
		return tip;
	}

	public void setTip(Double tip) {
		this.tip = tip;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getShopperNotes() {
		return shopperNotes;
	}

	public void setShopperNotes(String shopperNotes) {
		this.shopperNotes = shopperNotes;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getNumberOrder() {
		return numberOrder;
	}

	public void setNumberOrder(Integer numberOrder) {
		this.numberOrder = numberOrder;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public List<Image> getListOfImage() {
		return listOfImage;
	}

	public void setListOfImage(List<Image> listOfImage) {
		this.listOfImage = listOfImage;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

}
