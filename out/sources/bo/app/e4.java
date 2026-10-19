package bo.app;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e4 implements f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f20901f = BrazeLogger.getBrazeLogTag((Class<?>) e4.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f4 f20902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f20905e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20906a;

        static {
            int[] iArr = new int[f4.values().length];
            f20906a = iArr;
            try {
                iArr[f4.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20906a[f4.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20906a[f4.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20906a[f4.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public e4(f4 f4Var, String str, int i10) {
        this.f20902b = f4Var;
        this.f20903c = str;
        this.f20904d = i10;
    }

    private boolean b(Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Double)) {
            return this.f20904d == 2;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        double dDoubleValue2 = ((Number) this.f20905e).doubleValue();
        int i10 = this.f20904d;
        if (i10 == 1) {
            return dDoubleValue == dDoubleValue2;
        }
        if (i10 == 2) {
            return dDoubleValue != dDoubleValue2;
        }
        if (i10 != 3) {
            return i10 == 5 && dDoubleValue < dDoubleValue2;
        }
        return dDoubleValue > dDoubleValue2;
    }

    private boolean c(Object obj) {
        if (!(obj instanceof String)) {
            int i10 = this.f20904d;
            return i10 == 2 || i10 == 17;
        }
        int i11 = this.f20904d;
        if (i11 == 1) {
            return obj.equals(this.f20905e);
        }
        if (i11 == 2) {
            return !obj.equals(this.f20905e);
        }
        if (i11 == 10) {
            return a((String) this.f20905e, (String) obj);
        }
        if (i11 != 17) {
            return false;
        }
        return !a((String) this.f20905e, (String) obj);
    }

    @Override // bo.app.f2
    public boolean a(x2 x2Var) {
        Object objOpt;
        if (!(x2Var instanceof z2)) {
            return false;
        }
        BrazeProperties brazePropertiesC = ((z2) x2Var).c();
        if (brazePropertiesC != null) {
            try {
                objOpt = brazePropertiesC.forJsonPut().opt(this.f20903c);
            } catch (Exception e10) {
                BrazeLogger.e(f20901f, "Caught exception checking property filter condition.", e10);
                return false;
            }
        } else {
            objOpt = null;
        }
        if (objOpt == null) {
            int i10 = this.f20904d;
            return i10 == 12 || i10 == 17 || i10 == 2;
        }
        int i11 = this.f20904d;
        if (i11 == 11) {
            return true;
        }
        if (i11 == 12) {
            return false;
        }
        int i12 = a.f20906a[this.f20902b.ordinal()];
        if (i12 == 1) {
            return c(objOpt);
        }
        if (i12 == 2) {
            return a(objOpt);
        }
        if (i12 == 3) {
            return a(objOpt, x2Var.b());
        }
        if (i12 != 4) {
            return false;
        }
        return b(objOpt);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f20902b.equals(f4.UNKNOWN)) {
                jSONObject.put("property_type", this.f20902b.toString());
            }
            jSONObject.put("property_key", this.f20903c);
            jSONObject.put("comparator", this.f20904d);
            jSONObject.put("property_value", this.f20905e);
        } catch (JSONException e10) {
            BrazeLogger.e(f20901f, "Caught exception creating property filter Json.", e10);
        }
        return jSONObject;
    }

    public e4(JSONObject jSONObject) {
        this((f4) JsonUtils.optEnum(jSONObject, "property_type", f4.class, f4.UNKNOWN), jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        if (jSONObject.has("property_value")) {
            if (this.f20902b.equals(f4.STRING)) {
                this.f20905e = jSONObject.getString("property_value");
                return;
            }
            if (this.f20902b.equals(f4.BOOLEAN)) {
                this.f20905e = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (this.f20902b.equals(f4.NUMBER)) {
                this.f20905e = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (this.f20902b.equals(f4.DATE)) {
                this.f20905e = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    private boolean a(Object obj, long j) {
        Date date = null;
        if (obj instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) obj, BrazeDateFormat.LONG);
            } catch (Exception e10) {
                BrazeLogger.e(f20901f, "Caught exception trying to parse date in compareTimestamps", e10);
            }
        }
        if (date == null) {
            return this.f20904d == 2;
        }
        long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
        long jLongValue = ((Number) this.f20905e).longValue();
        int i10 = this.f20904d;
        if (i10 == 15) {
            return timeFromEpochInSeconds < j + jLongValue;
        }
        if (i10 == 16) {
            return timeFromEpochInSeconds > j + jLongValue;
        }
        switch (i10) {
            case 1:
                return timeFromEpochInSeconds == jLongValue;
            case 2:
                return timeFromEpochInSeconds != jLongValue;
            case 3:
                return timeFromEpochInSeconds > jLongValue;
            case 4:
                return timeFromEpochInSeconds >= j - jLongValue;
            case 5:
                return timeFromEpochInSeconds < jLongValue;
            case 6:
                return timeFromEpochInSeconds <= j - jLongValue;
            default:
                return false;
        }
    }

    private boolean a(Object obj) {
        if (!(obj instanceof Boolean)) {
            return this.f20904d == 2;
        }
        int i10 = this.f20904d;
        if (i10 == 1) {
            return obj.equals(this.f20905e);
        }
        if (i10 != 2) {
            return false;
        }
        return !obj.equals(this.f20905e);
    }

    public static boolean a(String str, String str2) {
        return Pattern.compile(str, 2).matcher(str2).find();
    }
}
