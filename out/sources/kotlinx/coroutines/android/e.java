package kotlinx.coroutines.android;

import Na.l;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.text.font.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.P;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.t0;
import p293xa.r;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f43228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f43231f;

    public e(Handler handler, String str, boolean z10) {
        this.f43228c = handler;
        this.f43229d = str;
        this.f43230e = z10;
        this.f43231f = z10 ? this : new e(handler, str, true);
    }

    @Override // kotlinx.coroutines.H
    public final void N(long j, C2693i c2693i) {
        final d dVar = new d(c2693i, this);
        if (this.f43228c.postDelayed(dVar, l.A(j, 4611686018427387903L))) {
            c2693i.u(new Ia.l<Throwable, r>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Throwable th) {
                    this.this$0.f43228c.removeCallbacks(dVar);
                    return r.f47939a;
                }
            });
        } else {
            e1(c2693i.f43448f, dVar);
        }
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        if (this.f43228c.post(runnable)) {
            return;
        }
        e1(eVar, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final boolean b1(kotlin.coroutines.e eVar) {
        return (this.f43230e && i.a(Looper.myLooper(), this.f43228c.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.q0
    public final q0 d1() {
        return this.f43231f;
    }

    public final void e1(kotlin.coroutines.e eVar, Runnable runnable) {
        C2702l0.b(eVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        N.f43200c.Z0(eVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f43228c == this.f43228c && eVar.f43230e == this.f43230e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f43228c) ^ (this.f43230e ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.android.f, kotlinx.coroutines.H
    public final P m0(long j, final Runnable runnable, kotlin.coroutines.e eVar) {
        if (this.f43228c.postDelayed(runnable, l.A(j, 4611686018427387903L))) {
            return new P() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.P
                public final void dispose() {
                    this.f43224b.f43228c.removeCallbacks(runnable);
                }
            };
        }
        e1(eVar, runnable);
        return t0.f43613b;
    }

    @Override // kotlinx.coroutines.q0, kotlinx.coroutines.AbstractC2712w
    public final String toString() {
        q0 q0VarD1;
        String str;
        Sa.b bVar = N.f43198a;
        q0 q0Var = q.f43500a;
        if (this == q0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                q0VarD1 = q0Var.d1();
            } catch (UnsupportedOperationException unused) {
                q0VarD1 = null;
            }
            str = this == q0VarD1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f43229d;
        if (string == null) {
            string = this.f43228c.toString();
        }
        return this.f43230e ? s.b(string, ".immediate") : string;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
