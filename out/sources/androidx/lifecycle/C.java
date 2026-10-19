package androidx.lifecycle;

import android.os.Looper;

/* JADX INFO: compiled from: MutableLiveData.java */
/* JADX INFO: loaded from: classes.dex */
public class C<T> extends AbstractC1382z<T> {
    public final void k(T t8) {
        boolean z10;
        synchronized (this.f17840a) {
            z10 = this.f17845f == AbstractC1382z.f17839k;
            this.f17845f = t8;
        }
        if (z10) {
            p160n.b bVarI0 = p160n.b.i0();
            AbstractC1382z.a aVar = this.j;
            p160n.c cVar = bVarI0.f44655c;
            if (cVar.f44658e == null) {
                synchronized (cVar.f44656c) {
                    try {
                        if (cVar.f44658e == null) {
                            cVar.f44658e = p160n.c.i0(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            cVar.f44658e.post(aVar);
        }
    }
}
