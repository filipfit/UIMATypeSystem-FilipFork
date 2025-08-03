

   
/* Apache UIMA v3 - First created by JCasGen Sat Jun 14 14:21:44 CEST 2025 */

package org.texttechnologylab.annotation.core;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.type.Coordinate;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Sat Jun 14 14:21:44 CEST 2025
 * XML source: /home/filip/Documents/Bachelor/UIMATypeSystem-FilipFork/target/jcasgen/typesystem.xml
 * @generated */
public class ScrollEvent extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.ScrollEvent";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ScrollEvent.class);
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
  public final static String _FeatName_fromCoord = "fromCoord";
  public final static String _FeatName_toCoord = "toCoord";
  public final static String _FeatName_timestamp = "timestamp";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_internalId = TypeSystemImpl.createCallSite(ScrollEvent.class, "internalId");
  private final static MethodHandle _FH_internalId = _FC_internalId.dynamicInvoker();
  private final static CallSite _FC_fromCoord = TypeSystemImpl.createCallSite(ScrollEvent.class, "fromCoord");
  private final static MethodHandle _FH_fromCoord = _FC_fromCoord.dynamicInvoker();
  private final static CallSite _FC_toCoord = TypeSystemImpl.createCallSite(ScrollEvent.class, "toCoord");
  private final static MethodHandle _FH_toCoord = _FC_toCoord.dynamicInvoker();
  private final static CallSite _FC_timestamp = TypeSystemImpl.createCallSite(ScrollEvent.class, "timestamp");
  private final static MethodHandle _FH_timestamp = _FC_timestamp.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ScrollEvent() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ScrollEvent(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ScrollEvent(JCas jcas) {
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
  //* Feature: fromCoord

  /** getter for fromCoord - gets Starting coordinate of scroll
   * @generated
   * @return value of the feature 
   */
  public Coordinate getFromCoord() { 
    return (Coordinate)(_getFeatureValueNc(wrapGetIntCatchException(_FH_fromCoord)));
  }
    
  /** setter for fromCoord - sets Starting coordinate of scroll 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFromCoord(Coordinate v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_fromCoord), v);
  }    
    
   
    
  //*--------------*
  //* Feature: toCoord

  /** getter for toCoord - gets Ending coordinate of scroll
   * @generated
   * @return value of the feature 
   */
  public Coordinate getToCoord() { 
    return (Coordinate)(_getFeatureValueNc(wrapGetIntCatchException(_FH_toCoord)));
  }
    
  /** setter for toCoord - sets Ending coordinate of scroll 
   * @generated
   * @param v value to set into the feature 
   */
  public void setToCoord(Coordinate v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_toCoord), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets Time of the scroll event
   * @generated
   * @return value of the feature 
   */
  public String getTimestamp() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timestamp));
  }
    
  /** setter for timestamp - sets Time of the scroll event 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timestamp), v);
  }    
    
  }

    