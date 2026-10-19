package p116j3;

import C4.v;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<K> f41084c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41082a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41083b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f41085d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A f41086e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41087f = -1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f41088g = -1.0f;

    /* JADX INFO: renamed from: j3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface InterfaceC0468a {
        void a();
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class b<T> implements c<T> {
        @Override // j3.a.c
        public final boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // j3.a.c
        public final p225s3.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // j3.a.c
        public final boolean c(float f10) {
            return false;
        }

        @Override // j3.a.c
        public final float d() {
            return 1.0f;
        }

        @Override // j3.a.c
        public final float e() {
            return 0.0f;
        }

        @Override // j3.a.c
        public final boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public interface c<T> {
        boolean a(float f10);

        p225s3.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class d<T> implements c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends p225s3.a<T>> f41089a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p225s3.a<T> f41091c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f41092d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p225s3.a<T> f41090b = f(0.0f);

        public d(List<? extends p225s3.a<T>> list) {
            this.f41089a = list;
        }

        @Override // j3.a.c
        public final boolean a(float f10) {
            p225s3.a<T> aVar = this.f41091c;
            p225s3.a<T> aVar2 = this.f41090b;
            if (aVar == aVar2 && this.f41092d == f10) {
                return true;
            }
            this.f41091c = aVar2;
            this.f41092d = f10;
            return false;
        }

        @Override // j3.a.c
        public final p225s3.a<T> b() {
            return this.f41090b;
        }

        @Override // j3.a.c
        public final boolean c(float f10) {
            p225s3.a<T> aVar = this.f41090b;
            if (f10 >= aVar.b() && f10 < aVar.a()) {
                return !this.f41090b.c();
            }
            this.f41090b = f(f10);
            return true;
        }

        @Override // j3.a.c
        public final float d() {
            return ((p225s3.a) v.e(1, this.f41089a)).a();
        }

        @Override // j3.a.c
        public final float e() {
            return this.f41089a.get(0).b();
        }

        public final p225s3.a<T> f(float f10) {
            List<? extends p225s3.a<T>> list = this.f41089a;
            p225s3.a<T> aVar = (p225s3.a) v.e(1, list);
            if (f10 >= aVar.b()) {
                return aVar;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                p225s3.a<T> aVar2 = list.get(size);
                if (this.f41090b != aVar2 && f10 >= aVar2.b() && f10 < aVar2.a()) {
                    return aVar2;
                }
            }
            return list.get(0);
        }

        @Override // j3.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: compiled from: BaseKeyframeAnimation.java */
    public static final class e<T> implements c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p225s3.a<T> f41093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f41094b = -1.0f;

        public e(List<? extends p225s3.a<T>> list) {
            this.f41093a = list.get(0);
        }

        @Override // j3.a.c
        public final boolean a(float f10) {
            if (this.f41094b == f10) {
                return true;
            }
            this.f41094b = f10;
            return false;
        }

        @Override // j3.a.c
        public final p225s3.a<T> b() {
            return this.f41093a;
        }

        @Override // j3.a.c
        public final boolean c(float f10) {
            return !this.f41093a.c();
        }

        @Override // j3.a.c
        public final float d() {
            return this.f41093a.a();
        }

        @Override // j3.a.c
        public final float e() {
            return this.f41093a.b();
        }

        @Override // j3.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends p225s3.a<K>> list) {
        c<K> eVar;
        if (list.isEmpty()) {
            eVar = new b<>();
        } else {
            eVar = list.size() == 1 ? new e<>(list) : new d<>(list);
        }
        this.f41084c = eVar;
    }

    public final void a(InterfaceC0468a interfaceC0468a) {
        this.f41082a.add(interfaceC0468a);
    }

    public float b() {
        if (this.f41088g == -1.0f) {
            this.f41088g = this.f41084c.d();
        }
        return this.f41088g;
    }

    public final float c() {
        p225s3.a<K> aVarB = this.f41084c.b();
        if (aVarB == null || aVarB.c()) {
            return 0.0f;
        }
        return aVarB.f46888d.getInterpolation(d());
    }

    public final float d() {
        if (this.f41083b) {
            return 0.0f;
        }
        p225s3.a<K> aVarB = this.f41084c.b();
        if (aVarB.c()) {
            return 0.0f;
        }
        return (this.f41085d - aVarB.b()) / (aVarB.a() - aVarB.b());
    }

    public A e() {
        Interpolator interpolator;
        float fD = d();
        c<K> cVar = this.f41084c;
        if (cVar.a(fD)) {
            return this.f41086e;
        }
        p225s3.a<K> aVarB = cVar.b();
        Interpolator interpolator2 = aVarB.f46889e;
        A aF = (interpolator2 == null || (interpolator = aVarB.f46890f) == null) ? f(aVarB, c()) : g(aVarB, fD, interpolator2.getInterpolation(fD), interpolator.getInterpolation(fD));
        this.f41086e = aF;
        return aF;
    }

    public abstract A f(p225s3.a<K> aVar, float f10);

    public A g(p225s3.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h(float f10) {
        c<K> cVar = this.f41084c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.f41087f == -1.0f) {
            this.f41087f = cVar.e();
        }
        float f11 = this.f41087f;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f41087f = cVar.e();
            }
            f10 = this.f41087f;
        } else if (f10 > b()) {
            f10 = b();
        }
        if (f10 == this.f41085d) {
            return;
        }
        this.f41085d = f10;
        if (!cVar.c(f10)) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f41082a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((InterfaceC0468a) arrayList.get(i10)).a();
            i10++;
        }
    }
}
