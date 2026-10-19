package U;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.B;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.graphics.D;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.W;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.h;
import androidx.compose.ui.graphics.vector.k;
import androidx.compose.ui.graphics.vector.l;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.xmlpull.v1.XmlPullParserException;
import p211r0.j;

/* JADX INFO: compiled from: PainterResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:131:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:133:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:141:0x0416 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x0418  */
    /* JADX WARN: Code duplicated, block: B:143:0x0420  */
    /* JADX WARN: Code duplicated, block: B:150:0x0439 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x043b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0443  */
    /* JADX WARN: Code duplicated, block: B:155:0x0455  */
    /* JADX WARN: Code duplicated, block: B:156:0x0458  */
    /* JADX WARN: Code duplicated, block: B:159:0x045e  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x028b  */
    public static final Painter a(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TypedValue typedValueB;
        int i12;
        long jD;
        int i13;
        XmlResourceParser xmlResourceParser;
        int i14;
        b bVar;
        b.C0082b c0082b;
        androidx.compose.ui.graphics.vector.c.a aVar;
        Resources.Theme theme;
        char c10;
        int i15;
        int i16;
        int i17;
        int iC;
        int i18;
        p211r0.d dVarB;
        int iC2;
        Shader shader;
        C m0Var;
        Shader shader2;
        C m0Var2;
        int i19;
        Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14792a);
        Resources resources = context.getResources();
        d dVar = (d) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14795d);
        synchronized (dVar) {
            typedValueB = dVar.f6063a.b(i10);
            i12 = 1;
            if (typedValueB == null) {
                typedValueB = new TypedValue();
                resources.getValue(i10, typedValueB, true);
                B<TypedValue> b10 = dVar.f6063a;
                int iD = b10.d(i10);
                Object[] objArr = b10.f9188c;
                Object obj = objArr[iD];
                b10.f9187b[iD] = i10;
                objArr[iD] = typedValueB;
            }
        }
        CharSequence charSequence = typedValueB.string;
        if (charSequence == null || !n.M(".xml", charSequence)) {
            interfaceC1084f.L(-802887899);
            boolean zK = interfaceC1084f.K(context.getTheme()) | interfaceC1084f.K(charSequence) | ((((i11 & 14) ^ 6) > 4 && interfaceC1084f.h(i10)) || (i11 & 6) == 4);
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                try {
                    Drawable drawable = resources.getDrawable(i10, null);
                    i.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objF = new C1141q(((BitmapDrawable) drawable).getBitmap());
                    interfaceC1084f.E(objF);
                } catch (Exception e10) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e10);
                }
            }
            W w3 = (W) objF;
            androidx.compose.ui.graphics.painter.a aVar2 = new androidx.compose.ui.graphics.painter.a(w3, 0L, (((long) w3.getWidth()) << 32) | (((long) w3.getHeight()) & 4294967295L));
            interfaceC1084f.D();
            return aVar2;
        }
        interfaceC1084f.L(-803043333);
        Resources.Theme theme2 = context.getTheme();
        int i20 = typedValueB.changingConfigurations;
        b bVar2 = (b) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14794c);
        b.C0082b c0082b2 = new b.C0082b(theme2, i10);
        WeakReference<b.a> weakReference = bVar2.f6058a.get(c0082b2);
        b.a aVar3 = weakReference != null ? weakReference.get() : null;
        if (aVar3 == null) {
            XmlResourceParser xml = resources.getXml(i10);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!i.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            L.a aVar4 = new L.a(xml);
            TypedArray typedArrayF = j.f(resources, theme2, attributeSetAsAttributeSet, L.b.f4379a);
            aVar4.b(typedArrayF.getChangingConfigurations());
            boolean z10 = !j.e(xml, "autoMirrored") ? false : typedArrayF.getBoolean(5, false);
            aVar4.b(typedArrayF.getChangingConfigurations());
            float fA = aVar4.a(typedArrayF, "viewportWidth", 7, 0.0f);
            float fA2 = aVar4.a(typedArrayF, "viewportHeight", 8, 0.0f);
            if (fA <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fA2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayF.getDimension(3, 0.0f);
            aVar4.b(typedArrayF.getChangingConfigurations());
            float dimension2 = typedArrayF.getDimension(2, 0.0f);
            aVar4.b(typedArrayF.getChangingConfigurations());
            if (typedArrayF.hasValue(1)) {
                TypedValue typedValue = new TypedValue();
                typedArrayF.getValue(1, typedValue);
                if (typedValue.type == 2) {
                    jD = H.f13504l;
                } else {
                    ColorStateList colorStateListA = j.a(typedArrayF, xml, theme2);
                    aVar4.b(typedArrayF.getChangingConfigurations());
                    jD = colorStateListA != null ? Q3.d.d(colorStateListA.getDefaultColor()) : H.f13504l;
                }
            } else {
                jD = H.f13504l;
            }
            long j = jD;
            int i21 = typedArrayF.getInt(6, -1);
            aVar4.b(typedArrayF.getChangingConfigurations());
            if (i21 == -1) {
                i13 = 5;
            } else if (i21 == 3) {
                i13 = 3;
            } else if (i21 == 5) {
                i13 = 5;
            } else if (i21 != 9) {
                switch (i21) {
                    case 14:
                        i13 = 13;
                        break;
                    case 15:
                        i13 = 14;
                        break;
                    case 16:
                        i13 = 12;
                        break;
                    default:
                        i13 = 5;
                        break;
                }
            } else {
                i13 = 9;
            }
            float f10 = dimension / resources.getDisplayMetrics().density;
            float f11 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayF.recycle();
            androidx.compose.ui.graphics.vector.c.a aVar5 = new androidx.compose.ui.graphics.vector.c.a(null, f10, f11, fA, fA2, j, i13, z10, 1);
            int i22 = 0;
            for (int i23 = 3; xml.getEventType() != i12 && (xml.getDepth() >= i12 || xml.getEventType() != i23); i23 = 3) {
                XmlResourceParser xmlResourceParser2 = aVar4.f4376a;
                int eventType = xmlResourceParser2.getEventType();
                if (eventType == 2) {
                    xmlResourceParser = xml;
                    Resources.Theme theme3 = theme2;
                    i14 = i20;
                    bVar = bVar2;
                    androidx.compose.ui.graphics.vector.c.a aVar6 = aVar5;
                    c0082b = c0082b2;
                    String name = xmlResourceParser2.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        Z6.a aVar7 = aVar4.f4378c;
                        if (iHashCode == -1649314686) {
                            aVar = aVar6;
                            theme = theme3;
                            c10 = '\t';
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayF2 = j.f(resources, theme, attributeSetAsAttributeSet, L.b.f4382d);
                                aVar4.b(typedArrayF2.getChangingConfigurations());
                                String string = typedArrayF2.getString(0);
                                aVar4.b(typedArrayF2.getChangingConfigurations());
                                String str = string == null ? "" : string;
                                i15 = 1;
                                String string2 = typedArrayF2.getString(1);
                                aVar4.b(typedArrayF2.getChangingConfigurations());
                                List listA = string2 == null ? androidx.compose.ui.graphics.vector.i.f13970a : Z6.a.a(aVar7, string2);
                                typedArrayF2.recycle();
                                if (aVar.f13887k) {
                                    R.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                aVar.f13886i.add(new androidx.compose.ui.graphics.vector.c.a.C0156a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, listA, 512));
                                i22++;
                            }
                        } else if (iHashCode == 3433509) {
                            aVar = aVar6;
                            theme = theme3;
                            if (name.equals("path")) {
                                TypedArray typedArrayF3 = j.f(resources, theme, attributeSetAsAttributeSet, L.b.f4381c);
                                aVar4.b(typedArrayF3.getChangingConfigurations());
                                if (!j.e(xmlResourceParser2, "pathData")) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String string3 = typedArrayF3.getString(0);
                                aVar4.b(typedArrayF3.getChangingConfigurations());
                                String str2 = string3 == null ? "" : string3;
                                String string4 = typedArrayF3.getString(2);
                                aVar4.b(typedArrayF3.getChangingConfigurations());
                                List listA2 = string4 == null ? androidx.compose.ui.graphics.vector.i.f13970a : Z6.a.a(aVar7, string4);
                                p211r0.d dVarB2 = j.b(typedArrayF3, aVar4.f4376a, theme, "fillColor", 1);
                                aVar4.b(typedArrayF3.getChangingConfigurations());
                                float fA3 = aVar4.a(typedArrayF3, "fillAlpha", 12, 1.0f);
                                int iC3 = j.c(typedArrayF3, aVar4.f4376a, "strokeLineCap", 8, -1);
                                aVar4.b(typedArrayF3.getChangingConfigurations());
                                if (iC3 != 0) {
                                    if (iC3 != 1) {
                                        i16 = 2;
                                        if (iC3 == 2) {
                                            i17 = 2;
                                        }
                                    } else {
                                        i16 = 2;
                                        i17 = 1;
                                    }
                                    c10 = '\t';
                                    iC = j.c(typedArrayF3, aVar4.f4376a, "strokeLineJoin", 9, -1);
                                    aVar4.b(typedArrayF3.getChangingConfigurations());
                                    if (iC != 0) {
                                        i18 = 0;
                                    } else if (iC != 1) {
                                        i18 = i16;
                                    } else {
                                        i18 = 1;
                                    }
                                    float fA4 = aVar4.a(typedArrayF3, "strokeMiterLimit", 10, 1.0f);
                                    dVarB = j.b(typedArrayF3, aVar4.f4376a, theme, "strokeColor", 3);
                                    aVar4.b(typedArrayF3.getChangingConfigurations());
                                    float fA5 = aVar4.a(typedArrayF3, "strokeAlpha", 11, 1.0f);
                                    float fA6 = aVar4.a(typedArrayF3, "strokeWidth", 4, 1.0f);
                                    float fA7 = aVar4.a(typedArrayF3, "trimPathEnd", 6, 1.0f);
                                    float fA8 = aVar4.a(typedArrayF3, "trimPathOffset", 7, 0.0f);
                                    float fA9 = aVar4.a(typedArrayF3, "trimPathStart", 5, 0.0f);
                                    iC2 = j.c(typedArrayF3, aVar4.f4376a, "fillType", 13, 0);
                                    aVar4.b(typedArrayF3.getChangingConfigurations());
                                    typedArrayF3.recycle();
                                    shader = dVarB2.f46234a;
                                    if (shader == null && dVarB2.f46236c == 0) {
                                        m0Var = null;
                                    } else if (shader != null) {
                                        m0Var = new D(shader);
                                    } else {
                                        m0Var = new m0(Q3.d.d(dVarB2.f46236c));
                                    }
                                    shader2 = dVarB.f46234a;
                                    if (shader2 == null && dVarB.f46236c == 0) {
                                        m0Var2 = null;
                                    } else if (shader2 != null) {
                                        m0Var2 = new D(shader2);
                                    } else {
                                        m0Var2 = new m0(Q3.d.d(dVarB.f46236c));
                                    }
                                    if (iC2 == 0) {
                                        i19 = 0;
                                    } else {
                                        i19 = 1;
                                    }
                                    if (aVar.f13887k) {
                                        R.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((androidx.compose.ui.graphics.vector.c.a.C0156a) Z3.n.f(1, aVar.f13886i)).j.add(new l(str2, listA2, i19, m0Var, fA3, m0Var2, fA5, fA6, i17, i18, fA4, fA9, fA7, fA8));
                                } else {
                                    i16 = 2;
                                }
                                i17 = 0;
                                c10 = '\t';
                                iC = j.c(typedArrayF3, aVar4.f4376a, "strokeLineJoin", 9, -1);
                                aVar4.b(typedArrayF3.getChangingConfigurations());
                                if (iC != 0) {
                                    i18 = 0;
                                } else if (iC != 1) {
                                    i18 = i16;
                                } else {
                                    i18 = 1;
                                }
                                float fA10 = aVar4.a(typedArrayF3, "strokeMiterLimit", 10, 1.0f);
                                dVarB = j.b(typedArrayF3, aVar4.f4376a, theme, "strokeColor", 3);
                                aVar4.b(typedArrayF3.getChangingConfigurations());
                                float fA11 = aVar4.a(typedArrayF3, "strokeAlpha", 11, 1.0f);
                                float fA12 = aVar4.a(typedArrayF3, "strokeWidth", 4, 1.0f);
                                float fA13 = aVar4.a(typedArrayF3, "trimPathEnd", 6, 1.0f);
                                float fA14 = aVar4.a(typedArrayF3, "trimPathOffset", 7, 0.0f);
                                float fA15 = aVar4.a(typedArrayF3, "trimPathStart", 5, 0.0f);
                                iC2 = j.c(typedArrayF3, aVar4.f4376a, "fillType", 13, 0);
                                aVar4.b(typedArrayF3.getChangingConfigurations());
                                typedArrayF3.recycle();
                                shader = dVarB2.f46234a;
                                if (shader == null) {
                                    m0Var = null;
                                } else if (shader != null) {
                                    m0Var = new D(shader);
                                } else {
                                    m0Var = new m0(Q3.d.d(dVarB2.f46236c));
                                }
                                shader2 = dVarB.f46234a;
                                if (shader2 == null) {
                                    m0Var2 = null;
                                } else if (shader2 != null) {
                                    m0Var2 = new D(shader2);
                                } else {
                                    m0Var2 = new m0(Q3.d.d(dVarB.f46236c));
                                }
                                if (iC2 == 0) {
                                    i19 = 0;
                                } else {
                                    i19 = 1;
                                }
                                if (aVar.f13887k) {
                                    R.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((androidx.compose.ui.graphics.vector.c.a.C0156a) Z3.n.f(1, aVar.f13886i)).j.add(new l(str2, listA2, i19, m0Var, fA3, m0Var2, fA11, fA12, i17, i18, fA10, fA15, fA13, fA14));
                            }
                        } else if (iHashCode == 98629247 && name.equals("group")) {
                            theme = theme3;
                            TypedArray typedArrayF4 = j.f(resources, theme, attributeSetAsAttributeSet, L.b.f4380b);
                            aVar4.b(typedArrayF4.getChangingConfigurations());
                            float fA16 = aVar4.a(typedArrayF4, "rotation", 5, 0.0f);
                            float f12 = typedArrayF4.getFloat(1, 0.0f);
                            aVar4.b(typedArrayF4.getChangingConfigurations());
                            float f13 = typedArrayF4.getFloat(2, 0.0f);
                            aVar4.b(typedArrayF4.getChangingConfigurations());
                            float fA17 = aVar4.a(typedArrayF4, "scaleX", 3, 1.0f);
                            float fA18 = aVar4.a(typedArrayF4, "scaleY", 4, 1.0f);
                            float fA19 = aVar4.a(typedArrayF4, "translateX", 6, 0.0f);
                            float fA20 = aVar4.a(typedArrayF4, "translateY", 7, 0.0f);
                            String string5 = typedArrayF4.getString(0);
                            aVar4.b(typedArrayF4.getChangingConfigurations());
                            String str3 = string5 == null ? "" : string5;
                            typedArrayF4.recycle();
                            EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                            aVar = aVar6;
                            if (aVar.f13887k) {
                                R.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            aVar.f13886i.add(new androidx.compose.ui.graphics.vector.c.a.C0156a(str3, fA16, f12, f13, fA17, fA18, fA19, fA20, emptyList, 512));
                        } else {
                            aVar = aVar6;
                            theme = theme3;
                        }
                        i15 = 1;
                    } else {
                        aVar = aVar6;
                        theme = theme3;
                    }
                    xmlResourceParser.next();
                    theme2 = theme;
                    aVar5 = aVar;
                    i12 = i15;
                    c0082b2 = c0082b;
                    bVar2 = bVar;
                    i20 = i14;
                    xml = xmlResourceParser;
                } else if (eventType != i23) {
                    xmlResourceParser = xml;
                    theme = theme2;
                    i14 = i20;
                    bVar = bVar2;
                    aVar = aVar5;
                    c0082b = c0082b2;
                } else {
                    if ("group".equals(xmlResourceParser2.getName())) {
                        int i24 = i22 + 1;
                        int i25 = 0;
                        while (i25 < i24) {
                            if (aVar5.f13887k) {
                                R.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            ArrayList<androidx.compose.ui.graphics.vector.c.a.C0156a> arrayList = aVar5.f13886i;
                            androidx.compose.ui.graphics.vector.c.a.C0156a c0156aRemove = arrayList.remove(arrayList.size() - 1);
                            ((androidx.compose.ui.graphics.vector.c.a.C0156a) Z3.n.f(1, arrayList)).j.add(new h(c0156aRemove.f13888a, c0156aRemove.f13889b, c0156aRemove.f13890c, c0156aRemove.f13891d, c0156aRemove.f13892e, c0156aRemove.f13893f, c0156aRemove.f13894g, c0156aRemove.f13895h, c0156aRemove.f13896i, c0156aRemove.j));
                            i25++;
                            i24 = i24;
                            c0082b2 = c0082b2;
                            bVar2 = bVar2;
                            i20 = i20;
                            xml = xml;
                            aVar5 = aVar5;
                            theme2 = theme2;
                        }
                        xmlResourceParser = xml;
                        i14 = i20;
                        bVar = bVar2;
                        c0082b = c0082b2;
                        theme = theme2;
                        aVar = aVar5;
                        i15 = 1;
                        i22 = 0;
                    } else {
                        xmlResourceParser = xml;
                        i14 = i20;
                        bVar = bVar2;
                        c0082b = c0082b2;
                        theme = theme2;
                        aVar = aVar5;
                    }
                    c10 = '\t';
                    xmlResourceParser.next();
                    theme2 = theme;
                    aVar5 = aVar;
                    i12 = i15;
                    c0082b2 = c0082b;
                    bVar2 = bVar;
                    i20 = i14;
                    xml = xmlResourceParser;
                }
                i15 = 1;
                c10 = '\t';
                xmlResourceParser.next();
                theme2 = theme;
                aVar5 = aVar;
                i12 = i15;
                c0082b2 = c0082b;
                bVar2 = bVar;
                i20 = i14;
                xml = xmlResourceParser;
            }
            b bVar3 = bVar2;
            b.C0082b c0082b3 = c0082b2;
            aVar3 = new b.a(aVar5.b(), i20);
            bVar3.f6058a.put(c0082b3, new WeakReference<>(aVar3));
        }
        VectorPainter vectorPainterB = k.b(aVar3.f6059a, interfaceC1084f);
        interfaceC1084f.D();
        return vectorPainterB;
    }
}
