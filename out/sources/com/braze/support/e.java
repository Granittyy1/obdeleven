package com.braze.support;

import com.braze.models.BrazeGeofence;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f24377a = new e();

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24378b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received null or blank geofence Json. Not parsing.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f24379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject) {
            super(0);
            this.f24379b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize geofence Json due to JSONException: " + this.f24379b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f24380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f24380b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize geofence Json:" + this.f24380b;
        }
    }

    private e() {
    }

    public static final List a(JSONArray geofenceJson) {
        kotlin.jvm.internal.i.e(geofenceJson, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = geofenceJson.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = geofenceJson.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f24377a, BrazeLogger.Priority.W, (Throwable) null, a.f24378b, 2, (Object) null);
                } catch (JSONException e10) {
                    BrazeLogger.INSTANCE.brazelog(f24377a, BrazeLogger.Priority.W, e10, new b(jSONObjectOptJSONObject));
                } catch (Exception e11) {
                    BrazeLogger.INSTANCE.brazelog(f24377a, BrazeLogger.Priority.E, e11, new c(jSONObjectOptJSONObject));
                }
            } else {
                arrayList.add(new BrazeGeofence(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }
}
