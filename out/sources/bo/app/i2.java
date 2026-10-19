package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21298a = a.f21299a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f21299a = new a();

        /* JADX INFO: renamed from: bo.app.i2$a$a, reason: collision with other inner class name */
        public static final class C0221a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JSONObject f21300b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0221a(JSONObject jSONObject) {
                super(0);
                this.f21300b = jSONObject;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to parse json. Returning unknown.\n" + this.f21300b;
            }
        }

        private a() {
        }

        public final i2 a(JSONObject json) {
            kotlin.jvm.internal.i.e(json, "json");
            if (kotlin.jvm.internal.i.a(json.getString("type"), b.CONTENT_CARD_REFRESH.b())) {
                return new t0();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new C0221a(json), 3, (Object) null);
            return new x0();
        }
    }

    public enum b {
        UNKNOWN(""),
        CONTENT_CARD_REFRESH("ccr");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f21304b;

        b(String str) {
            this.f21304b = str;
        }

        public final String b() {
            return this.f21304b;
        }
    }

    b a();
}
