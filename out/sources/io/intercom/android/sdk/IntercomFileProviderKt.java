package io.intercom.android.sdk;

import android.content.Context;

/* JADX INFO: compiled from: IntercomFileProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomFileProviderKt {
    public static final String fileProviderAuthority(Context context) {
        kotlin.jvm.internal.i.e(context, "<this>");
        return context.getPackageName() + ".IntercomFileProvider";
    }
}
