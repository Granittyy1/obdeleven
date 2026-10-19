package androidx.compose.material3;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.InterfaceC1182c;

/* JADX INFO: renamed from: androidx.compose.material3.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1071x extends AbstractC1187h implements InterfaceC1182c, androidx.compose.ui.node.O {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.j f12763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f12765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final androidx.compose.ui.graphics.L f12766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.compose.material.ripple.b f12767v;

    public C1071x(androidx.compose.foundation.interaction.j jVar, boolean z10, float f10, androidx.compose.ui.graphics.L l10) {
        this.f12763r = jVar;
        this.f12764s = z10;
        this.f12765t = f10;
        this.f12766u = l10;
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
