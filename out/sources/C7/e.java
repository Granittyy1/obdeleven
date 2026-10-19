package C7;

import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p191p5.g f2428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p191p5.g f2429d;

    public /* synthetic */ e(i iVar, p191p5.g gVar, p191p5.g gVar2) {
        this.f2427b = iVar;
        this.f2428c = gVar;
        this.f2429d = gVar2;
    }

    @Override // p191p5.InterfaceC2755a
    public final Object i(p191p5.g gVar) {
        com.google.firebase.remoteconfig.internal.b bVar;
        i iVar = this.f2427b;
        iVar.getClass();
        p191p5.g gVar2 = this.f2428c;
        if (!gVar2.o() || gVar2.k() == null) {
            return p191p5.j.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar2 = (com.google.firebase.remoteconfig.internal.b) gVar2.k();
        p191p5.g gVar3 = this.f2429d;
        return (gVar3.o() && (bVar = (com.google.firebase.remoteconfig.internal.b) gVar3.k()) != null && bVar2.f28587c.equals(bVar.f28587c)) ? p191p5.j.e(Boolean.FALSE) : iVar.f2437e.d(bVar2).g(iVar.f2435c, new h(iVar));
    }
}
