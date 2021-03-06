/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package siglib_wrap;

public final class SLSignal_t {
  public final static SLSignal_t SIGLIB_SINE_WAVE = new SLSignal_t("SIGLIB_SINE_WAVE");
  public final static SLSignal_t SIGLIB_COSINE_WAVE = new SLSignal_t("SIGLIB_COSINE_WAVE");
  public final static SLSignal_t SIGLIB_WHITE_NOISE = new SLSignal_t("SIGLIB_WHITE_NOISE");
  public final static SLSignal_t SIGLIB_GAUSSIAN_NOISE = new SLSignal_t("SIGLIB_GAUSSIAN_NOISE");
  public final static SLSignal_t SIGLIB_CHIRP_LIN = new SLSignal_t("SIGLIB_CHIRP_LIN");
  public final static SLSignal_t SIGLIB_CHIRP_NL = new SLSignal_t("SIGLIB_CHIRP_NL");
  public final static SLSignal_t SIGLIB_SQUARE_WAVE = new SLSignal_t("SIGLIB_SQUARE_WAVE");
  public final static SLSignal_t SIGLIB_TRIANGLE_WAVE = new SLSignal_t("SIGLIB_TRIANGLE_WAVE");
  public final static SLSignal_t SIGLIB_IMPULSE = new SLSignal_t("SIGLIB_IMPULSE");
  public final static SLSignal_t SIGLIB_IMPULSE_STREAM = new SLSignal_t("SIGLIB_IMPULSE_STREAM");
  public final static SLSignal_t SIGLIB_STEP = new SLSignal_t("SIGLIB_STEP");
  public final static SLSignal_t SIGLIB_PN_SEQUENCE = new SLSignal_t("SIGLIB_PN_SEQUENCE");
  public final static SLSignal_t SIGLIB_DC_LEVEL = new SLSignal_t("SIGLIB_DC_LEVEL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SLSignal_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SLSignal_t.class + " with value " + swigValue);
  }

  private SLSignal_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SLSignal_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SLSignal_t(String swigName, SLSignal_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SLSignal_t[] swigValues = { SIGLIB_SINE_WAVE, SIGLIB_COSINE_WAVE, SIGLIB_WHITE_NOISE, SIGLIB_GAUSSIAN_NOISE, SIGLIB_CHIRP_LIN, SIGLIB_CHIRP_NL, SIGLIB_SQUARE_WAVE, SIGLIB_TRIANGLE_WAVE, SIGLIB_IMPULSE, SIGLIB_IMPULSE_STREAM, SIGLIB_STEP, SIGLIB_PN_SEQUENCE, SIGLIB_DC_LEVEL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

