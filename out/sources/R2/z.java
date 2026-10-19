package R2;

import android.util.Log;
import androidx.work.impl.utils.futures.AbstractFuture;
import com.google.firebase.abt.AbtException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p033c7.C1488a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5252d;

    public /* synthetic */ z(Object obj, int i10, Object obj2) {
        this.f5250b = i10;
        this.f5251c = obj;
        this.f5252d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5250b) {
            case 0:
                A a10 = (A) this.f5251c;
                androidx.work.impl.utils.futures.a aVar = (androidx.work.impl.utils.futures.a) this.f5252d;
                if (!(a10.f5191b.f20427b instanceof AbstractFuture.b)) {
                    aVar.m(a10.f5194e.getForegroundInfoAsync());
                } else {
                    aVar.cancel(true);
                }
                break;
            default:
                S6.h hVar = (S6.h) this.f5252d;
                C1488a c1488a = (C1488a) this.f5251c;
                c1488a.getClass();
                try {
                    hVar.toString();
                    Q3.d.B();
                    p157m6.b bVar = c1488a.f22419a;
                    p157m6.a aVar2 = new p157m6.a(hVar.H(), hVar.M(), hVar.K(), new Date(hVar.I()), hVar.L(), hVar.J());
                    bVar.d();
                    p157m6.a.d(aVar2.c());
                    ArrayList arrayList = new ArrayList();
                    HashMap mapC = aVar2.c();
                    mapC.remove("triggerEvent");
                    arrayList.add(p157m6.a.a(mapC));
                    bVar.a(arrayList);
                } catch (AbtException e10) {
                    Log.e("FIAM.Headless", "Unable to set experiment as active with ABT, missing analytics?\n" + e10.getMessage());
                }
                break;
        }
    }
}
