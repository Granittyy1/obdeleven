package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0910j;
import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SizeAnimationModifierNode extends u {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC0906f<p013b0.l> f9319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.f f9320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ia.p<? super p013b0.l, ? super p013b0.l, p293xa.r> f9321r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9324u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9322s = h.f9641a;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9323t = p013b0.b.b(0, 0, 15);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1085f0 f9325v = J0.f(null);

    /* JADX INFO: compiled from: AnimationModifier.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animatable<p013b0.l, C0910j> f9326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9327b;

        public a() {
            throw null;
        }

        public a(Animatable animatable, long j) {
            this.f9326a = animatable;
            this.f9327b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f9326a, aVar.f9326a) && p013b0.l.b(this.f9327b, aVar.f9327b);
        }

        public final int hashCode() {
            return Long.hashCode(this.f9327b) + (this.f9326a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.f9326a + ", startSize=" + ((Object) p013b0.l.c(this.f9327b)) + ')';
        }
    }

    public SizeAnimationModifierNode(InterfaceC0906f interfaceC0906f, androidx.compose.ui.f fVar, Ia.p pVar) {
        this.f9319p = interfaceC0906f;
        this.f9320q = fVar;
        this.f9321r = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(final H h8, androidx.compose.ui.layout.D d10, long j) {
        Y yQ;
        a aVar;
        long jD;
        if (h8.S0()) {
            this.f9323t = j;
            this.f9324u = true;
            yQ = d10.Q(j);
        } else {
            yQ = d10.Q(this.f9324u ? this.f9323t : j);
        }
        Y y10 = yQ;
        final long j10 = (((long) y10.f14221c) & 4294967295L) | (((long) y10.f14220b) << 32);
        if (h8.S0()) {
            this.f9322s = j10;
            y10 = y10;
            jD = j10;
        } else {
            long j11 = !p013b0.l.b(this.f9322s, h.f9641a) ? this.f9322s : j10;
            C1085f0 c1085f0 = this.f9325v;
            a aVar2 = (a) c1085f0.getValue();
            if (aVar2 != null) {
                Animatable<p013b0.l, C0910j> animatable = aVar2.f9326a;
                boolean z10 = (p013b0.l.b(j11, animatable.d().f20490a) || ((Boolean) animatable.f9339d.getValue()).booleanValue()) ? false : true;
                if (!p013b0.l.b(j11, ((p013b0.l) animatable.f9340e.getValue()).f20490a) || z10) {
                    aVar2.f9327b = animatable.d().f20490a;
                    C2680e.c(E1(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(aVar2, j11, this, null), 3);
                }
                aVar = aVar2;
            } else {
                long j12 = 1;
                aVar = new a(new Animatable(new p013b0.l(j11), VectorConvertersKt.f9484h, new p013b0.l((j12 << 32) | (j12 & 4294967295L)), 8), j11);
            }
            c1085f0.setValue(aVar);
            jD = p013b0.b.d(j, aVar.f9326a.d().f20490a);
        }
        final int i10 = (int) (jD >> 32);
        final int i11 = (int) (jD & 4294967295L);
        final Y y11 = y10;
        return h8.y1(i10, i11, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar3) {
                Y.a.f(aVar3, y11, this.this$0.f9320q.a(j10, (((long) i10) << 32) | (((long) i11) & 4294967295L), h8.getLayoutDirection()));
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        this.f9322s = h.f9641a;
        this.f9324u = false;
    }

    @Override // androidx.compose.ui.h.c
    public final void K1() {
        this.f9325v.setValue(null);
    }
}
