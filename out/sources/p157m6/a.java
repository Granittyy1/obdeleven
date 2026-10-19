package p157m6;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: AbtExperimentInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f44599g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f44600h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f44604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f44606f;

    public a(String str, String str2, String str3, Date date, long j, long j10) {
        this.f44601a = str;
        this.f44602b = str2;
        this.f44603c = str3;
        this.f44604d = date;
        this.f44605e = j;
        this.f44606f = j10;
    }

    public static a a(Map<String, String> map) throws AbtException {
        d(map);
        try {
            return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f44600h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    public static void d(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        String[] strArr = f44599g;
        for (int i10 = 0; i10 < 5; i10++) {
            String str = strArr[i10];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public final p6.a.c b(String str) {
        p6.a.c cVar = new p6.a.c();
        cVar.f45854a = str;
        cVar.f45865m = this.f44604d.getTime();
        cVar.f45855b = this.f44601a;
        cVar.f45856c = this.f44602b;
        String str2 = this.f44603c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        cVar.f45857d = str2;
        cVar.f45858e = this.f44605e;
        cVar.j = this.f44606f;
        return cVar;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        map.put("experimentId", this.f44601a);
        map.put("variantId", this.f44602b);
        map.put("triggerEvent", this.f44603c);
        map.put("experimentStartTime", f44600h.format(this.f44604d));
        map.put("triggerTimeoutMillis", Long.toString(this.f44605e));
        map.put("timeToLiveMillis", Long.toString(this.f44606f));
        return map;
    }
}
