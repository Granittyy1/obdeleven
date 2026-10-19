package com.google.android.play.integrity.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2034b extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f27732c;

    public C2034b(c cVar) {
        Objects.requireNonNull(cVar);
        this.f27732c = cVar;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void b() {
        d dVar = this.f27732c.f27733b;
        dVar.f27736b.b("unlinkToDeath", new Object[0]);
        dVar.f27746m.asBinder().unlinkToDeath(dVar.j, 0);
        dVar.f27746m = null;
        dVar.f27741g = false;
    }
}
