package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.m;
import p013b0.k;
import p114j1.C2479a;

/* JADX INFO: compiled from: ContextMenuPopupPositionProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9875a;

    public e(long j) {
        this.f9875a = j;
    }

    @Override // androidx.compose.ui.window.m
    public final long a(k kVar, long j, LayoutDirection layoutDirection, long j10) {
        int i10 = kVar.f20486a;
        long j11 = this.f9875a;
        return (((long) C2479a.g(i10 + ((int) (j11 >> 32)), (int) (j10 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.f15717b)) << 32) | (((long) C2479a.g(kVar.f20487b + ((int) (j11 & 4294967295L)), (int) (j10 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L);
    }
}
