package Z6;

import android.util.DisplayMetrics;

/* JADX INFO: compiled from: InflaterConfigModule_ProvidesModalLandscapeConfigFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f7943b;

    public l(e eVar, j jVar) {
        this.f7942a = eVar;
        this.f7943b = jVar;
    }

    @Override // p268va.a
    public final Object get() {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.f7943b.get();
        this.f7942a.getClass();
        W6.n nVar = new W6.n();
        nVar.f7028c = Integer.valueOf((int) (((double) displayMetrics.heightPixels) * 0.8d));
        nVar.f7029d = Integer.valueOf(displayMetrics.widthPixels);
        nVar.f7026a = Float.valueOf(1.0f);
        nVar.f7027b = Float.valueOf(0.4f);
        nVar.f7031f = 17;
        nVar.f7030e = 327938;
        nVar.f7032g = -1;
        nVar.f7033h = -1;
        Boolean bool = Boolean.FALSE;
        nVar.f7034i = bool;
        nVar.j = bool;
        nVar.f7035k = bool;
        return nVar;
    }
}
