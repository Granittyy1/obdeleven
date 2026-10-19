package E7;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RolloutsStateFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D7.e f3111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D7.e f3112b;

    public final G7.c a(com.google.firebase.remoteconfig.internal.b bVar) throws FirebaseRemoteConfigClientException {
        String string;
        JSONArray jSONArray = bVar.f28591g;
        long j = bVar.f28590f;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2);
                }
                String strOptString = jSONArray2.optString(0, "");
                com.google.firebase.remoteconfig.internal.b bVarC = this.f3111a.c();
                String string3 = null;
                if (bVarC == null) {
                    string = null;
                } else {
                    try {
                        string = bVarC.f28586b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    com.google.firebase.remoteconfig.internal.b bVarC2 = this.f3112b.c();
                    if (bVarC2 != null) {
                        try {
                            string3 = bVarC2.f28586b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i11 = G7.d.f3399a;
                G7.b.a aVar = new G7.b.a();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                aVar.f3392a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                aVar.f3393b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                aVar.f3394c = strOptString;
                aVar.f3395d = string;
                aVar.f3396e = j;
                aVar.f3397f = (byte) (aVar.f3397f | 1);
                hashSet.add(aVar.a());
            } catch (JSONException e10) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e10);
            }
        }
        return new G7.c(hashSet);
    }
}
