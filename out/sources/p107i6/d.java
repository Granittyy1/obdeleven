package p107i6;

import A8.p;
import C.g;
import com.google.android.gms.measurement.internal.e;
import java.util.concurrent.ExecutionException;
import p131k5.T1;
import p131k5.j3;

/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends g {

    /* JADX INFO: compiled from: Futures.java */
    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f36750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T1 f36751c;

        public a(f fVar, T1 t8) {
            this.f36750b = fVar;
            this.f36751c = t8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            f fVar = this.f36750b;
            boolean z10 = fVar instanceof p119j6.a;
            T1 t8 = this.f36751c;
            if (z10) {
                ((p119j6.a) fVar).getClass();
            }
            try {
                d.i0(fVar);
                e eVar = (e) t8.f41994b;
                eVar.p();
                eVar.f26577i = false;
                eVar.S();
                eVar.d().f41718m.b(((j3) t8.f41993a).f42256b, "registerTriggerAsync ran. uri");
            } catch (ExecutionException e10) {
                t8.a(e10.getCause());
            } catch (Throwable th) {
                t8.a(th);
            }
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            com.google.common.base.d.a.b bVar = new com.google.common.base.d.a.b();
            aVarB.f27794c.f27798c = bVar;
            aVarB.f27794c = bVar;
            bVar.f27797b = this.f36751c;
            return aVarB.toString();
        }
    }

    public static Object i0(f fVar) throws ExecutionException {
        V v10;
        p.o(fVar, "Future was expected to be done: %s", fVar.isDone());
        boolean z10 = false;
        while (true) {
            try {
                v10 = fVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }
}
