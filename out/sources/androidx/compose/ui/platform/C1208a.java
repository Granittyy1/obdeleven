package androidx.compose.ui.platform;

import java.text.BreakIterator;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1208a extends androidx.compose.animation.core.H {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1208a f15014e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BreakIterator f15015d;

    @Override // androidx.compose.animation.core.H
    public final int[] a(int i10) {
        int length = c().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f15015d;
            if (breakIterator == null) {
                kotlin.jvm.internal.i.m("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f15015d;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.i.m("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return b(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f15015d;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.i.m("impl");
                throw null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // androidx.compose.animation.core.H
    public final int[] d(int i10) {
        int length = c().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        do {
            BreakIterator breakIterator = this.f15015d;
            if (breakIterator == null) {
                kotlin.jvm.internal.i.m("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f15015d;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.i.m("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return b(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f15015d;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.i.m("impl");
                throw null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }
}
