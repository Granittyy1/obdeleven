package androidx.compose.material;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.InterfaceC1182c;

/* JADX INFO: renamed from: androidx.compose.material.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1043t extends AbstractC1187h implements InterfaceC1182c, androidx.compose.ui.node.O {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.j f12022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f12024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final androidx.compose.ui.graphics.L f12025u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.compose.material.ripple.b f12026v;

    public C1043t(androidx.compose.foundation.interaction.j jVar, boolean z10, float f10, androidx.compose.ui.graphics.L l10) {
        this.f12022r = jVar;
        this.f12023s = z10;
        this.f12024t = f10;
        this.f12025u = l10;
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        androidx.compose.ui.node.P.a(this, new DelegatingThemeAwareRippleNode$updateConfiguration$1(this));
    }

    @Override // androidx.compose.ui.node.O
    public final void a1() {
        androidx.compose.ui.node.P.a(this, new DelegatingThemeAwareRippleNode$updateConfiguration$1(this));
    }
}
