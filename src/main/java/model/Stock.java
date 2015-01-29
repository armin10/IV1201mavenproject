package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author      Kentaro
 * @author      Johny Premanantham
 * @version     1.0
 * @since       2015-01-03
 */
@Entity
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String type;
    private int amount;
    
    public Stock(){
        
    }
    
    public Stock(String type, int amount){
        this.type = type;
        this.amount = amount;
        this.id = type;
    }
 
    
    public String gettype(){
        return type;
    }
    
    
    public int getamount(){
    return amount;
    }
    public int setamount(int amount){
    this.amount = amount;
    return amount;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Stock[ id=" + id + " ]";
    }
    
}
