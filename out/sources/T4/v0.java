package T4;

import S4.C0760b;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements Z, X1.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6007b;

    public /* synthetic */ v0(Object obj) {
        this.f6007b = obj;
    }

    @Override // X1.h
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // X1.h
    public long b(int i10) {
        p241t7.b.e(i10 == 0);
        return 0L;
    }

    @Override // X1.h
    public List c(long j) {
        return j >= 0 ? (List) this.f6007b : Collections.emptyList();
    }

    @Override // T4.Z
    public void d(int i10) {
        C0780m c0780m = (C0780m) this.f6007b;
        ReentrantLock reentrantLock = c0780m.f5984n;
        ReentrantLock reentrantLock2 = c0780m.f5984n;
        reentrantLock.lock();
        try {
            if (c0780m.f5983m) {
                c0780m.f5983m = false;
                C0780m.g(c0780m, i10);
            } else {
                c0780m.f5983m = true;
                c0780m.f5976e.e(i10);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // X1.h
    public int e() {
        return 1;
    }

    @Override // T4.Z
    public void f(Bundle bundle) {
        C0780m c0780m = (C0780m) this.f6007b;
        ReentrantLock reentrantLock = c0780m.f5984n;
        ReentrantLock reentrantLock2 = c0780m.f5984n;
        reentrantLock.lock();
        try {
            c0780m.f5982l = C0760b.f5525g;
            C0780m.h(c0780m);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // T4.Z
    public void g(C0760b c0760b) {
        C0780m c0780m = (C0780m) this.f6007b;
        ReentrantLock reentrantLock = c0780m.f5984n;
        ReentrantLock reentrantLock2 = c0780m.f5984n;
        reentrantLock.lock();
        try {
            c0780m.f5982l = c0760b;
            C0780m.h(c0780m);
        } finally {
            reentrantLock2.unlock();
        }
    }
}
