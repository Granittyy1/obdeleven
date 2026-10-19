package Z3;

import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: GraphResponse.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7902e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f7903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f7904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FacebookRequestError f7905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f7906d;

    /* JADX INFO: compiled from: GraphResponse.kt */
    public static final class a {
        public static ArrayList a(AbstractList requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            kotlin.jvm.internal.i.e(requests, "requests");
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(requests, 10));
            Iterator it = requests.iterator();
            while (it.hasNext()) {
                arrayList.add(new x((r) it.next(), httpURLConnection, new FacebookRequestError(facebookException)));
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:58:0x0101 A[Catch: JSONException -> 0x011b, TryCatch #0 {JSONException -> 0x011b, blocks: (B:5:0x0017, B:7:0x001d, B:9:0x0027, B:11:0x002b, B:14:0x0038, B:49:0x00e0, B:35:0x007b, B:32:0x0072, B:29:0x0068, B:26:0x0060, B:23:0x0059, B:20:0x004f, B:17:0x0045, B:37:0x008e, B:40:0x009b, B:42:0x00a4, B:47:0x00b9, B:56:0x00f9, B:58:0x0101, B:59:0x0107), top: B:99:0x0017 }] */
        public static x b(r request, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            FacebookRequestError facebookRequestError;
            C0835a c0835a;
            C0835a c0835a2;
            FacebookRequestError facebookRequestError2;
            String strOptString;
            String str;
            int iOptInt;
            String str2;
            String str3;
            Object NULL = obj;
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                try {
                    if (jSONObject.has("code")) {
                        int i10 = jSONObject.getInt("code");
                        Object objR = p165n4.s.r("body", jSONObject, "FACEBOOK_NON_JSON_RESULT");
                        if (objR != null && (objR instanceof JSONObject)) {
                            boolean zOptBoolean = false;
                            int iOptInt2 = -1;
                            if (((JSONObject) objR).has("error")) {
                                JSONObject jSONObject2 = (JSONObject) p165n4.s.r("error", (JSONObject) objR, null);
                                String strOptString2 = jSONObject2 == null ? null : jSONObject2.optString("type", null);
                                String strOptString3 = jSONObject2 == null ? null : jSONObject2.optString("message", null);
                                int iOptInt3 = jSONObject2 == null ? -1 : jSONObject2.optInt("code", -1);
                                if (jSONObject2 != null) {
                                    iOptInt2 = jSONObject2.optInt("error_subcode", -1);
                                }
                                String strOptString4 = jSONObject2 == null ? null : jSONObject2.optString("error_user_msg", null);
                                String strOptString5 = jSONObject2 == null ? null : jSONObject2.optString("error_user_title", null);
                                if (jSONObject2 != null) {
                                    zOptBoolean = jSONObject2.optBoolean("is_transient", false);
                                }
                                strOptString = strOptString2;
                                str2 = strOptString5;
                                str = strOptString3;
                                zOptBoolean = zOptBoolean;
                                str3 = strOptString4;
                                iOptInt = iOptInt2;
                                zOptBoolean = true;
                                iOptInt2 = iOptInt3;
                            } else {
                                if (((JSONObject) objR).has("error_code") || ((JSONObject) objR).has("error_msg") || ((JSONObject) objR).has("error_reason")) {
                                    strOptString = ((JSONObject) objR).optString("error_reason", null);
                                    String strOptString6 = ((JSONObject) objR).optString("error_msg", null);
                                    iOptInt2 = ((JSONObject) objR).optInt("error_code", -1);
                                    str = strOptString6;
                                    iOptInt = ((JSONObject) objR).optInt("error_subcode", -1);
                                    zOptBoolean = true;
                                } else {
                                    iOptInt = -1;
                                    strOptString = null;
                                    str = null;
                                }
                                str2 = null;
                                str3 = null;
                            }
                            if (zOptBoolean) {
                                facebookRequestError2 = new FacebookRequestError(i10, iOptInt2, iOptInt, strOptString, str, str2, str3, obj2, null, zOptBoolean);
                            } else {
                                if (i10 <= 299) {
                                }
                                if (jSONObject.has("body")) {
                                }
                                facebookRequestError2 = new FacebookRequestError(i10, -1, -1, null, null, null, null, obj2, null, false);
                            }
                        } else if (i10 <= 299 || 200 > i10) {
                            if (jSONObject.has("body")) {
                            }
                            facebookRequestError2 = new FacebookRequestError(i10, -1, -1, null, null, null, null, obj2, null, false);
                        } else {
                            facebookRequestError = null;
                        }
                        facebookRequestError = facebookRequestError2;
                    } else {
                        facebookRequestError = null;
                    }
                } catch (JSONException unused) {
                }
                if (facebookRequestError != null) {
                    Log.e("Z3.x", facebookRequestError.toString());
                    if (facebookRequestError.f24760c == 190 && (c0835a = request.f7873a) != null) {
                        Date date = C0835a.f7782m;
                        if (c0835a.equals(C0835a.b.b())) {
                            int i11 = facebookRequestError.f24761d;
                            C0841g.a aVar = C0841g.f7810f;
                            if (i11 != 493) {
                                aVar.a().c(null, true);
                            } else {
                                C0835a c0835aB = C0835a.b.b();
                                if (kotlin.jvm.internal.i.a(c0835aB == null ? null : Boolean.valueOf(new Date().after(c0835aB.f7785b)), Boolean.FALSE) && (c0835a2 = aVar.a().f7814c) != null) {
                                    aVar.a().c(new C0835a(c0835a2.f7789f, c0835a2.f7792i, c0835a2.j, c0835a2.f7786c, c0835a2.f7787d, c0835a2.f7788e, c0835a2.f7790g, new Date(), new Date(), c0835a2.f7793k, "facebook"), true);
                                }
                            }
                        }
                    }
                    return new x(request, httpURLConnection, facebookRequestError);
                }
                Object objR2 = p165n4.s.r("body", jSONObject, "FACEBOOK_NON_JSON_RESULT");
                if (objR2 instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) objR2;
                    return new x(request, httpURLConnection, jSONObject3.toString(), jSONObject3);
                }
                if (objR2 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objR2;
                    String rawResponse = jSONArray.toString();
                    kotlin.jvm.internal.i.e(request, "request");
                    kotlin.jvm.internal.i.e(rawResponse, "rawResponse");
                    return new x(request, httpURLConnection, null, jSONArray, null);
                }
                NULL = JSONObject.NULL;
                kotlin.jvm.internal.i.d(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new x(request, httpURLConnection, NULL.toString(), null);
            }
            throw new FacebookException(kotlin.jvm.internal.i.k(NULL.getClass().getSimpleName(), "Got unexpected object type in response, class: "));
        }

        public static ArrayList c(InputStream inputStream, HttpURLConnection httpURLConnection, w requests) throws Throwable {
            Object obj;
            kotlin.jvm.internal.i.e(requests, "requests");
            String strE = p165n4.s.E(inputStream);
            n4.l.a aVar = p165n4.l.f44910c;
            n4.l.a.b(LoggingBehavior.f24775c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strE.length()), strE);
            Object resultObject = new JSONTokener(strE).nextValue();
            kotlin.jvm.internal.i.d(resultObject, "resultObject");
            int size = requests.f7900d.size();
            ArrayList arrayList = new ArrayList(size);
            int i10 = 0;
            if (size == 1) {
                r rVar = (r) requests.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", resultObject);
                    jSONObject.put("code", httpURLConnection == null ? androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION : httpURLConnection.getResponseCode());
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e10) {
                    arrayList.add(new x(rVar, httpURLConnection, new FacebookRequestError(e10)));
                    obj = resultObject;
                } catch (JSONException e11) {
                    arrayList.add(new x(rVar, httpURLConnection, new FacebookRequestError(e11)));
                    obj = resultObject;
                }
            } else {
                obj = resultObject;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    if (length > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            r rVar2 = (r) requests.get(i10);
                            try {
                                Object obj2 = ((JSONArray) obj).get(i10);
                                kotlin.jvm.internal.i.d(obj2, "obj");
                                arrayList.add(b(rVar2, httpURLConnection, obj2, resultObject));
                            } catch (FacebookException e12) {
                                arrayList.add(new x(rVar2, httpURLConnection, new FacebookRequestError(e12)));
                            } catch (JSONException e13) {
                                arrayList.add(new x(rVar2, httpURLConnection, new FacebookRequestError(e13)));
                            }
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    n4.l.a aVar2 = p165n4.l.f44910c;
                    n4.l.a.b(LoggingBehavior.f24774b, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.f7899c, Integer.valueOf(strE.length()), arrayList);
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }
    }

    public x(r request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f7903a = httpURLConnection;
        this.f7904b = jSONObject;
        this.f7905c = facebookRequestError;
        this.f7906d = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f7903a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection == null ? androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION : httpURLConnection.getResponseCode())}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbA = C7.g.a("{Response:  responseCode: ", str, ", graphObject: ");
        sbA.append(this.f7904b);
        sbA.append(", error: ");
        sbA.append(this.f7905c);
        sbA.append("}");
        String string = sbA.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(r request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(r request, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(request, httpURLConnection, null, null, facebookRequestError);
        kotlin.jvm.internal.i.e(request, "request");
    }
}
