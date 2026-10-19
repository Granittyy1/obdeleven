package p164n3;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import p104i3.b;
import p154m3.e;
import p154m3.k;

/* JADX INFO: compiled from: CircleShape.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k<PointF, PointF> f44825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f44826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44828e;

    public a(String str, k<PointF, PointF> kVar, e eVar, boolean z10, boolean z11) {
        this.f44824a = str;
        this.f44825b = kVar;
        this.f44826c = eVar;
        this.f44827d = z10;
        this.f44828e = z11;
    }

    @Override // p164n3.b
    public final b a(LottieDrawable lottieDrawable, p079g3.b bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new p104i3.e(lottieDrawable, aVar, this);
    }
}
