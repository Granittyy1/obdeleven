package p228s6;

import A8.A;
import com.google.firebase.messaging.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: Component.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<p<? super T>> f46931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<j> f46932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d<T> f46935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f46936g;

    public a(String str, Set<p<? super T>> set, Set<j> set2, int i10, int i11, d<T> dVar, Set<Class<?>> set3) {
        this.f46930a = str;
        this.f46931b = Collections.unmodifiableSet(set);
        this.f46932c = Collections.unmodifiableSet(set2);
        this.f46933d = i10;
        this.f46934e = i11;
        this.f46935f = dVar;
        this.f46936g = Collections.unmodifiableSet(set3);
    }

    public static <T> C0531a<T> a(Class<T> cls) {
        return new C0531a<>(cls, new Class[0]);
    }

    public static <T> C0531a<T> b(p<T> pVar) {
        return new C0531a<>(pVar, new p[0]);
    }

    @SafeVarargs
    public static <T> a<T> c(T t8, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            A.d(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new a<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new r(t8), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f46931b.toArray()) + ">{" + this.f46933d + ", type=" + this.f46934e + ", deps=" + Arrays.toString(this.f46932c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: s6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Component.java */
    public static class C0531a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46937a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f46938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f46939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d<T> f46942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashSet f46943g;

        public C0531a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f46938b = hashSet;
            this.f46939c = new HashSet();
            this.f46940d = 0;
            this.f46941e = 0;
            this.f46943g = new HashSet();
            hashSet.add(p.a(cls));
            for (Class cls2 : clsArr) {
                A.d(cls2, "Null interface");
                this.f46938b.add(p.a(cls2));
            }
        }

        public final void a(j jVar) {
            if (this.f46938b.contains(jVar.f46962a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f46939c.add(jVar);
        }

        public final a<T> b() {
            if (this.f46942f != null) {
                return new a<>(this.f46937a, new HashSet(this.f46938b), new HashSet(this.f46939c), this.f46940d, this.f46941e, this.f46942f, this.f46943g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i10) {
            if (!(this.f46940d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f46940d = i10;
        }

        public C0531a(p pVar, p[] pVarArr) {
            HashSet hashSet = new HashSet();
            this.f46938b = hashSet;
            this.f46939c = new HashSet();
            this.f46940d = 0;
            this.f46941e = 0;
            this.f46943g = new HashSet();
            hashSet.add(pVar);
            for (p pVar2 : pVarArr) {
                A.d(pVar2, "Null interface");
            }
            Collections.addAll(this.f46938b, pVarArr);
        }
    }
}
