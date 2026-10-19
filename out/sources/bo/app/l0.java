package bo.app;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21467b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21468a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String a() {
            return String.valueOf(722989291);
        }

        private a() {
        }
    }

    public l0(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.device", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f21468a = sharedPreferences;
    }

    private final void a(String str) {
        this.f21468a.edit().putString("device_id", str).putString("persistent_device_id", f21467b.a()).apply();
    }

    @Override // bo.app.h2
    public String getDeviceId() {
        String string = a() ? null : this.f21468a.getString("device_id", null);
        if (string == null) {
            String strC = androidx.compose.animation.D.c("randomUUID().toString()");
            a(strC);
            return strC;
        }
        if (this.f21468a.contains("persistent_device_id")) {
            return string;
        }
        a(string);
        return string;
    }

    private final boolean a() {
        if (this.f21468a.contains("persistent_device_id")) {
            if (!kotlin.jvm.internal.i.a(f21467b.a(), this.f21468a.getString("persistent_device_id", ""))) {
                return true;
            }
        }
        return false;
    }
}
