package p238t4;

import com.braze.Constants;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ErrorReportData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f47264c;

    public a(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
        this.f47264c = lValueOf;
        this.f47263b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        i.d(string, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f47262a = string;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f47264c;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.f47263b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String string = jSONObject.toString();
        i.d(string, "params.toString()");
        return string;
    }
}
