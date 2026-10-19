package p137kb;

import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2693i;
import retrofit2.d;
import retrofit2.f;
import retrofit2.v;

/* JADX INFO: compiled from: CentralDirectory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f42919a;

    @Override // retrofit2.f
    public void onFailure(d call, Throwable th) {
        i.e(call, "call");
        ((C2693i) this.f42919a).resumeWith(kotlin.b.a(th));
    }

    @Override // retrofit2.f
    public void onResponse(d call, v vVar) {
        i.e(call, "call");
        ((C2693i) this.f42919a).resumeWith(vVar);
    }
}
