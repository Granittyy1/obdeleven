package androidx.compose.foundation;

import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.node.C1192m;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;
import androidx.compose.ui.node.O;
import androidx.compose.ui.node.P;
import androidx.compose.ui.unit.LayoutDirection;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.foundation.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Background.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0933e extends androidx.compose.ui.h.c implements InterfaceC1191l, O {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.graphics.C f9893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f9894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l0 f9895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LayoutDirection f9897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b0 f9898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l0 f9899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b0 f9900x;

    @Override // androidx.compose.ui.node.O
    public final void a1() {
        this.f9896t = 9205357640488583168L;
        this.f9897u = null;
        this.f9898v = null;
        this.f9899w = null;
        C1192m.a(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(final C1202x c1202x) {
        b0 b0Var;
        if (this.f9895s == h0.f13629a) {
            if (!androidx.compose.ui.graphics.H.c(this.f9892p, androidx.compose.ui.graphics.H.f13504l)) {
                J.e.s0(c1202x, this.f9892p, 0L, 0L, 0.0f, R.styleable.AppCompatTheme_windowNoTitle);
            }
            androidx.compose.ui.graphics.C c10 = this.f9893q;
            if (c10 != null) {
                J.e.m0(c1202x, c10, 0L, 0L, this.f9894r, null, R.styleable.AppCompatTheme_windowActionBarOverlay);
            }
        } else {
            J.a aVar = c1202x.f14624b;
            if (I.h.a(aVar.j(), this.f9896t) && c1202x.getLayoutDirection() == this.f9897u && kotlin.jvm.internal.i.a(this.f9899w, this.f9895s)) {
                b0Var = this.f9898v;
                kotlin.jvm.internal.i.b(b0Var);
            } else {
                P.a(this, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.BackgroundNode$getOutline$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        C0933e c0933e = this.this$0;
                        c0933e.f9900x = c0933e.f9895s.mo0createOutlinePq9zytI(c1202x.j(), c1202x.getLayoutDirection(), c1202x);
                        return p293xa.r.f47939a;
                    }
                });
                b0Var = this.f9900x;
                this.f9900x = null;
            }
            this.f9898v = b0Var;
            this.f9896t = aVar.j();
            this.f9897u = c1202x.getLayoutDirection();
            this.f9899w = this.f9895s;
            kotlin.jvm.internal.i.b(b0Var);
            if (!androidx.compose.ui.graphics.H.c(this.f9892p, androidx.compose.ui.graphics.H.f13504l)) {
                c0.c(c1202x, b0Var, this.f9892p);
            }
            androidx.compose.ui.graphics.C c11 = this.f9893q;
            if (c11 != null) {
                c0.b(c1202x, b0Var, c11, this.f9894r);
            }
        }
        c1202x.A1();
    }
}
