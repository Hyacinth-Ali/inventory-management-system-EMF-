/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;

// line 9 "../../../../../IMSTransferObjects.ump"
public class TOTransactionItem
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOTransactionItem Attributes
  private int quantity;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOTransactionItem(int aQuantity)
  {
    quantity = aQuantity;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setQuantity(int aQuantity)
  {
    boolean wasSet = false;
    quantity = aQuantity;
    wasSet = true;
    return wasSet;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "quantity" + ":" + getQuantity()+ "]";
  }
}