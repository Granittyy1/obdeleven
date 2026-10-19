package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.InterfaceC1198t;
import kotlin.Pair;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DraggableAnchorsNode<T> extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i<T> f12489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Ia.p<? super p013b0.l, ? super p013b0.a, ? extends Pair<? extends q<T>, ? extends T>> f12490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Orientation f12491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12492s;

    public DraggableAnchorsNode() {
        throw null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final F B(final H h8, D d10, long j) {
        final Y yQ = d10.Q(j);
        if (!h8.S0() || !this.f12492s) {
            Pair<? extends q<T>, ? extends T> pairInvoke = this.f12490q.invoke(new p013b0.l(A8.A.a(yQ.f14220b, yQ.f14221c)), new p013b0.a(j));
            final i<T> iVar = this.f12489p;
            q<T> qVarC = pairInvoke.c();
            final T tD = pairInvoke.d();
            if (!kotlin.jvm.internal.i.a(iVar.e(), qVarC)) {
                iVar.f12540m.setValue(qVarC);
                Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$trySnapTo$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        i<Object> iVar2 = iVar;
                        g gVar = iVar2.f12541n;
                        Object obj = tD;
                        float fD = iVar2.e().d(obj);
                        if (!Float.isNaN(fD)) {
                            gVar.a(fD, 0.0f);
                            iVar2.i(null);
                        }
                        iVar2.h(obj);
                        return p293xa.r.f47939a;
                    }
                };
                MutexImpl mutexImpl = iVar.f12533e.f12576b;
                boolean zD = mutexImpl.d(null);
                if (zD) {
                    try {
                        aVar.invoke();
                        mutexImpl.g(null);
                    } catch (Throwable th) {
                        mutexImpl.g(null);
                        throw th;
                    }
                }
                if (!zD) {
                    iVar.i(tD);
                }
            }
        }
        this.f12492s = h8.S0() || this.f12492s;
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material3.internal.DraggableAnchorsNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar2) {
                Y.a aVar3 = aVar2;
                float fD = h8.S0() ? this.f12489p.e().d(this.f12489p.f12536h.getValue()) : this.f12489p.g();
                Orientation orientation = this.f12491r;
                float f10 = orientation == Orientation.f9958c ? fD : 0.0f;
                if (orientation != Orientation.f9957b) {
                    fD = 0.0f;
                }
                aVar3.d(yQ, Ka.a.b(f10), Ka.a.b(fD), 0.0f);
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        this.f12492s = false;
    }
}
