package Z6;

import android.util.DisplayMetrics;

/* JADX INFO: compiled from: InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f7947b;

    public n(e eVar, j jVar) {
        this.f7946a = eVar;
        this.f7947b = jVar;
    }

    @Override // p268va.a
    public final Object get() {
        DisplayMetrics displayMetrics = (DisplayMetrics) this.f7947b.get();
        this.f7946a.getClass();
        W6.n nVar = new W6.n();
        nVar.f7028c = Integer.valueOf((int) (displayMetrics.heightPixels * 0.9f));
        nVar.f7029d = Integer.valueOf((int) (displayMetrics.widthPixels * 0.9f));
        nVar.f7027b = Float.valueOf(0.8f);
        nVar.f7026a = Float.valueOf(0.8f);
        nVar.f7031f = 17;
        nVar.f7030e = 327938;
        nVar.f7032g = -2;
        nVar.f7033h = -2;
        Boolean bool = Boolean.FALSE;
        nVar.f7034i = bool;
        nVar.j = bool;
        nVar.f7035k = bool;
        return nVar;
    }
}
