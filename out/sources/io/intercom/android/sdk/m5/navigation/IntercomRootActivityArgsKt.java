package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.intercom.android.sdk.m5.IntercomRootActivity;

/* JADX INFO: compiled from: IntercomRootActivityArgs.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRootActivityArgsKt {
    private static final String BUNDLE = "BUNDLE";
    private static final String BUNDLE_ARGS = "BUNDLE_ARGS";

    public static final IntercomRootActivityArgs getArgsForIntent(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra(BUNDLE);
        if (bundleExtra == null) {
            return IntercomRootActivityArgs.NoContent.INSTANCE;
        }
        IntercomRootActivityArgs intercomRootActivityArgs = (IntercomRootActivityArgs) p271w0.b.a(bundleExtra, BUNDLE_ARGS, IntercomRootActivityArgs.class);
        return intercomRootActivityArgs == null ? IntercomRootActivityArgs.NoContent.INSTANCE : intercomRootActivityArgs;
    }

    public static final Intent getIntentForArgs(Context context, IntercomRootActivityArgs intercomRootActivityArgs, Class<?> activityName, Integer num) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(intercomRootActivityArgs, "intercomRootActivityArgs");
        kotlin.jvm.internal.i.e(activityName, "activityName");
        Intent intent = new Intent(context, activityName);
        Bundle bundle = new Bundle();
        bundle.putParcelable(BUNDLE_ARGS, intercomRootActivityArgs);
        intent.putExtra(BUNDLE, bundle);
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        return intent;
    }

    public static /* synthetic */ Intent getIntentForArgs$default(Context context, IntercomRootActivityArgs intercomRootActivityArgs, Class cls, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cls = IntercomRootActivity.class;
        }
        if ((i10 & 8) != 0) {
            num = 268435456;
        }
        return getIntentForArgs(context, intercomRootActivityArgs, cls, num);
    }
}
