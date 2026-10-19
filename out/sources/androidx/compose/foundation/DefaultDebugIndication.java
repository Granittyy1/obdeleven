package androidx.compose.foundation;

import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1184e;
import androidx.compose.ui.node.InterfaceC1191l;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultDebugIndication implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DefaultDebugIndication f9749a = new DefaultDebugIndication();

    /* JADX INFO: compiled from: Indication.kt */
    public static final class DefaultDebugIndicationInstance extends androidx.compose.ui.h.c implements InterfaceC1191l {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final androidx.compose.foundation.interaction.j f9750p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f9751q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f9752r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f9753s;

        public DefaultDebugIndicationInstance(androidx.compose.foundation.interaction.j jVar) {
            this.f9750p = jVar;
        }

        @Override // androidx.compose.ui.h.c
        public final void I1() {
            C2680e.c(E1(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
        }

        @Override // androidx.compose.ui.node.InterfaceC1191l
        public final void x(C1202x c1202x) {
            c1202x.A1();
            boolean z10 = this.f9751q;
            J.a aVar = c1202x.f14624b;
            if (z10) {
                J.e.s0(c1202x, androidx.compose.ui.graphics.H.b(0.3f, androidx.compose.ui.graphics.H.f13495b), 0L, aVar.j(), 0.0f, R.styleable.AppCompatTheme_windowFixedWidthMajor);
            } else if (this.f9752r || this.f9753s) {
                J.e.s0(c1202x, androidx.compose.ui.graphics.H.b(0.1f, androidx.compose.ui.graphics.H.f13495b), 0L, aVar.j(), 0.0f, R.styleable.AppCompatTheme_windowFixedWidthMajor);
            }
        }
    }

    @Override // androidx.compose.foundation.z
    public final InterfaceC1184e b(androidx.compose.foundation.interaction.j jVar) {
        return new DefaultDebugIndicationInstance(jVar);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.z
    public final int hashCode() {
        return -1;
    }
}
