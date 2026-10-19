package p313z6;

import D6.f;
import Q6.b;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p302y6.C2818n;

/* JADX INFO: compiled from: UserMetadata.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f48892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2818n f48893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f48895d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f48896e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f48897f = new l();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicMarkableReference<String> f48898g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: compiled from: UserMetadata.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference<d> f48899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f48900b = new AtomicReference<>(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48901c;

        public a(boolean z10) {
            this.f48901c = z10;
            this.f48899a = new AtomicMarkableReference<>(new d(z10 ? 8192 : 1024), false);
        }

        public final boolean a(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f48899a.getReference().b(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<d> atomicMarkableReference = this.f48899a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    b bVar = new b(1, this);
                    AtomicReference<Callable<Void>> atomicReference = this.f48900b;
                    while (!atomicReference.compareAndSet(null, bVar)) {
                        if (atomicReference.get() != null) {
                            return true;
                        }
                    }
                    n.this.f48893b.a(bVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public n(String str, f fVar, C2818n c2818n) {
        this.f48894c = str;
        this.f48892a = new g(fVar);
        this.f48893b = c2818n;
    }
}
