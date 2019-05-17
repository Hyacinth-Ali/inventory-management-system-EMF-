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

  //TOProductTransaction Associations
  private TOProduct toProduct;
  private Receipt receipt;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOProductTransaction(TOProduct aToProduct)
  {
    quantity = 0;
    price = 0;
    boolean didAddToProduct = setToProduct(aToProduct);
    if (!didAddToProduct)
    {
      throw new RuntimeException("Unable to create tOProductTransaction due to toProduct");
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
  /* Code from template association_SetOneToOptionalOne */
  public boolean setToProduct(TOProduct aNewToProduct)
  {
    boolean wasSet = false;
    if (aNewToProduct == null)
    {
      //Unable to setToProduct to null, as tOProductTransaction must always be associated to a toProduct
      return wasSet;
    }
    
    TOProductTransaction existingTOProductTransaction = aNewToProduct.getTOProductTransaction();
    if (existingTOProductTransaction != null && !equals(existingTOProductTransaction))
    {
      //Unable to setToProduct, the current toProduct already has a tOProductTransaction, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    TOProduct anOldToProduct = toProduct;
    toProduct = aNewToProduct;
    toProduct.setTOProductTransaction(this);

    if (anOldToProduct != null)
    {
      anOldToProduct.setTOProductTransaction(null);
    }
    wasSet = true;
    return wasSet;
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
    TOProduct existingToProduct = toProduct;
    toProduct = null;
    if (existingToProduct != null)
    {
      existingToProduct.setTOProductTransaction(null);
    }
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
            "price" + ":" + getPrice()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "toProduct = "+(getToProduct()!=null?Integer.toHexString(System.identityHashCode(getToProduct())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "receipt = "+(getReceipt()!=null?Integer.toHexString(System.identityHashCode(getReceipt())):"null");
  }
}