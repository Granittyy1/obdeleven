package com.google.android.gms.internal.measurement;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public class M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static N1 f25511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static M1 f25512b;

    public static kotlinx.coroutines.B0 a() {
        return new kotlinx.coroutines.B0(null);
    }

    public static void b(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(Object obj) {
        d(obj, "Argument must not be null");
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }

    public static ListBuilder f() {
        return new ListBuilder(10);
    }

    public static long g(double d10) {
        A8.p.f("not a normal value", i(d10));
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean i(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    public static final boolean j(View view) {
        boolean z10;
        boolean zMatches;
        int i10;
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (!(textView.getInputType() == 128 ? true : textView.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            String strF = new Regex("\\s").f("", p043d4.c.h(textView));
            int length = strF.length();
            if (length < 12 || length > 19) {
                z10 = false;
            } else {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z11 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char cCharAt = strF.charAt(i11);
                        if (Character.isDigit(cCharAt)) {
                            int iDigit = Character.digit((int) cCharAt, 10);
                            if (iDigit < 0) {
                                throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                            }
                            if (z11 && (iDigit = iDigit * 2) > 9) {
                                iDigit = (iDigit % 10) + 1;
                            }
                            i10 += iDigit;
                            z11 = !z11;
                            if (i12 >= 0) {
                                i11 = i12;
                            }
                        }
                        z10 = false;
                    }
                } else {
                    i10 = 0;
                }
                if (i10 % 10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                if (!(textView.getInputType() == 96)) {
                    if (!(textView.getInputType() == 112)) {
                        if (!(textView.getInputType() == 3)) {
                            if (textView.getInputType() == 32) {
                                zMatches = true;
                            } else {
                                String strH = p043d4.c.h(textView);
                                zMatches = strH.length() == 0 ? false : Patterns.EMAIL_ADDRESS.matcher(strH).matches();
                            }
                            if (!zMatches) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static List k(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.i.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static void l(int i10, Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
    }

    public static int m(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public Object h(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        throw null;
    }
}
