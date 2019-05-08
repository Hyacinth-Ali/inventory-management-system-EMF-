/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;

// line 16 "../../../../../IMSTransferObjects.ump"
public class TOTransactionProduct
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOTransactionProduct Attributes
  private int quantity;
  private double price;

  //TOTransactionProduct Associations
  private TOProduct toProduct;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOTransactionProduct(int aQuantity, double aPrice, TOProduct aToProduct)
  {
    quantity = aQuantity;
    price = aPrice;
    if (!setToProduct(aToProduct))
    {
      throw new RuntimeException("Unable to create TOTransactionProduct due to aToProduct");
    }
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

  public int getQuantity()
  {
    return quantity;
  }

  public double getPrice()
  {
    return price;
  }
  /* Code from template association_GetOne */
  public TOProduct getToProduct()
  {
    return toProduct;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setToProduct(TOProduct aNewToProduct)
  {
    boolean wasSet = false;
    if (aNewToProduct != null)
    {
      toProduct = aNewToProduct;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    toProduct = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "quantity" + ":" + getQuantity()+ "," +
            "price" + ":" + getPrice()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "toProduct = "+(getToProduct()!=null?Integer.toHexString(System.identityHashCode(getToProduct())):"null");
  }
}