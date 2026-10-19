package androidx.compose.animation.core;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0<T> implements InterfaceC0920u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0921v f9528c;

    public c0() {
        this(0, (InterfaceC0921v) null, 7);
    }

    @Override // androidx.compose.animation.core.InterfaceC0906f
    public final f0 a(d0 d0Var) {
        return new r0(this.f9526a, this.f9527b, this.f9528c);
    }

    @Override // androidx.compose.animation.core.InterfaceC0923x
    public final j0 b() {
        e0 e0Var = VectorConvertersKt.f9477a;
        return new r0(this.f9526a, this.f9527b, this.f9528c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f9526a == this.f9526a && c0Var.f9527b == this.f9527b && kotlin.jvm.internal.i.a(c0Var.f9528c, this.f9528c);
    }

    public final int hashCode() {
        return ((this.f9528c.hashCode() + (this.f9526a * 31)) * 31) + this.f9527b;
    }

    public c0(int i10, InterfaceC0921v interfaceC0921v, int i11) {
        this((i11 & 1) != 0 ? CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS : i10, 0, (i11 & 4) != 0 ? C0922w.f9635a : interfaceC0921v);
    }

    @Override // androidx.compose.animation.core.InterfaceC0920u, androidx.compose.animation.core.InterfaceC0906f
    public final i0 a(d0 d0Var) {
        return new r0(this.f9526a, this.f9527b, this.f9528c);
    }

    public c0(int i10, int i11, InterfaceC0921v interfaceC0921v) {
        this.f9526a = i10;
        this.f9527b = i11;
        this.f9528c = interfaceC0921v;
    }
}
