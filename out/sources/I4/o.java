package I4;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Uploader.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D4.d f3872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J4.d f3873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f3874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f3875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K4.a f3876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L4.a f3877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L4.a f3878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J4.c f3879i;

    public o(Context context, D4.d dVar, J4.d dVar2, u uVar, Executor executor, K4.a aVar, L4.a aVar2, L4.a aVar3, J4.c cVar) {
        this.f3871a = context;
        this.f3872b = dVar;
        this.f3873c = dVar2;
        this.f3874d = uVar;
        this.f3875e = executor;
        this.f3876f = aVar;
        this.f3877g = aVar2;
        this.f3878h = aVar3;
        this.f3879i = cVar;
    }

    public final void a(final C4.l lVar, int i10) {
        com.google.android.datatransport.runtime.backends.a aVarA;
        D4.k kVar = this.f3872b.get(lVar.f2380a);
        BackendResponse.Status status = BackendResponse.Status.f25256b;
        new com.google.android.datatransport.runtime.backends.a(status, 0L);
        final long j = 0;
        while (true) {
            K4.a.InterfaceC0060a interfaceC0060a = new K4.a.InterfaceC0060a() { // from class: I4.h
                @Override // K4.a.InterfaceC0060a
                public final Object k() {
                    return Boolean.valueOf(this.f3855b.f3873c.u0(lVar));
                }
            };
            K4.a aVar = this.f3876f;
            if (!((Boolean) aVar.b(interfaceC0060a)).booleanValue()) {
                aVar.b(new K4.a.InterfaceC0060a() { // from class: I4.n
                    @Override // K4.a.InterfaceC0060a
                    public final Object k() {
                        o oVar = this.f3868b;
                        oVar.f3873c.h0(oVar.f3877g.b() + j, lVar);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) aVar.b(new i(this, lVar));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (kVar == null) {
                G4.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", lVar);
                aVarA = new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.f25258d, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((J4.h) it.next()).a());
                }
                if (lVar.b() != null) {
                    J4.c cVar = this.f3879i;
                    Objects.requireNonNull(cVar);
                    F4.a aVar2 = (F4.a) aVar.b(new e(cVar));
                    C4.j.a aVar3 = new C4.j.a();
                    aVar3.f2374f = new HashMap();
                    aVar3.f2372d = Long.valueOf(this.f3877g.b());
                    aVar3.f2373e = Long.valueOf(this.f3878h.b());
                    aVar3.f2369a = "GDT_CLIENT_METRICS";
                    p311z4.c cVar2 = new p311z4.c("proto");
                    aVar2.getClass();
                    O6.e eVar = C4.q.f2394a;
                    eVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eVar.a(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar3.f2371c = new C4.n(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(kVar.b(aVar3.b()));
                }
                aVarA = kVar.a(new D4.a(arrayList, lVar.f2381b));
            }
            BackendResponse.Status status2 = BackendResponse.Status.f25257c;
            BackendResponse.Status status3 = aVarA.f25261a;
            if (status3 == status2) {
                aVar.b(new K4.a.InterfaceC0060a() { // from class: I4.j
                    @Override // K4.a.InterfaceC0060a
                    public final Object k() {
                        o oVar = this.f3859b;
                        J4.d dVar = oVar.f3873c;
                        dVar.L0(iterable);
                        dVar.h0(oVar.f3877g.b() + j, lVar);
                        return null;
                    }
                });
                this.f3874d.b(lVar, i10 + 1, true);
                return;
            }
            aVar.b(new K4.a.InterfaceC0060a() { // from class: I4.k
                @Override // K4.a.InterfaceC0060a
                public final Object k() {
                    this.f3863b.f3873c.m(iterable);
                    return null;
                }
            });
            if (status3 == status) {
                long jMax = Math.max(j, aVarA.f25262b);
                if (lVar.b() != null) {
                    aVar.b(new l(this));
                }
                j = jMax;
            } else if (status3 == BackendResponse.Status.f25259e) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strG = ((J4.h) it2.next()).a().g();
                    if (map.containsKey(strG)) {
                        map.put(strG, Integer.valueOf(((Integer) map.get(strG)).intValue() + 1));
                    } else {
                        map.put(strG, 1);
                    }
                }
                aVar.b(new m(this, map));
            }
        }
    }
}
