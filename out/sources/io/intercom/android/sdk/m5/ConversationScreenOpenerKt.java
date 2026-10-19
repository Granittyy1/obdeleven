package io.intercom.android.sdk.m5;

import android.content.Context;
import android.content.Intent;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationScreenOpener.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationScreenOpenerKt {
    public static final Intent getComposerIntent(Context context, String initialMessage, boolean z10, ArticleMetadata articleMetadata, String str, Class<?> activityName) {
        i.e(context, "context");
        i.e(initialMessage, "initialMessage");
        i.e(activityName, "activityName");
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str, initialMessage, z10, articleMetadata != null ? articleMetadata.getId() : null, articleMetadata != null ? articleMetadata.getTitle() : null, null, 32, null), activityName, null, 8, null);
    }

    public static /* synthetic */ Intent getComposerIntent$default(Context context, String str, boolean z10, ArticleMetadata articleMetadata, String str2, Class cls, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        String str3 = str;
        if ((i10 & 32) != 0) {
            cls = IntercomRootActivity.class;
        }
        return getComposerIntent(context, str3, z10, articleMetadata, str2, cls);
    }

    public static final Intent getConversationIntent(Context context, String str) {
        i.e(context, "context");
        return IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(str, "", false, null, null, null, 48, null), null, null, 12, null);
    }

    public static final void openComposer(Context context, String initialMessage, boolean z10, ArticleMetadata articleMetadata, String str) {
        i.e(context, "context");
        i.e(initialMessage, "initialMessage");
        context.startActivity(getComposerIntent$default(context, initialMessage, z10, articleMetadata, str, null, 32, null));
    }

    public static /* synthetic */ void openComposer$default(Context context, String str, boolean z10, ArticleMetadata articleMetadata, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            articleMetadata = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        openComposer(context, str, z10, articleMetadata, str2);
    }
}
