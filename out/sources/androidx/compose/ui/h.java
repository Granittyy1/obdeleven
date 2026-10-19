package androidx.compose.ui;

import Ia.l;
import Ia.p;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1184e;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.InterfaceC2694i0;
import p293xa.r;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
public interface h {

    /* JADX INFO: compiled from: Modifier.kt */
    public interface b extends h {
        @Override // androidx.compose.ui.h
        default <R> R b(R r10, p<? super R, ? super b, ? extends R> pVar) {
            return pVar.invoke(r10, this);
        }

        @Override // androidx.compose.ui.h
        default boolean d(l<? super b, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }
    }

    <R> R b(R r10, p<? super R, ? super b, ? extends R> pVar);

    boolean d(l<? super b, Boolean> lVar);

    default h i(h hVar) {
        return hVar == a.f13984b ? this : new CombinedModifier(this, hVar);
    }

    /* JADX INFO: compiled from: Modifier.kt */
    public static abstract class c implements InterfaceC1184e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public kotlinx.coroutines.internal.f f13986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13987d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f13989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c f13990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ObserverNodeOwnerScope f13991h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public NodeCoordinator f13992i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f13993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f13994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f13995m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Ia.a<r> f13996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f13997o;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f13985b = this;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13988e = -1;

        public final A E1() {
            kotlinx.coroutines.internal.f fVar = this.f13986c;
            if (fVar != null) {
                return fVar;
            }
            kotlinx.coroutines.internal.f fVarA = B.a(C1185f.g(this).getCoroutineContext().plus(new C2700k0((InterfaceC2694i0) C1185f.g(this).getCoroutineContext().get(InterfaceC2694i0.b.f43449b))));
            this.f13986c = fVarA;
            return fVarA;
        }

        public boolean F1() {
            return !(this instanceof FocusableNode);
        }

        public void G1() {
            if (this.f13997o) {
                R.a.b("node attached multiple times");
            }
            if (this.f13992i == null) {
                R.a.b("attach invoked on a node without a coordinator");
            }
            this.f13997o = true;
            this.f13994l = true;
        }

        public void H1() {
            if (!this.f13997o) {
                R.a.b("Cannot detach a node that is not attached");
            }
            if (this.f13994l) {
                R.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f13995m) {
                R.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f13997o = false;
            kotlinx.coroutines.internal.f fVar = this.f13986c;
            if (fVar != null) {
                B.c(fVar, new ModifierNodeDetachedCancellationException());
                this.f13986c = null;
            }
        }

        public void L1() {
            if (!this.f13997o) {
                R.a.b("reset() called on an unattached node");
            }
            K1();
        }

        public void M1() {
            if (!this.f13997o) {
                R.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f13994l) {
                R.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f13994l = false;
            I1();
            this.f13995m = true;
        }

        public void N1() {
            if (!this.f13997o) {
                R.a.b("node detached multiple times");
            }
            if (this.f13992i == null) {
                R.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.f13995m) {
                R.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f13995m = false;
            Ia.a<r> aVar = this.f13996n;
            if (aVar != null) {
                aVar.invoke();
            }
            J1();
        }

        public void O1(c cVar) {
            this.f13985b = cVar;
        }

        public void P1(NodeCoordinator nodeCoordinator) {
            this.f13992i = nodeCoordinator;
        }

        @Override // androidx.compose.ui.node.InterfaceC1184e
        public final c getNode() {
            return this.f13985b;
        }

        public void I1() {
        }

        public void J1() {
        }

        public void K1() {
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    public static final class a implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f13984b = new a();

        @Override // androidx.compose.ui.h
        public final boolean d(l<? super b, Boolean> lVar) {
            return true;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.h
        public final h i(h hVar) {
            return hVar;
        }

        @Override // androidx.compose.ui.h
        public final <R> R b(R r10, p<? super R, ? super b, ? extends R> pVar) {
            return r10;
        }
    }
}
