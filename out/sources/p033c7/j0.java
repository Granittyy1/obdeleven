package p033c7;

import android.app.Application;
import android.content.SharedPreferences;
import p144l6.e;

/* JADX INFO: compiled from: TestDeviceHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f22462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22465d = 0;

    public j0(i0 i0Var) {
        boolean z10 = false;
        this.f22462a = i0Var;
        e eVar = i0Var.f22459a;
        eVar.a();
        SharedPreferences sharedPreferences = ((Application) eVar.f44388a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        boolean z11 = true;
        if (sharedPreferences.contains("fresh_install")) {
            z11 = sharedPreferences.getBoolean("fresh_install", true);
        } else {
            i0Var.a("fresh_install", true);
        }
        this.f22464c = z11;
        e eVar2 = i0Var.f22459a;
        eVar2.a();
        SharedPreferences sharedPreferences2 = ((Application) eVar2.f44388a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences2.contains("test_device")) {
            z10 = sharedPreferences2.getBoolean("test_device", false);
        } else {
            i0Var.a("test_device", false);
        }
        this.f22463b = z10;
    }
}
