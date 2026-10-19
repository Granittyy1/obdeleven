package com.braze.support;

import A1.C0575j;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import kotlin.jvm.internal.Lambda;
import p005a4.q;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionUtils {
    private static final String NOTIFICATION_PERMISSION = "android.permission.POST_NOTIFICATIONS";
    private static final String PERMISSION_STORAGE_PREFS_FILE = "com.braze.support.permission_util.requested_perms";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24305b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f24305b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failure checking permission " + this.f24305b;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(0);
            this.f24306b = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C0575j.b(new StringBuilder("Incrementing permission request counter to "), this.f24306b, '.');
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f24307b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to execute requestPushPermissionPrompt()";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24308b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f24309b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Permission prompt would not display, not attempting to request push permission prompt.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f24310b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting push permission from system.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f24311b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f24312b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return q.c(new StringBuilder("Device API version of "), Build.VERSION.SDK_INT, " is too low to display push permission prompt.");
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24313b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i10) {
            super(0);
            this.f24313b = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return q.c(new StringBuilder("App Target API version of "), this.f24313b, " is too low to display push permission prompt.");
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f24314b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Notification permission already granted, doing nothing.";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24315b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i10) {
            super(0);
            this.f24315b = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return q.c(new StringBuilder("Notification permission request count is "), this.f24315b, ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'");
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f24316b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Push Prompt can be shown on this device, within a reasonable confidence.";
        }
    }

    public static final int getPermissionRequestCount(Context context, String permission) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(permission, "permission");
        return context.getSharedPreferences(PERMISSION_STORAGE_PREFS_FILE, 0).getInt(permission, 0);
    }

    public static final boolean hasPermission(Context context, String permission) {
        kotlin.jvm.internal.i.e(permission, "permission");
        if (context == null) {
            return false;
        }
        try {
            return context.checkCallingOrSelfPermission(permission) == 0;
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (Ia.a<String>) new a(permission));
            return false;
        }
    }

    public static final void incrementPermissionRequestCount(Context context, String permission) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(permission, "permission");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PERMISSION_STORAGE_PREFS_FILE, 0);
        int i10 = sharedPreferences.getInt(permission, 0) + 1;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new b(i10), 6, (Object) null);
        sharedPreferences.edit().putInt(permission, i10).apply();
    }

    public static final void requestPushPermissionPrompt(Activity activity) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, (Ia.a) c.f24307b, 4, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) d.f24308b, 6, (Object) null);
            return;
        }
        if (!wouldPushPermissionPromptDisplay(activity) || Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) e.f24309b, 6, (Object) null);
            return;
        }
        incrementPermissionRequestCount(activity, NOTIFICATION_PERMISSION);
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, (Ia.a) f.f24310b, 4, (Object) null);
        activity.requestPermissions(new String[]{NOTIFICATION_PERMISSION}, IntentUtils.getRequestCode());
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f24311b, 6, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) h.f24312b, 4, (Object) null);
            return false;
        }
        int i10 = activity.getApplicationInfo().targetSdkVersion;
        if (i10 < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) new i(i10), 4, (Object) null);
            return false;
        }
        if (hasPermission(activity, NOTIFICATION_PERMISSION)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) j.f24314b, 4, (Object) null);
            return false;
        }
        int permissionRequestCount = getPermissionRequestCount(activity, NOTIFICATION_PERMISSION);
        if (permissionRequestCount >= 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) new k(permissionRequestCount), 4, (Object) null);
            return activity.shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (Ia.a) l.f24316b, 4, (Object) null);
        return true;
    }
}
