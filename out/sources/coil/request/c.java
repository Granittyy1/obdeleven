package coil.request;

import coil.size.Precision;
import coil.size.Scale;

/* JADX INFO: compiled from: DefinedRequestOptions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z2.f f23027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scale f23028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sa.a f23029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sa.a f23030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Sa.a f23031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c3.c.a f23032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Precision f23033g;

    public c(Z2.f fVar, Scale scale, Sa.a aVar, Sa.a aVar2, Sa.a aVar3, c3.c.a aVar4, Precision precision) {
        this.f23027a = fVar;
        this.f23028b = scale;
        this.f23029c = aVar;
        this.f23030d = aVar2;
        this.f23031e = aVar3;
        this.f23032f = aVar4;
        this.f23033g = precision;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            if (kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f23027a, cVar.f23027a) && this.f23028b == cVar.f23028b && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f23029c, cVar.f23029c) && kotlin.jvm.internal.i.a(this.f23030d, cVar.f23030d) && kotlin.jvm.internal.i.a(this.f23031e, cVar.f23031e) && kotlin.jvm.internal.i.a(this.f23032f, cVar.f23032f) && this.f23033g == cVar.f23033g && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Z2.f fVar = this.f23027a;
        int iHashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        Scale scale = this.f23028b;
        int iHashCode2 = (iHashCode + (scale != null ? scale.hashCode() : 0)) * 961;
        Sa.a aVar = this.f23029c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Sa.a aVar2 = this.f23030d;
        int iHashCode4 = (iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        Sa.a aVar3 = this.f23031e;
        int iHashCode5 = (iHashCode4 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        c3.c.a aVar4 = this.f23032f;
        int iHashCode6 = (iHashCode5 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        Precision precision = this.f23033g;
        return (iHashCode6 + (precision != null ? precision.hashCode() : 0)) * 887503681;
    }
}
