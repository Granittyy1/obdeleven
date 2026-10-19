package p235t1;

import p078g1.p;
import p078g1.x;

/* JADX INFO: compiled from: TimelineWithUpdatedMediaItem.java */
/* JADX INFO: loaded from: classes.dex */
public final class v extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f47100c;

    public v(x xVar, p pVar) {
        super(xVar);
        this.f47100c = pVar;
    }

    @Override // p235t1.h, p078g1.x
    public final x.c m(int i10, x.c cVar, long j) {
        super.m(i10, cVar, j);
        p pVar = this.f47100c;
        cVar.f35479c = pVar;
        p.f fVar = pVar.f35356b;
        cVar.f35478b = fVar != null ? fVar.f35388e : null;
        return cVar;
    }
}
