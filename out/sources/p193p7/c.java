package p193p7;

import p206q7.a;

/* JADX INFO: compiled from: FirebasePerformanceInitializer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a.InterfaceC0520a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p241t7.a f45880a = p241t7.a.d();

    @Override // p206q7.a.InterfaceC0520a
    public final void a() {
        try {
            p241t7.a aVar = b.f45875e;
        } catch (IllegalStateException e10) {
            f45880a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
