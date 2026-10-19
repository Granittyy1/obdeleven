package Z2;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: DisplaySizeResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7727b;

    public b(Context context) {
        this.f7727b = context;
    }

    @Override // Z2.f
    public final Object e(kotlin.coroutines.c<? super e> cVar) {
        DisplayMetrics displayMetrics = this.f7727b.getResources().getDisplayMetrics();
        a.C0110a c0110a = new a.C0110a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new e(c0110a, c0110a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            if (kotlin.jvm.internal.i.a(this.f7727b, ((b) obj).f7727b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7727b.hashCode();
    }
}
