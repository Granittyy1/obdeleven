package p164n3;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import p104i3.m;
import p154m3.b;
import p154m3.k;

/* JADX INFO: compiled from: RectangleShape.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k<PointF, PointF> f44840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p154m3.e f44841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f44842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44843e;

    public e(String str, k kVar, p154m3.e eVar, b bVar, boolean z10) {
        this.f44839a = str;
        this.f44840b = kVar;
        this.f44841c = eVar;
        this.f44842d = bVar;
        this.f44843e = z10;
    }

    @Override // p164n3.b
    public final p104i3.b a(LottieDrawable lottieDrawable, p079g3.b bVar, a aVar) {
        return new m(lottieDrawable, aVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f44840b + ", size=" + this.f44841c + '}';
    }
}
