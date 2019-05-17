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

  //TOProduct Associations
  private TOProductTransaction tOProductTransaction;

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
  /* Code from template association_GetOne */
  public TOProductTransaction getTOProductTransaction()
  {
    return tOProductTransaction;
  }

  public boolean hasTOProductTransaction()
  {
    boolean has = tOProductTransaction != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setTOProductTransaction(TOProductTransaction aNewTOProductTransaction)
  {
    boolean wasSet = false;
    if (tOProductTransaction != null && !tOProductTransaction.equals(aNewTOProductTransaction) && equals(tOProductTransaction.getToProduct()))
    {
      //Unable to setTOProductTransaction, as existing tOProductTransaction would become an orphan
      return wasSet;
    }

    tOProductTransaction = aNewTOProductTransaction;
    TOProduct anOldToProduct = aNewTOProductTransaction != null ? aNewTOProductTransaction.getToProduct() : null;

    if (!this.equals(anOldToProduct))
    {
      if (anOldToProduct != null)
      {
        anOldToProduct.tOProductTransaction = null;
      }
      if (tOProductTransaction != null)
      {
        tOProductTransaction.setToProduct(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    TOProductTransaction existingTOProductTransaction = tOProductTransaction;
    tOProductTransaction = null;
    if (existingTOProductTransaction != null)
    {
      existingTOProductTransaction.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "itemPrice" + ":" + getItemPrice()+ "," +
            "quantity" + ":" + getQuantity()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "tOProductTransaction = "+(getTOProductTransaction()!=null?Integer.toHexString(System.identityHashCode(getTOProductTransaction())):"null");
  }
}