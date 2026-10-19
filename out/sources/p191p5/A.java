package p191p5;

import T4.C0772e;
import T4.InterfaceC0773f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends C0772e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45804c;

    public A(InterfaceC0773f interfaceC0773f) {
        super(interfaceC0773f);
        this.f45804c = new ArrayList();
        interfaceC0773f.k("TaskOnStopCallback", this);
    }

    @Override // T4.C0772e
    public final void h() {
        synchronized (this.f45804c) {
            try {
                Iterator it = this.f45804c.iterator();
                while (it.hasNext()) {
                    w wVar = (w) ((WeakReference) it.next()).get();
                    if (wVar != null) {
                        wVar.y();
                    }
                }
                this.f45804c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
