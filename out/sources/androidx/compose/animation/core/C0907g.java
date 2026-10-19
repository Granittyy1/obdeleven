package androidx.compose.animation.core;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: renamed from: androidx.compose.animation.core.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0907g {
    public static E a(InterfaceC0920u interfaceC0920u, RepeatMode repeatMode, int i10) {
        if ((i10 & 2) != 0) {
            repeatMode = RepeatMode.f9398b;
        }
        return new E(interfaceC0920u, repeatMode, 0);
    }

    public static final <T> I<T> b(Ia.l<? super I.b<T>, p293xa.r> lVar) {
        I.b bVar = new I.b();
        lVar.invoke(bVar);
        return new I<>(bVar);
    }

    public static P c(float f10, float f11, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new P(f10, f11, obj);
    }

    public static c0 d(int i10, int i11, InterfaceC0921v interfaceC0921v, int i12) {
        if ((i12 & 1) != 0) {
            i10 = CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC0921v = C0922w.f9635a;
        }
        return new c0(i10, i11, interfaceC0921v);
    }
}
