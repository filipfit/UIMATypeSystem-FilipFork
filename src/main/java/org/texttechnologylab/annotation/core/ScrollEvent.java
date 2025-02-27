

   
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
   
  public final static String _FeatName_id = "id";
  public final static String _FeatName_fromX = "fromX";
  public final static String _FeatName_fromY = "fromY";
  public final static String _FeatName_toX = "toX";
  public final static String _FeatName_toY = "toY";
  public final static String _FeatName_startTime = "startTime";
  public final static String _FeatName_endTime = "endTime";
  public final static String _FeatName_timestamp = "timestamp";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(ScrollEvent.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_fromX = TypeSystemImpl.createCallSite(ScrollEvent.class, "fromX");
  private final static MethodHandle _FH_fromX = _FC_fromX.dynamicInvoker();
  private final static CallSite _FC_fromY = TypeSystemImpl.createCallSite(ScrollEvent.class, "fromY");
  private final static MethodHandle _FH_fromY = _FC_fromY.dynamicInvoker();
  private final static CallSite _FC_toX = TypeSystemImpl.createCallSite(ScrollEvent.class, "toX");
  private final static MethodHandle _FH_toX = _FC_toX.dynamicInvoker();
  private final static CallSite _FC_toY = TypeSystemImpl.createCallSite(ScrollEvent.class, "toY");
  private final static MethodHandle _FH_toY = _FC_toY.dynamicInvoker();
  private final static CallSite _FC_startTime = TypeSystemImpl.createCallSite(ScrollEvent.class, "startTime");
  private final static MethodHandle _FH_startTime = _FC_startTime.dynamicInvoker();
  private final static CallSite _FC_endTime = TypeSystemImpl.createCallSite(ScrollEvent.class, "endTime");
  private final static MethodHandle _FH_endTime = _FC_endTime.dynamicInvoker();
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
  //* Feature: fromX

  /** getter for fromX - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFromX() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_fromX));
  }
    
  /** setter for fromX - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFromX(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_fromX), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fromY

  /** getter for fromY - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFromY() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_fromY));
  }
    
  /** setter for fromY - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFromY(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_fromY), v);
  }    
    
   
    
  //*--------------*
  //* Feature: toX

  /** getter for toX - gets 
   * @generated
   * @return value of the feature 
   */
  public int getToX() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_toX));
  }
    
  /** setter for toX - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setToX(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_toX), v);
  }    
    
   
    
  //*--------------*
  //* Feature: toY

  /** getter for toY - gets 
   * @generated
   * @return value of the feature 
   */
  public int getToY() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_toY));
  }
    
  /** setter for toY - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setToY(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_toY), v);
  }    
    
   
    
  //*--------------*
  //* Feature: startTime

  /** getter for startTime - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStartTime() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_startTime));
  }
    
  /** setter for startTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartTime(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_startTime), v);
  }    
    
   
    
  //*--------------*
  //* Feature: endTime

  /** getter for endTime - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEndTime() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_endTime));
  }
    
  /** setter for endTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTime(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_endTime), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTimestamp() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_timestamp));
  }
    
  /** setter for timestamp - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_timestamp), v);
  }    
    
  }

    