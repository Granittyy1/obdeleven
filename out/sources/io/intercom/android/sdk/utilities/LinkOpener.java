package io.intercom.android.sdk.utilities;

import Z3.o;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.braze.Constants;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LinkOpener {
    private static final Twig twig = LumberMill.getLogger();

    private static String getPlaceFromContext(Context context) {
        if (context instanceof IntercomCarouselActivity) {
            return "carousel_message";
        }
        if ((context instanceof IntercomPostActivity) || (context instanceof IntercomNoteActivity)) {
            return MetricTracker.Place.IN_APP;
        }
        if (context instanceof IntercomRootActivity) {
            return "conversation";
        }
        return context instanceof IntercomSurveyActivity ? "survey" : MetricTracker.Place.PUSH;
    }

    public static Uri getTargetUriFromTrackingUrl(String str) {
        Uri uri = Uri.parse(str);
        String queryParameter = uri.isHierarchical() ? uri.getQueryParameter(Constants.BRAZE_WEBVIEW_URL_EXTRA) : str;
        if (queryParameter != null) {
            str = queryParameter;
        }
        return parseUrl(str);
    }

    public static void handleUrl(String str, Context context, Api api) {
        handleUrl(str, context, api, false);
    }

    private static boolean isTrackingUrl(String str) {
        return str.contains("via.intercom.io") || str.contains("via.eu.intercom.io") || str.contains("via.au.intercom.io");
    }

    private static Uri normalizeScheme(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri;
        }
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        return scheme.equals(lowerCase) ? uri : uri.buildUpon().scheme(lowerCase).build();
    }

    private static void openUrl(Uri uri, Context context) {
        Intent intent = new Intent("mailto".equals(uri.getScheme()) ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            IntentUtils.safelyOpenIntent(context, intent);
        } catch (ActivityNotFoundException unused) {
            twig.e("No Activity found to handle the URL '" + uri.toString() + "'", new Object[0]);
        } catch (SecurityException e10) {
            twig.e("Couldn't open link because of error: " + e10.getMessage(), new Object[0]);
        }
    }

    private static Uri parseUrl(String str) {
        Uri uri = Uri.parse(str);
        if (uri.getScheme() == null) {
            uri = Uri.parse("http://" + str);
        }
        return (uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https")) ? normalizeScheme(uri) : uri;
    }

    public static void handleUrl(String str, Context context, Api api, boolean z10) {
        Uri url;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (isTrackingUrl(str)) {
            api.hitTrackingUrl(str);
            url = getTargetUriFromTrackingUrl(str);
        } else {
            url = parseUrl(str);
        }
        Set<String> helpCenterUrls = ((AppConfig) o.b()).getHelpCenterUrls();
        String string = url.toString();
        String placeFromContext = getPlaceFromContext(context);
        if (HelpCenterUrlUtilsKt.isHelpCenterArticleUrl(string, helpCenterUrls)) {
            HelpCenterUrlUtilsKt.openArticle(context, HelpCenterUrlUtilsKt.extractIdFromLastSegment(url.getLastPathSegment()), placeFromContext, z10);
        } else if (HelpCenterUrlUtilsKt.isHelpCenterCollectionUrl(string, helpCenterUrls)) {
            HelpCenterUrlUtilsKt.openCollection(context, HelpCenterUrlUtilsKt.extractIdFromLastSegment(url.getLastPathSegment()), placeFromContext);
        } else {
            openUrl(url, context);
        }
    }
}
