package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: TintContextWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class Z extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8886a = null;

    public static void a(Context context) {
        if ((context instanceof Z) || (context.getResources() instanceof b0)) {
            return;
        }
        context.getResources();
        int i10 = j0.f8996a;
    }
}
