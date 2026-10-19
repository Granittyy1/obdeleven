package I4;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.HashMap;
import java.util.Map;
import p033c7.A;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements K4.a.InterfaceC0060a, p183oa.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3867c;

    public /* synthetic */ m(Object obj, Object obj2) {
        this.f3866b = obj;
        this.f3867c = obj2;
    }

    @Override // K4.a.InterfaceC0060a
    public Object k() {
        o oVar = (o) this.f3866b;
        oVar.getClass();
        for (Map.Entry entry : ((HashMap) this.f3867c).entrySet()) {
            oVar.f3879i.i(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    @Override // p183oa.a
    public void run() {
        N7.b bVar = (N7.b) this.f3867c;
        A a10 = (A) this.f3866b;
        a10.getClass();
        a10.f22340b = p123ja.h.b(bVar);
    }
}
