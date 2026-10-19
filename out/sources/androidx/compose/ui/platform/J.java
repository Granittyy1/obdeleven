package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: AndroidUriHandler.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J implements R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14933a;

    public J(Context context) {
        this.f14933a = context;
    }

    @Override // androidx.compose.ui.platform.R0
    public final void a(String str) {
        try {
            this.f14933a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException(p005a4.o.c('.', "Can't open ", str), e10);
        }
    }
}
