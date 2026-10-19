package p164n3;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import p104i3.n;
import p154m3.b;
import p154m3.j;

/* JADX INFO: compiled from: Repeater.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f44845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f44846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f44847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44848e;

    public f(String str, b bVar, b bVar2, j jVar, boolean z10) {
        this.f44844a = str;
        this.f44845b = bVar;
        this.f44846c = bVar2;
        this.f44847d = jVar;
        this.f44848e = z10;
    }

    @Override // p164n3.b
    public final p104i3.b a(LottieDrawable lottieDrawable, p079g3.b bVar, a aVar) {
        return new n(lottieDrawable, aVar, this);
    }
}
