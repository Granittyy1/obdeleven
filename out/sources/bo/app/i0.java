package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements IPutIntoJson, j2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f21264o = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BrazeConfigurationProvider f21265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21272i;
    private final Boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Boolean f21273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f21274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Boolean f21275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f21276n;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BrazeConfigurationProvider f21277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f21278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f21279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f21280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f21281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f21282f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f21283g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f21284h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f21285i;
        private Boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f21286k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Boolean f21287l;

        public a(BrazeConfigurationProvider configurationProvider) {
            kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
            this.f21277a = configurationProvider;
        }

        public final a a(String str) {
            this.f21278b = str;
            return this;
        }

        public final a b(String str) {
            if (str != null && !kotlin.text.n.S(str)) {
                this.f21280d = str;
            }
            return this;
        }

        public final a c(String str) {
            this.f21279c = str;
            return this;
        }

        public final a d(String str) {
            this.f21286k = str;
            return this;
        }

        public final a e(String str) {
            this.f21282f = str;
            return this;
        }

        public final a f(String str) {
            this.f21281e = str;
            return this;
        }

        public final a g(String str) {
            this.f21284h = str;
            return this;
        }

        public final a h(String str) {
            this.f21283g = str;
            return this;
        }

        public final a a(Boolean bool) {
            this.f21287l = bool;
            return this;
        }

        public final a b(Boolean bool) {
            this.j = bool;
            return this;
        }

        public final a c(Boolean bool) {
            this.f21285i = bool;
            return this;
        }

        public final i0 a() {
            return new i0(this.f21277a, this.f21278b, this.f21279c, this.f21280d, this.f21281e, this.f21282f, this.f21283g, this.f21284h, this.f21285i, this.j, this.f21286k, this.f21287l);
        }
    }

    public static final class b {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21288a;

            static {
                int[] iArr = new int[DeviceKey.values().length];
                try {
                    iArr[DeviceKey.TIMEZONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DeviceKey.CARRIER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DeviceKey.ANDROID_VERSION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DeviceKey.RESOLUTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DeviceKey.LOCALE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DeviceKey.BRAND.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DeviceKey.MODEL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[DeviceKey.NOTIFICATIONS_ENABLED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[DeviceKey.IS_BACKGROUND_RESTRICTED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[DeviceKey.GOOGLE_ADVERTISING_ID.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[DeviceKey.AD_TRACKING_ENABLED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                f21288a = iArr;
            }
        }

        /* JADX INFO: renamed from: bo.app.i0$b$b, reason: collision with other inner class name */
        public static final class C0220b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ DeviceKey f21289b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0220b(DeviceKey deviceKey) {
                super(0);
                this.f21289b = deviceKey;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Not adding device key <" + this.f21289b + "> to export due to allowlist restrictions.";
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final i0 a(BrazeConfigurationProvider configurationProvider, JSONObject jsonObject) {
            kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
            kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
            a aVar = new a(configurationProvider);
            for (DeviceKey deviceKey : DeviceKey.values()) {
                String key = deviceKey.getKey();
                switch (a.f21288a[deviceKey.ordinal()]) {
                    case 1:
                        aVar.h(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 2:
                        aVar.c(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 3:
                        aVar.a(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 4:
                        aVar.g(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 5:
                        aVar.e(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 6:
                        aVar.b(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 7:
                        aVar.f(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 8:
                        if (jsonObject.has(key)) {
                            aVar.c(Boolean.valueOf(jsonObject.optBoolean(key, true)));
                        }
                        break;
                    case 9:
                        if (jsonObject.has(key)) {
                            aVar.b(Boolean.valueOf(jsonObject.optBoolean(key, false)));
                        }
                        break;
                    case 10:
                        aVar.d(JsonUtils.getOptionalString(jsonObject, key));
                        break;
                    case 11:
                        if (jsonObject.has(key)) {
                            aVar.a(Boolean.valueOf(jsonObject.optBoolean(key)));
                        }
                        break;
                }
            }
            return aVar.a();
        }

        private b() {
        }

        public final void a(BrazeConfigurationProvider configurationProvider, JSONObject deviceExport, DeviceKey exportKey, Object obj) throws JSONException {
            kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
            kotlin.jvm.internal.i.e(deviceExport, "deviceExport");
            kotlin.jvm.internal.i.e(exportKey, "exportKey");
            if (configurationProvider.isDeviceObjectAllowlistEnabled() && !configurationProvider.getDeviceObjectAllowlist().contains(exportKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0220b(exportKey), 2, (Object) null);
            } else {
                deviceExport.putOpt(exportKey.getKey(), obj);
            }
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21290b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating device Json.";
        }
    }

    public i0(BrazeConfigurationProvider configurationProvider, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, Boolean bool3) {
        kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
        this.f21265b = configurationProvider;
        this.f21266c = str;
        this.f21267d = str2;
        this.f21268e = str3;
        this.f21269f = str4;
        this.f21270g = str5;
        this.f21271h = str6;
        this.f21272i = str7;
        this.j = bool;
        this.f21273k = bool2;
        this.f21274l = str8;
        this.f21275m = bool3;
    }

    public final void a(boolean z10) {
        this.f21276n = z10;
    }

    @Override // bo.app.j2
    public boolean isEmpty() {
        return forJsonPut().length() == 0;
    }

    public final boolean u() {
        return forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey());
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            b bVar = f21264o;
            bVar.a(this.f21265b, jSONObject, DeviceKey.ANDROID_VERSION, this.f21266c);
            bVar.a(this.f21265b, jSONObject, DeviceKey.CARRIER, this.f21267d);
            bVar.a(this.f21265b, jSONObject, DeviceKey.BRAND, this.f21268e);
            bVar.a(this.f21265b, jSONObject, DeviceKey.MODEL, this.f21269f);
            bVar.a(this.f21265b, jSONObject, DeviceKey.RESOLUTION, this.f21272i);
            bVar.a(this.f21265b, jSONObject, DeviceKey.LOCALE, this.f21270g);
            bVar.a(this.f21265b, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.j);
            bVar.a(this.f21265b, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.f21273k);
            String str = this.f21274l;
            if (str != null && !kotlin.text.n.S(str)) {
                bVar.a(this.f21265b, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.f21274l);
            }
            Boolean bool = this.f21275m;
            if (bool != null) {
                bVar.a(this.f21265b, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str2 = this.f21271h;
            if (str2 != null && !kotlin.text.n.S(str2)) {
                bVar.a(this.f21265b, jSONObject, DeviceKey.TIMEZONE, this.f21271h);
            }
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, c.f21290b);
        }
        return jSONObject;
    }

    public final boolean w() {
        return this.f21276n;
    }
}
