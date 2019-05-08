/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.transferobjects;
import java.util.*;

// line 3 "../../../../../IMSTransferObjects.ump"
public class TOTransactionComplete
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOTransactionComplete Attributes
  private double totalAmount;
  private double amoundPaid;

  //TOTransactionComplete Associations
  private List<TOProduct> products;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOTransactionComplete(double aTotalAmount, double aAmoundPaid)
  {
    totalAmount = aTotalAmount;
    amoundPaid = aAmoundPaid;
    products = new ArrayList<TOProduct>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTotalAmount(double aTotalAmount)
  {
    boolean wasSet = false;
    totalAmount = aTotalAmount;
    wasSet = true;
    return wasSet;
  }

  public boolean setAmoundPaid(double aAmoundPaid)
  {
    boolean wasSet = false;
    amoundPaid = aAmoundPaid;
    wasSet = true;
    return wasSet;
  }

  public double getTotalAmount()
  {
    return totalAmount;
  }

  public double getAmoundPaid()
  {
    return amoundPaid;
  }
  /* Code from template association_GetMany */
  public TOProduct getProduct(int index)
  {
    TOProduct aProduct = products.get(index);
    return aProduct;
  }

  public List<TOProduct> getProducts()
  {
    List<TOProduct> newProducts = Collections.unmodifiableList(products);
    return newProducts;
  }

  public int numberOfProducts()
  {
    int number = products.size();
    return number;
  }

  public boolean hasProducts()
  {
    boolean has = products.size() > 0;
    return has;
  }

  public int indexOfProduct(TOProduct aProduct)
  {
    int index = products.indexOf(aProduct);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfProducts()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addProduct(TOProduct aProduct)
  {
    boolean wasAdded = false;
    if (products.contains(aProduct)) { return false; }
    products.add(aProduct);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeProduct(TOProduct aProduct)
  {
    boolean wasRemoved = false;
    if (products.contains(aProduct))
    {
      products.remove(aProduct);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addProductAt(TOProduct aProduct, int index)
  {  
    boolean wasAdded = false;
    if(addProduct(aProduct))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfProducts()) { index = numberOfProducts() - 1; }
      products.remove(aProduct);
      products.add(index, aProduct);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveProductAt(TOProduct aProduct, int index)
  {
    boolean wasAdded = false;
    if(products.contains(aProduct))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfProducts()) { index = numberOfProducts() - 1; }
      products.remove(aProduct);
      products.add(index, aProduct);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addProductAt(aProduct, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    products.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "totalAmount" + ":" + getTotalAmount()+ "," +
            "amoundPaid" + ":" + getAmoundPaid()+ "]";
  }
}