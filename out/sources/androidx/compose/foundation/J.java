package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: PlatformMagnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f9778a = new J();

    /* JADX INFO: compiled from: PlatformMagnifier.android.kt */
    public static final class a extends I.a {
        @Override // androidx.compose.foundation.I.a, androidx.compose.foundation.G
        public final void c(float f10, long j, long j10) {
            if (!Float.isNaN(f10)) {
                this.f9771a.setZoom(f10);
            }
            if ((9223372034707292159L & j10) != 9205357640488583168L) {
                this.f9771a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            } else {
                this.f9771a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
    }

    @Override // androidx.compose.foundation.H
    public final boolean a() {
        return true;
    }

    @Override // androidx.compose.foundation.H
    public final G b(View view, boolean z10, long j, float f10, float f11, boolean z11, p013b0.c cVar, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long jO1 = cVar.o1(j);
        float fT0 = cVar.T0(f10);
        float fT1 = cVar.T0(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jO1 != 9205357640488583168L) {
            builder.setSize(Ka.a.b(Float.intBitsToFloat((int) (jO1 >> 32))), Ka.a.b(Float.intBitsToFloat((int) (jO1 & 4294967295L))));
        }
        if (!Float.isNaN(fT0)) {
            builder.setCornerRadius(fT0);
        }
        if (!Float.isNaN(fT1)) {
            builder.setElevation(fT1);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
