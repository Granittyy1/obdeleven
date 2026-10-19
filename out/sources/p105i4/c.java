package p105i4;

import Z3.q;
import java.util.concurrent.atomic.AtomicBoolean;
import p017b4.a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean = p143l4.c.f44360a;
        synchronized (p143l4.c.class) {
            q.c().execute(new a(1));
        }
    }
}
