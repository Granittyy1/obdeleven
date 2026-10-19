package com.obdeleven.service.model.fault;

import O.e;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.FaultException;
import com.obdeleven.service.model.ControlUnit;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p181o8.a;
import p255u9.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Fault {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29430a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ControlUnit f29431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f29434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f29437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29438i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v f29440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f29441m;

    public enum UnknownDescription {
        ENGLISH("en", "Unknown"),
        /* JADX INFO: Fake field, exist only in values array */
        GERMAN("de", "Unbekannt"),
        /* JADX INFO: Fake field, exist only in values array */
        SPANISH("es", "Desconocido"),
        /* JADX INFO: Fake field, exist only in values array */
        RUSSIAN("ru", "Неизвестно"),
        /* JADX INFO: Fake field, exist only in values array */
        FRANCE("fr", "Inconnu"),
        /* JADX INFO: Fake field, exist only in values array */
        CZECH("cs", "Neznámý"),
        /* JADX INFO: Fake field, exist only in values array */
        DANISH("da", "Ukendt"),
        /* JADX INFO: Fake field, exist only in values array */
        FINLAND("fi", "Tuntematon"),
        /* JADX INFO: Fake field, exist only in values array */
        CROATIAN("hr", "Nepoznato"),
        /* JADX INFO: Fake field, exist only in values array */
        HUNGARIAN("hu", "Ismeretlen"),
        /* JADX INFO: Fake field, exist only in values array */
        ITALIAN("it", "Sconosciuto"),
        /* JADX INFO: Fake field, exist only in values array */
        JAPAN("ja", "不明"),
        /* JADX INFO: Fake field, exist only in values array */
        KOREAN("ko", "알 수 없음"),
        /* JADX INFO: Fake field, exist only in values array */
        NETHERLANDS("nl", "Onbekend"),
        /* JADX INFO: Fake field, exist only in values array */
        POLISH("pl", "Nieznany"),
        /* JADX INFO: Fake field, exist only in values array */
        PORTUGAL("pt", "Desconhecido"),
        /* JADX INFO: Fake field, exist only in values array */
        SLOVENIA("sl", "Neznano"),
        /* JADX INFO: Fake field, exist only in values array */
        SWEDEN("sv", "Okänt"),
        /* JADX INFO: Fake field, exist only in values array */
        TURKEY("tr", "Bilinmiyor"),
        /* JADX INFO: Fake field, exist only in values array */
        GREECE("el", "Άγνωστο"),
        /* JADX INFO: Fake field, exist only in values array */
        CHINESE("zh", "未知");

        private final String code;
        private final String desc;

        UnknownDescription(String str, String str2) {
            this.code = str;
            this.desc = str2;
        }

        public static String a(String str) {
            for (UnknownDescription unknownDescription : values()) {
                if (unknownDescription.code.equals(str)) {
                    return unknownDescription.desc;
                }
            }
            return ENGLISH.desc;
        }
    }

    public static int a(JSONArray jSONArray) {
        int i10 = 0;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            if (jSONArray.optJSONObject(i11).optInt("statusStatus") == 0) {
                i10++;
            }
        }
        return i10;
    }

    public static JSONArray j(List<Fault> list) {
        JSONArray jSONArray = new JSONArray();
        for (Fault fault : list) {
            fault.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                if (fault.b() == ApplicationProtocol.f29264d) {
                    jSONObject.put("rawFaultCode", fault.f29432c);
                } else {
                    jSONObject.put("faultCode", fault.f29433d);
                }
                jSONObject.put("statusStatus", fault.h());
                jSONObject.put("faultStatus", fault.e());
                if (fault.f() != null) {
                    jSONObject.put("freezeFrame", fault.f().b());
                }
            } catch (FaultException e10) {
                e = e10;
                e.m(e);
            } catch (JSONException e11) {
                e = e11;
                e.m(e);
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public abstract ApplicationProtocol b();

    public String c(String str) {
        v vVar = this.f29434e;
        if (vVar == null) {
            return UnknownDescription.a(str);
        }
        String string = vVar.getString(str);
        return string == null ? this.f29434e.getString("en") : string;
    }

    public final String d(String str) {
        v vVar = this.f29437h;
        if (vVar == null) {
            return UnknownDescription.a(str);
        }
        String string = vVar.getString(str);
        return string == null ? this.f29437h.getString("en") : string;
    }

    public final String e() {
        if (this.f29439k == null) {
            this.f29439k = String.format(Locale.US, this.f29431b.f29327i == ApplicationProtocol.f29262b ? "KFST%04d" : "FST%05d", Integer.valueOf(this.f29436g));
        }
        return this.f29439k;
    }

    public final a f() throws FaultException {
        if (this.f29430a && this.f29441m == null) {
            throw new FaultException();
        }
        return this.f29441m;
    }

    public final String g(String str) {
        v vVar = this.f29440l;
        if (vVar == null) {
            return UnknownDescription.a(str);
        }
        String string = vVar.getString(str);
        return string == null ? this.f29440l.getString("en") : string;
    }

    public final String h() {
        if (this.j == null) {
            this.j = String.format(Locale.US, "SST%05d", Integer.valueOf(this.f29438i));
        }
        return this.j;
    }

    public boolean i() {
        return true;
    }
}
