/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class LocalShapeInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected LocalShapeInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(LocalShapeInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_LocalShapeInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_shapePart(int value) {
    gdxBulletJNI.LocalShapeInfo_m_shapePart_set(swigCPtr, this, value);
  }

  public int getM_shapePart() {
    return gdxBulletJNI.LocalShapeInfo_m_shapePart_get(swigCPtr, this);
  }

  public void setM_triangleIndex(int value) {
    gdxBulletJNI.LocalShapeInfo_m_triangleIndex_set(swigCPtr, this, value);
  }

  public int getM_triangleIndex() {
    return gdxBulletJNI.LocalShapeInfo_m_triangleIndex_get(swigCPtr, this);
  }

  public LocalShapeInfo() {
    this(gdxBulletJNI.new_LocalShapeInfo(), true);
  }

}
