package p131k5;

import U4.C0804l;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.internal.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O1 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ e f41936a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        e eVar = this.f41936a;
        eVar.getClass();
        if ("IABTCF_TCString".equals(str)) {
            eVar.d().f41719n.c("IABTCF_TCString change picked up in listener.");
            W1 w3 = eVar.f26585r;
            C0804l.h(w3);
            w3.b(500L);
        }
    }
}
