package com.likhith.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_account_details")
public class UserAccEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_account_id")
	private Integer user_account_id;
	
	@OneToOne
	@JoinColumn(name="user_id",referencedColumnName="user_id")
	private UserEntity user;
	
	

	


	public Integer getUser_account_id() {
		return user_account_id;
	}


	public void setUser_account_id(Integer user_account_id) {
		this.user_account_id = user_account_id;
	}



	public UserEntity getUser() {
		return user;
	}


	public void setUser(UserEntity user) {
		this.user = user;
	}


	public String getAccount_open_date() {
		return account_open_date;
	}


	public void setAccount_open_date(String account_open_date) {
		this.account_open_date = account_open_date;
	}


	public BigDecimal getCurrent_wallet_balance() {
		return current_wallet_balance;
	}


	public void setCurrent_wallet_balance(BigDecimal current_wallet_balance) {
		this.current_wallet_balance = current_wallet_balance;
	}


	public int getLinked_bank_accounts_count() {
		return linked_bank_accounts_count;
	}


	public void setLinked_bank_accounts_count(int linked_bank_accounts_count) {
		this.linked_bank_accounts_count = linked_bank_accounts_count;
	}


	public String getWalletPin() {
		return walletPin;
	}


	public void setWalletPin(String walletPin) {
		this.walletPin = walletPin;
	}


	@Column(name="account_open_date")
	private String account_open_date;
	
	@Column(name="current_wallet_balance",precision=10 ,scale=2 )
	private BigDecimal current_wallet_balance;
	
	@Column(name="linked_bank_accounts_count")
	private int linked_bank_accounts_count;
	

    @Column(name = "wallet_pin")
    private String walletPin;

	

}
