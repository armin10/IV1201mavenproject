package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Defines a user account.
 * 
 * @author      Kentaro Hayashida
 * @author      Johny Premanantham
 * @version     1.0
 * @since       2015-01-03
 */
@Entity
public class Accounts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String account;
    private String password;
    private int balance;
    
    public Accounts(){
        
    }
    
    public Accounts(String account, String password, int balance){
        this.account = account;
        this.password = password;
        this.balance = balance;
        this.id = account;
    }
 
    
    public String getaccount(){
        return account;
    }
    
    public String getpassword(){
        return password;
    }
    
    public int getbalance(){
    return balance;
    }
    public int setbalance(int amount){
    this.balance = amount;
    return balance;
    }
   

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accounts)) {
            return false;
        }
        Accounts other = (Accounts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bank.model.Accounts[ id=" + id + " ]";
    }
    
}
