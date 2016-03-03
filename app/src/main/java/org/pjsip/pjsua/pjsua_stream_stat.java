/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_stream_stat {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_stream_stat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_stream_stat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_stream_stat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRtcp(SWIGTYPE_p_pjmedia_rtcp_stat value) {
    pjsuaJNI.pjsua_stream_stat_rtcp_set(swigCPtr, this, SWIGTYPE_p_pjmedia_rtcp_stat.getCPtr(value));
  }

  public SWIGTYPE_p_pjmedia_rtcp_stat getRtcp() {
    return new SWIGTYPE_p_pjmedia_rtcp_stat(pjsuaJNI.pjsua_stream_stat_rtcp_get(swigCPtr, this), true);
  }

  public void setJbuf(SWIGTYPE_p_pjmedia_jb_state value) {
    pjsuaJNI.pjsua_stream_stat_jbuf_set(swigCPtr, this, SWIGTYPE_p_pjmedia_jb_state.getCPtr(value));
  }

  public SWIGTYPE_p_pjmedia_jb_state getJbuf() {
    return new SWIGTYPE_p_pjmedia_jb_state(pjsuaJNI.pjsua_stream_stat_jbuf_get(swigCPtr, this), true);
  }

  public pjsua_stream_stat() {
    this(pjsuaJNI.new_pjsua_stream_stat(), true);
  }

}
