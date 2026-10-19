package p211r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.collection.C0893v;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p068f4.h;

/* JADX INFO: compiled from: ResourcesCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f46248a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f46249b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f46250c = new Object();

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f46251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f46252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46253c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f46251a = colorStateList;
            this.f46252b = configuration;
            this.f46253c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f46254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f46255b;

        public d(Resources resources, Resources.Theme theme) {
            this.f46254a = resources;
            this.f46255b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f46254a.equals(dVar.f46254a) && Objects.equals(this.f46255b, dVar.f46255b);
        }

        public final int hashCode() {
            return Objects.hash(this.f46254a, this.f46255b);
        }
    }

    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static abstract class e {
        public final void a(final int i10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: r0.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46256b.b(i10);
                }
            });
        }

        public abstract void b(int i10);

        public abstract void c(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    public static Typeface b(Context context, int i10, TypedValue typedValue, int i11, e eVar, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            C0893v<String, Typeface> c0893v = p222s0.e.f46859b;
            Typeface typefaceC = c0893v.c(p222s0.e.b(resources, i10, string, i12, i11));
            if (typefaceC != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new h(eVar, 1, typefaceC));
                }
            } else if (!z11) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        r0.e.b bVarA = p211r0.e.a(resources.getXml(i10), resources);
                        if (bVarA == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (eVar != null) {
                                eVar.a(-3);
                            }
                        } else {
                            typefaceA = p222s0.e.a(context, bVarA, resources, i10, string, typedValue.assetCookie, i11, eVar, z10);
                        }
                    } else {
                        int i13 = typedValue.assetCookie;
                        typefaceC = p222s0.e.f46858a.c(context, resources, i10, string, i11);
                        if (typefaceC != null) {
                            c0893v.d(p222s0.e.b(resources, i10, string, i13, i11), typefaceC);
                        }
                        if (eVar != null) {
                            if (typefaceC != null) {
                                new Handler(Looper.getMainLooper()).post(new h(eVar, 1, typefaceC));
                            } else {
                                eVar.a(-3);
                            }
                        }
                    }
                } catch (IOException e10) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e10);
                    if (eVar != null) {
                        eVar.a(-3);
                    }
                } catch (XmlPullParserException e11) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e11);
                    if (eVar != null) {
                        eVar.a(-3);
                    }
                }
            }
            typefaceA = typefaceC;
        } else if (eVar != null) {
            eVar.a(-3);
        }
        if (typefaceA != null || eVar != null || z11) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }
}
