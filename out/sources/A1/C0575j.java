package A1;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: A1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0575j implements C0577l.a.InterfaceC0002a, p228s6.d, FeatureManager.a, androidx.compose.foundation.text.selection.j, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f527b;

    public /* synthetic */ C0575j(int i10) {
        this.f527b = i10;
    }

    public static String b(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    @Override // A1.C0577l.a.InterfaceC0002a
    public Constructor a() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            p056e4.a.f34731b = true;
            synchronized (p056e4.a.f34730a) {
                try {
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
                    p165n4.j jVarF = FetchedAppSettingsManager.f(Z3.q.b(), false);
                    if (jVarF == null) {
                        return;
                    }
                    String str = jVarF.f44905l;
                    if (str != null && str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        p056e4.a.f34732c.clear();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String key = itKeys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                            if (jSONObject2 != null) {
                                if (jSONObject2.optBoolean("is_deprecated_event")) {
                                    HashSet hashSet = p056e4.a.f34733d;
                                    kotlin.jvm.internal.i.d(key, "key");
                                    hashSet.add(key);
                                } else {
                                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                    kotlin.jvm.internal.i.d(key, "key");
                                    ArrayList arrayList = new ArrayList();
                                    p056e4.a.C0360a c0360a = new p056e4.a.C0360a();
                                    c0360a.f34734a = key;
                                    c0360a.f34735b = arrayList;
                                    if (jSONArrayOptJSONArray != null) {
                                        c0360a.f34735b = p165n4.s.g(jSONArrayOptJSONArray);
                                    }
                                    p056e4.a.f34732c.add(c0360a);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        switch (this.f527b) {
            case 1:
                return TransportRegistrar.lambda$getComponents$0(qVar);
            case 5:
                return FirebaseSessionsRegistrar.m14getComponents$lambda5(qVar);
            default:
                return ExecutorsRegistrar.f28052c.get();
        }
    }

    @Override // androidx.compose.foundation.text.selection.j
    public androidx.compose.foundation.text.selection.i g(androidx.compose.foundation.text.selection.s sVar) {
        return androidx.compose.foundation.text.selection.k.a(sVar, androidx.compose.foundation.text.selection.j.a.b.f11613a);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
