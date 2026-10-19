package androidx.media3.exoplayer;

import p033c7.C1494g;
import p191p5.InterfaceC2755a;

/* JADX INFO: renamed from: androidx.media3.exoplayer.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1401t implements j1.j.a, p183oa.b, InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18804b;

    public /* synthetic */ C1401t(Object obj) {
        this.f18804b = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        ((C1494g) this.f18804b).f22450d = (N7.e) obj;
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        boolean zO = gVar.o();
        p191p5.h hVar = (p191p5.h) this.f18804b;
        if (zO) {
            hVar.b(gVar.k());
            return null;
        }
        if (gVar.j() == null) {
            return null;
        }
        hVar.a(gVar.j());
        return null;
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((g1.v.c) obj).m((p078g1.r) this.f18804b);
    }
}
