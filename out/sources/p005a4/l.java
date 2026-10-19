package p005a4;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        HashSet hashSet = new HashSet();
        String str = j.f8027a;
        Iterator it = j.f8029c.d().iterator();
        while (it.hasNext()) {
            hashSet.add(((AccessTokenAppIdPair) it.next()).b());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            FetchedAppSettingsManager.f((String) it2.next(), true);
        }
    }
}
