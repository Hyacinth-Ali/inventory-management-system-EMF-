/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;

// line 13 "../../../../../IMSTransferObjects.ump"
public class TOTransactionPrice
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOTransactionPrice Attributes
  private int price;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOTransactionPrice(int aPrice)
  {
    price = aPrice;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPrice(int aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public int getPrice()
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