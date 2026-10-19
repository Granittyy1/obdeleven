package coil.util;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends E2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ia.a<p293xa.r> f23155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.a<p293xa.r> f23156c;

    public e(Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2) {
        this.f23155b = aVar;
        this.f23156c = aVar2;
    }

    @Override // E2.c
    public final void a(Drawable drawable) {
        Ia.a<p293xa.r> aVar = this.f23156c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // E2.c
    public final void b(Drawable drawable) {
        Ia.a<p293xa.r> aVar = this.f23155b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
