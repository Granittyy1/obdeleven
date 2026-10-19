package p067f3;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.X;

/* JADX INFO: compiled from: TypefaceHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X<String, Typeface> f34936a = new X<>();

    public static Typeface a(Context context, String str) {
        X<String, Typeface> x10 = f34936a;
        synchronized (x10) {
            try {
                if (x10.containsKey(str)) {
                    return x10.get(str);
                }
                try {
                    Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/" + str);
                    x10.put(str, typefaceCreateFromAsset);
                    return typefaceCreateFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
