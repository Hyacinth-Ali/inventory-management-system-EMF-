/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;
import java.util.Date;

// line 24 "../../../../../IMSTransferObjects.ump"
public class TOTransaction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOTransaction Attributes
  private Date date;
  private double totalAmount;
  private double amountPaid;
  private String id;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOTransaction()
  {
    date = null;
    totalAmount = 0;
    amountPaid = 0;
    id = null;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(Date aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalAmount(double aTotalAmount)
  {
    boolean wasSet = false;
    totalAmount = aTotalAmount;
    wasSet = true;
    return wasSet;
  }

  public boolean setAmountPaid(double aAmountPaid)
  {
    boolean wasSet = false;
    amountPaid = aAmountPaid;
    wasSet = true;
    return wasSet;
  }

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public Date getDate()
  {
    return date;
  }

  public double getTotalAmount()
  {
    return totalAmount;
  }

  public double getAmountPaid()
  {
    return amountPaid;
  }

  public String getId()
  {
    return id;
  }

  public double getBalance()
  {
    return getTotalAmount() - getAmountPaid();
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "totalAmount" + ":" + getTotalAmount()+ "," +
            "amountPaid" + ":" + getAmountPaid()+ "," +
            "id" + ":" + getId()+ "," +
            "balance" + ":" + getBalance()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}