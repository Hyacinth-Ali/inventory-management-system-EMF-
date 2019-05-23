/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;

// line 17 "../../../../../IMSTransferObjects.ump"
public class TOProductTransaction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOProductTransaction Attributes
  private int quantity;
  private double price;
  private double unitPrice;
  private String productName;

  //TOProductTransaction Associations
  private Receipt receipt;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOProductTransaction()
  {
    quantity = 0;
    price = 0;
    unitPrice = 0;
    productName = null;
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

  public boolean setPrice(double aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public boolean setUnitPrice(double aUnitPrice)
  {
    boolean wasSet = false;
    unitPrice = aUnitPrice;
    wasSet = true;
    return wasSet;
  }

  public boolean setProductName(String aProductName)
  {
    boolean wasSet = false;
    productName = aProductName;
    wasSet = true;
    return wasSet;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public double getPrice()
  {
    return price;
  }

  public double getUnitPrice()
  {
    return unitPrice;
  }

  public String getProductName()
  {
    return productName;
  }
  /* Code from template association_GetOne */
  public Receipt getReceipt()
  {
    return receipt;
  }

  public boolean hasReceipt()
  {
    boolean has = receipt != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setReceipt(Receipt aReceipt)
  {
    boolean wasSet = false;
    Receipt existingReceipt = receipt;
    receipt = aReceipt;
    if (existingReceipt != null && !existingReceipt.equals(aReceipt))
    {
      existingReceipt.removePTransaction(this);
    }
    if (aReceipt != null)
    {
      aReceipt.addPTransaction(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (receipt != null)
    {
      Receipt placeholderReceipt = receipt;
      this.receipt = null;
      placeholderReceipt.removePTransaction(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "quantity" + ":" + getQuantity()+ "," +
            "price" + ":" + getPrice()+ "," +
            "unitPrice" + ":" + getUnitPrice()+ "," +
            "productName" + ":" + getProductName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "receipt = "+(getReceipt()!=null?Integer.toHexString(System.identityHashCode(getReceipt())):"null");
  }
}