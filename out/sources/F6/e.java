package F6;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: SettingsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements p191p5.f<Void, Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.settings.a f3271b;

    public e(com.google.firebase.crashlytics.internal.settings.a aVar) {
        this.f3271b = aVar;
    }

    @Override // p191p5.f
    public final p191p5.g<Void> c(Void r12) throws Exception {
        JSONObject jSONObjectG;
        FileWriter fileWriter;
        com.google.firebase.crashlytics.internal.settings.a aVar = this.f3271b;
        c cVar = aVar.f28107f;
        i iVar = aVar.f28103b;
        cVar.getClass();
        FileWriter fileWriter2 = null;
        try {
            HashMap mapF = c.f(iVar);
            C6.a aVar2 = new C6.a((String) cVar.f3260b, mapF);
            HashMap map = aVar2.f2424c;
            map.put("User-Agent", "Crashlytics Android SDK/18.6.3");
            map.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c.c(aVar2, iVar);
            Log.isLoggable("FirebaseCrashlytics", 3);
            mapF.toString();
            Log.isLoggable("FirebaseCrashlytics", 2);
            jSONObjectG = cVar.g(aVar2.b());
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            jSONObjectG = null;
        }
        if (jSONObjectG != null) {
            d dVarA = aVar.f28104c.a(jSONObjectG);
            long j = dVarA.f3263c;
            a aVar3 = aVar.f28106e;
            aVar3.getClass();
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                try {
                    jSONObjectG.put("expires_at", j);
                    try {
                        fileWriter = new FileWriter((File) aVar3.f3259c);
                        try {
                            try {
                                fileWriter.write(jSONObjectG.toString());
                                fileWriter.flush();
                            } catch (Exception e11) {
                                e = e11;
                                Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileWriter2 = fileWriter;
                            CommonUtils.b(fileWriter2, "Failed to close settings writer.");
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileWriter = null;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        CommonUtils.b(fileWriter, "Failed to close settings writer.");
                        jSONObjectG.toString();
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        String str = iVar.f3278f;
                        SharedPreferences.Editor editorEdit = aVar.f28102a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        editorEdit.putString("existing_instance_identifier", str);
                        editorEdit.apply();
                        aVar.f28109h.set(dVarA);
                        aVar.f28110i.get().d(dVarA);
                        return p191p5.j.e(null);
                    }
                } catch (Exception e13) {
                    e = e13;
                }
                CommonUtils.b(fileWriter, "Failed to close settings writer.");
                jSONObjectG.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                String str2 = iVar.f3278f;
                SharedPreferences.Editor editorEdit2 = aVar.f28102a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit2.putString("existing_instance_identifier", str2);
                editorEdit2.apply();
                aVar.f28109h.set(dVarA);
                aVar.f28110i.get().d(dVarA);
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
        return p191p5.j.e(null);
    }
}
