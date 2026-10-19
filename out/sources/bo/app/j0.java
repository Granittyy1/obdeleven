package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AbstractC1455a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f21331f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BrazeConfigurationProvider f21332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f21333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedPreferences f21334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i0 f21335e;

    public static final class a {

        /* JADX INFO: renamed from: bo.app.j0$a$a, reason: collision with other inner class name */
        public static final class C0222a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0222a f21336b = new C0222a();

            public C0222a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught json exception while creating the diff. Returning null";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f21337b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "shouldReportPushPermissionsAsGranted: Returning true given that push is permissible now and notifications enabled transitioned to true.";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f21338b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "shouldReportPushPermissionsAsGranted: Returning true since notifications enabled is true and device has upgraded to Tiramisu or beyond.";
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f21339b = new d();

            public d() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Returning false for shouldReportPushPermissionsAsGranted.";
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject2.opt(next);
                Object objOpt2 = jSONObject.opt(next);
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            if (objOpt2 == null || !JsonUtils.areJsonObjectsEqual((JSONObject) objOpt, (JSONObject) objOpt2)) {
                                jSONObject3.put(next, objOpt);
                            }
                        } else if (!objOpt.equals(objOpt2)) {
                            jSONObject3.put(next, objOpt);
                        }
                    } catch (JSONException e10) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, C0222a.f21336b);
                        return null;
                    }
                }
            }
            return jSONObject3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject a(SharedPreferences sharedPreferences) {
            String string = sharedPreferences.getString("cached_device", "{}");
            return new JSONObject(string != null ? string : "{}");
        }

        public final boolean a(JSONObject cachedDeviceJson, JSONObject liveDeviceJson, int i10, int i11) {
            kotlin.jvm.internal.i.e(cachedDeviceJson, "cachedDeviceJson");
            kotlin.jvm.internal.i.e(liveDeviceJson, "liveDeviceJson");
            boolean z10 = i11 >= 33;
            boolean z11 = i10 < 33 && z10;
            DeviceKey deviceKey = DeviceKey.NOTIFICATIONS_ENABLED;
            boolean zOptBoolean = liveDeviceJson.optBoolean(deviceKey.getKey(), false);
            boolean z12 = zOptBoolean && !cachedDeviceJson.optBoolean(deviceKey.getKey(), false);
            if (z10 && z12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.f21337b, 3, (Object) null);
                return true;
            }
            if (zOptBoolean && z11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.f21338b, 3, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, d.f21339b, 2, (Object) null);
            return false;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21340b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception confirming and unlocking device cache.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21341b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Sending full device on next export but keeping cache intact.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21342b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception confirming and unlocking JSON objects.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21343b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to generate diff between the cached and live device. Returning the live device.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f21344b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Remote Notification Enabled changed to true. Updating user subscription.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21346c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, boolean z11) {
            super(0);
            this.f21345b = z10;
            this.f21346c = z11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exporting the full device due to either: shouldShouldFullDeviceOnNextExport: " + this.f21345b + ", shouldReportPushPermissionsAsGranted: " + this.f21346c;
        }
    }

    public /* synthetic */ j0(Context context, String str, String str2, int i10, kotlin.jvm.internal.e eVar) {
        this(context, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }

    public final void a(i0 i0Var) {
        this.f21335e = i0Var;
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, c.f21341b, 2, (Object) null);
        this.f21334d.edit().putBoolean("sfone", true).apply();
    }

    @Override // bo.app.AbstractC1455a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i0 d() {
        JSONObject jSONObject;
        JSONObject jSONObjectA;
        JSONObject jSONObject2 = new JSONObject();
        i0 i0Var = this.f21335e;
        if (i0Var == null || (jSONObject = i0Var.forJsonPut()) == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject2 = f21331f.a(this.f21333c);
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, d.f21342b);
        }
        a aVar = f21331f;
        SharedPreferences sharedPreferences = this.f21334d;
        int i10 = Build.VERSION.SDK_INT;
        boolean zA = aVar.a(jSONObject2, jSONObject, sharedPreferences.getInt("ldov", i10), i10);
        boolean z10 = this.f21334d.getBoolean("sfone", false);
        if (z10 || zA) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(z10, zA), 3, (Object) null);
            jSONObjectA = aVar.a(new JSONObject(), jSONObject);
        } else {
            jSONObjectA = aVar.a(jSONObject2, jSONObject);
        }
        if (jSONObjectA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.f21343b, 3, (Object) null);
            return this.f21335e;
        }
        i0 i0VarA = i0.f21264o.a(this.f21332b, jSONObjectA);
        if (zA) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, f.f21344b, 2, (Object) null);
            i0VarA.a(true);
        }
        return i0VarA;
    }

    public j0(Context context, String str, String str2) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f21332b = new BrazeConfigurationProvider(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.device_cache.v3" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f21333c = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.storage.device_cache.metadata" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        kotlin.jvm.internal.i.d(sharedPreferences2, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f21334d = sharedPreferences2;
    }

    @Override // bo.app.AbstractC1455a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(i0 outboundObject, boolean z10) {
        kotlin.jvm.internal.i.e(outboundObject, "outboundObject");
        if (z10) {
            try {
                this.f21333c.edit().putString("cached_device", JsonUtils.mergeJsonObjects(f21331f.a(this.f21333c), outboundObject.forJsonPut()).toString()).apply();
                this.f21334d.edit().putBoolean("sfone", false).putInt("ldov", Build.VERSION.SDK_INT).apply();
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f21340b);
            }
        }
    }
}
