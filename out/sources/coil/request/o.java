package coil.request;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.D;
import coil.decode.DataSource;

/* JADX INFO: compiled from: ImageResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f23120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f23121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSource f23122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X2.b.a f23123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23126g;

    public o(Drawable drawable, g gVar, DataSource dataSource, X2.b.a aVar, String str, boolean z10, boolean z11) {
        this.f23120a = drawable;
        this.f23121b = gVar;
        this.f23122c = dataSource;
        this.f23123d = aVar;
        this.f23124e = str;
        this.f23125f = z10;
        this.f23126g = z11;
    }

    @Override // coil.request.h
    public final Drawable a() {
        return this.f23120a;
    }

    @Override // coil.request.h
    public final g b() {
        return this.f23121b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (kotlin.jvm.internal.i.a(this.f23120a, oVar.f23120a)) {
                if (kotlin.jvm.internal.i.a(this.f23121b, oVar.f23121b) && this.f23122c == oVar.f23122c && kotlin.jvm.internal.i.a(this.f23123d, oVar.f23123d) && kotlin.jvm.internal.i.a(this.f23124e, oVar.f23124e) && this.f23125f == oVar.f23125f && this.f23126g == oVar.f23126g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f23122c.hashCode() + ((this.f23121b.hashCode() + (this.f23120a.hashCode() * 31)) * 31)) * 31;
        X2.b.a aVar = this.f23123d;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f23124e;
        return Boolean.hashCode(this.f23126g) + D.b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f23125f);
    }
}
