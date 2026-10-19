package com.braze.push.support;

import Ia.a;
import android.text.Html;
import android.text.Spanned;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: HtmlUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HtmlUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("HtmlUtils");

    public static final CharSequence getHtmlSpannedTextIfEnabled(String str, BrazeConfigurationProvider configurationProvider) {
        i.e(str, "<this>");
        i.e(configurationProvider, "configurationProvider");
        if (n.S(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (a) new a<String>() { // from class: com.braze.push.support.HtmlUtils.getHtmlSpannedTextIfEnabled.1
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot create html spanned text on blank text. Returning blank string.";
                }
            }, 6, (Object) null);
            return str;
        }
        if (!configurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            return str;
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        i.d(spannedFromHtml, "{\n        if (Build.VERS…tml(this)\n        }\n    }");
        return spannedFromHtml;
    }
}
