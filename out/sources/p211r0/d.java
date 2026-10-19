package p211r0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p131k5.T1;
import p174o0.a;

/* JADX INFO: compiled from: ComplexColorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f46234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f46235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46236c;

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f46234a = shader;
        this.f46235b = colorStateList;
        this.f46236c = i10;
    }

    public static d a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f10;
        float f11;
        float f12;
        int i11;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayF = j.f(resources, theme, attributeSetAsAttributeSet, a.f45050d);
        float f13 = !j.e(xml, "startX") ? 0.0f : typedArrayF.getFloat(8, 0.0f);
        float f14 = !j.e(xml, "startY") ? 0.0f : typedArrayF.getFloat(9, 0.0f);
        float f15 = !j.e(xml, "endX") ? 0.0f : typedArrayF.getFloat(10, 0.0f);
        float f16 = !j.e(xml, "endY") ? 0.0f : typedArrayF.getFloat(11, 0.0f);
        float f17 = !j.e(xml, "centerX") ? 0.0f : typedArrayF.getFloat(3, 0.0f);
        float f18 = !j.e(xml, "centerY") ? 0.0f : typedArrayF.getFloat(4, 0.0f);
        int i12 = !j.e(xml, "type") ? 0 : typedArrayF.getInt(2, 0);
        int color = !j.e(xml, "startColor") ? 0 : typedArrayF.getColor(0, 0);
        boolean zE = j.e(xml, "centerColor");
        int color2 = !j.e(xml, "centerColor") ? 0 : typedArrayF.getColor(7, 0);
        int color3 = !j.e(xml, "endColor") ? 0 : typedArrayF.getColor(1, 0);
        int i13 = !j.e(xml, "tileMode") ? 0 : typedArrayF.getInt(6, 0);
        float f19 = !j.e(xml, "gradientRadius") ? 0.0f : typedArrayF.getFloat(5, 0.0f);
        typedArrayF.recycle();
        int depth = xml.getDepth() + 1;
        float f20 = f19;
        ArrayList arrayList = new ArrayList(20);
        float f21 = f16;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f10 = f15;
            if (next2 == 1) {
                f11 = f14;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f14;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayF2 = j.f(resources, theme, attributeSetAsAttributeSet, a.f45051e);
                boolean zHasValue = typedArrayF2.hasValue(0);
                boolean zHasValue2 = typedArrayF2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayF2.getColor(0, 0);
                float f22 = typedArrayF2.getFloat(1, 0.0f);
                typedArrayF2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f22));
            }
            f15 = f10;
            f14 = f11;
        }
        T1 t8 = arrayList2.size() > 0 ? new T1(arrayList2, arrayList) : null;
        if (t8 == null) {
            t8 = zE ? new T1(color, color2, color3) : new T1(color, color3);
        }
        if (i12 == 1) {
            float f23 = f17;
            i11 = 0;
            if (f20 <= 0.0f) {
                f12 = f18;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i13 == 1) {
                f12 = f18;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i13 != 2) {
                f12 = f18;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f12 = f18;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f23, f12, f20, (int[]) t8.f41993a, (float[]) t8.f41994b, tileMode);
        } else if (i12 != 2) {
            if (i13 != 1) {
                tileMode2 = i13 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            Shader.TileMode tileMode3 = tileMode2;
            i11 = 0;
            radialGradient = new LinearGradient(f13, f11, f10, f21, (int[]) t8.f41993a, (float[]) t8.f41994b, tileMode3);
        } else {
            i11 = 0;
            radialGradient = new SweepGradient(f17, f18, (int[]) t8.f41993a, (float[]) t8.f41994b);
        }
        return new d(radialGradient, null, i11);
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f46234a == null && (colorStateList = this.f46235b) != null && colorStateList.isStateful();
    }
}
