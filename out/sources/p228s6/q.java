package p228s6;

import P6.c;
import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p096h7.b;

/* JADX INFO: compiled from: RestrictedComponentContainer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<p<?>> f46979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<p<?>> f46980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<p<?>> f46981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<p<?>> f46982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<p<?>> f46983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f46984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f46985g;

    /* JADX INFO: compiled from: RestrictedComponentContainer.java */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f46986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f46987b;

        public a(Set<Class<?>> set, c cVar) {
            this.f46986a = set;
            this.f46987b = cVar;
        }
    }

    public q(p228s6.a<?> aVar, b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (j jVar : aVar.f46932c) {
            int i10 = jVar.f46964c;
            boolean z10 = i10 == 0;
            int i11 = jVar.f46963b;
            p<?> pVar = jVar.f46962a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(pVar);
                } else {
                    hashSet.add(pVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(pVar);
            } else if (i11 == 2) {
                hashSet5.add(pVar);
            } else {
                hashSet2.add(pVar);
            }
        }
        Set<Class<?>> set = aVar.f46936g;
        if (!set.isEmpty()) {
            hashSet.add(p.a(c.class));
        }
        this.f46979a = Collections.unmodifiableSet(hashSet);
        this.f46980b = Collections.unmodifiableSet(hashSet2);
        this.f46981c = Collections.unmodifiableSet(hashSet3);
        this.f46982d = Collections.unmodifiableSet(hashSet4);
        this.f46983e = Collections.unmodifiableSet(hashSet5);
        this.f46984f = set;
        this.f46985g = bVar;
    }

    @Override // p228s6.b
    public final <T> T a(Class<T> cls) {
        if (this.f46979a.contains(p.a(cls))) {
            T t8 = (T) this.f46985g.a(cls);
            return !cls.equals(c.class) ? t8 : (T) new a(this.f46984f, (c) t8);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // p228s6.b
    public final <T> b<Set<T>> b(p<T> pVar) {
        if (this.f46983e.contains(pVar)) {
            return this.f46985g.b(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + pVar + ">>.");
    }

    @Override // p228s6.b
    public final <T> T c(p<T> pVar) {
        if (this.f46979a.contains(pVar)) {
            return (T) this.f46985g.c(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + pVar + ".");
    }

    @Override // p228s6.b
    public final <T> b<T> d(Class<T> cls) {
        return g(p.a(cls));
    }

    @Override // p228s6.b
    public final <T> Set<T> e(p<T> pVar) {
        if (this.f46982d.contains(pVar)) {
            return this.f46985g.e(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    @Override // p228s6.b
    public final <T> p096h7.a<T> f(p<T> pVar) {
        if (this.f46981c.contains(pVar)) {
            return this.f46985g.f(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + pVar + ">.");
    }

    @Override // p228s6.b
    public final <T> b<T> g(p<T> pVar) {
        if (this.f46980b.contains(pVar)) {
            return this.f46985g.g(pVar);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    @Override // p228s6.b
    public final <T> p096h7.a<T> h(Class<T> cls) {
        return f(p.a(cls));
    }
}
