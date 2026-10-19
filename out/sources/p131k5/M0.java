package p131k5;

import U4.C0804l;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.C1834i5;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f41896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f41897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L0 f41898d;

    public M0(L0 l10, String str) {
        this.f41898d = l10;
        C0804l.e(str);
        this.f41895a = str;
        this.f41896b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    public final Bundle a() {
        byte b10;
        if (this.f41897c == null) {
            L0 l10 = this.f41898d;
            String string = l10.y().getString(this.f41895a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
                            String string3 = jSONObject.getString(Constants.BRAZE_PUSH_TITLE_KEY);
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b10 = 3;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (string3.equals(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY)) {
                                        b10 = 0;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (string3.equals(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE)) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            if (b10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b10 != 2) {
                                C2523i1 c2523i1 = (C2523i1) l10.f3968a;
                                if (b10 == 3) {
                                    C1834i5.a();
                                    if (c2523i1.f42218g.B(null, B.f41616F0)) {
                                        JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                        int length = jSONArray2.length();
                                        int[] iArr = new int[length];
                                        for (int i11 = 0; i11 < length; i11++) {
                                            iArr[i11] = jSONArray2.optInt(i11);
                                        }
                                        bundle.putIntArray(string2, iArr);
                                    }
                                } else if (b10 != 4) {
                                    l10.d().f41712f.b(string3, "Unrecognized persisted bundle type. Type");
                                } else {
                                    C1834i5.a();
                                    if (c2523i1.f42218g.B(null, B.f41616F0)) {
                                        JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                        int length2 = jSONArray3.length();
                                        long[] jArr = new long[length2];
                                        for (int i12 = 0; i12 < length2; i12++) {
                                            jArr[i12] = jSONArray3.optLong(i12);
                                        }
                                        bundle.putLongArray(string2, jArr);
                                    }
                                }
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            l10.d().f41712f.c("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f41897c = bundle;
                } catch (JSONException unused2) {
                    l10.d().f41712f.c("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f41897c == null) {
                this.f41897c = this.f41896b;
            }
        }
        return this.f41897c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        L0 l10 = this.f41898d;
        SharedPreferences.Editor editorEdit = l10.y().edit();
        int size = bundle.size();
        String str = this.f41895a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, str2);
                        C1834i5.a();
                        if (((C2523i1) l10.f3968a).f42218g.B(null, B.f41616F0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                            } else {
                                l10.d().f41712f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                            } else if (obj instanceof Long) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                            } else {
                                l10.d().f41712f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        l10.d().f41712f.b(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f41897c = bundle;
    }
}
