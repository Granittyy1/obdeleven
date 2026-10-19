package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import com.braze.models.BrazeGeofence;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IBrazeGeofenceApi {
    void deleteRegisteredGeofenceCache(Context context);

    PendingIntent getGeofenceTransitionPendingIntent(Context context);

    void registerGeofences(Context context, List<BrazeGeofence> list, PendingIntent pendingIntent);

    void teardownGeofences(Context context, PendingIntent pendingIntent);
}
