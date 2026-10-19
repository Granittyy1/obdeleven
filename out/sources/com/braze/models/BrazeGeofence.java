package com.braze.models;

import com.braze.support.JsonUtils;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    private static final String ANALYTICS_ENABLED_ENTER = "analytics_enabled_enter";
    private static final String ANALYTICS_ENABLED_EXIT = "analytics_enabled_exit";
    private static final String COOLDOWN_ENTER_SECONDS = "cooldown_enter";
    private static final String COOLDOWN_EXIT_SECONDS = "cooldown_exit";
    public static final a Companion = new a(null);
    private static final int DEFAULT_NOTIFICATION_RESPONSIVENESS_MS = 30000;
    private static final String ENTER_EVENTS = "enter_events";
    private static final String EXIT_EVENTS = "exit_events";
    private static final String ID = "id";
    private static final String LATITUDE = "latitude";
    private static final String LONGITUDE = "longitude";
    private static final String NOTIFICATION_RESPONSIVENESS_MS = "notification_responsiveness";
    private static final String RADIUS_METERS = "radius";
    private final boolean analyticsEnabledEnter;
    private final boolean analyticsEnabledExit;
    private final int cooldownEnterSeconds;
    private final int cooldownExitSeconds;
    private double distanceFromGeofenceRefresh;
    private final boolean enterEvents;
    private final boolean exitEvents;
    private final String id;
    private final JSONObject jsonObject;
    private final double latitude;
    private final double longitude;
    private final int notificationResponsivenessMs;
    private final int radiusMeter;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public BrazeGeofence(JSONObject jsonObject, String id, double d10, double d11, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, boolean z13, int i13) {
        i.e(jsonObject, "jsonObject");
        i.e(id, "id");
        this.jsonObject = jsonObject;
        this.id = id;
        this.latitude = d10;
        this.longitude = d11;
        this.radiusMeter = i10;
        this.cooldownEnterSeconds = i11;
        this.cooldownExitSeconds = i12;
        this.analyticsEnabledEnter = z10;
        this.analyticsEnabledExit = z11;
        this.enterEvents = z12;
        this.exitEvents = z13;
        this.notificationResponsivenessMs = i13;
        this.distanceFromGeofenceRefresh = -1.0d;
    }

    public final boolean equivalentServerData(BrazeGeofence otherGeofence) {
        i.e(otherGeofence, "otherGeofence");
        try {
            return JsonUtils.isEqualTo(this.jsonObject, otherGeofence.forJsonPut());
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean getAnalyticsEnabledEnter() {
        return this.analyticsEnabledEnter;
    }

    public final boolean getAnalyticsEnabledExit() {
        return this.analyticsEnabledExit;
    }

    public final int getCooldownEnterSeconds() {
        return this.cooldownEnterSeconds;
    }

    public final int getCooldownExitSeconds() {
        return this.cooldownExitSeconds;
    }

    public final double getDistanceFromGeofenceRefresh() {
        return this.distanceFromGeofenceRefresh;
    }

    public final boolean getEnterEvents() {
        return this.enterEvents;
    }

    public final boolean getExitEvents() {
        return this.exitEvents;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getNotificationResponsivenessMs() {
        return this.notificationResponsivenessMs;
    }

    public final int getRadiusMeter() {
        return this.radiusMeter;
    }

    public final double getRadiusMeters() {
        return this.radiusMeter;
    }

    public final void setDistanceFromGeofenceRefresh(double d10) {
        this.distanceFromGeofenceRefresh = d10;
    }

    public String toString() {
        return "BrazeGeofence{id=" + this.id + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", radiusMeters=" + this.radiusMeter + ", cooldownEnterSeconds=" + this.cooldownEnterSeconds + ", cooldownExitSeconds=" + this.cooldownExitSeconds + ", analyticsEnabledEnter=" + this.analyticsEnabledEnter + ", analyticsEnabledExit=" + this.analyticsEnabledExit + ", enterEvents=" + this.enterEvents + ", exitEvents=" + this.exitEvents + ", notificationResponsivenessMs=" + this.notificationResponsivenessMs + ", distanceFromGeofenceRefresh=" + this.distanceFromGeofenceRefresh + " }";
    }

    @Override // java.lang.Comparable
    public int compareTo(BrazeGeofence other) {
        i.e(other, "other");
        double d10 = this.distanceFromGeofenceRefresh;
        return (d10 != -1.0d && d10 < other.distanceFromGeofenceRefresh) ? -1 : 1;
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        return this.jsonObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BrazeGeofence(JSONObject jsonObject) throws JSONException {
        i.e(jsonObject, "jsonObject");
        String string = jsonObject.getString("id");
        i.d(string, "jsonObject.getString(ID)");
        this(jsonObject, string, jsonObject.getDouble("latitude"), jsonObject.getDouble("longitude"), jsonObject.getInt(RADIUS_METERS), jsonObject.getInt(COOLDOWN_ENTER_SECONDS), jsonObject.getInt(COOLDOWN_EXIT_SECONDS), jsonObject.getBoolean(ANALYTICS_ENABLED_ENTER), jsonObject.getBoolean(ANALYTICS_ENABLED_EXIT), jsonObject.optBoolean(ENTER_EVENTS, true), jsonObject.optBoolean(EXIT_EVENTS, true), jsonObject.optInt(NOTIFICATION_RESPONSIVENESS_MS, DEFAULT_NOTIFICATION_RESPONSIVENESS_MS));
    }

    public static /* synthetic */ void getDistanceFromGeofenceRefresh$annotations() {
    }
}
