package O3;

import D3.o;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.M1;
import java.security.MessageDigest;

/* JADX INFO: compiled from: GifDrawableTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements A3.g<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3.g<Bitmap> f4817b;

    public f(A3.g<Bitmap> gVar) {
        M1.d(gVar, "Argument must not be null");
        this.f4817b = gVar;
    }

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        this.f4817b.a(messageDigest);
    }

    @Override // A3.g
    public final o<c> b(Context context, o<c> oVar, int i10, int i11) {
        c cVar = oVar.get();
        o<Bitmap> dVar = new K3.d(com.bumptech.glide.b.b(context).f24470b, cVar.f4804b.f4813a.f4828l);
        A3.g<Bitmap> gVar = this.f4817b;
        o<Bitmap> oVarB = gVar.b(context, dVar, i10, i11);
        if (!dVar.equals(oVarB)) {
            dVar.a();
        }
        cVar.f4804b.f4813a.c(gVar, oVarB.get());
        return oVar;
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f4817b.equals(((f) obj).f4817b);
        }
        return false;
    }

    @Override // A3.b
    public final int hashCode() {
        return this.f4817b.hashCode();
    }
}
