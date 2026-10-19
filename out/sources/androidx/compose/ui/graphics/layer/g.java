package androidx.compose.ui.graphics.layer;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: LayerManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f13756a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
        f13756a = lowerCase.equals("robolectric");
    }
}
