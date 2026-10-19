package p277w7;

import O.a;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.h;
import java.io.EOFException;
import java.io.IOException;
import okhttp3.InterfaceC2754e;
import okhttp3.f;
import okhttp3.p;
import okhttp3.u;
import okhttp3.z;
import p253u7.c;

/* JADX INFO: compiled from: InstrumentOkHttpEnqueueCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f47788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f47789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f47790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47791e;

    public g(f fVar, p314z7.f fVar2, h hVar, long j) {
        this.f47788b = fVar;
        this.f47789c = new c(fVar2);
        this.f47791e = j;
        this.f47790d = hVar;
    }

    @Override // okhttp3.f
    public final void onFailure(InterfaceC2754e interfaceC2754e, IOException iOException) throws EOFException {
        u uVarRequest = interfaceC2754e.request();
        c cVar = this.f47789c;
        if (uVarRequest != null) {
            p pVar = uVarRequest.f45661a;
            if (pVar != null) {
                cVar.l(pVar.j().toString());
            }
            String str = uVarRequest.f45662b;
            if (str != null) {
                cVar.d(str);
            }
        }
        cVar.h(this.f47791e);
        a.h(this.f47790d, cVar, cVar);
        this.f47788b.onFailure(interfaceC2754e, iOException);
    }

    @Override // okhttp3.f
    public final void onResponse(InterfaceC2754e interfaceC2754e, z zVar) throws IOException {
        FirebasePerfOkHttpClient.a(zVar, this.f47789c, this.f47791e, this.f47790d.a());
        this.f47788b.onResponse(interfaceC2754e, zVar);
    }
}
