/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.controller;

// line 26 "../../../../IMSTransferObjects.ump"
public class TOTransactionProducts
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOTransactionProducts Attributes
  private String name;
  private String quantity;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOTransactionProducts(String aName, String aQuantity)
  {
    name = aName;
    quantity = aQuantity;
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

  public boolean setQuantity(String aQuantity)
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

  public String getQuantity()
  {
    return quantity;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "quantity" + ":" + getQuantity()+ "]";
  }
}