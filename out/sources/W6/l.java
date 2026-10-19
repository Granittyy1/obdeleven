package W6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;

/* JADX INFO: compiled from: FirebaseInAppMessagingDisplayImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class l implements FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        "Created activity: ".concat(activity.getClass().getName());
        H3.c.j();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        "Destroyed activity: ".concat(activity.getClass().getName());
        H3.c.j();
    }

    public void onActivityPaused(Activity activity) {
        "Pausing activity: ".concat(activity.getClass().getName());
        H3.c.j();
    }

    public void onActivityResumed(Activity activity) {
        "Resumed activity: ".concat(activity.getClass().getName());
        H3.c.j();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        "SavedInstance activity: ".concat(activity.getClass().getName());
        H3.c.j();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        "Started activity: ".concat(activity.getClass().getName());
        H3.c.j();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        "Stopped activity: ".concat(activity.getClass().getName());
        H3.c.j();
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public final void displayMessage(p083g7.h hVar, FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks) {
    }
}
