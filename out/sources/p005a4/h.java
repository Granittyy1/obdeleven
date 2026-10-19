package p005a4;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.PersistedEvents;
import java.util.ArrayList;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i10 = k.f8033a;
        c eventsToPersist = j.f8029c;
        synchronized (k.class) {
            i.e(eventsToPersist, "eventsToPersist");
            PersistedEvents persistedEventsA = d.a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.d()) {
                u uVarA = eventsToPersist.a(accessTokenAppIdPair);
                if (uVarA == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                synchronized (uVarA) {
                    arrayList = uVarA.f8046c;
                    uVarA.f8046c = new ArrayList();
                }
                persistedEventsA.a(accessTokenAppIdPair, arrayList);
            }
            d.b(persistedEventsA);
        }
        j.f8029c = new c();
    }
}
