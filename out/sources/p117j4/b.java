package p117j4;

import Z3.q;
import android.content.Context;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import java.util.Set;
import kotlin.collections.B;
import p165n4.s;

/* JADX INFO: compiled from: OnDeviceProcessingManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f41133a = B.C("fb_mobile_purchase", "StartTrial", "Subscribe");

    public static final boolean a() {
        if (q.f(q.a()) || s.w()) {
            return false;
        }
        if (RemoteServiceWrapper.f24960b == null) {
            Context contextA = q.a();
            RemoteServiceWrapper.f24959a.getClass();
            RemoteServiceWrapper.f24960b = Boolean.valueOf(RemoteServiceWrapper.a(contextA) != null);
        }
        Boolean bool = RemoteServiceWrapper.f24960b;
        return bool == null ? false : bool.booleanValue();
    }
}
