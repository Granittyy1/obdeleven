package androidx.compose.ui.platform;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1210b extends androidx.compose.animation.core.H {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1210b f15024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ResolvedTextDirection f15025f = ResolvedTextDirection.f15651c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ResolvedTextDirection f15026g = ResolvedTextDirection.f15650b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.compose.ui.text.B f15027d;

    @Override // androidx.compose.animation.core.H
    public final int[] a(int i10) {
        int iD;
        if (c().length() <= 0 || i10 >= c().length()) {
            return null;
        }
        ResolvedTextDirection resolvedTextDirection = f15025f;
        if (i10 < 0) {
            androidx.compose.ui.text.B b10 = this.f15027d;
            if (b10 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            iD = b10.f15301b.d(0);
        } else {
            androidx.compose.ui.text.B b11 = this.f15027d;
            if (b11 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            int iD2 = b11.f15301b.d(i10);
            iD = e(iD2, resolvedTextDirection) == i10 ? iD2 : iD2 + 1;
        }
        androidx.compose.ui.text.B b12 = this.f15027d;
        if (b12 == null) {
            kotlin.jvm.internal.i.m("layoutResult");
            throw null;
        }
        if (iD >= b12.f15301b.f15475f) {
            return null;
        }
        return b(e(iD, resolvedTextDirection), e(iD, f15026g) + 1);
    }

    @Override // androidx.compose.animation.core.H
    public final int[] d(int i10) {
        int iD;
        if (c().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = c().length();
        ResolvedTextDirection resolvedTextDirection = f15026g;
        if (i10 > length) {
            androidx.compose.ui.text.B b10 = this.f15027d;
            if (b10 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            iD = b10.f15301b.d(c().length());
        } else {
            androidx.compose.ui.text.B b11 = this.f15027d;
            if (b11 == null) {
                kotlin.jvm.internal.i.m("layoutResult");
                throw null;
            }
            int iD2 = b11.f15301b.d(i10);
            iD = e(iD2, resolvedTextDirection) + 1 == i10 ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return b(e(iD, f15025f), e(iD, resolvedTextDirection) + 1);
    }

    public final int e(int i10, ResolvedTextDirection resolvedTextDirection) {
        androidx.compose.ui.text.B b10 = this.f15027d;
        if (b10 == null) {
            kotlin.jvm.internal.i.m("layoutResult");
            throw null;
        }
        int iG = b10.g(i10);
        androidx.compose.ui.text.B b11 = this.f15027d;
        if (b11 == null) {
            kotlin.jvm.internal.i.m("layoutResult");
            throw null;
        }
        if (resolvedTextDirection != b11.h(iG)) {
            androidx.compose.ui.text.B b12 = this.f15027d;
            if (b12 != null) {
                return b12.g(i10);
            }
            kotlin.jvm.internal.i.m("layoutResult");
            throw null;
        }
        androidx.compose.ui.text.B b13 = this.f15027d;
        if (b13 != null) {
            return b13.f15301b.c(i10, false) - 1;
        }
        kotlin.jvm.internal.i.m("layoutResult");
        throw null;
    }
}
