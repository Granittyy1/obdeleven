package M3;

import D3.k;
import D3.o;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.measurement.M1;

/* JADX INFO: compiled from: DrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends Drawable> implements o<T>, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f4562b;

    public b(T t8) {
        M1.d(t8, "Argument must not be null");
        this.f4562b = t8;
    }

    @Override // D3.k
    public void b() {
        T t8 = this.f4562b;
        if (t8 instanceof BitmapDrawable) {
            ((BitmapDrawable) t8).getBitmap().prepareToDraw();
        } else if (t8 instanceof O3.c) {
            ((O3.c) t8).f4804b.f4813a.f4828l.prepareToDraw();
        }
    }

    @Override // D3.o
    public final Object get() {
        T t8 = this.f4562b;
        Drawable.ConstantState constantState = t8.getConstantState();
        return constantState == null ? t8 : constantState.newDrawable();
    }
}
