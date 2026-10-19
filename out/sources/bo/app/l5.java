package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class l5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21474b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21475a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21476b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10) {
            super(0);
            this.f21476b = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Setting Braze SDK disabled to: " + this.f21476b;
        }
    }

    public l5(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f21475a = new SharedPreferencesC1463e(context, "persistent.com.appboy.storage.sdk_enabled_cache");
    }

    public final boolean a() {
        return this.f21475a.getBoolean("appboy_sdk_disabled", false);
    }

    public final void a(boolean z10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new b(z10), 2, (Object) null);
        this.f21475a.edit().putBoolean("appboy_sdk_disabled", z10).apply();
    }
}
