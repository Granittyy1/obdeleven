package p005a4;

import Z3.q;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
import p114j1.j;
import p130k4.a;
import p165n4.s;
import p183oa.b;
import p228s6.d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements FeatureManager.a, b, d, j.a {
    public static int b(int i10, int i11, int i12, int i13) {
        return CodedOutputStream.w(i10) + i11 + i12 + i13;
    }

    public static String c(char c10, String str, String str2) {
        return str + str2 + c10;
    }

    public static String d(long j, String str, StringBuilder sb2) {
        sb2.append(j);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // p183oa.b
    public void a(Object obj) {
        Q3.d.C();
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        String str;
        if (z10) {
            a.f41585b = true;
            a.f41584a.getClass();
            try {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
                p165n4.j jVarF = FetchedAppSettingsManager.f(q.b(), false);
                if (jVarF != null && (str = jVarF.f44905l) != null && str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    ArrayList arrayList = a.f41586c;
                    arrayList.clear();
                    CopyOnWriteArraySet copyOnWriteArraySet = a.f41587d;
                    copyOnWriteArraySet.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String key = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                            i.d(key, "key");
                            HashMap map = new HashMap();
                            a.C0473a c0473a = new a.C0473a();
                            c0473a.f41588a = key;
                            c0473a.f41589b = map;
                            if (jSONObjectOptJSONObject != null) {
                                c0473a.f41589b = s.i(jSONObjectOptJSONObject);
                                arrayList.add(c0473a);
                            }
                            if (jSONObject2.has("process_event_name")) {
                                copyOnWriteArraySet.add(key);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        return FirebaseSessionsRegistrar.m12getComponents$lambda3(qVar);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
