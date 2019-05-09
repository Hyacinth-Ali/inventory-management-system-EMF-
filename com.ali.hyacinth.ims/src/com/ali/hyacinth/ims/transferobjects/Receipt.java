/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;
import java.util.Date;
import java.util.*;

// line 4 "../../../../../IMSTransferObjects.ump"
public class Receipt
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Receipt Attributes
  private Date date;
  private double totalAmount;
  private double amoundPaid;

  //Receipt Associations
  private List<TOProductTransaction> pTransactions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Receipt()
  {
    date = null;
    totalAmount = 0;
    amoundPaid = 0;
    pTransactions = new ArrayList<TOProductTransaction>();
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

  public boolean setAmoundPaid(double aAmoundPaid)
  {
    boolean wasSet = false;
    amoundPaid = aAmoundPaid;
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

  public double getAmoundPaid()
  {
    return amoundPaid;
  }
  /* Code from template association_GetMany */
  public TOProductTransaction getPTransaction(int index)
  {
    TOProductTransaction aPTransaction = pTransactions.get(index);
    return aPTransaction;
  }

  public List<TOProductTransaction> getPTransactions()
  {
    List<TOProductTransaction> newPTransactions = Collections.unmodifiableList(pTransactions);
    return newPTransactions;
  }

  public int numberOfPTransactions()
  {
    int number = pTransactions.size();
    return number;
  }

  public boolean hasPTransactions()
  {
    boolean has = pTransactions.size() > 0;
    return has;
  }

  public int indexOfPTransaction(TOProductTransaction aPTransaction)
  {
    int index = pTransactions.indexOf(aPTransaction);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPTransactions()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addPTransaction(TOProductTransaction aPTransaction)
  {
    boolean wasAdded = false;
    if (pTransactions.contains(aPTransaction)) { return false; }
    Receipt existingReceipt = aPTransaction.getReceipt();
    if (existingReceipt == null)
    {
      aPTransaction.setReceipt(this);
    }
    else if (!this.equals(existingReceipt))
    {
      existingReceipt.removePTransaction(aPTransaction);
      addPTransaction(aPTransaction);
    }
    else
    {
      pTransactions.add(aPTransaction);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePTransaction(TOProductTransaction aPTransaction)
  {
    boolean wasRemoved = false;
    if (pTransactions.contains(aPTransaction))
    {
      pTransactions.remove(aPTransaction);
      aPTransaction.setReceipt(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPTransactionAt(TOProductTransaction aPTransaction, int index)
  {  
    boolean wasAdded = false;
    if(addPTransaction(aPTransaction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPTransactions()) { index = numberOfPTransactions() - 1; }
      pTransactions.remove(aPTransaction);
      pTransactions.add(index, aPTransaction);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePTransactionAt(TOProductTransaction aPTransaction, int index)
  {
    boolean wasAdded = false;
    if(pTransactions.contains(aPTransaction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPTransactions()) { index = numberOfPTransactions() - 1; }
      pTransactions.remove(aPTransaction);
      pTransactions.add(index, aPTransaction);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPTransactionAt(aPTransaction, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !pTransactions.isEmpty() )
    {
      pTransactions.get(0).setReceipt(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "totalAmount" + ":" + getTotalAmount()+ "," +
            "amoundPaid" + ":" + getAmoundPaid()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}