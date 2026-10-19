package D2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.collection.C0873a;
import com.voltasit.obdeleven.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: TransitionInflater.java */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f2530b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0873a<String, Constructor<?>> f2531c = new C0873a<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2532a;

    public I(Context context) {
        this.f2532a = context;
    }

    public final Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            C0873a<String, Constructor<?>> c0873a = f2531c;
            synchronized (c0873a) {
                try {
                    Constructor<?> constructor = c0873a.get(attributeValue);
                    if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f2532a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = clsAsSubclass.getConstructor(f2530b);
                        constructor.setAccessible(true);
                        c0873a.put(attributeValue, constructor);
                    }
                    objNewInstance = constructor.newInstance(this.f2532a, attributeSet);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return objNewInstance;
        } catch (Exception e10) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [D2.I] */
    /* JADX WARN: Type inference failed for: r20v0, types: [D2.F] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [D2.L] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [D2.F] */
    /* JADX WARN: Type inference failed for: r7v10, types: [D2.F, D2.h] */
    /* JADX WARN: Type inference failed for: r7v11, types: [D2.F] */
    /* JADX WARN: Type inference failed for: r7v12, types: [D2.F, D2.e0, D2.k] */
    /* JADX WARN: Type inference failed for: r7v13, types: [D2.D, D2.F, D2.e0] */
    /* JADX WARN: Type inference failed for: r7v14, types: [D2.F, D2.d] */
    /* JADX WARN: Type inference failed for: r7v15, types: [D2.F] */
    /* JADX WARN: Type inference failed for: r7v16, types: [D2.e0] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [D2.F] */
    /* JADX WARN: Type inference failed for: r7v6, types: [D2.L] */
    /* JADX WARN: Type inference failed for: r7v7, types: [D2.F] */
    /* JADX WARN: Type inference failed for: r7v8, types: [D2.L, D2.b] */
    /* JADX WARN: Type inference failed for: r7v9, types: [D2.F] */
    public final F b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, F f10) throws XmlPullParserException, IOException {
        ?? l10;
        int depth = xmlResourceParser.getDepth();
        ?? r10 = f10 instanceof L ? (L) f10 : 0;
        loop0: while (true) {
            l10 = 0;
            while (true) {
                int next = xmlResourceParser.next();
                int i10 = 3;
                if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                    break loop0;
                }
                if (next == 1) {
                    break loop0;
                }
                int i11 = 2;
                if (next == 2) {
                    String name = xmlResourceParser.getName();
                    boolean zEquals = "fade".equals(name);
                    Context context = this.f2532a;
                    if (zEquals) {
                        l10 = new C0686m(context, attributeSet);
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E.f2489e);
                        l10.S(p211r0.j.c(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, l10.f2622E));
                        typedArrayObtainStyledAttributes.recycle();
                    } else if ("changeBounds".equals(name)) {
                        l10 = new C0677d(context, attributeSet);
                        l10.f2597E = false;
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, E.f2487c);
                        boolean z10 = p211r0.j.e((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes2.getBoolean(0, false) : false;
                        typedArrayObtainStyledAttributes2.recycle();
                        l10.f2597E = z10;
                    } else if ("slide".equals(name)) {
                        l10 = new D(context, attributeSet);
                        D.f fVar = D.f2483O;
                        l10.f2484G = fVar;
                        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, E.f2491g);
                        int iC = p211r0.j.c(typedArrayObtainStyledAttributes3, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
                        typedArrayObtainStyledAttributes3.recycle();
                        if (iC == 3) {
                            l10.f2484G = D.f2478J;
                        } else if (iC == 5) {
                            l10.f2484G = D.f2481M;
                        } else if (iC == 48) {
                            l10.f2484G = D.f2480L;
                        } else if (iC == 80) {
                            l10.f2484G = fVar;
                        } else if (iC == 8388611) {
                            l10.f2484G = D.f2479K;
                        } else {
                            if (iC != 8388613) {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                            l10.f2484G = D.f2482N;
                        }
                        C c10 = new C();
                        c10.f2475b = iC;
                        l10.f2520y = c10;
                    } else if ("explode".equals(name)) {
                        l10 = new C0684k(context, attributeSet);
                        l10.f2674G = new int[2];
                        l10.f2520y = new C0683j();
                    } else if ("changeImageTransform".equals(name)) {
                        l10 = new C0679f(context, attributeSet);
                    } else if ("changeTransform".equals(name)) {
                        l10 = new C0681h(context, attributeSet);
                        l10.f2646E = true;
                        l10.f2647F = true;
                        l10.f2648G = new Matrix();
                        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, E.f2490f);
                        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
                        l10.f2646E = !p211r0.j.e(xmlPullParser, "reparentWithOverlay") ? true : typedArrayObtainStyledAttributes4.getBoolean(1, true);
                        l10.f2647F = p211r0.j.e(xmlPullParser, "reparent") ? typedArrayObtainStyledAttributes4.getBoolean(0, true) : true;
                        typedArrayObtainStyledAttributes4.recycle();
                    } else if ("changeClipBounds".equals(name)) {
                        l10 = new C0678e(context, attributeSet);
                    } else if ("autoTransition".equals(name)) {
                        l10 = new C0675b(context, attributeSet);
                        l10.Q();
                    } else if ("changeScroll".equals(name)) {
                        l10 = new C0680g(context, attributeSet);
                    } else if ("transitionSet".equals(name)) {
                        l10 = new L(context, attributeSet);
                    } else if ("transition".equals(name)) {
                        l10 = (F) a(attributeSet, F.class, "transition");
                    } else if ("targets".equals(name)) {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if ((next2 == i10 && xmlResourceParser.getDepth() <= depth2) || next2 == 1) {
                                break;
                            }
                            if (next2 != i11) {
                                i10 = 3;
                            } else {
                                if (!xmlResourceParser.getName().equals("target")) {
                                    throw new RuntimeException("Unknown scene name: " + xmlResourceParser.getName());
                                }
                                TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(attributeSet, E.f2485a);
                                int resourceId = !p211r0.j.e(xmlResourceParser, "targetId") ? 0 : typedArrayObtainStyledAttributes5.getResourceId(1, 0);
                                if (resourceId != 0) {
                                    f10.b(resourceId);
                                } else {
                                    int resourceId2 = !p211r0.j.e(xmlResourceParser, "excludeId") ? 0 : typedArrayObtainStyledAttributes5.getResourceId(i11, 0);
                                    if (resourceId2 != 0) {
                                        f10.r(resourceId2);
                                    } else {
                                        String strD = p211r0.j.d(typedArrayObtainStyledAttributes5, xmlResourceParser, "targetName", 4);
                                        if (strD != null) {
                                            f10.e(strD);
                                        } else {
                                            String strD2 = p211r0.j.d(typedArrayObtainStyledAttributes5, xmlResourceParser, "excludeName", 5);
                                            if (strD2 != null) {
                                                f10.t(strD2);
                                            } else {
                                                String strD3 = p211r0.j.d(typedArrayObtainStyledAttributes5, xmlResourceParser, "excludeClass", 3);
                                                if (strD3 != null) {
                                                    try {
                                                        f10.s(Class.forName(strD3));
                                                    } catch (ClassNotFoundException e10) {
                                                        typedArrayObtainStyledAttributes5.recycle();
                                                        throw new RuntimeException(B7.b.c("Could not create ", strD3), e10);
                                                    }
                                                } else {
                                                    String strD4 = p211r0.j.d(typedArrayObtainStyledAttributes5, xmlResourceParser, "targetClass", 0);
                                                    if (strD4 != null) {
                                                        f10.d(Class.forName(strD4));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                typedArrayObtainStyledAttributes5.recycle();
                                i10 = 3;
                                i11 = 2;
                            }
                        }
                    } else if ("arcMotion".equals(name)) {
                        if (f10 == 0) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        C0674a c0674a = new C0674a();
                        c0674a.f2583a = 0.0f;
                        c0674a.f2584b = 0.0f;
                        c0674a.f2585c = C0674a.f2582d;
                        TypedArray typedArrayObtainStyledAttributes6 = context.obtainStyledAttributes(attributeSet, E.f2493i);
                        XmlPullParser xmlPullParser2 = (XmlPullParser) attributeSet;
                        c0674a.f2584b = C0674a.b(!p211r0.j.e(xmlPullParser2, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes6.getFloat(1, 0.0f));
                        c0674a.f2583a = C0674a.b(p211r0.j.e(xmlPullParser2, "minimumHorizontalAngle") ? typedArrayObtainStyledAttributes6.getFloat(0, 0.0f) : 0.0f);
                        c0674a.f2585c = C0674a.b(p211r0.j.e(xmlPullParser2, "maximumAngle") ? typedArrayObtainStyledAttributes6.getFloat(2, 70.0f) : 70.0f);
                        typedArrayObtainStyledAttributes6.recycle();
                        f10.J(c0674a);
                    } else if ("pathMotion".equals(name)) {
                        if (f10 == 0) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        f10.J((AbstractC0697y) a(attributeSet, AbstractC0697y.class, "pathMotion"));
                    } else {
                        if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlResourceParser.getName());
                        }
                        if (f10 == 0) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        f10.J(new C0698z(context, attributeSet));
                    }
                    if (l10 == 0) {
                        continue;
                    } else {
                        if (!xmlResourceParser.isEmptyElementTag()) {
                            b(xmlResourceParser, attributeSet, l10);
                        }
                        if (r10 != 0) {
                            break;
                        }
                        if (f10 != 0) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                }
            }
            r10.O(l10);
        }
        return l10;
    }

    public final F c() {
        XmlResourceParser xml = this.f2532a.getResources().getXml(R.transition.default_transition);
        try {
            try {
                F fB = b(xml, Xml.asAttributeSet(xml), null);
                xml.close();
                return fB;
            } catch (IOException e10) {
                throw new InflateException(xml.getPositionDescription() + ": " + e10.getMessage(), e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException(e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
