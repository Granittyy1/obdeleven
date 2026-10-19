package com.braze.models.outgoing;

import android.location.Location;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeLocation implements IBrazeLocation {
    private static final a Companion = new a(null);
    private final Double _accuracy;
    private final Double _altitude;
    private final double _latitude;
    private final double _longitude;
    private final Double _verticalAccuracy;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Double a(Location location) {
            if (location.hasVerticalAccuracy()) {
                return Double.valueOf(location.getVerticalAccuracyMeters());
            }
            return null;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24201b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating location Json.";
        }
    }

    public BrazeLocation(double d10, double d11) {
        this(d10, d11, null, null, null, 28, null);
    }

    private final double component1() {
        return this._latitude;
    }

    private final double component2() {
        return this._longitude;
    }

    private final Double component3() {
        return this._altitude;
    }

    private final Double component4() {
        return this._accuracy;
    }

    private final Double component5() {
        return this._verticalAccuracy;
    }

    public final BrazeLocation copy(double d10, double d11, Double d12, Double d13, Double d14) {
        return new BrazeLocation(d10, d11, d12, d13, d14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeLocation)) {
            return false;
        }
        BrazeLocation brazeLocation = (BrazeLocation) obj;
        return Double.compare(this._latitude, brazeLocation._latitude) == 0 && Double.compare(this._longitude, brazeLocation._longitude) == 0 && i.a(this._altitude, brazeLocation._altitude) && i.a(this._accuracy, brazeLocation._accuracy) && i.a(this._verticalAccuracy, brazeLocation._verticalAccuracy);
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAccuracy() {
        return this._accuracy;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAltitude() {
        return this._altitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLatitude() {
        return this._latitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLongitude() {
        return this._longitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getVerticalAccuracy() {
        return this._verticalAccuracy;
    }

    public int hashCode() {
        int iHashCode = (Double.hashCode(this._longitude) + (Double.hashCode(this._latitude) * 31)) * 31;
        Double d10 = this._altitude;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this._accuracy;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this._verticalAccuracy;
        return iHashCode3 + (d12 != null ? d12.hashCode() : 0);
    }

    public String toString() {
        return "BrazeLocation(_latitude=" + this._latitude + ", _longitude=" + this._longitude + ", _altitude=" + this._altitude + ", _accuracy=" + this._accuracy + ", _verticalAccuracy=" + this._verticalAccuracy + ')';
    }

    public BrazeLocation(double d10, double d11, Double d12) {
        this(d10, d11, d12, null, null, 24, null);
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IBrazeLocation.LATITUDE, getLatitude());
            jSONObject.put(IBrazeLocation.LONGITUDE, getLongitude());
            if (getAltitude() != null) {
                jSONObject.put(IBrazeLocation.ALTITUDE, getAltitude());
            }
            if (getAccuracy() != null) {
                jSONObject.put(IBrazeLocation.ACCURACY, getAccuracy());
            }
            if (getVerticalAccuracy() != null) {
                jSONObject.put(IBrazeLocation.VERTICAL_ACCURACY, getVerticalAccuracy());
            }
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f24201b);
        }
        return jSONObject;
    }

    public BrazeLocation(double d10, double d11, Double d12, Double d13) {
        this(d10, d11, d12, d13, null, 16, null);
    }

    public BrazeLocation(double d10, double d11, Double d12, Double d13, Double d14) {
        this._latitude = d10;
        this._longitude = d11;
        this._altitude = d12;
        this._accuracy = d13;
        this._verticalAccuracy = d14;
        if (!ValidationUtils.isValidLocation(getLatitude(), getLongitude())) {
            throw new IllegalArgumentException("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively");
        }
    }

    public /* synthetic */ BrazeLocation(double d10, double d11, Double d12, Double d13, Double d14, int i10, e eVar) {
        this(d10, d11, (i10 & 4) != 0 ? null : d12, (i10 & 8) != 0 ? null : d13, (i10 & 16) != 0 ? null : d14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.hasAccuracy() ? Double.valueOf(location.getAccuracy()) : null, Companion.a(location));
        i.e(location, "location");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(JSONObject jsonObject) {
        this(jsonObject.getDouble(IBrazeLocation.LATITUDE), jsonObject.getDouble(IBrazeLocation.LONGITUDE), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.ALTITUDE), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.ACCURACY), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.VERTICAL_ACCURACY));
        i.e(jsonObject, "jsonObject");
    }
}
