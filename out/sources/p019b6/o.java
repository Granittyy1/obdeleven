package p019b6;

import O3.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.integrity.internal.v;
import com.voltasit.obdeleven.domain.usecases.device.u;
import java.util.ArrayList;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f20591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f20593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f20594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.play.integrity.internal.d f20595e;

    public o(Context context, v vVar, d dVar) {
        h hVar = new h();
        this.f20593c = hVar;
        this.f20592b = context.getPackageName();
        this.f20591a = vVar;
        this.f20594d = dVar;
        Intent intent = p.f20596a;
        com.google.android.play.integrity.internal.d dVar2 = new com.google.android.play.integrity.internal.d(context, vVar, new O.h());
        this.f20595e = dVar2;
        dVar2.a().post(new h(this, hVar, context));
    }

    public static Bundle a(o oVar, a.d dVar, long j, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", oVar.f20592b);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", dVar.a());
        bundle.putLong("warm.up.sid", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", i10);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(dVar.b()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.android.play.integrity.internal.o(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(u.e(arrayList)));
        return bundle;
    }

    public static Bundle b(o oVar, long j, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", oVar.f20592b);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.android.play.integrity.internal.o(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(u.e(arrayList)));
        return bundle;
    }

    public static boolean c(o oVar, int i10) {
        h hVar = oVar.f20593c;
        if (hVar.f45811a.o()) {
            return ((Integer) hVar.f45811a.k()).intValue() < (i10 == 0 ? 83420000 : 83830000);
        }
        return false;
    }

    public static boolean d(o oVar) {
        h hVar = oVar.f20593c;
        return hVar.f45811a.o() && ((Integer) hVar.f45811a.k()).intValue() == 0;
    }
}
