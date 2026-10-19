package coil.fetch;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.D;
import coil.decode.DataSource;

/* JADX INFO: compiled from: FetchResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f22983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSource f22985c;

    public f(Drawable drawable, boolean z10, DataSource dataSource) {
        this.f22983a = drawable;
        this.f22984b = z10;
        this.f22985c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (kotlin.jvm.internal.i.a(this.f22983a, fVar.f22983a) && this.f22984b == fVar.f22984b && this.f22985c == fVar.f22985c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22985c.hashCode() + D.b(this.f22983a.hashCode() * 31, 31, this.f22984b);
    }
}
