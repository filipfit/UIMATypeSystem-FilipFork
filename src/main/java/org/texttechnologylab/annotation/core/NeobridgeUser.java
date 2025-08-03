

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 13 13:13:30 CEST 2025 */

package org.texttechnologylab.annotation.core;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jun 13 13:13:30 CEST 2025
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
   
  public final static String _FeatName_internalId = "internalId";
  public final static String _FeatName_username = "username";
  public final static String _FeatName_userId = "userId";
  public final static String _FeatName_roles = "roles";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_internalId = TypeSystemImpl.createCallSite(NeobridgeUser.class, "internalId");
  private final static MethodHandle _FH_internalId = _FC_internalId.dynamicInvoker();
  private final static CallSite _FC_username = TypeSystemImpl.createCallSite(NeobridgeUser.class, "username");
  private final static MethodHandle _FH_username = _FC_username.dynamicInvoker();
  private final static CallSite _FC_userId = TypeSystemImpl.createCallSite(NeobridgeUser.class, "userId");
  private final static MethodHandle _FH_userId = _FC_userId.dynamicInvoker();
  private final static CallSite _FC_roles = TypeSystemImpl.createCallSite(NeobridgeUser.class, "roles");
  private final static MethodHandle _FH_roles = _FC_roles.dynamicInvoker();

   
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
  //* Feature: internalId

  /** getter for internalId - gets Numeric ID for internal handling, in most cases assigned by the data bank.
   * @generated
   * @return value of the feature 
   */
  public long getInternalId() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_internalId));
  }
    
  /** setter for internalId - sets Numeric ID for internal handling, in most cases assigned by the data bank. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInternalId(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_internalId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: username

  /** getter for username - gets Assigned username
   * @generated
   * @return value of the feature 
   */
  public String getUsername() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_username));
  }
    
  /** setter for username - sets Assigned username 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUsername(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_username), v);
  }    
    
   
    
  //*--------------*
  //* Feature: userId

  /** getter for userId - gets String ID assigned to the user
   * @generated
   * @return value of the feature 
   */
  public String getUserId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_userId));
  }
    
  /** setter for userId - sets String ID assigned to the user 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUserId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_userId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: roles

  /** getter for roles - gets Roles of the user, e.g. ["admin", "user"]
   * @generated
   * @return value of the feature 
   */
  public StringList getRoles() { 
    return (StringList)(_getFeatureValueNc(wrapGetIntCatchException(_FH_roles)));
  }
    
  /** setter for roles - sets Roles of the user, e.g. ["admin", "user"] 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRoles(StringList v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_roles), v);
  }    
    
  }

    