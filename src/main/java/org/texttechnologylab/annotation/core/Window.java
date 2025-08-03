

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 13 13:13:30 CEST 2025 */

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
 * Updated by JCasGen Fri Jun 13 13:13:30 CEST 2025
 * XML source: /home/filip/Documents/Bachelor/UIMATypeSystem-FilipFork/target/jcasgen/typesystem.xml
 * @generated */
public class Window extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.core.Window";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Window.class);
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
  public final static String _FeatName_browserWindowId = "browserWindowId";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_internalId = TypeSystemImpl.createCallSite(Window.class, "internalId");
  private final static MethodHandle _FH_internalId = _FC_internalId.dynamicInvoker();
  private final static CallSite _FC_browserWindowId = TypeSystemImpl.createCallSite(Window.class, "browserWindowId");
  private final static MethodHandle _FH_browserWindowId = _FC_browserWindowId.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Window() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Window(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Window(JCas jcas) {
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
  //* Feature: browserWindowId

  /** getter for browserWindowId - gets ID of the browser window
   * @generated
   * @return value of the feature 
   */
  public long getBrowserWindowId() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_browserWindowId));
  }
    
  /** setter for browserWindowId - sets ID of the browser window 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBrowserWindowId(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_browserWindowId), v);
  }    
    
  }

    