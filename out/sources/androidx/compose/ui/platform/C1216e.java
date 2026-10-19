package androidx.compose.ui.platform;

import java.text.BreakIterator;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1216e extends androidx.compose.animation.core.H {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1216e f15038e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BreakIterator f15039d;

    @Override // androidx.compose.animation.core.H
    public final int[] a(int i10) {
        if (c().length() <= 0 || i10 >= c().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!f(i10) && (!f(i10) || (i10 != 0 && f(i10 - 1)))) {
            BreakIterator breakIterator = this.f15039d;
            if (breakIterator == null) {
                kotlin.jvm.internal.i.m("impl");
                throw null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f15039d;
        if (breakIterator2 == null) {
            kotlin.jvm.internal.i.m("impl");
            throw null;
        }
        int iFollowing = breakIterator2.following(i10);
        if (iFollowing == -1 || !e(iFollowing)) {
            return null;
        }
        return b(i10, iFollowing);
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
        while (i10 > 0 && !f(i10 - 1) && !e(i10)) {
            BreakIterator breakIterator = this.f15039d;
            if (breakIterator == null) {
                kotlin.jvm.internal.i.m("impl");
                throw null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f15039d;
        if (breakIterator2 == null) {
            kotlin.jvm.internal.i.m("impl");
            throw null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding == -1 || !f(iPreceding) || (iPreceding != 0 && f(iPreceding - 1))) {
            return null;
        }
        return b(iPreceding, i10);
    }

    public final boolean e(int i10) {
        return i10 > 0 && f(i10 + (-1)) && (i10 == c().length() || !f(i10));
    }

    public final boolean f(int i10) {
        if (i10 < 0 || i10 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i10));
    }
}
