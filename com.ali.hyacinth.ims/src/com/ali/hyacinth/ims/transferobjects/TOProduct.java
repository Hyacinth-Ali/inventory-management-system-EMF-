/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;

// line 11 "../../../../../IMSTransferObjects.ump"
public class TOProduct
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOProduct Attributes
  private String name;
  private double itemPrice;
  private int quantity;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOProduct()
  {
    name = null;
    itemPrice = 0;
    quantity = 0;
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

  public boolean setQuantity(int aQuantity)
  {
    boolean wasSet = false;
    quantity = aQuantity;
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

  public int getQuantity()
  {
    return quantity;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "itemPrice" + ":" + getItemPrice()+ "," +
            "quantity" + ":" + getQuantity()+ "]";
  }
}