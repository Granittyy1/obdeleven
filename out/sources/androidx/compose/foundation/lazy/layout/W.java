package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: PrefetchScheduler.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10697a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
        f10697a = lowerCase.equals("robolectric") ? new a() : null;
    }

    /* JADX INFO: compiled from: PrefetchScheduler.android.kt */
    public static final class a implements V {
        @Override // androidx.compose.foundation.lazy.layout.V
        public final void a(PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl) {
        }
    }
}
