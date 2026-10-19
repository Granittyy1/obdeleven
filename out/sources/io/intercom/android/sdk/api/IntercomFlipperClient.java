package io.intercom.android.sdk.api;

import android.content.Context;
import kotlin.jvm.internal.i;
import okhttp3.t;

/* JADX INFO: compiled from: IntercomFlipperClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomFlipperClient {
    public static final int $stable = 0;
    public static final IntercomFlipperClient INSTANCE = new IntercomFlipperClient();

    private IntercomFlipperClient() {
    }

    public final void addDefaultFlipperInterceptor(t.a builder, Context context) {
        i.e(builder, "builder");
        i.e(context, "context");
    }

    public final void addInterceptor(t.a builder, Context context) {
        i.e(builder, "builder");
        i.e(context, "context");
    }
}
