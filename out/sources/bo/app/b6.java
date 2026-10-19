package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b6 implements u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20771b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f20772a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f20773b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set end time to now for session json data";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f20774b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No stored open session in storage.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f20775b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not create new mutable session for open session.";
        }
    }

    public b6(Context context, String str, String str2) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f20772a = context.getSharedPreferences("com.appboy.storage.session_storage" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
    }

    @Override // bo.app.u2
    public t5 a() {
        String str = "";
        if (!this.f20772a.contains("current_open_session")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.f20774b, 3, (Object) null);
            return null;
        }
        try {
            String string = this.f20772a.getString(this.f20772a.getString("current_open_session", ""), "");
            if (string != null) {
                str = string;
            }
            return new t5(new JSONObject(str));
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, d.f20775b);
            return null;
        }
    }

    @Override // bo.app.u2
    public void a(t5 session) {
        kotlin.jvm.internal.i.e(session, "session");
        String string = session.s().toString();
        JSONObject jSONObjectForJsonPut = session.forJsonPut();
        SharedPreferences.Editor editorEdit = this.f20772a.edit();
        a(jSONObjectForJsonPut);
        editorEdit.putString(string, jSONObjectForJsonPut.toString());
        if (!session.y()) {
            editorEdit.putString("current_open_session", string);
        } else if (kotlin.jvm.internal.i.a(this.f20772a.getString("current_open_session", ""), string)) {
            editorEdit.remove("current_open_session");
        }
        editorEdit.apply();
    }

    @Override // bo.app.u2
    public void a(String sessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        SharedPreferences.Editor editorEdit = this.f20772a.edit();
        editorEdit.remove(sessionId);
        if (sessionId.equals(this.f20772a.getString("current_open_session", null))) {
            editorEdit.remove("current_open_session");
        }
        editorEdit.apply();
    }

    private final void a(JSONObject jSONObject) {
        if (jSONObject.has("end_time")) {
            return;
        }
        try {
            jSONObject.put("end_time", DateTimeUtils.nowInSecondsPrecise());
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f20773b);
        }
    }
}
