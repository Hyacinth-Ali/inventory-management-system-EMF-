/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;

// line 17 "../../../../../IMSTransferObjects.ump"
public class TOProduct
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOProduct Attributes
  private String name;
  private double itemPrice;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOProduct(String aName, double aItemPrice)
  {
    name = aName;
    itemPrice = aItemPrice;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setItemPrice(double aItemPrice)
  {
    boolean wasSet = false;
    itemPrice = aItemPrice;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public double getItemPrice()
  {
    return itemPrice;
  }

  public double getTotalPrice()
  {
    return getItemPrice() * item.getQuantity();
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "itemPrice" + ":" + getItemPrice()+ "," +
            "totalPrice" + ":" + getTotalPrice()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 21 "../../../../../IMSTransferObjects.ump"
  1 -> o..1 TOTransactionItem item ;
// line 22 "../../../../../IMSTransferObjects.ump"
  1 -> o..1 TOTransactionPrice price ;

  
}