package B7;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Date;
import p191p5.InterfaceC2755a;
import p228s6.q;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements p228s6.d, InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1603c;

    public /* synthetic */ f(Object obj, Object obj2) {
        this.f1602b = obj;
        this.f1603c = obj2;
    }

    @Override // p228s6.d
    public Object f(q qVar) {
        return new a((String) this.f1602b, ((g.a) this.f1603c).b((Context) qVar.a(Context.class)));
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f1602b;
        Date date = (Date) this.f1603c;
        configFetchHandler.getClass();
        if (gVar.o()) {
            com.google.firebase.remoteconfig.internal.c cVar = configFetchHandler.f28558g;
            synchronized (cVar.f28601b) {
                cVar.f28600a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception excJ = gVar.j();
            if (excJ != null) {
                if (excJ instanceof FirebaseRemoteConfigFetchThrottledException) {
                    com.google.firebase.remoteconfig.internal.c cVar2 = configFetchHandler.f28558g;
                    synchronized (cVar2.f28601b) {
                        cVar2.f28600a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    com.google.firebase.remoteconfig.internal.c cVar3 = configFetchHandler.f28558g;
                    synchronized (cVar3.f28601b) {
                        cVar3.f28600a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return gVar;
    }
}
