package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: PlatformMagnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f9770a = new I();

    /* JADX INFO: compiled from: PlatformMagnifier.android.kt */
    public static class a implements G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Magnifier f9771a;

        public a(Magnifier magnifier) {
            this.f9771a = magnifier;
        }

        @Override // androidx.compose.foundation.G
        public final long a() {
            return (((long) this.f9771a.getHeight()) & 4294967295L) | (((long) this.f9771a.getWidth()) << 32);
        }

        @Override // androidx.compose.foundation.G
        public final void b() {
            this.f9771a.update();
        }

        @Override // androidx.compose.foundation.G
        public void c(float f10, long j, long j10) {
            this.f9771a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }

        @Override // androidx.compose.foundation.G
        public final void dismiss() {
            this.f9771a.dismiss();
        }
    }

    @Override // androidx.compose.foundation.H
    public final boolean a() {
        return false;
    }

    @Override // androidx.compose.foundation.H
    public final G b(View view, boolean z10, long j, float f10, float f11, boolean z11, p013b0.c cVar, float f12) {
        return new a(new Magnifier(view));
    }
}
