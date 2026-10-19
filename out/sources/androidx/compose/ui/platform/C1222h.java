package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidClipboard.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1222h implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1224i f15047a;

    public C1222h(C1224i c1224i) {
        this.f15047a = c1224i;
    }

    @Override // androidx.compose.ui.platform.Z
    public final p293xa.r a(Y y10) {
        ClipboardManager clipboardManager = this.f15047a.f15050a;
        if (y10 != null) {
            clipboardManager.setPrimaryClip(y10.f15013a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return p293xa.r.f47939a;
    }

    @Override // androidx.compose.ui.platform.Z
    public final Y b() {
        ClipData primaryClip = this.f15047a.f15050a.getPrimaryClip();
        if (primaryClip != null) {
            return new Y(primaryClip);
        }
        return null;
    }
}
