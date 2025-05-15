package POSTCALLS;

import org.apache.juneau.annotation.Beanc;

public class POJOClasswithArrayVariable {

    private String[] suppliers;
    private String prodName;
    private String prodId;

    @Beanc(properties="suppliers,prodName,prodId")
    public POJOClasswithArrayVariable(String[] suppliers,String prodName,String prodId){
        this.suppliers=suppliers;
        this.prodName=prodName;
        this.prodId=prodId;
    }

    public void setName(String prodName){
        this.prodName=prodName;
    }
    public void setId(String prodId){
        this.prodId=prodId;
    }
    public void setSuppliers(String[] suppliers){
        this.prodId=prodId;
    }

    public String getProdName(){
        return prodName;
    }
    public String getProdId(){
        return prodId;
    }

    public String[] getSuppliers() {
        return suppliers;
    }}
