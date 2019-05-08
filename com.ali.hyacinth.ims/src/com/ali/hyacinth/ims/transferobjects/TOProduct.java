/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;

// line 18 "../../../../../IMSTransferObjects.ump"
public class TOProduct
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOProduct Attributes
  private String name;
  private double itemPrice;

  //TOProduct Associations
  private TOTransactionItem item;
  private TOTransactionPrice price;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOProduct()
  {
    name = null;
    itemPrice = 0;
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
  /* Code from template association_GetOne */
  public TOTransactionItem getItem()
  {
    return item;
  }

  public boolean hasItem()
  {
    boolean has = item != null;
    return has;
  }
  /* Code from template association_GetOne */
  public TOTransactionPrice getPrice()
  {
    return price;
  }

  public boolean hasPrice()
  {
    boolean has = price != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setItem(TOTransactionItem aNewItem)
  {
    boolean wasSet = false;
    item = aNewItem;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPrice(TOTransactionPrice aNewPrice)
  {
    boolean wasSet = false;
    price = aNewPrice;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    item = null;
    price = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "itemPrice" + ":" + getItemPrice()+ "," +
            "totalPrice" + ":" + getTotalPrice()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "item = "+(getItem()!=null?Integer.toHexString(System.identityHashCode(getItem())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "price = "+(getPrice()!=null?Integer.toHexString(System.identityHashCode(getPrice())):"null");
  }
}