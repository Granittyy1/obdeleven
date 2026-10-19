package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.C0937i;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.braze.support.BrazeLogger;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.random.Random;
import kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1787c0 implements p276w6.a {
    public static final C0937i a(float f10, long j) {
        return new C0937i(f10, new androidx.compose.ui.graphics.m0(j));
    }

    public static final long b(String str) {
        DurationUnit durationUnit;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i10 = Pa.b.f4973e;
        char cCharAt2 = str.charAt(0);
        int i11 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z10 = (i11 > 0) && kotlin.text.n.g0(str, '-');
        if (length <= i11) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i11) != 'P') {
            throw new IllegalArgumentException();
        }
        int i12 = i11 + 1;
        if (i12 == length) {
            throw new IllegalArgumentException();
        }
        DurationUnit durationUnit2 = null;
        long jG = 0;
        boolean z11 = false;
        while (i12 < length) {
            if (str.charAt(i12) != 'T') {
                int i13 = i12;
                while (i13 < str.length() && (('0' <= (cCharAt = str.charAt(i13)) && cCharAt < ':') || kotlin.text.n.K("+-.", cCharAt))) {
                    i13++;
                }
                String strSubstring = str.substring(i12, i13);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i12;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i14 = length2 + 1;
                if (z11) {
                    if (cCharAt3 == 'H') {
                        durationUnit = DurationUnit.HOURS;
                    } else if (cCharAt3 == 'M') {
                        durationUnit = DurationUnit.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        durationUnit = DurationUnit.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    durationUnit = DurationUnit.DAYS;
                }
                if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iP = kotlin.text.n.P(strSubstring, '.', 0, false, 6);
                if (durationUnit != DurationUnit.SECONDS || iP <= 0) {
                    jG = Pa.b.g(jG, u(r(strSubstring), durationUnit));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iP);
                    kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
                    long jG2 = Pa.b.g(jG, u(r(strSubstring2), durationUnit));
                    String strSubstring3 = strSubstring.substring(iP);
                    kotlin.jvm.internal.i.d(strSubstring3, "substring(...)");
                    double d10 = Double.parseDouble(strSubstring3);
                    double dC = Lb.a.c(d10, durationUnit, DurationUnit.NANOSECONDS);
                    if (Double.isNaN(dC)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jC = Ka.a.c(dC);
                    jG = Pa.b.g(jG2, (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? h(Ka.a.c(Lb.a.c(d10, durationUnit, DurationUnit.MILLISECONDS))) : i(jC));
                }
                durationUnit2 = durationUnit;
                i12 = i14;
            } else {
                if (z11 || (i12 = i12 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z11 = true;
            }
        }
        return z10 ? Pa.b.k(jG) : jG;
    }

    public static final String d(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static void e(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final long g(long j) {
        long j10 = (j << 1) + 1;
        int i10 = Pa.b.f4973e;
        int i11 = Pa.c.f4975a;
        return j10;
    }

    public static final long h(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? g(Na.l.E(j, -4611686018427387903L, 4611686018427387903L)) : i(j * ((long) 1000000));
    }

    public static final long i(long j) {
        long j10 = j << 1;
        int i10 = Pa.b.f4973e;
        int i11 = Pa.c.f4975a;
        return j10;
    }

    public static Typeface j() {
        return Typeface.create("sans-serif-light", 0);
    }

    public static p134k8.T1 k(p134k8.T1 t8) {
        String str;
        String str2 = t8.f42680c;
        String str3 = t8.f42679b;
        if (str2 == null) {
            return t8;
        }
        String str4 = "in";
        switch (str2) {
            case "liters":
            case "l":
                str = String.format(Locale.US, "%.2f", Float.valueOf(Float.parseFloat(str3) * 0.26417205f));
                str4 = str2.equals("l") ? "gal" : "gallons";
                break;
            case "m":
                str = String.format(Locale.US, "%.2f", Float.valueOf(Float.parseFloat(str3) * 1.0936133f));
                str4 = "yd";
                break;
            case "Nm":
                str = String.format(Locale.US, "%.2f", Float.valueOf((float) (((double) Float.parseFloat(str3)) * 0.7375621212d)));
                str4 = "lb∙ft";
                break;
            case "Pa":
            case "MPa":
            case "bar":
            case "hPa":
            case "kPa":
            case "mbar":
                float f10 = Float.parseFloat(str3);
                if (str2.equals("Pa")) {
                    f10 /= 100000.0f;
                }
                if (str2.equals("mbar") || str2.equals("hPa")) {
                    f10 /= 1000.0f;
                }
                if (str2.equals("kPa")) {
                    f10 /= 100.0f;
                }
                if (str2.equals("MPa")) {
                    f10 /= 0.1f;
                }
                str = String.format(Locale.US, "%.1f", Float.valueOf(f10 * 14.503775f));
                str4 = "psi";
                break;
            case "cm":
                str = String.format(Locale.US, "%.2f", Float.valueOf(Float.parseFloat(str3) * 0.39370078f));
                break;
            case "kW":
                str = String.format(Locale.US, "%.1f", Float.valueOf(Float.parseFloat(str3) * 1.3596216f));
                str4 = "hp";
                break;
            case "kg":
                str = String.format(Locale.US, "%.1f", Float.valueOf(Float.parseFloat(str3) * 2.2046225f));
                str4 = "lb";
                break;
            case "km":
                str = String.format(Locale.US, "%.2f", Float.valueOf(Float.parseFloat(str3) * 0.6213712f));
                str4 = "miles";
                break;
            case "mm":
                str = String.format(Locale.US, "%.3f", Float.valueOf(Float.parseFloat(str3) * 0.03937008f));
                break;
            case "°C":
                str = String.format(Locale.US, "%.1f", Float.valueOf(((Float.parseFloat(str3) * 9.0f) / 5.0f) + 32.0f));
                str4 = "°F";
                break;
            case "g/s":
                str = String.format(Locale.US, "%.2f", Float.valueOf(Float.parseFloat(str3) * 0.13227735f));
                str4 = "lb/min";
                break;
            case "l/h":
                str = String.format(Locale.US, "%.2f", Float.valueOf(Float.parseFloat(str3) * 0.26417205f));
                str4 = "gal/h";
                break;
            case "l/km":
                str = String.format(Locale.US, "%.2f", Float.valueOf((Float.parseFloat(str3) * 0.26417205f) / 0.6213712f));
                str4 = "gal/mile";
                break;
            case "kg/h":
                str = String.format(Locale.US, "%.3f", Float.valueOf(Float.parseFloat(str3) * 2.2046225f));
                str4 = "lb/h";
                break;
            case "km/h":
                str = String.format(Locale.US, "%.1f", Float.valueOf(Float.parseFloat(str3) * 0.6213712f));
                str4 = "MPH";
                break;
            case "m/s²":
                str = String.format(Locale.US, "%.1f", Float.valueOf(Float.parseFloat(str3) * 3.28084f));
                str4 = "ft/s²";
                break;
            case "mg/h":
                str = String.format(Locale.US, "%.3f", Float.valueOf(Float.parseFloat(str3) * 0.015432359f));
                str4 = "gr/h";
                break;
            case "l/100":
                str = String.format(Locale.US, "%.2f", Float.valueOf(Float.parseFloat(str3) * 0.26417205f));
                str4 = "gal/100";
                break;
            default:
                return t8;
        }
        return new p134k8.T1(str2, str, str4);
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(k((p134k8.T1) it.next()));
        }
        return arrayList2;
    }

    public static boolean m(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static kotlin.sequences.h n(Ia.p pVar) {
        kotlin.sequences.h hVar = new kotlin.sequences.h();
        hVar.f43101e = A8.p.u(pVar, hVar, hVar);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    public static final androidx.compose.ui.layout.F o(androidx.compose.foundation.layout.P p10, int i10, int i11, int i12, int i13, int i14, androidx.compose.ui.layout.H h8, List list, androidx.compose.ui.layout.Y[] yArr, int i15, int i16, int[] iArr, int i17) {
        int[] iArr2;
        int i18;
        int i19;
        int i20;
        ?? r10;
        List list2 = list;
        int i21 = i16;
        long j = i14;
        int i22 = i21 - i15;
        int[] iArr3 = new int[i22];
        float f10 = 0.0f;
        int i23 = i15;
        float f11 = 0.0f;
        int i24 = 0;
        int i25 = 0;
        int iMin = 0;
        int iMax = 0;
        while (i23 < i21) {
            androidx.compose.ui.layout.D d10 = (androidx.compose.ui.layout.D) list2.get(i23);
            float fH = Y.h(Y.g(d10));
            if (fH > f10) {
                f11 += fH;
                i24++;
                i19 = i22;
            } else {
                int i26 = i12 - i25;
                androidx.compose.ui.layout.Y yQ = yArr[i23];
                if (yQ == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        i19 = i22;
                        r10 = 0;
                        i20 = BrazeLogger.SUPPRESS;
                    } else {
                        i19 = i22;
                        if (i26 < 0) {
                            r10 = 0;
                            i20 = 0;
                        } else {
                            i20 = i26;
                            r10 = 0;
                        }
                    }
                    yQ = d10.Q(p10.b(r10, i20, i13, r10));
                } else {
                    i19 = i22;
                }
                androidx.compose.ui.layout.Y y10 = yQ;
                int iC = p10.c(y10);
                int iE = p10.e(y10);
                iArr3[i23 - i15] = iC;
                int i27 = i26 - iC;
                if (i27 < 0) {
                    i27 = 0;
                }
                iMin = Math.min(i14, i27);
                i25 += iC + iMin;
                iMax = Math.max(iMax, iE);
                yArr[i23] = y10;
            }
            i23++;
            i21 = i16;
            i22 = i19;
            f10 = 0.0f;
        }
        int i28 = i22;
        int i29 = iMax;
        if (i24 == 0) {
            i25 -= iMin;
            iArr2 = iArr3;
            i18 = 0;
        } else {
            long j10 = j * ((long) (i24 - 1));
            long jRound = ((long) ((i12 != Integer.MAX_VALUE ? i12 : i10) - i25)) - j10;
            if (jRound < 0) {
                jRound = 0;
            }
            float f12 = jRound / f11;
            int i30 = i15;
            while (i30 < i16) {
                jRound -= (long) Math.round(Y.h(Y.g((androidx.compose.ui.layout.D) list2.get(i30))) * f12);
                i30++;
                iArr3 = iArr3;
            }
            iArr2 = iArr3;
            int i31 = i15;
            int i32 = 0;
            while (i31 < i16) {
                if (yArr[i31] == null) {
                    androidx.compose.ui.layout.D d11 = (androidx.compose.ui.layout.D) list2.get(i31);
                    androidx.compose.foundation.layout.Q qG = Y.g(d11);
                    float fH2 = Y.h(qG);
                    if (fH2 <= 0.0f) {
                        p258v.a.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fH2 * f12) + iSignum);
                    androidx.compose.ui.layout.Y yQ2 = d11.Q(p10.b((!(qG != null ? qG.f10200b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i13, true));
                    int iC2 = p10.c(yQ2);
                    int iE2 = p10.e(yQ2);
                    iArr2[i31 - i15] = iC2;
                    i32 += iC2;
                    int iMax3 = Math.max(i29, iE2);
                    yArr[i31] = yQ2;
                    i29 = iMax3;
                }
                i31++;
                list2 = list;
                j10 = j10;
            }
            i18 = (int) (((long) i32) + j10);
            int i33 = i12 - i25;
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > i33) {
                i18 = i33;
            }
        }
        int i34 = i18 + i25;
        if (i34 < 0) {
            i34 = 0;
        }
        int iMax4 = Math.max(i34, i10);
        int iMax5 = Math.max(i29, Math.max(i11, 0));
        int[] iArr4 = new int[i28];
        p10.a(iMax4, iArr2, iArr4, h8);
        return p10.d(yArr, h8, iArr4, iMax4, iMax5, iArr, i17, i15, i16);
    }

    public static Nb.a p(Ia.l moduleDeclaration) {
        kotlin.jvm.internal.i.e(moduleDeclaration, "moduleDeclaration");
        Nb.a aVar = new Nb.a(false);
        moduleDeclaration.invoke(aVar);
        return aVar;
    }

    public static final int q(Random.Default r10, Na.i iVar) {
        kotlin.jvm.internal.i.e(r10, "<this>");
        if (iVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + iVar);
        }
        int i10 = iVar.f4687b;
        int i11 = iVar.f4688c;
        if (i11 < Integer.MAX_VALUE) {
            return Random.f43065c.d(i10, i11 + 1);
        }
        if (i10 <= Integer.MIN_VALUE) {
            return Random.f43065c.b();
        }
        return Random.f43065c.d(i10 - 1, i11) + 1;
    }

    public static final long r(String str) {
        int length = str.length();
        int i10 = (length <= 0 || !kotlin.text.n.K("+-", str.charAt(0))) ? 0 : 1;
        if (length - i10 > 16) {
            Iterable iVar = new Na.i(i10, kotlin.text.n.N(str), 1);
            if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                Na.h it = iVar.iterator();
                while (true) {
                    if (it.f4692d) {
                        char cCharAt = str.charAt(it.a());
                        if ('0' > cCharAt || cCharAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (kotlin.text.m.I(str, "+", false)) {
            str = kotlin.text.o.r0(1, str);
        }
        return Long.parseLong(str);
    }

    public static final p141l2.H s(p141l2.P[] pArr, InterfaceC1084f interfaceC1084f) {
        int i10 = 0;
        Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        Object[] objArrCopyOf = Arrays.copyOf(pArr, pArr.length);
        androidx.navigation.compose.w wVar = new androidx.navigation.compose.w();
        androidx.navigation.compose.x xVar = new androidx.navigation.compose.x(i10, context);
        W.f fVar = SaverKt.f13134a;
        W.f fVar2 = new W.f(wVar, xVar);
        boolean zK = interfaceC1084f.k(context);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new androidx.navigation.compose.v(context, i10);
            interfaceC1084f.E(objF);
        }
        p141l2.H h8 = (p141l2.H) androidx.compose.runtime.saveable.b.c(objArrCopyOf, fVar2, null, (Ia.a) objF, interfaceC1084f, 0, 4);
        int length = pArr.length;
        while (i10 < length) {
            h8.f44310b.f44802s.a(pArr[i10]);
            i10++;
        }
        return h8;
    }

    public static final long t(int i10, DurationUnit unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? i(Lb.a.e(i10, unit, DurationUnit.NANOSECONDS)) : u(i10, unit);
    }

    public static final long u(long j, DurationUnit unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jE = Lb.a.e(4611686018426999999L, durationUnit, unit);
        return ((-jE) > j || j > jE) ? g(Na.l.E(Lb.a.d(j, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : i(Lb.a.e(j, unit, durationUnit));
    }

    public static final Object v(Object obj) throws NoSuchFieldException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof Ha.a) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }

    public static final int w(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    @Override // p276w6.a
    public void c(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}
