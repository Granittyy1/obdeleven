package D9;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: CompressorRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f2880b = new g(new e.a(), e.b.f2879a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f2881a = new ConcurrentHashMap();

    public g(f... fVarArr) {
        for (f fVar : fVarArr) {
            this.f2881a.put(fVar.a(), fVar);
        }
    }
}
