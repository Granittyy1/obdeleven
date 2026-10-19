package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: FontFamilyResolver.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final e a(Context context) {
        H3.c cVar = new H3.c();
        context.getApplicationContext();
        return new e(cVar, new a(Build.VERSION.SDK_INT >= 31 ? m.f15448a.a(context) : 0));
    }
}
