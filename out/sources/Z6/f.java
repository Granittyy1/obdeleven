package Z6;

import android.util.DisplayMetrics;

/* JADX INFO: compiled from: InflaterConfigModule_ProvidesBannerLandscapeLayoutConfigFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f7931b;

    public f(e eVar, j jVar) {
        this.f7930a = eVar;
        this.f7931b = jVar;
    }

    @Override // p268va.a
    public final Object get() {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.f7931b.get();
        this.f7930a.getClass();
        W6.n nVar = new W6.n();
        nVar.f7026a = Float.valueOf(0.3f);
        nVar.f7027b = Float.valueOf(0.3f);
        nVar.f7028c = Integer.valueOf((int) (displayMetrics.heightPixels * 0.5f));
        nVar.f7029d = Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f));
        nVar.f7031f = 48;
        nVar.f7030e = 65824;
        nVar.f7032g = -1;
        nVar.f7033h = -2;
        Boolean bool = Boolean.TRUE;
        nVar.f7034i = bool;
        nVar.j = bool;
        nVar.f7035k = bool;
        return nVar;
    }
}
