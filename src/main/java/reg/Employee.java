package reg;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class Employee implements Serializable {

    private boolean headship = false;
    private String pesel;
    private String name;
    private String surname;
    private BigDecimal salary;
    private BigDecimal costLimit;
    private String phoneNumber;

    public Employee(){}

    protected void setHeadship(){
        headship = true;
    }

    protected void setPesel(String newPesel){
        pesel = newPesel;
    }
    protected void setName(String newName){
        name = newName;
    }
    protected void setSurname(String newSurname){
        surname = newSurname;
    }
    protected void setSalary(BigDecimal newSalary){
        salary = newSalary;
    }
    protected void setCostLimit(BigDecimal newCostLimit){
        costLimit = newCostLimit;
    }
    protected void setPhoneNumber(String newNum){ phoneNumber = newNum;}

    public boolean hasHeadship(){
        return headship;
    }
    protected String getPesel(){
        return pesel;
    }
    protected String getName(){
        return name;
    }
    protected String getSurname(){
        return surname;
    }
    protected BigDecimal getSalary(){
        return salary;
    }
    protected BigDecimal getCostLimit(){
        return costLimit;
    }
    protected String getPhoneNumber(){
        return phoneNumber;
    }
    protected abstract BigDecimal getBonus();
    protected abstract String getBusinessCard();
    protected abstract BigDecimal getCommision();
}