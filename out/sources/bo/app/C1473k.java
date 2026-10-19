package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import com.braze.location.IBrazeGeofenceApi;
import java.util.List;

/* JADX INFO: renamed from: bo.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1473k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBrazeGeofenceApi f21392a;

    public C1473k() {
        IBrazeGeofenceApi iBrazeGeofenceApi = null;
        try {
            Object objNewInstance = Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type com.braze.location.IBrazeGeofenceApi");
            iBrazeGeofenceApi = (IBrazeGeofenceApi) objNewInstance;
        } catch (Exception unused) {
        }
        this.f21392a = iBrazeGeofenceApi;
    }

    public final boolean a() {
        return this.f21392a != null;
    }

    public final PendingIntent b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.f21392a;
        if (iBrazeGeofenceApi != null) {
            return iBrazeGeofenceApi.getGeofenceTransitionPendingIntent(context);
        }
        return null;
    }

    public final void a(Context applicationContext, PendingIntent intent) {
        kotlin.jvm.internal.i.e(applicationContext, "applicationContext");
        kotlin.jvm.internal.i.e(intent, "intent");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.f21392a;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.teardownGeofences(applicationContext, intent);
        }
    }

    public final void a(Context context, List geofenceList, PendingIntent geofenceRequestIntent) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(geofenceList, "geofenceList");
        kotlin.jvm.internal.i.e(geofenceRequestIntent, "geofenceRequestIntent");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.f21392a;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.registerGeofences(context, geofenceList, geofenceRequestIntent);
        }
    }

    public final void a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.f21392a;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.deleteRegisteredGeofenceCache(context);
        }
    }
}
