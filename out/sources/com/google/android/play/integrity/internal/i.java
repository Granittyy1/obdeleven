package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f27751d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile j f27752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f27753c;

    /* JADX WARN: Multi-variable type inference failed */
    public static i b(j jVar) {
        if (jVar instanceof i) {
            return (i) jVar;
        }
        i iVar = new i();
        iVar.f27753c = f27751d;
        iVar.f27752b = jVar;
        return iVar;
    }

    @Override // com.google.android.play.integrity.internal.m
    public final Object a() {
        Object objA;
        Object obj = this.f27753c;
        Object obj2 = f27751d;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f27753c;
                if (objA == obj2) {
                    objA = this.f27752b.a();
                    Object obj3 = this.f27753c;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f27753c = objA;
                    this.f27752b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
