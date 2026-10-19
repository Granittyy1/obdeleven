package p222s0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p211r0.e;
import p283x0.l;

/* JADX INFO: compiled from: TypefaceCompatApi26Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f46866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Constructor<?> f46867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f46868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f46869i;
    public final Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f46870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f46871l;

    public g() throws NoSuchMethodException {
        Method methodM;
        Constructor<?> constructor;
        Method methodL;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodL = l(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodM = m(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            methodM = null;
            constructor = null;
            methodL = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f46866f = cls;
        this.f46867g = constructor;
        this.f46868h = methodL;
        this.f46869i = method;
        this.j = method2;
        this.f46870k = method3;
        this.f46871l = methodM;
    }

    public static Method l(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // p222s0.f, p222s0.k
    public final Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        if (this.f46868h == null) {
            return super.a(context, cVar, resources, i10);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        for (e.d dVar : cVar.f46237a) {
            if (!h(context, objK, dVar.f46238a, dVar.f46242e, dVar.f46239b, dVar.f46240c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f46241d))) {
                g(objK);
                return null;
            }
        }
        if (j(objK)) {
            return i(objK);
        }
        return null;
    }

    @Override // p222s0.k
    public final Typeface b(Context context, l[] lVarArr, int i10) {
        Typeface typefaceI;
        boolean zBooleanValue;
        if (lVarArr.length < 1) {
            return null;
        }
        if (this.f46868h == null) {
            l lVarD = d(i10, lVarArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(lVarD.f47869a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(lVarD.f47871c).setItalic(lVarD.f47872d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (l lVar : lVarArr) {
            if (lVar.f47873e == 0) {
                Uri uri = lVar.f47869a;
                if (!map.containsKey(uri)) {
                    map.put(uri, l.e(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objK = k();
        if (objK == null) {
            return null;
        }
        int length = lVarArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            l lVar2 = lVarArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(lVar2.f47869a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f46869i.invoke(objK, byteBuffer, Integer.valueOf(lVar2.f47870b), null, Integer.valueOf(lVar2.f47871c), Integer.valueOf(lVar2.f47872d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    g(objK);
                    return null;
                }
                z10 = true;
            }
            i11++;
            z10 = z10;
        }
        if (!z10) {
            g(objK);
            return null;
        }
        if (j(objK) && (typefaceI = i(objK)) != null) {
            return Typeface.create(typefaceI, i10);
        }
        return null;
    }

    @Override // p222s0.k
    public final Typeface c(Context context, Resources resources, int i10, String str, int i11) {
        if (this.f46868h == null) {
            return super.c(context, resources, i10, str, i11);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        if (!h(context, objK, str, 0, -1, -1, null)) {
            g(objK);
            return null;
        }
        if (j(objK)) {
            return i(objK);
        }
        return null;
    }

    public final void g(Object obj) {
        try {
            this.f46870k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean h(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f46868h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f46866f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f46871l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean j(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object k() {
        try {
            return this.f46867g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method m(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
