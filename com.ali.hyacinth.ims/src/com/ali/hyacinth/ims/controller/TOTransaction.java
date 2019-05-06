/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.controller;
import java.sql.Date;

// line 13 "../../../../IMSTransferObjects.ump"
public class TOTransaction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOTransaction Attributes
  private int id;
  private Date date;
  private double totalAmount;
  private double amountPaid;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOTransaction(int aId, Date aDate, double aTotalAmount)
  {
    id = aId;
    date = aDate;
    totalAmount = aTotalAmount;
    amountPaid = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

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

  public int getId()
  {
    return id;
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

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "totalAmount" + ":" + getTotalAmount()+ "," +
            "amountPaid" + ":" + getAmountPaid()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}