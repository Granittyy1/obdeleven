package p033c7;

import N7.b;
import com.parse.LogOutCallback;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.activity.e;
import p123ja.h;
import p183oa.a;
import p220r9.C;

/* JADX INFO: renamed from: c7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1512z implements a, LogOutCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22518c;

    public /* synthetic */ C1512z(Object obj, Object obj2) {
        this.f22517b = obj;
        this.f22518c = obj2;
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        C.b((MainActivity) this.f22517b, (e) this.f22518c);
    }

    @Override // p183oa.a
    public void run() {
        b bVar = (b) this.f22518c;
        A a10 = (A) this.f22517b;
        a10.getClass();
        a10.f22340b = h.b(bVar);
    }
}
