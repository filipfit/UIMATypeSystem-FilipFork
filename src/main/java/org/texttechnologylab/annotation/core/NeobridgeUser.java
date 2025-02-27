

   
/* Apache UIMA v3 - First created by JCasGen Thu Jan 23 11:20:41 CET 2025 */

package org.texttechnologylab.annotation.core;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Thu Jan 23 11:20:41 CET 2025
 * XML source: /home/filip/Documents/Bachelor/UIMATypeSystem-FilipFork/target/jcasgen/typesystem.xml
 * @generated */
public class NeobridgeUser extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.NeobridgeUser";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NeobridgeUser.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_id = "id";
  public final static String _FeatName_created = "created";
  public final static String _FeatName_email = "email";
  public final static String _FeatName_openId = "openId";
  public final static String _FeatName_roles = "roles";
  public final static String _FeatName_userID = "userID";
  public final static String _FeatName_username = "username";
  public final static String _FeatName_picture = "picture";
  public final static String _FeatName_realName = "realName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(NeobridgeUser.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_created = TypeSystemImpl.createCallSite(NeobridgeUser.class, "created");
  private final static MethodHandle _FH_created = _FC_created.dynamicInvoker();
  private final static CallSite _FC_email = TypeSystemImpl.createCallSite(NeobridgeUser.class, "email");
  private final static MethodHandle _FH_email = _FC_email.dynamicInvoker();
  private final static CallSite _FC_openId = TypeSystemImpl.createCallSite(NeobridgeUser.class, "openId");
  private final static MethodHandle _FH_openId = _FC_openId.dynamicInvoker();
  private final static CallSite _FC_roles = TypeSystemImpl.createCallSite(NeobridgeUser.class, "roles");
  private final static MethodHandle _FH_roles = _FC_roles.dynamicInvoker();
  private final static CallSite _FC_userID = TypeSystemImpl.createCallSite(NeobridgeUser.class, "userID");
  private final static MethodHandle _FH_userID = _FC_userID.dynamicInvoker();
  private final static CallSite _FC_username = TypeSystemImpl.createCallSite(NeobridgeUser.class, "username");
  private final static MethodHandle _FH_username = _FC_username.dynamicInvoker();
  private final static CallSite _FC_picture = TypeSystemImpl.createCallSite(NeobridgeUser.class, "picture");
  private final static MethodHandle _FH_picture = _FC_picture.dynamicInvoker();
  private final static CallSite _FC_realName = TypeSystemImpl.createCallSite(NeobridgeUser.class, "realName");
  private final static MethodHandle _FH_realName = _FC_realName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected NeobridgeUser() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public NeobridgeUser(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NeobridgeUser(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_id));
  }
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: created

  /** getter for created - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCreated() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_created));
  }
    
  /** setter for created - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCreated(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_created), v);
  }    
    
   
    
  //*--------------*
  //* Feature: email

  /** getter for email - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEmail() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_email));
  }
    
  /** setter for email - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmail(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_email), v);
  }    
    
   
    
  //*--------------*
  //* Feature: openId

  /** getter for openId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOpenId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_openId));
  }
    
  /** setter for openId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOpenId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_openId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: roles

  /** getter for roles - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRoles() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_roles));
  }
    
  /** setter for roles - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRoles(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_roles), v);
  }    
    
   
    
  //*--------------*
  //* Feature: userID

  /** getter for userID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUserID() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_userID));
  }
    
  /** setter for userID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUserID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_userID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: username

  /** getter for username - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUsername() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_username));
  }
    
  /** setter for username - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUsername(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_username), v);
  }    
    
   
    
  //*--------------*
  //* Feature: picture

  /** getter for picture - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPicture() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_picture));
  }
    
  /** setter for picture - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPicture(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_picture), v);
  }    
    
   
    
  //*--------------*
  //* Feature: realName

  /** getter for realName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRealName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_realName));
  }
    
  /** setter for realName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRealName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_realName), v);
  }    
    
  }

    