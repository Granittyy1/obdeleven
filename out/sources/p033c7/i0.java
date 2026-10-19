package p033c7;

import android.app.Application;
import android.content.SharedPreferences;
import p144l6.e;

/* JADX INFO: compiled from: SharedPreferencesUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22459a;

    public i0(e eVar) {
        this.f22459a = eVar;
    }

    public final void a(String str, boolean z10) {
        e eVar = this.f22459a;
        eVar.a();
        SharedPreferences.Editor editorEdit = ((Application) eVar.f44388a).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }
}
