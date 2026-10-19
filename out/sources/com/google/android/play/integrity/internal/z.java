package com.google.android.play.integrity.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p191p5.h f27765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p019b6.n f27766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f27767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d dVar, p191p5.h hVar, p191p5.h hVar2, p019b6.n nVar) {
        super(hVar);
        this.f27765c = hVar2;
        this.f27766d = nVar;
        Objects.requireNonNull(dVar);
        this.f27767e = dVar;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void b() {
        final d dVar = this.f27767e;
        synchronized (dVar.f27740f) {
            try {
                final p191p5.h hVar = this.f27765c;
                dVar.f27739e.add(hVar);
                hVar.f45811a.c(new p191p5.c() { // from class: com.google.android.play.integrity.internal.y
                    @Override // p191p5.c
                    public final void e(p191p5.g gVar) {
                        d dVar2 = dVar;
                        p191p5.h hVar2 = hVar;
                        synchronized (dVar2.f27740f) {
                            dVar2.f27739e.remove(hVar2);
                        }
                    }
                });
                if (dVar.f27744k.getAndIncrement() > 0) {
                    dVar.f27736b.b("Already connected to the service.", new Object[0]);
                }
                d.b(dVar, this.f27766d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
