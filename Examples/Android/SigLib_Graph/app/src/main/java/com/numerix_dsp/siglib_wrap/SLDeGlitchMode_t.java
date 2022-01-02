/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package siglib_wrap;

public final class SLDeGlitchMode_t {
  public final static SLDeGlitchMode_t SIGLIB_DEGLITCH_ABOVE = new SLDeGlitchMode_t("SIGLIB_DEGLITCH_ABOVE", siglib_wrapJNI.SIGLIB_DEGLITCH_ABOVE_get());
  public final static SLDeGlitchMode_t SIGLIB_DEGLITCH_BOTH = new SLDeGlitchMode_t("SIGLIB_DEGLITCH_BOTH", siglib_wrapJNI.SIGLIB_DEGLITCH_BOTH_get());
  public final static SLDeGlitchMode_t SIGLIB_DEGLITCH_BELOW = new SLDeGlitchMode_t("SIGLIB_DEGLITCH_BELOW", siglib_wrapJNI.SIGLIB_DEGLITCH_BELOW_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SLDeGlitchMode_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SLDeGlitchMode_t.class + " with value " + swigValue);
  }

  private SLDeGlitchMode_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SLDeGlitchMode_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SLDeGlitchMode_t(String swigName, SLDeGlitchMode_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SLDeGlitchMode_t[] swigValues = { SIGLIB_DEGLITCH_ABOVE, SIGLIB_DEGLITCH_BOTH, SIGLIB_DEGLITCH_BELOW };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
