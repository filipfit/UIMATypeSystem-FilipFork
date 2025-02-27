

   
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
public class ImageBase64 extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.ImageBase64";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ImageBase64.class);
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
   
  public final static String _FeatName_base64String = "base64String";
  public final static String _FeatName_width = "width";
  public final static String _FeatName_height = "height";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_base64String = TypeSystemImpl.createCallSite(ImageBase64.class, "base64String");
  private final static MethodHandle _FH_base64String = _FC_base64String.dynamicInvoker();
  private final static CallSite _FC_width = TypeSystemImpl.createCallSite(ImageBase64.class, "width");
  private final static MethodHandle _FH_width = _FC_width.dynamicInvoker();
  private final static CallSite _FC_height = TypeSystemImpl.createCallSite(ImageBase64.class, "height");
  private final static MethodHandle _FH_height = _FC_height.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ImageBase64() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ImageBase64(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ImageBase64(JCas jcas) {
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
  //* Feature: base64String

  /** getter for base64String - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBase64String() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_base64String));
  }
    
  /** setter for base64String - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBase64String(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_base64String), v);
  }    
    
   
    
  //*--------------*
  //* Feature: width

  /** getter for width - gets 
   * @generated
   * @return value of the feature 
   */
  public int getWidth() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_width));
  }
    
  /** setter for width - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWidth(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_width), v);
  }    
    
   
    
  //*--------------*
  //* Feature: height

  /** getter for height - gets 
   * @generated
   * @return value of the feature 
   */
  public int getHeight() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_height));
  }
    
  /** setter for height - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeight(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_height), v);
  }    
    
  }

    