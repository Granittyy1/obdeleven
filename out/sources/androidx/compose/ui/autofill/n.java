package androidx.compose.ui.autofill;

import android.os.Build;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: PlatformAutofillManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutofillManager f13303a;

    public n(AutofillManager autofillManager) {
        this.f13303a = autofillManager;
    }

    public final void a(AndroidComposeView androidComposeView, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            this.f13303a.notifyViewVisibilityChanged(androidComposeView, i10, z10);
        }
    }
}
