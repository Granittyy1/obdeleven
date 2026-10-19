package p222s0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p211r0.e;

/* JADX INFO: compiled from: TypefaceCompatApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class<?> f46861a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Constructor<?> f46862b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f46863c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f46864d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f46865e = false;

    public static boolean e(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        f();
        try {
            return ((Boolean) f46863c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void f() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f46865e) {
            return;
        }
        f46865e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f46862b = constructor;
        f46861a = cls;
        f46863c = method2;
        f46864d = method;
    }

    @Override // p222s0.k
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) throws NoSuchMethodException {
        f();
        try {
            Object objNewInstance = f46862b.newInstance(null);
            for (e.d dVar : cVar.f46237a) {
                File fileD = l.d(context);
                if (fileD == null) {
                    return null;
                }
                try {
                    if (!l.b(fileD, resources, dVar.f46243f)) {
                        return null;
                    }
                    if (!e(objNewInstance, fileD.getPath(), dVar.f46239b, dVar.f46240c)) {
                        return null;
                    }
                    fileD.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileD.delete();
                }
            }
            f();
            try {
                Object objNewInstance2 = Array.newInstance(f46861a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f46864d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
