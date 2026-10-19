package androidx.compose.ui.platform;

import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1212c extends androidx.compose.animation.core.H {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C1212c f15029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ResolvedTextDirection f15030g = ResolvedTextDirection.f15651c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ResolvedTextDirection f15031h = ResolvedTextDirection.f15650b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.compose.ui.text.B f15032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.compose.ui.semantics.q f15033e;

    @Override // androidx.compose.animation.core.H
    public final int[] a(int i10) {
        int iE;
        if (c().length() <= 0 || i10 >= c().length()) {
            return null;
        }
        try {
            androidx.compose.ui.semantics.q qVar = this.f15033e;
            if (qVar == null) {
                kotlin.jvm.internal.i.m("node");
                throw null;
            }
            I.f fVarE = qVar.e();
            int iRound = Math.round(fVarE.f3760d - fVarE.f3758b);
            if (i10 <= 0) {
                i10 = 0;
            }
            androidx.compose.ui.text.B b10 = this.f15032d;
            if (b10 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            int iD = b10.f15301b.d(i10);
            androidx.compose.ui.text.B b11 = this.f15032d;
            if (b11 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            float f10 = b11.f15301b.f(iD) + iRound;
            androidx.compose.ui.text.B b12 = this.f15032d;
            if (b12 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            if (b12 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            C1268i c1268i = b12.f15301b;
            if (f10 < c1268i.f(c1268i.f15475f - 1)) {
                androidx.compose.ui.text.B b13 = this.f15032d;
                if (b13 == null) {
                    kotlin.jvm.internal.i.m("layoutResult");
                    throw null;
                }
                iE = b13.f15301b.e(f10);
            } else {
                androidx.compose.ui.text.B b14 = this.f15032d;
                if (b14 == null) {
                    kotlin.jvm.internal.i.m("layoutResult");
                    throw null;
                }
                iE = b14.f15301b.f15475f;
            }
            return b(i10, e(iE - 1, f15031h) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.animation.core.H
    public final int[] d(int i10) {
        int iE;
        if (c().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            androidx.compose.ui.semantics.q qVar = this.f15033e;
            if (qVar == null) {
                kotlin.jvm.internal.i.m("node");
                throw null;
            }
            I.f fVarE = qVar.e();
            int iRound = Math.round(fVarE.f3760d - fVarE.f3758b);
            int length = c().length();
            if (length <= i10) {
                i10 = length;
            }
            androidx.compose.ui.text.B b10 = this.f15032d;
            if (b10 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            int iD = b10.f15301b.d(i10);
            androidx.compose.ui.text.B b11 = this.f15032d;
            if (b11 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            float f10 = b11.f15301b.f(iD) - iRound;
            if (f10 > 0.0f) {
                androidx.compose.ui.text.B b12 = this.f15032d;
                if (b12 == null) {
                    kotlin.jvm.internal.i.m("layoutResult");
                    throw null;
                }
                iE = b12.f15301b.e(f10);
            } else {
                iE = 0;
            }
            if (i10 == c().length() && iE < iD) {
                iE++;
            }
            return b(e(iE, f15030g), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i10, ResolvedTextDirection resolvedTextDirection) {
        androidx.compose.ui.text.B b10 = this.f15032d;
        if (b10 == null) {
            kotlin.jvm.internal.i.m("layoutResult");
            throw null;
        }
        int iG = b10.g(i10);
        androidx.compose.ui.text.B b11 = this.f15032d;
        if (b11 == null) {
            kotlin.jvm.internal.i.m("layoutResult");
            throw null;
        }
        if (resolvedTextDirection != b11.h(iG)) {
            androidx.compose.ui.text.B b12 = this.f15032d;
            if (b12 != null) {
                return b12.g(i10);
            }
            kotlin.jvm.internal.i.m("layoutResult");
            throw null;
        }
        androidx.compose.ui.text.B b13 = this.f15032d;
        if (b13 != null) {
            return b13.f15301b.c(i10, false) - 1;
        }
        kotlin.jvm.internal.i.m("layoutResult");
        throw null;
    }
}
