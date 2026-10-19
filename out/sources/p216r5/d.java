package p216r5;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: DrawableAlphaProperty.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f46348a;

    static {
        d dVar = new d(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
        f46348a = dVar;
    }

    @Override // android.util.Property
    public final Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
