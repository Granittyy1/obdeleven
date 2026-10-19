package com.facebook.appevents;

import D2.V;
import H3.c;
import Z3.q;
import android.os.Bundle;
import com.braze.Constants;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.l;
import p293xa.r;

/* JADX INFO: compiled from: AppEvent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEvent implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet<String> f24779b = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    /* JADX INFO: compiled from: AppEvent.kt */
    public static final class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        public SerializationProxyV2(String str, boolean z10, boolean z11, String str2) {
            this.jsonString = str;
            this.isImplicit = z10;
            this.inBackground = z11;
            this.checksum = str2;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum);
        }
    }

    /* JADX INFO: compiled from: AppEvent.kt */
    public static final class a {
        public static final String a(String str) {
            HashSet<String> hashSet = AppEvent.f24779b;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset charsetForName = Charset.forName("UTF-8");
                i.d(charsetForName, "Charset.forName(charsetName)");
                byte[] bytes = str.getBytes(charsetForName);
                i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                i.d(bArrDigest, "digest.digest()");
                return c.c(bArrDigest);
            } catch (UnsupportedEncodingException unused) {
                q qVar = q.f7852a;
                return "1";
            } catch (NoSuchAlgorithmException unused2) {
                q qVar2 = q.f7852a;
                return "0";
            }
        }

        public static final void b(String str) {
            boolean zContains;
            HashSet<String> hashSet = AppEvent.f24779b;
            if (str == null || str.length() == 0 || str.length() > 40) {
                if (str == null) {
                    str = "<None Provided>";
                }
                throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
            }
            HashSet<String> hashSet2 = AppEvent.f24779b;
            synchronized (hashSet2) {
                zContains = hashSet2.contains(str);
                r rVar = r.f47939a;
            }
            if (zContains) {
                return;
            }
            if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").e(str)) {
                throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
            }
            synchronized (hashSet2) {
                hashSet2.add(str);
            }
        }
    }

    public AppEvent(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) throws JSONException, FacebookException {
        String str;
        i.e(contextName, "contextName");
        i.e(eventName, "eventName");
        this.isImplicit = z10;
        this.inBackground = z11;
        this.name = eventName;
        a.b(eventName);
        JSONObject jSONObject = new JSONObject();
        if (p130k4.a.f41585b) {
            p130k4.a.f41584a.getClass();
            if (p130k4.a.f41587d.contains(eventName)) {
                eventName = "_removed_";
            }
        }
        jSONObject.put("_eventName", eventName);
        jSONObject.put("_eventName_md5", a.a(eventName));
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
        jSONObject.put("_ui", contextName);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            HashMap map = new HashMap();
            for (String key : bundle.keySet()) {
                i.d(key, "key");
                a.b(key);
                Object obj = bundle.get(key);
                if (!(obj instanceof String) && !(obj instanceof Number)) {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2)));
                }
                map.put(key, obj.toString());
            }
            if (V.f2577e && !map.isEmpty()) {
                try {
                    List<String> listO0 = kotlin.collections.q.o0(map.keySet());
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str2 : listO0) {
                        Object obj2 = map.get(str2);
                        if (obj2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String str3 = (String) obj2;
                        if (V.s(str2) || V.s(str3)) {
                            map.remove(str2);
                            if (!V.f2578f) {
                                str3 = "";
                            }
                            jSONObject2.put(str2, str3);
                        }
                    }
                    if (jSONObject2.length() != 0) {
                        String string = jSONObject2.toString();
                        i.d(string, "restrictiveParamJson.toString()");
                        map.put("_onDeviceParams", string);
                    }
                } catch (Exception unused) {
                }
            }
            p130k4.a aVar = p130k4.a.f41584a;
            String eventName2 = this.name;
            i.e(eventName2, "eventName");
            if (p130k4.a.f41585b) {
                HashMap map2 = new HashMap();
                for (String str4 : new ArrayList(map.keySet())) {
                    p130k4.a.f41584a.getClass();
                    try {
                        Iterator it = new ArrayList(p130k4.a.f41586c).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str = null;
                                break;
                            }
                            p130k4.a.C0473a c0473a = (p130k4.a.C0473a) it.next();
                            if (c0473a != null && eventName2.equals(c0473a.f41588a)) {
                                for (String str5 : c0473a.f41589b.keySet()) {
                                    if (i.a(str4, str5)) {
                                        str = (String) c0473a.f41589b.get(str5);
                                        break;
                                    }
                                    str = null;
                                }
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    if (str != null) {
                        map2.put(str4, str);
                        map.remove(str4);
                    }
                }
                if (!map2.isEmpty()) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        map.put("_restrictedParams", jSONObject3.toString());
                    } catch (JSONException unused3) {
                    }
                }
            }
            p056e4.a aVar2 = p056e4.a.f34730a;
            String eventName3 = this.name;
            i.e(eventName3, "eventName");
            if (p056e4.a.f34731b) {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                for (p056e4.a.C0360a c0360a : new ArrayList(p056e4.a.f34732c)) {
                    if (i.a(c0360a.f34734a, eventName3)) {
                        for (String str6 : arrayList) {
                            if (c0360a.f34735b.contains(str6)) {
                                map.remove(str6);
                            }
                        }
                    }
                }
            }
            for (String str7 : map.keySet()) {
                jSONObject.put(str7, map.get(str7));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            l.a aVar3 = l.f44910c;
            LoggingBehavior loggingBehavior = LoggingBehavior.f24776d;
            String string2 = jSONObject.toString();
            i.d(string2, "eventObject.toString()");
            l.a.b(loggingBehavior, "AppEvents", "Created app event '%s'", string2);
        }
        this.jsonObject = jSONObject;
        String string3 = jSONObject.toString();
        i.d(string3, "jsonObject.toString()");
        this.checksum = a.a(string3);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.jsonObject.toString();
        i.d(string, "jsonObject.toString()");
        return new SerializationProxyV2(string, this.isImplicit, this.inBackground, this.checksum);
    }

    public final boolean a() {
        return this.isImplicit;
    }

    public final JSONObject b() {
        return this.jsonObject;
    }

    public final String c() {
        return this.name;
    }

    public final boolean d() {
        if (this.checksum == null) {
            return true;
        }
        String string = this.jsonObject.toString();
        i.d(string, "jsonObject.toString()");
        return a.a(string).equals(this.checksum);
    }

    public final boolean e() {
        return this.isImplicit;
    }

    public final String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
    }

    public AppEvent(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z10;
        String strOptString = jSONObject.optString("_eventName");
        i.d(strOptString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.name = strOptString;
        this.checksum = str2;
        this.inBackground = z11;
    }
}
