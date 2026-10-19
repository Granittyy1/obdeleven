package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20894b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f20895c = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f20896a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String a(a2 event) throws JSONException {
            kotlin.jvm.internal.i.e(event, "event");
            return event.a() + m4.j.a(event);
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map.Entry f20897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map.Entry entry) {
            super(0);
            this.f20897b = entry;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get expiration time. Deleting entry: " + this.f20897b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f20898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a2 a2Var) {
            super(0);
            this.f20898b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Event already seen in cache. Ignoring duplicate: " + this.f20898b;
        }
    }

    public e1(Context context, String str, String apiKey) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.event_data_validator" + StringUtils.getCacheFileSuffix(context, str, apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f20896a = sharedPreferences;
        a();
    }

    private final boolean b(String str) {
        return this.f20896a.contains(str);
    }

    public boolean a(a2 event) throws JSONException {
        kotlin.jvm.internal.i.e(event, "event");
        if (event.a() != j1.PUSH_CLICKED) {
            return true;
        }
        a();
        String strA = f20894b.a(event);
        if (b(strA)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(event), 3, (Object) null);
            return false;
        }
        a(DateTimeUtils.nowInMilliseconds() + f20895c, strA);
        return true;
    }

    private final void a(String str) {
        this.f20896a.edit().remove(str).apply();
    }

    public final void a(long j, String eventKey) {
        kotlin.jvm.internal.i.e(eventKey, "eventKey");
        this.f20896a.edit().putLong(eventKey, j).apply();
    }

    public final void a() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (Map.Entry<String, ?> entry : this.f20896a.getAll().entrySet()) {
            try {
                Object value = entry.getValue();
                kotlin.jvm.internal.i.c(value, "null cannot be cast to non-null type kotlin.Long");
                if (jNowInMilliseconds >= ((Long) value).longValue()) {
                    String key = entry.getKey();
                    kotlin.jvm.internal.i.d(key, "entry.key");
                    a(key);
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new b(entry));
                String key2 = entry.getKey();
                kotlin.jvm.internal.i.d(key2, "entry.key");
                a(key2);
            }
        }
    }
}
