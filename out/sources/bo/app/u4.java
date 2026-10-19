package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class u4 implements n2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22002c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BrazeConfigurationProvider f22003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f22004b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f22005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22006c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11) {
            super(0);
            this.f22005b = i10;
            this.f22006c = i11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Stored push registration ID version code ");
            sb2.append(this.f22005b);
            sb2.append(" does not match live version code ");
            return p005a4.q.c(sb2, this.f22006c, ". Not returning saved registration ID.");
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f22007b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Device identifier differs from saved device identifier. Returning null token.";
        }
    }

    public u4(Context context, BrazeConfigurationProvider configurationProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
        this.f22003a = configurationProvider;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.push_registration", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f22004b = sharedPreferences;
    }

    private final boolean b() {
        return this.f22003a.isFirebaseCloudMessagingRegistrationEnabled() || this.f22003a.isAdmMessagingRegistrationEnabled();
    }

    @Override // bo.app.n2
    public synchronized String a() {
        int versionCode;
        int i10;
        if (b() && this.f22004b.contains("version_code") && (versionCode = this.f22003a.getVersionCode()) != (i10 = this.f22004b.getInt("version_code", Integer.MIN_VALUE))) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(i10, versionCode), 2, (Object) null);
            return null;
        }
        if (this.f22004b.contains("device_identifier")) {
            if (!kotlin.jvm.internal.i.a(l0.f21467b.a(), this.f22004b.getString("device_identifier", ""))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.f22007b, 2, (Object) null);
                return null;
            }
        }
        return this.f22004b.getString("registration_id", null);
    }

    @Override // bo.app.n2
    public synchronized void a(String str) {
        try {
            if (str != null) {
                this.f22004b.edit().putString("registration_id", str).putInt("version_code", this.f22003a.getVersionCode()).putString("device_identifier", l0.f21467b.a()).apply();
            } else {
                throw new NullPointerException("Provided push token is null. Cannot set null push token.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
