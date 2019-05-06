/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package com.ali.hyacinth.ims.controller;

// line 20 "../../../../IMSTransferObjects.ump"
public class TOManager
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TOManager Attributes
  private String name;
  private String userName;
  private String password;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TOManager(String aName, String aUserName)
  {
    name = aName;
    userName = aUserName;
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

  public boolean setUserName(String aUserName)
  {
    boolean wasSet = false;
    userName = aUserName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getUserName()
  {
    return userName;
  }

  public String getPassword()
  {
    return password;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "userName" + ":" + getUserName()+ "," +
            "password" + ":" + getPassword()+ "]";
  }
}