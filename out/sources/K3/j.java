package K3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: DrawableTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements A3.g<Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3.g<Bitmap> f4255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4256c;

    public j(A3.g<Bitmap> gVar, boolean z10) {
        this.f4255b = gVar;
        this.f4256c = z10;
    }

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        this.f4255b.a(messageDigest);
    }

    @Override // A3.g
    public final D3.o<Drawable> b(Context context, D3.o<Drawable> oVar, int i10, int i11) {
        E3.c cVar = com.bumptech.glide.b.b(context).f24470b;
        Drawable drawable = oVar.get();
        d dVarA = i.a(cVar, drawable, i10, i11);
        if (dVarA != null) {
            D3.o<Bitmap> oVarB = this.f4255b.b(context, dVarA, i10, i11);
            if (!oVarB.equals(dVarA)) {
                return new n(context.getResources(), oVarB);
            }
            oVarB.a();
            return oVar;
        }
        if (!this.f4256c) {
            return oVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f4255b.equals(((j) obj).f4255b);
        }
        return false;
    }

    @Override // A3.b
    public final int hashCode() {
        return this.f4255b.hashCode();
    }
}
