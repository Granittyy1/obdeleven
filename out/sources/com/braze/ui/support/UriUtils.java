package com.braze.ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.y;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UriUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UriUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    public static final Intent getMainActivityIntent(Context context, Bundle bundle) {
        i.e(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (bundle != null && launchIntentForPackage != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    public static /* synthetic */ Intent getMainActivityIntent$default(Context context, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        return getMainActivityIntent(context, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [T, android.net.Uri, java.lang.Object] */
    public static final Map<String, String> getQueryParameters(Uri uri) {
        i.e(uri, "<this>");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = uri;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (Ia.a) new Ia.a<String>() { // from class: com.braze.ui.support.UriUtils.getQueryParameters.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Encoded query is null for Uri: " + ref$ObjectRef.element + " Returning empty map for query parameters";
                }
            }, 4, (Object) null);
            return y.p();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (((Uri) ref$ObjectRef.element).isOpaque()) {
                ?? Build = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
                i.d(Build, "parse(\"://\")\n           …\n                .build()");
                ref$ObjectRef.element = Build;
            }
            Set<String> queryParameterNames = ((Uri) ref$ObjectRef.element).getQueryParameterNames();
            i.d(queryParameterNames, "uri.queryParameterNames");
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (!(str == null || str.length() == 0)) {
                    arrayList.add(obj);
                }
            }
            for (String queryParameterKey : arrayList) {
                String queryParameter = ((Uri) ref$ObjectRef.element).getQueryParameter(queryParameterKey);
                if (queryParameter != null && queryParameter.length() != 0) {
                    i.d(queryParameterKey, "queryParameterKey");
                    linkedHashMap.put(queryParameterKey, queryParameter);
                }
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e10, new Ia.a<String>() { // from class: com.braze.ui.support.UriUtils.getQueryParameters.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Failed to map the query parameters of Uri: " + ref$ObjectRef.element;
                }
            });
        }
        return linkedHashMap;
    }

    public static final boolean isActivityRegisteredInManifest(Context context, final String className) {
        i.e(context, "context");
        i.e(className, "className");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, className), PackageManager.ComponentInfoFlags.of(0L));
            } else {
                context.getPackageManager().getActivityInfo(new ComponentName(context, className), 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.W, (Throwable) e10, new Ia.a<String>() { // from class: com.braze.ui.support.UriUtils.isActivityRegisteredInManifest.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Could not find activity info for class with name: " + className;
                }
            });
            return false;
        }
    }
}
