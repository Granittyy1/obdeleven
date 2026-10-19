package coil.decode;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: DecodeResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f22873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22874b;

    public c(Drawable drawable, boolean z10) {
        this.f22873a = drawable;
        this.f22874b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (kotlin.jvm.internal.i.a(this.f22873a, cVar.f22873a) && this.f22874b == cVar.f22874b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22874b) + (this.f22873a.hashCode() * 31);
    }
}
