package p164n3;

import Z3.o;
import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import p104i3.b;
import p104i3.f;
import p154m3.a;
import p154m3.d;

/* JADX INFO: compiled from: ShapeFill.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f44854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f44856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f44857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44858f;

    public i(String str, boolean z10, Path.FillType fillType, a aVar, d dVar, boolean z11) {
        this.f44855c = str;
        this.f44853a = z10;
        this.f44854b = fillType;
        this.f44856d = aVar;
        this.f44857e = dVar;
        this.f44858f = z11;
    }

    @Override // p164n3.b
    public final b a(LottieDrawable lottieDrawable, p079g3.b bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new f(lottieDrawable, aVar, this);
    }

    public final String toString() {
        return o.d(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f44853a, '}');
    }
}
