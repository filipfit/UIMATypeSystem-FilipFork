

   
/* Apache UIMA v3 - First created by JCasGen Thu Jan 23 11:20:41 CET 2025 */

package org.texttechnologylab.annotation.core;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FloatArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jan 23 11:20:41 CET 2025
 * XML source: /home/filip/Documents/Bachelor/UIMATypeSystem-FilipFork/target/jcasgen/typesystem.xml
 * @generated */
public class FourPointBoundingBox extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.FourPointBoundingBox";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FourPointBoundingBox.class);
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
   
  public final static String _FeatName_topLeft = "topLeft";
  public final static String _FeatName_topRight = "topRight";
  public final static String _FeatName_botRight = "botRight";
  public final static String _FeatName_botLeft = "botLeft";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_topLeft = TypeSystemImpl.createCallSite(FourPointBoundingBox.class, "topLeft");
  private final static MethodHandle _FH_topLeft = _FC_topLeft.dynamicInvoker();
  private final static CallSite _FC_topRight = TypeSystemImpl.createCallSite(FourPointBoundingBox.class, "topRight");
  private final static MethodHandle _FH_topRight = _FC_topRight.dynamicInvoker();
  private final static CallSite _FC_botRight = TypeSystemImpl.createCallSite(FourPointBoundingBox.class, "botRight");
  private final static MethodHandle _FH_botRight = _FC_botRight.dynamicInvoker();
  private final static CallSite _FC_botLeft = TypeSystemImpl.createCallSite(FourPointBoundingBox.class, "botLeft");
  private final static MethodHandle _FH_botLeft = _FC_botLeft.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected FourPointBoundingBox() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public FourPointBoundingBox(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FourPointBoundingBox(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FourPointBoundingBox(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: topLeft

  /** getter for topLeft - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getTopLeft() { 
    return (FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_topLeft)));
  }
    
  /** setter for topLeft - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopLeft(FloatArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_topLeft), v);
  }    
    
    
  /** indexed getter for topLeft - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getTopLeft(int i) {
     return ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_topLeft)))).get(i);
  } 

  /** indexed setter for topLeft - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTopLeft(int i, float v) {
    ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_topLeft)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: topRight

  /** getter for topRight - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getTopRight() { 
    return (FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_topRight)));
  }
    
  /** setter for topRight - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopRight(FloatArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_topRight), v);
  }    
    
    
  /** indexed getter for topRight - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getTopRight(int i) {
     return ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_topRight)))).get(i);
  } 

  /** indexed setter for topRight - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTopRight(int i, float v) {
    ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_topRight)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: botRight

  /** getter for botRight - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getBotRight() { 
    return (FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_botRight)));
  }
    
  /** setter for botRight - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBotRight(FloatArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_botRight), v);
  }    
    
    
  /** indexed getter for botRight - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getBotRight(int i) {
     return ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_botRight)))).get(i);
  } 

  /** indexed setter for botRight - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setBotRight(int i, float v) {
    ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_botRight)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: botLeft

  /** getter for botLeft - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getBotLeft() { 
    return (FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_botLeft)));
  }
    
  /** setter for botLeft - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBotLeft(FloatArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_botLeft), v);
  }    
    
    
  /** indexed getter for botLeft - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getBotLeft(int i) {
     return ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_botLeft)))).get(i);
  } 

  /** indexed setter for botLeft - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setBotLeft(int i, float v) {
    ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_botLeft)))).set(i, v);
  }  
  }

    