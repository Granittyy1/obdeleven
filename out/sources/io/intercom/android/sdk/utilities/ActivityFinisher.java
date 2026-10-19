package io.intercom.android.sdk.utilities;

import android.app.Activity;
import androidx.collection.C0874b;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ActivityFinisher {
    private final Set<Activity> activities = new C0874b(0);

    public void finishActivities() {
        Iterator<Activity> it = this.activities.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        this.activities.clear();
    }

    public void register(Activity activity) {
        this.activities.add(activity);
    }

    public void unregister(Activity activity) {
        this.activities.remove(activity);
    }
}
