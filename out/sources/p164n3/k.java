package p164n3;

import A1.C0575j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import p104i3.b;
import p104i3.p;
import p154m3.g;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f44864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44865d;

    public k(String str, int i10, g gVar, boolean z10) {
        this.f44862a = str;
        this.f44863b = i10;
        this.f44864c = gVar;
        this.f44865d = z10;
    }

    @Override // p164n3.b
    public final b a(LottieDrawable lottieDrawable, p079g3.b bVar, a aVar) {
        return new p(lottieDrawable, aVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f44862a);
        sb2.append(", index=");
        return C0575j.b(sb2, this.f44863b, '}');
    }
}
