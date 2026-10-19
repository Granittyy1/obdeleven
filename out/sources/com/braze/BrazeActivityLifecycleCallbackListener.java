package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BrazeActivityLifecycleCallbackListener.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    private Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;
    private final boolean registerInAppMessageManager;
    private Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;

    public BrazeActivityLifecycleCallbackListener() {
        this(false, false, null, null, 15, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityCreated.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: " + activity.getClass();
                }
            }, 2, (Object) null);
            BrazeInAppMessageManager companion = BrazeInAppMessageManager.Companion.getInstance();
            Context applicationContext = activity.getApplicationContext();
            i.d(applicationContext, "activity.applicationContext");
            companion.ensureSubscribedToInAppMessageEvents(applicationContext);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        i.e(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityPaused.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Automatically calling lifecycle method: unregisterInAppMessageManager for class: " + activity.getClass();
                }
            }, 2, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().unregisterInAppMessageManager(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        i.e(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityResumed.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Automatically calling lifecycle method: registerInAppMessageManager for class: " + activity.getClass();
                }
            }, 2, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().registerInAppMessageManager(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        i.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        i.e(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityStarted.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Automatically calling lifecycle method: openSession for class: " + activity.getClass();
                }
            }, 2, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context applicationContext = activity.getApplicationContext();
            i.d(applicationContext, "activity.applicationContext");
            companion.getInstance(applicationContext).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        i.e(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.onActivityStopped.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Automatically calling lifecycle method: closeSession for class: " + activity.getClass();
                }
            }, 2, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context applicationContext = activity.getApplicationContext();
            i.d(applicationContext, "activity.applicationContext");
            companion.getInstance(applicationContext).closeSession(activity);
        }
    }

    public final void registerOnApplication(Context context) {
        i.e(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.registerOnApplication.1
                @Override // Ia.a
                public final String invoke() {
                    return "Failed to register this lifecycle callback listener directly against application class";
                }
            });
        }
    }

    public final void setInAppMessagingRegistrationBlocklist(final Set<? extends Class<?>> blocklist) {
        i.e(blocklist, "blocklist");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.setInAppMessagingRegistrationBlocklist.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "setInAppMessagingRegistrationBlocklist called with blocklist: " + blocklist;
            }
        }, 2, (Object) null);
        this.inAppMessagingRegistrationBlocklist = blocklist;
    }

    public final void setSessionHandlingBlocklist(final Set<? extends Class<?>> blocklist) {
        i.e(blocklist, "blocklist");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.setSessionHandlingBlocklist.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "setSessionHandlingBlocklist called with blocklist: " + blocklist;
            }
        }, 2, (Object) null);
        this.sessionHandlingBlocklist = blocklist;
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean z10) {
        i.e(activity, "activity");
        Class<?> cls = activity.getClass();
        if (cls.equals(NotificationTrampolineActivity.class)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.shouldHandleLifecycleMethodsInActivity.1
                @Override // Ia.a
                public final String invoke() {
                    return "Skipping automatic registration for notification trampoline activity class.";
                }
            }, 2, (Object) null);
            return false;
        }
        if (z10) {
            if (this.sessionHandlingBlocklist.contains(cls)) {
                return false;
            }
        } else if (this.inAppMessagingRegistrationBlocklist.contains(cls)) {
            return false;
        }
        return true;
    }

    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set) {
        this(set, (Set) null, 2, (e) null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z10) {
        this(z10, false, null, null, 14, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z10, boolean z11) {
        this(z10, z11, null, null, 12, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z10, boolean z11, Set<? extends Class<?>> set) {
        this(z10, z11, set, null, 8, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z10, boolean z11, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z10;
        this.registerInAppMessageManager = z11;
        this.inAppMessagingRegistrationBlocklist = set == null ? EmptySet.f42985b : set;
        this.sessionHandlingBlocklist = set2 == null ? EmptySet.f42985b : set2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.1
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: " + BrazeActivityLifecycleCallbackListener.this.inAppMessagingRegistrationBlocklist;
            }
        }, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.BrazeActivityLifecycleCallbackListener.2
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "BrazeActivityLifecycleCallbackListener using session handling blocklist: " + BrazeActivityLifecycleCallbackListener.this.sessionHandlingBlocklist;
            }
        }, 2, (Object) null);
    }

    public BrazeActivityLifecycleCallbackListener(Set set, Set set2, int i10, e eVar) {
        this((Set<? extends Class<?>>) set, (Set<? extends Class<?>>) ((i10 & 2) != 0 ? EmptySet.f42985b : set2));
    }

    public BrazeActivityLifecycleCallbackListener(boolean z10, boolean z11, Set set, Set set2, int i10, e eVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (Set<? extends Class<?>>) ((i10 & 4) != 0 ? EmptySet.f42985b : set), (Set<? extends Class<?>>) ((i10 & 8) != 0 ? EmptySet.f42985b : set2));
    }

    public BrazeActivityLifecycleCallbackListener(Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this(true, true, set, set2);
    }
}
