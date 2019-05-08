/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;

// line 14 "../../../../../IMSTransferObjects.ump"
public class TOTransactionPrice
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOTransactionPrice Attributes
  private double price;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOTransactionPrice()
  {
    price = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPrice(double aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public double getPrice()
  {
    return price;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "price" + ":" + getPrice()+ "]";
  }
}