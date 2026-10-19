package C4;

import java.util.Set;

/* JADX INFO: compiled from: TransportFactoryImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class u implements p311z4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<p311z4.c> f2397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f2399c;

    public u(Set set, l lVar, x xVar) {
        this.f2397a = set;
        this.f2398b = lVar;
        this.f2399c = xVar;
    }

    @Override // p311z4.h
    public final w a(v vVar) {
        return b("FIREBASE_INAPPMESSAGING", new p311z4.c("proto"), vVar);
    }

    @Override // p311z4.h
    public final w b(String str, p311z4.c cVar, p311z4.f fVar) {
        Set<p311z4.c> set = this.f2397a;
        if (set.contains(cVar)) {
            return new w(this.f2398b, str, cVar, fVar, this.f2399c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
