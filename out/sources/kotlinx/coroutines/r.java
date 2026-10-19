package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2689g f43526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<Throwable, p293xa.r> f43527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f43528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f43529e;

    /* JADX WARN: Multi-variable type inference failed */
    public r(Object obj, InterfaceC2689g interfaceC2689g, Ia.l<? super Throwable, p293xa.r> lVar, Object obj2, Throwable th) {
        this.f43525a = obj;
        this.f43526b = interfaceC2689g;
        this.f43527c = lVar;
        this.f43528d = obj2;
        this.f43529e = th;
    }

    public static r a(r rVar, InterfaceC2689g interfaceC2689g, CancellationException cancellationException, int i10) {
        Object obj = rVar.f43525a;
        if ((i10 & 2) != 0) {
            interfaceC2689g = rVar.f43526b;
        }
        InterfaceC2689g interfaceC2689g2 = interfaceC2689g;
        Ia.l<Throwable, p293xa.r> lVar = rVar.f43527c;
        Object obj2 = rVar.f43528d;
        Throwable th = cancellationException;
        if ((i10 & 16) != 0) {
            th = rVar.f43529e;
        }
        rVar.getClass();
        return new r(obj, interfaceC2689g2, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.i.a(this.f43525a, rVar.f43525a) && kotlin.jvm.internal.i.a(this.f43526b, rVar.f43526b) && kotlin.jvm.internal.i.a(this.f43527c, rVar.f43527c) && kotlin.jvm.internal.i.a(this.f43528d, rVar.f43528d) && kotlin.jvm.internal.i.a(this.f43529e, rVar.f43529e);
    }

    public final int hashCode() {
        Object obj = this.f43525a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC2689g interfaceC2689g = this.f43526b;
        int iHashCode2 = (iHashCode + (interfaceC2689g == null ? 0 : interfaceC2689g.hashCode())) * 31;
        Ia.l<Throwable, p293xa.r> lVar = this.f43527c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f43528d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f43529e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f43525a + ", cancelHandler=" + this.f43526b + ", onCancellation=" + this.f43527c + ", idempotentResume=" + this.f43528d + ", cancelCause=" + this.f43529e + ')';
    }

    public /* synthetic */ r(Object obj, InterfaceC2689g interfaceC2689g, Ia.l lVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC2689g, (Ia.l<? super Throwable, p293xa.r>) ((i10 & 4) != 0 ? null : lVar), (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
