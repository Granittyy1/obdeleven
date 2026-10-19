package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: CascadingMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.d f8439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f8440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f8441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.c f8442e;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f8442e = cVar;
        this.f8439b = dVar;
        this.f8440c = hVar;
        this.f8441d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.f8439b;
        if (dVar != null) {
            b.c cVar = this.f8442e;
            b.this.f8409A = true;
            dVar.f8437b.c(false);
            b.this.f8409A = false;
        }
        h hVar = this.f8440c;
        if (hVar.isEnabled() && hVar.hasSubMenu()) {
            this.f8441d.q(hVar, null, 4);
        }
    }
}
