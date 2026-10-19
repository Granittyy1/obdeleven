package D7;

import android.content.Context;
import androidx.compose.runtime.N0;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: ConfigRealtimeHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2862c;

    public l(p144l6.e eVar, p108i7.c cVar, ConfigFetchHandler configFetchHandler, e eVar2, Context context, String str, com.google.firebase.remoteconfig.internal.c cVar2, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f2860a = linkedHashSet;
        this.f2861b = new com.google.firebase.remoteconfig.internal.d(eVar, cVar, configFetchHandler, eVar2, context, str, linkedHashSet, cVar2, scheduledExecutorService);
        this.f2862c = cVar;
    }

    public synchronized void a() {
        if (!((LinkedHashSet) this.f2860a).isEmpty()) {
            ((com.google.firebase.remoteconfig.internal.d) this.f2861b).e(0L);
        }
    }

    public boolean b() {
        l lVar;
        return ((N0) this.f2860a).getValue() != this.f2862c || ((lVar = (l) this.f2861b) != null && lVar.b());
    }

    public l(N0 n10, l lVar) {
        this.f2860a = n10;
        this.f2861b = lVar;
        this.f2862c = n10.getValue();
    }
}
