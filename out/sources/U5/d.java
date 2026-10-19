package U5;

import Z3.q;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.n;
import p005a4.m;
import p116j3.j;
import p154m3.k;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC1309y, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6509b;

    @Override // p154m3.k
    public p116j3.a a() {
        ArrayList arrayList = (ArrayList) this.f6509b;
        return ((p225s3.a) arrayList.get(0)).c() ? new p116j3.k(arrayList) : new j(arrayList);
    }

    public void b(int i10) {
        p249u3.a aVar = (p249u3.a) this.f6509b;
        if (i10 == 0) {
            try {
                String string = aVar.a().f23573a.getString("install_referrer");
                if (string != null && (n.J(string, "fb", false) || n.J(string, "facebook", false))) {
                    q.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", string).apply();
                }
                q.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            } catch (RemoteException | Exception unused) {
                return;
            }
        } else if (i10 == 2) {
            q.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
        }
        aVar.f47418a = 3;
        if (aVar.f47421d != null) {
            Log.isLoggable("InstallReferrerClient", 2);
            aVar.f47419b.unbindService(aVar.f47421d);
            aVar.f47421d = null;
        }
        aVar.f47420c = null;
    }

    @Override // p154m3.k
    public List e() {
        return (ArrayList) this.f6509b;
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View view, n0 n0Var) {
        int iA = n0Var.a();
        BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.f6509b;
        baseTransientBottomBar.f27400n = iA;
        baseTransientBottomBar.f27401o = n0Var.b();
        baseTransientBottomBar.f27402p = n0Var.c();
        baseTransientBottomBar.g();
        return n0Var;
    }

    @Override // p154m3.k
    public boolean k() {
        ArrayList arrayList = (ArrayList) this.f6509b;
        return arrayList.size() == 1 && ((p225s3.a) arrayList.get(0)).c();
    }

    public d(p249u3.a aVar, m mVar) {
        this.f6509b = aVar;
    }
}
