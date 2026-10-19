package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: HapticFeedback.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1211b0 implements M.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15028a;

    public C1211b0(View view) {
        this.f15028a = view;
    }

    @Override // M.a
    public final void a(int i10) {
        boolean zA = M.b.a(i10, 16);
        View view = this.f15028a;
        if (zA) {
            view.performHapticFeedback(16);
            return;
        }
        if (M.b.a(i10, 6)) {
            view.performHapticFeedback(6);
            return;
        }
        if (M.b.a(i10, 13)) {
            view.performHapticFeedback(13);
            return;
        }
        if (M.b.a(i10, 23)) {
            view.performHapticFeedback(23);
            return;
        }
        if (M.b.a(i10, 0)) {
            view.performHapticFeedback(0);
            return;
        }
        if (M.b.a(i10, 17)) {
            view.performHapticFeedback(17);
            return;
        }
        if (M.b.a(i10, 27)) {
            view.performHapticFeedback(27);
            return;
        }
        if (M.b.a(i10, 26)) {
            view.performHapticFeedback(26);
            return;
        }
        if (M.b.a(i10, 9)) {
            view.performHapticFeedback(9);
            return;
        }
        if (M.b.a(i10, 22)) {
            view.performHapticFeedback(22);
        } else if (M.b.a(i10, 21)) {
            view.performHapticFeedback(21);
        } else if (M.b.a(i10, 1)) {
            view.performHapticFeedback(1);
        }
    }
}
