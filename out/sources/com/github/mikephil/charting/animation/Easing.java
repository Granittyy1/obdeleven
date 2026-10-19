package com.github.mikephil.charting.animation;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class Easing {
    private static final float DOUBLE_PI = 6.2831855f;
    public static final EasingFunction Linear = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.1
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10;
        }
    };
    public static final EasingFunction EaseInQuad = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.2
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10 * f10;
        }
    };
    public static final EasingFunction EaseOutQuad = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.3
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (f10 - 2.0f) * (-f10);
        }
    };
    public static final EasingFunction EaseInOutQuad = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.4
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11;
            float f12 = f10 * 2.0f;
            if (f12 < 1.0f) {
                f11 = 0.5f * f12;
            } else {
                float f13 = f12 - 1.0f;
                f11 = ((f13 - 2.0f) * f13) - 1.0f;
                f12 = -0.5f;
            }
            return f11 * f12;
        }
    };
    public static final EasingFunction EaseInCubic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.5
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) Math.pow(f10, 3.0d);
        }
    };
    public static final EasingFunction EaseOutCubic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.6
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return ((float) Math.pow(f10 - 1.0f, 3.0d)) + 1.0f;
        }
    };
    public static final EasingFunction EaseInOutCubic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.7
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 * 2.0f;
            return (f11 < 1.0f ? (float) Math.pow(f11, 3.0d) : ((float) Math.pow(f11 - 2.0f, 3.0d)) + 2.0f) * 0.5f;
        }
    };
    public static final EasingFunction EaseInQuart = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.8
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) Math.pow(f10, 4.0d);
        }
    };
    public static final EasingFunction EaseOutQuart = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.9
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return -(((float) Math.pow(f10 - 1.0f, 4.0d)) - 1.0f);
        }
    };
    public static final EasingFunction EaseInOutQuart = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.10
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float fPow;
            float f11;
            float f12 = f10 * 2.0f;
            if (f12 < 1.0f) {
                fPow = (float) Math.pow(f12, 4.0d);
                f11 = 0.5f;
            } else {
                fPow = ((float) Math.pow(f12 - 2.0f, 4.0d)) - 2.0f;
                f11 = -0.5f;
            }
            return fPow * f11;
        }
    };
    public static final EasingFunction EaseInSine = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.11
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (-((float) Math.cos(((double) f10) * 1.5707963267948966d))) + 1.0f;
        }
    };
    public static final EasingFunction EaseOutSine = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.12
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) Math.sin(((double) f10) * 1.5707963267948966d);
        }
    };
    public static final EasingFunction EaseInOutSine = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.13
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (((float) Math.cos(((double) f10) * 3.141592653589793d)) - 1.0f) * (-0.5f);
        }
    };
    public static final EasingFunction EaseInExpo = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.14
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (f10 - 1.0f) * 10.0f);
        }
    };
    public static final EasingFunction EaseOutExpo = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.15
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (f10 + 1.0f) * (-10.0f)));
        }
    };
    public static final EasingFunction EaseInOutExpo = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.16
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            if (f10 == 1.0f) {
                return 1.0f;
            }
            float f11 = f10 * 2.0f;
            return (f11 < 1.0f ? (float) Math.pow(2.0d, (f11 - 1.0f) * 10.0f) : (-((float) Math.pow(2.0d, (f11 - 1.0f) * (-10.0f)))) + 2.0f) * 0.5f;
        }
    };
    public static final EasingFunction EaseInCirc = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.17
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return -(((float) Math.sqrt(1.0f - (f10 * f10))) - 1.0f);
        }
    };
    public static final EasingFunction EaseOutCirc = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.18
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (float) Math.sqrt(1.0f - (f11 * f11));
        }
    };
    public static final EasingFunction EaseInOutCirc = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.19
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float fSqrt;
            float f11;
            float f12 = f10 * 2.0f;
            if (f12 < 1.0f) {
                fSqrt = ((float) Math.sqrt(1.0f - (f12 * f12))) - 1.0f;
                f11 = -0.5f;
            } else {
                float f13 = f12 - 2.0f;
                fSqrt = ((float) Math.sqrt(1.0f - (f13 * f13))) + 1.0f;
                f11 = 0.5f;
            }
            return fSqrt * f11;
        }
    };
    public static final EasingFunction EaseInElastic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.20
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            if (f10 == 1.0f) {
                return 1.0f;
            }
            float f11 = f10 - 1.0f;
            return -(((float) Math.pow(2.0d, 10.0f * f11)) * ((float) Math.sin(((f11 - (0.047746483f * ((float) Math.asin(1.0d)))) * Easing.DOUBLE_PI) / 0.3f)));
        }
    };
    public static final EasingFunction EaseOutElastic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.21
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            if (f10 == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (-10.0f) * f10)) * ((float) Math.sin(((f10 - (0.047746483f * ((float) Math.asin(1.0d)))) * Easing.DOUBLE_PI) / 0.3f))) + 1.0f;
        }
    };
    public static final EasingFunction EaseInOutElastic = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.22
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            float f11 = f10 * 2.0f;
            if (f11 == 2.0f) {
                return 1.0f;
            }
            float fAsin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f11 < 1.0f) {
                float f12 = f11 - 1.0f;
                return ((float) Math.pow(2.0d, 10.0f * f12)) * ((float) Math.sin(((f12 * 1.0f) - fAsin) * Easing.DOUBLE_PI * 2.2222223f)) * (-0.5f);
            }
            float f13 = f11 - 1.0f;
            return (((float) Math.pow(2.0d, (-10.0f) * f13)) * 0.5f * ((float) Math.sin(((f13 * 1.0f) - fAsin) * Easing.DOUBLE_PI * 2.2222223f))) + 1.0f;
        }
    };
    public static final EasingFunction EaseInBack = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.23
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return ((f10 * 2.70158f) - 1.70158f) * f10 * f10;
        }
    };
    public static final EasingFunction EaseOutBack = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.24
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (((f11 * 2.70158f) + 1.70158f) * f11 * f11) + 1.0f;
        }
    };
    public static final EasingFunction EaseInOutBack = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.25
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11;
            float f12 = f10 * 2.0f;
            if (f12 < 1.0f) {
                f11 = ((3.5949094f * f12) - 2.5949094f) * f12 * f12;
            } else {
                float f13 = f12 - 2.0f;
                f11 = (((3.5949094f * f13) + 2.5949094f) * f13 * f13) + 2.0f;
            }
            return f11 * 0.5f;
        }
    };
    public static final EasingFunction EaseInBounce = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.26
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return 1.0f - Easing.EaseOutBounce.getInterpolation(1.0f - f10);
        }
    };
    public static final EasingFunction EaseOutBounce = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.27
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 < 0.36363637f) {
                return 7.5625f * f10 * f10;
            }
            if (f10 < 0.72727275f) {
                float f11 = f10 - 0.54545456f;
                return (7.5625f * f11 * f11) + 0.75f;
            }
            if (f10 < 0.90909094f) {
                float f12 = f10 - 0.8181818f;
                return (7.5625f * f12 * f12) + 0.9375f;
            }
            float f13 = f10 - 0.95454544f;
            return (7.5625f * f13 * f13) + 0.984375f;
        }
    };
    public static final EasingFunction EaseInOutBounce = new EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.28
        @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10 < 0.5f ? Easing.EaseInBounce.getInterpolation(f10 * 2.0f) * 0.5f : (Easing.EaseOutBounce.getInterpolation((f10 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    };

    public interface EasingFunction extends TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float f10);
    }
}
