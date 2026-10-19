package M0;

import androidx.lifecycle.AbstractC1382z;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: WeakListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class j<T> extends WeakReference<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f4505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1382z f4507c;

    public j(h hVar, int i10, g<T> gVar, ReferenceQueue<h> referenceQueue) {
        super(hVar, referenceQueue);
        this.f4506b = i10;
        this.f4505a = gVar;
    }

    public final boolean a() {
        boolean z10;
        AbstractC1382z abstractC1382z = this.f4507c;
        if (abstractC1382z != null) {
            this.f4505a.a(abstractC1382z);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4507c = null;
        return z10;
    }
}
