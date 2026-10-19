package p229s7;

import com.google.firebase.perf.session.SessionManager;
import p111ia.c;
import p268va.a;

/* JADX INFO: compiled from: FirebasePerformanceModule_ProvidesSessionManagerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements a {
    @Override // p268va.a
    public final Object get() {
        SessionManager sessionManager = SessionManager.getInstance();
        c.d(sessionManager);
        return sessionManager;
    }
}
