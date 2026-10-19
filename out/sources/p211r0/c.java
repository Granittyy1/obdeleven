package p211r0;

import S4.o;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.voltasit.obdeleven.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p174o0.a;

/* JADX INFO: compiled from: ColorStateListInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f46233a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int[] iArr;
        boolean z10;
        int iA;
        float f10;
        float f11;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r10 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = a.f45047a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i10, i10);
                int resourceId = ObtainAttributes.getResourceId(i10, -1);
                if (resourceId == -1) {
                    color = ObtainAttributes.getColor(i10, -65281);
                } else {
                    ThreadLocal<TypedValue> threadLocal = f46233a;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r10);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i10, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i10, -65281);
                    }
                }
                float f12 = ObtainAttributes.hasValue(r10) ? ObtainAttributes.getFloat(r10, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f13 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i13 = i10;
                for (int i14 = i13; i14 < attributeCount; i14++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i15 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i13] = attributeNameResource;
                        i13 = i15;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i13);
                float f14 = 0.0f;
                float f15 = 100.0f;
                boolean z11 = f13 >= 0.0f && f13 <= 100.0f;
                if (f12 != 1.0f || z11) {
                    int iD = o.d((int) ((Color.alpha(color) * f12) + 0.5f), 0, 255);
                    if (z11) {
                        a aVarA = a.a(color);
                        k kVar = k.f46261k;
                        float f16 = aVarA.f46224b;
                        if (f16 >= 1.0d && Math.round(f13) > 0.0d && Math.round(f13) < 100.0d) {
                            float f17 = aVarA.f46223a;
                            float fMin = f17 < 0.0f ? 0.0f : Math.min(360.0f, f17);
                            float f18 = 0.0f;
                            float f19 = f16;
                            a aVar = null;
                            boolean z12 = true;
                            while (true) {
                                if (Math.abs(f18 - f16) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    depth2 = depth2;
                                    z10 = true;
                                    if (aVar != null) {
                                        iA = aVar.c(kVar);
                                        break;
                                    }
                                    iA = b.a(f13);
                                    break;
                                }
                                float f20 = 1000.0f;
                                float f21 = f14;
                                float f22 = f15;
                                float f23 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f21 - f22) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        f15 = f15;
                                        z10 = true;
                                        float f24 = f14;
                                        iArr = iArrTrimStateSet;
                                        f10 = f24;
                                        break;
                                    }
                                    float f25 = ((f22 - f21) / 2.0f) + f21;
                                    int iC = a.b(f25, f19, fMin).c(k.f46261k);
                                    float fB = b.b(Color.red(iC));
                                    float fB2 = b.b(Color.green(iC));
                                    float fB3 = b.b(Color.blue(iC));
                                    z10 = true;
                                    float[] fArr = b.f46232d[1];
                                    f15 = 100.0f;
                                    float f26 = ((fB3 * fArr[2]) + ((fB2 * fArr[1]) + (fB * fArr[0]))) / 100.0f;
                                    float fCbrt = f26 <= 0.008856452f ? f26 * 903.2963f : (((float) Math.cbrt(f26)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f13 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        a aVarB = a.b(aVarA2.f46225c, aVarA2.f46224b, fMin);
                                        f11 = f25;
                                        float f27 = aVarA2.f46226d - aVarB.f46226d;
                                        fMin = fMin;
                                        float f28 = aVarA2.f46227e - aVarB.f46227e;
                                        float f29 = aVarA2.f46228f - aVarB.f46228f;
                                        double dSqrt = Math.sqrt((f29 * f29) + (f28 * f28) + (f27 * f27));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f23 = fPow;
                                            aVar2 = aVarA2;
                                            f20 = fAbs;
                                        }
                                    } else {
                                        f11 = f25;
                                        fMin = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f10 = 0.0f;
                                    if (f20 == 0.0f && f23 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f13) {
                                        f21 = f11;
                                    } else {
                                        f22 = f11;
                                    }
                                    f15 = 100.0f;
                                    depth2 = depth2;
                                    fMin = fMin;
                                    int[] iArr5 = iArr;
                                    f14 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                a aVar3 = aVar2;
                                if (!z12) {
                                    if (aVar3 == null) {
                                        f16 = f19;
                                    } else {
                                        aVar = aVar3;
                                        f18 = f19;
                                    }
                                    f19 = ((f16 - f18) / 2.0f) + f18;
                                } else {
                                    if (aVar3 != null) {
                                        iA = aVar3.c(kVar);
                                        break;
                                    }
                                    f19 = ((f16 - f18) / 2.0f) + f18;
                                    z12 = false;
                                }
                                int[] iArr6 = iArr;
                                f14 = f10;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            depth2 = depth2;
                            z10 = true;
                            iA = b.a(f13);
                        }
                        color = iA;
                    } else {
                        iArr = iArrTrimStateSet;
                        depth2 = depth2;
                        z10 = true;
                    }
                    color = (16777215 & color) | (iD << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    depth2 = depth2;
                    z10 = true;
                }
                int i16 = i11 + 1;
                if (i16 > iArr2.length) {
                    int[] iArr7 = new int[i11 <= 4 ? 8 : i11 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i11);
                    iArr2 = iArr7;
                }
                iArr2[i11] = color;
                if (i16 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i11);
                    objArr = objArr2;
                }
                objArr[i11] = iArr;
                objArr = (int[][]) objArr;
                i11 = i16;
                r10 = z10;
                depth2 = depth2;
                i10 = 0;
            } else {
                int i17 = depth2;
                r10 = r10 == true ? 1 : 0;
                depth2 = i17;
                i10 = 0;
            }
        }
        int[] iArr8 = new int[i11];
        int[][] iArr9 = new int[i11][];
        System.arraycopy(iArr2, 0, iArr8, 0, i11);
        System.arraycopy(objArr, 0, iArr9, 0, i11);
        return new ColorStateList(iArr9, iArr8);
    }
}
