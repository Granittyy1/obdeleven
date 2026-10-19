package M;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: PlatformHapticFeedback.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f4477a;

    public c(AndroidComposeView androidComposeView) {
        this.f4477a = androidComposeView;
    }

    @Override // M.a
    public final void a(int i10) {
        boolean zA = b.a(i10, 16);
        AndroidComposeView androidComposeView = this.f4477a;
        if (zA) {
            androidComposeView.performHapticFeedback(16);
            return;
        }
        if (b.a(i10, 6)) {
            androidComposeView.performHapticFeedback(6);
            return;
        }
        if (b.a(i10, 13)) {
            androidComposeView.performHapticFeedback(13);
            return;
        }
        if (b.a(i10, 23)) {
            androidComposeView.performHapticFeedback(23);
            return;
        }
        if (b.a(i10, 0)) {
            androidComposeView.performHapticFeedback(0);
            return;
        }
        if (b.a(i10, 17)) {
            androidComposeView.performHapticFeedback(17);
            return;
        }
        if (b.a(i10, 27)) {
            androidComposeView.performHapticFeedback(27);
            return;
        }
        if (b.a(i10, 26)) {
            androidComposeView.performHapticFeedback(26);
            return;
        }
        if (b.a(i10, 9)) {
            androidComposeView.performHapticFeedback(9);
            return;
        }
        if (b.a(i10, 22)) {
            androidComposeView.performHapticFeedback(22);
        } else if (b.a(i10, 21)) {
            androidComposeView.performHapticFeedback(21);
        } else if (b.a(i10, 1)) {
            androidComposeView.performHapticFeedback(1);
        }
    }
}
