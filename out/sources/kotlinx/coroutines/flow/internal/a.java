package kotlinx.coroutines.flow.internal;

import com.braze.support.BrazeLogger;
import java.util.Arrays;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.c;
import p293xa.r;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<S extends c<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S[] f43388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f43391e;

    public final S c() {
        S s10;
        q qVar;
        synchronized (this) {
            try {
                S[] sArr = this.f43388b;
                if (sArr == null) {
                    sArr = (S[]) i();
                    this.f43388b = sArr;
                } else if (this.f43389c >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
                    this.f43388b = (S[]) ((c[]) objArrCopyOf);
                    sArr = (S[]) ((c[]) objArrCopyOf);
                }
                int i10 = this.f43390d;
                do {
                    s10 = sArr[i10];
                    if (s10 == null) {
                        s10 = (S) g();
                        sArr[i10] = s10;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                } while (!s10.a(this));
                this.f43390d = i10;
                this.f43389c++;
                qVar = this.f43391e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qVar != null) {
            qVar.x(1);
        }
        return s10;
    }

    public abstract S g();

    public final q h() {
        q qVar;
        synchronized (this) {
            qVar = this.f43391e;
            if (qVar == null) {
                int i10 = this.f43389c;
                qVar = new q(1, BrazeLogger.SUPPRESS, BufferOverflow.f43244c);
                qVar.f(Integer.valueOf(i10));
                this.f43391e = qVar;
            }
        }
        return qVar;
    }

    public abstract c[] i();

    public final void j(S s10) {
        q qVar;
        int i10;
        kotlin.coroutines.c[] cVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f43389c - 1;
                this.f43389c = i11;
                qVar = this.f43391e;
                if (i11 == 0) {
                    this.f43390d = 0;
                }
                kotlin.jvm.internal.i.c(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = s10.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(r.f47939a);
            }
        }
        if (qVar != null) {
            qVar.x(-1);
        }
    }
}
