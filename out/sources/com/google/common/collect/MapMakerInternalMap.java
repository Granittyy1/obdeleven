package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.collect.MapMakerInternalMap.h;
import com.google.common.primitives.Ints;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
class MapMakerInternalMap<K, V, E extends h<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f27895i = new a();
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f27896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f27897c;
    final int concurrencyLevel;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Segment<K, V, E, S>[] f27898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient i<K, V, E, S> f27899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient k f27900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient o f27901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient f f27902h;
    final Equivalence<Object> keyEquivalence;

    public static abstract class AbstractSerializationProxy<K, V> extends com.google.common.collect.j<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient AbstractMap f27903b;
        final int concurrencyLevel;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i10, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i10;
            this.f27903b = (AbstractMap) concurrentMap;
        }

        @Override // com.google.common.collect.l
        public final Object a() {
            return this.f27903b;
        }

        @Override // com.google.common.collect.k
        public final Map b() {
            return this.f27903b;
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        /* JADX WARN: Multi-variable type inference failed */
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i10 = objectInputStream.readInt();
            com.google.common.collect.o oVar = new com.google.common.collect.o();
            A8.p.g(i10 >= 0);
            oVar.f27981b = i10;
            Strength strength = this.keyStrength;
            Strength strength2 = oVar.f27983d;
            A8.p.o(strength2, "Key strength was already set to %s", strength2 == null);
            strength.getClass();
            oVar.f27983d = strength;
            Strength.AnonymousClass1 anonymousClass1 = Strength.f27905b;
            if (strength != anonymousClass1) {
                oVar.f27980a = true;
            }
            Strength strength3 = this.valueStrength;
            Strength strength4 = oVar.f27984e;
            A8.p.o(strength4, "Value strength was already set to %s", strength4 == null);
            strength3.getClass();
            oVar.f27984e = strength3;
            if (strength3 != anonymousClass1) {
                oVar.f27980a = true;
            }
            Equivalence<Object> equivalence = this.keyEquivalence;
            Equivalence<Object> equivalence2 = oVar.f27985f;
            A8.p.o(equivalence2, "key equivalence was already set to %s", equivalence2 == null);
            equivalence.getClass();
            oVar.f27985f = equivalence;
            oVar.f27980a = true;
            int i11 = this.concurrencyLevel;
            int i12 = oVar.f27982c;
            if (!(i12 == -1)) {
                throw new IllegalStateException(A8.A.h("concurrency level was already set to %s", Integer.valueOf(i12)));
            }
            A8.p.g(i11 > 0);
            oVar.f27982c = i11;
            this.f27903b = (AbstractMap) oVar.a();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.f27903b.put(object, objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.f27903b;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f27903b.size());
            for (Map.Entry<K, V> entry : this.f27903b.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    public enum Strength {
        f27905b { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public final Equivalence<Object> a() {
                return Equivalence.c();
            }
        },
        f27906c { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public final Equivalence<Object> a() {
                return Equivalence.e();
            }
        };

        Strength() {
            throw null;
        }

        public abstract Equivalence<Object> a();
    }

    public static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f27908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27909b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i10, Object obj) {
            this.f27908a = obj;
            this.f27909b = i10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final int b() {
            return this.f27909b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final K getKey() {
            return this.f27908a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public E getNext() {
            return null;
        }
    }

    public static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27910a;

        public c(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(k10, referenceQueue);
            this.f27910a = i10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final int b() {
            return this.f27910a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final K getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public E getNext() {
            return null;
        }
    }

    public static final class d implements h<Object, Object, d> {
        public d() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final int b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final h getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final Object getValue() {
            throw new AssertionError();
        }
    }

    public final class e extends MapMakerInternalMap<K, V, E, S>.g<Map.Entry<K, V>> {
    }

    public final class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            MapMakerInternalMap mapMakerInternalMap;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (mapMakerInternalMap = MapMakerInternalMap.this).get(key)) != null && mapMakerInternalMap.f27899e.d().a().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public abstract class g<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27913c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Segment<K, V, E, S> f27914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AtomicReferenceArray<E> f27915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public E f27916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public MapMakerInternalMap<K, V, E, S>.u f27917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public MapMakerInternalMap<K, V, E, S>.u f27918h;

        public g() {
            this.f27912b = MapMakerInternalMap.this.f27898d.length - 1;
            a();
        }

        public final void a() {
            this.f27917g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i10 = this.f27912b;
                if (i10 < 0) {
                    return;
                }
                Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.f27898d;
                this.f27912b = i10 - 1;
                Segment<K, V, E, S> segment = segmentArr[i10];
                this.f27914d = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f27914d.table;
                    this.f27915e = atomicReferenceArray;
                    this.f27913c = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(E e10) {
            Segment<K, V, E, S> segment;
            MapMakerInternalMap mapMakerInternalMap = MapMakerInternalMap.this;
            try {
                Object key = e10.getKey();
                mapMakerInternalMap.getClass();
                Object value = e10.getKey() == null ? null : e10.getValue();
                if (value == null) {
                    return false;
                }
                this.f27917g = new u(key, value);
                return true;
            } finally {
                this.f27914d.g();
            }
        }

        public final MapMakerInternalMap<K, V, E, S>.u c() {
            MapMakerInternalMap<K, V, E, S>.u uVar = this.f27917g;
            if (uVar == null) {
                throw new NoSuchElementException();
            }
            this.f27918h = uVar;
            a();
            return this.f27918h;
        }

        public final boolean d() {
            E e10 = this.f27916f;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f27916f = (E) e10.getNext();
                E e11 = this.f27916f;
                if (e11 == null) {
                    return false;
                }
                if (b(e11)) {
                    return true;
                }
                e10 = this.f27916f;
            }
        }

        public final boolean e() {
            while (true) {
                int i10 = this.f27913c;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f27915e;
                this.f27913c = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f27916f = e10;
                if (e10 != null && (b(e10) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27917g != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            A8.p.p("no calls to next() since the last call to remove()", this.f27918h != null);
            MapMakerInternalMap.this.remove(this.f27918h.f27935b);
            this.f27918h = null;
        }
    }

    public interface h<K, V, E extends h<K, V, E>> {
        int b();

        K getKey();

        E getNext();

        V getValue();
    }

    public interface i<K, V, E extends h<K, V, E>, S extends Segment<K, V, E, S>> {
        S a(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i10);

        E b(S s10, E e10, E e11);

        Strength c();

        Strength d();

        void e(S s10, E e10, V v10);

        E f(S s10, K k10, int i10, E e10);
    }

    public final class j extends MapMakerInternalMap<K, V, E, S>.g<K> {
        @Override // com.google.common.collect.MapMakerInternalMap.g, java.util.Iterator
        public final K next() {
            return c().f27935b;
        }
    }

    public final class k extends AbstractSet<K> {
        public k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static class l<K, V> extends b<K, V, l<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile V f27921c;

        public static final class a<K, V> implements i<K, V, l<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f27922a = new a<>();

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i10) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final h b(Segment segment, h hVar, h hVar2) {
                l lVar = (l) hVar;
                l lVar2 = (l) hVar2;
                K k10 = lVar.f27908a;
                int i10 = lVar.f27909b;
                l lVar3 = lVar2 == null ? new l(i10, k10) : new b(k10, i10, lVar2);
                lVar3.f27921c = lVar.f27921c;
                return lVar3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Strength c() {
                return Strength.f27905b;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Strength d() {
                return Strength.f27905b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final void e(Segment segment, h hVar, Object obj) {
                ((l) hVar).f27921c = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final h f(Segment segment, Object obj, int i10, h hVar) {
                l lVar = (l) hVar;
                return lVar == null ? new l(i10, obj) : new b(obj, i10, lVar);
            }
        }

        public static final class b<K, V> extends l<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final l<K, V> f27923d;

            public b(K k10, int i10, l<K, V> lVar) {
                super(i10, k10);
                this.f27923d = lVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.b, com.google.common.collect.MapMakerInternalMap.h
            public final h getNext() {
                return this.f27923d;
            }
        }

        public l() {
            throw null;
        }

        public l(int i10, Object obj) {
            super(i10, obj);
            this.f27921c = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final V getValue() {
            return this.f27921c;
        }
    }

    public static class m<K, V> extends b<K, V, m<K, V>> implements r<K, V, m<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile s<K, V, m<K, V>> f27924c;

        public static final class a<K, V> implements i<K, V, m<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f27925a = new a<>();

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i10) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final h b(Segment segment, h hVar, h hVar2) {
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                m mVar = (m) hVar;
                m mVar2 = (m) hVar2;
                int i10 = Segment.f27904b;
                if (mVar.getValue() == null) {
                    return null;
                }
                K k10 = mVar.f27908a;
                int i11 = mVar.f27909b;
                m mVar3 = mVar2 == null ? new m(i11, k10) : new b(k10, i11, mVar2);
                mVar3.f27924c = mVar.f27924c.a(strongKeyWeakValueSegment.queueForValues, mVar3);
                return mVar3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Strength c() {
                return Strength.f27905b;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Strength d() {
                return Strength.f27906c;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final void e(Segment segment, h hVar, Object obj) {
                m mVar = (m) hVar;
                s<K, V, m<K, V>> sVar = mVar.f27924c;
                mVar.f27924c = new t(((StrongKeyWeakValueSegment) segment).queueForValues, obj, mVar);
                sVar.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final h f(Segment segment, Object obj, int i10, h hVar) {
                m mVar = (m) hVar;
                return mVar == null ? new m(i10, obj) : new b(obj, i10, mVar);
            }
        }

        public static final class b<K, V> extends m<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final m<K, V> f27926d;

            public b(K k10, int i10, m<K, V> mVar) {
                super(i10, k10);
                this.f27926d = mVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.b, com.google.common.collect.MapMakerInternalMap.h
            public final h getNext() {
                return this.f27926d;
            }
        }

        public m() {
            throw null;
        }

        public m(int i10, Object obj) {
            super(i10, obj);
            this.f27924c = MapMakerInternalMap.f27895i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.r
        public final s<K, V, m<K, V>> a() {
            return this.f27924c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final V getValue() {
            return this.f27924c.get();
        }
    }

    public final class n extends MapMakerInternalMap<K, V, E, S>.g<V> {
        @Override // com.google.common.collect.MapMakerInternalMap.g, java.util.Iterator
        public final V next() {
            return c().f27936c;
        }
    }

    public final class o extends AbstractCollection<V> {
        public o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static class p<K, V> extends c<K, V, p<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile V f27928b;

        public static final class a<K, V> implements i<K, V, p<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f27929a = new a<>();

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i10) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final h b(Segment segment, h hVar, h hVar2) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                p pVar = (p) hVar;
                p pVar2 = (p) hVar2;
                K k10 = pVar.get();
                if (k10 == null) {
                    return null;
                }
                int i10 = pVar.f27910a;
                p pVar3 = pVar2 == null ? new p(weakKeyStrongValueSegment.queueForKeys, k10, i10) : new b(weakKeyStrongValueSegment.queueForKeys, k10, i10, pVar2);
                pVar3.f27928b = pVar.f27928b;
                return pVar3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Strength c() {
                return Strength.f27906c;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Strength d() {
                return Strength.f27905b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final void e(Segment segment, h hVar, Object obj) {
                ((p) hVar).f27928b = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final h f(Segment segment, Object obj, int i10, h hVar) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                p pVar = (p) hVar;
                return pVar == null ? new p(weakKeyStrongValueSegment.queueForKeys, obj, i10) : new b(weakKeyStrongValueSegment.queueForKeys, obj, i10, pVar);
            }
        }

        public static final class b<K, V> extends p<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final p<K, V> f27930c;

            public b(ReferenceQueue referenceQueue, Object obj, int i10, p pVar) {
                super(referenceQueue, obj, i10);
                this.f27930c = pVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.c, com.google.common.collect.MapMakerInternalMap.h
            public final h getNext() {
                return this.f27930c;
            }
        }

        public p() {
            throw null;
        }

        public p(ReferenceQueue referenceQueue, Object obj, int i10) {
            super(referenceQueue, obj, i10);
            this.f27928b = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final V getValue() {
            return this.f27928b;
        }
    }

    public static class q<K, V> extends c<K, V, q<K, V>> implements r<K, V, q<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile s<K, V, q<K, V>> f27931b;

        public static final class a<K, V> implements i<K, V, q<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f27932a = new a<>();

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i10) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final h b(Segment segment, h hVar, h hVar2) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                q qVar = (q) hVar;
                q qVar2 = (q) hVar2;
                K k10 = qVar.get();
                q qVar3 = null;
                if (k10 != null) {
                    int i10 = Segment.f27904b;
                    if (qVar.f27931b.get() != null) {
                        int i11 = qVar.f27910a;
                        qVar3 = qVar2 == null ? new q(weakKeyWeakValueSegment.queueForKeys, k10, i11) : new b(weakKeyWeakValueSegment.queueForKeys, k10, i11, qVar2);
                        qVar3.f27931b = qVar.f27931b.a(weakKeyWeakValueSegment.queueForValues, qVar3);
                    }
                }
                return qVar3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Strength c() {
                return Strength.f27906c;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final Strength d() {
                return Strength.f27906c;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final void e(Segment segment, h hVar, Object obj) {
                q qVar = (q) hVar;
                s<K, V, q<K, V>> sVar = qVar.f27931b;
                qVar.f27931b = new t(((WeakKeyWeakValueSegment) segment).queueForValues, obj, qVar);
                sVar.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.i
            public final h f(Segment segment, Object obj, int i10, h hVar) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                q qVar = (q) hVar;
                return qVar == null ? new q(weakKeyWeakValueSegment.queueForKeys, obj, i10) : new b(weakKeyWeakValueSegment.queueForKeys, obj, i10, qVar);
            }
        }

        public static final class b<K, V> extends q<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final q<K, V> f27933c;

            public b(ReferenceQueue<K> referenceQueue, K k10, int i10, q<K, V> qVar) {
                super(referenceQueue, k10, i10);
                this.f27933c = qVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.c, com.google.common.collect.MapMakerInternalMap.h
            public final h getNext() {
                return this.f27933c;
            }
        }

        public q(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f27931b = MapMakerInternalMap.f27895i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.r
        public final s<K, V, q<K, V>> a() {
            return this.f27931b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h
        public final V getValue() {
            return this.f27931b.get();
        }
    }

    public interface r<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        s<K, V, E> a();
    }

    public interface s<K, V, E extends h<K, V, E>> {
        s a(ReferenceQueue referenceQueue, r rVar);

        void clear();

        V get();

        E getEntry();
    }

    public static final class t<K, V, E extends h<K, V, E>> extends WeakReference<V> implements s<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f27934a;

        public t(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f27934a = e10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.s
        public final s a(ReferenceQueue referenceQueue, r rVar) {
            return new t(referenceQueue, get(), rVar);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.s
        public final E getEntry() {
            return this.f27934a;
        }
    }

    public final class u extends AbstractC2037c<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f27935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public V f27936c;

        public u(K k10, V v10) {
            this.f27935b = k10;
            this.f27936c = v10;
        }

        @Override // com.google.common.collect.AbstractC2037c, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f27935b.equals(entry.getKey()) && this.f27936c.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f27935b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f27936c;
        }

        @Override // com.google.common.collect.AbstractC2037c, java.util.Map.Entry
        public final int hashCode() {
            return this.f27935b.hashCode() ^ this.f27936c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = (V) MapMakerInternalMap.this.put(this.f27935b, v10);
            this.f27936c = v10;
            return v11;
        }
    }

    public MapMakerInternalMap(com.google.common.collect.o oVar, i<K, V, E, S> iVar) {
        int i10 = oVar.f27982c;
        this.concurrencyLevel = Math.min(i10 == -1 ? 4 : i10, 65536);
        this.keyEquivalence = (Equivalence) com.google.common.base.d.a(oVar.f27985f, ((Strength) com.google.common.base.d.a(oVar.f27983d, Strength.f27905b)).a());
        this.f27899e = iVar;
        int i11 = oVar.f27981b;
        int iMin = Math.min(i11 == -1 ? 16 : i11, 1073741824);
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        int i15 = 0;
        while (i14 < this.concurrencyLevel) {
            i15++;
            i14 <<= 1;
        }
        this.f27897c = 32 - i15;
        this.f27896b = i14 - 1;
        this.f27898d = new Segment[i14];
        int i16 = iMin / i14;
        while (i12 < (i14 * i16 < iMin ? i16 + 1 : i16)) {
            i12 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.f27898d;
            if (i13 >= segmentArr.length) {
                return;
            }
            segmentArr[i13] = this.f27899e.a(this, i12);
            i13++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int a(Object obj) {
        int iB;
        Equivalence<Object> equivalence = this.keyEquivalence;
        if (obj == null) {
            equivalence.getClass();
            iB = 0;
        } else {
            iB = equivalence.b(obj);
        }
        int i10 = iB + ((iB << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = (i13 << 2) + (i13 << 14) + i13;
        return (i14 >>> 16) ^ i14;
    }

    public final Segment<K, V, E, S> b(int i10) {
        return this.f27898d[(i10 >>> this.f27897c) & this.f27896b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Segment<K, V, E, S> segment : this.f27898d) {
            if (segment.count != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    segment.e();
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                    segment.unlock();
                } catch (Throwable th) {
                    segment.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        h hVarD;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        Segment<K, V, E, S> segmentB = b(iA);
        segmentB.getClass();
        try {
            if (segmentB.count != 0 && (hVarD = segmentB.d(iA, obj)) != null && hVarD.getValue() != null) {
                z10 = true;
            }
            return z10;
        } finally {
            segmentB.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.f27898d;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = segmentArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                Segment<K, V, E, S> segment = segmentArr[r10];
                int i11 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    for (E next = atomicReferenceArray.get(r13); next != null; next = next.getNext()) {
                        if (next.getKey() == null || (value = next.getValue()) == null) {
                            segment.m();
                            value = null;
                        }
                        if (value != null && this.f27899e.d().a().d(obj, value)) {
                            return true;
                        }
                    }
                }
                j11 += (long) segment.modCount;
                z10 = false;
            }
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        f fVar = this.f27902h;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        this.f27902h = fVar2;
        return fVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v10 = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        Segment<K, V, E, S> segmentB = b(iA);
        segmentB.getClass();
        try {
            h hVarD = segmentB.d(iA, obj);
            if (hVarD != null && (v10 = (V) hVarD.getValue()) == null) {
                segmentB.m();
            }
            return v10;
        } finally {
            segmentB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.f27898d;
        long j10 = 0;
        for (int i10 = 0; i10 < segmentArr.length; i10++) {
            if (segmentArr[i10].count != 0) {
                return false;
            }
            j10 += (long) segmentArr[i10].modCount;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < segmentArr.length; i11++) {
            if (segmentArr[i11].count != 0) {
                return false;
            }
            j10 -= (long) segmentArr[i11].modCount;
        }
        return j10 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        k kVar = this.f27900f;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k();
        this.f27900f = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iA = a(k10);
        return (V) b(iA).h(iA, k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iA = a(k10);
        return (V) b(iA).h(iA, k10, v10, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r6.getValue() == null) goto L18;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r9.a(r10)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r9.b(r1)
            r2.lock()
            r2.j()     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$h<K, V, E>> r3 = r2.table     // Catch: java.lang.Throwable -> L5f
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L5f
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L5f
            com.google.common.collect.MapMakerInternalMap$h r5 = (com.google.common.collect.MapMakerInternalMap.h) r5     // Catch: java.lang.Throwable -> L5f
            r6 = r5
        L22:
            if (r6 == 0) goto L61
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L5f
            int r8 = r6.b()     // Catch: java.lang.Throwable -> L5f
            if (r8 != r1) goto L65
            if (r7 == 0) goto L65
            com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$h<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r8 = r2.map     // Catch: java.lang.Throwable -> L5f
            com.google.common.base.Equivalence<java.lang.Object> r8 = r8.keyEquivalence     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r8.d(r10, r7)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L65
            java.lang.Object r10 = r6.getValue()     // Catch: java.lang.Throwable -> L5f
            if (r10 == 0) goto L41
            goto L47
        L41:
            java.lang.Object r1 = r6.getValue()     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L61
        L47:
            int r0 = r2.modCount     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + 1
            r2.modCount = r0     // Catch: java.lang.Throwable -> L5f
            com.google.common.collect.MapMakerInternalMap$h r0 = r2.i(r5, r6)     // Catch: java.lang.Throwable -> L5f
            int r1 = r2.count     // Catch: java.lang.Throwable -> L5f
            int r1 = r1 + (-1)
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L5f
            r2.count = r1     // Catch: java.lang.Throwable -> L5f
            r2.unlock()
            r0 = r10
            goto L6a
        L5f:
            r10 = move-exception
            goto L6b
        L61:
            r2.unlock()
            goto L6a
        L65:
            com.google.common.collect.MapMakerInternalMap$h r6 = r6.getNext()     // Catch: java.lang.Throwable -> L5f
            goto L22
        L6a:
            return r0
        L6b:
            r2.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iA = a(k10);
        Segment<K, V, E, S> segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray<E> atomicReferenceArray = segmentB.table;
            int length = (atomicReferenceArray.length() - 1) & iA;
            E e10 = atomicReferenceArray.get(length);
            for (h next = e10; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.b() == iA && key != null && segmentB.map.keyEquivalence.d(k10, key)) {
                    V v11 = (V) next.getValue();
                    if (v11 != null) {
                        segmentB.modCount++;
                        segmentB.l(next, v10);
                        return v11;
                    }
                    if (next.getValue() != null) {
                        break;
                    }
                    segmentB.modCount++;
                    h hVarI = segmentB.i(e10, next);
                    int i10 = segmentB.count - 1;
                    atomicReferenceArray.set(length, (E) hVarI);
                    segmentB.count = i10;
                    break;
                }
            }
            return null;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j10 = 0;
        for (Segment<K, V, E, S> segment : this.f27898d) {
            j10 += (long) segment.count;
        }
        return Ints.k0(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        o oVar = this.f27901g;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o();
        this.f27901g = oVar2;
        return oVar2;
    }

    public Object writeReplace() {
        i<K, V, E, S> iVar = this.f27899e;
        return new SerializationProxy(iVar.c(), iVar.d(), this.keyEquivalence, iVar.d().a(), this.concurrencyLevel, this);
    }

    public static abstract class Segment<K, V, E extends h<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f27904b = 0;
        volatile int count;
        final MapMakerInternalMap<K, V, E, S> map;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        volatile AtomicReferenceArray<E> table;
        int threshold;

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i10) {
            this.map = mapMakerInternalMap;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i10);
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        public final void a(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                h hVar = (h) referencePoll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.map;
                mapMakerInternalMap.getClass();
                int iB = hVar.b();
                Segment<K, V, E, S> segmentB = mapMakerInternalMap.b(iB);
                segmentB.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segmentB.table;
                    int length = iB & (atomicReferenceArray.length() - 1);
                    E e10 = atomicReferenceArray.get(length);
                    for (h next = e10; next != null; next = next.getNext()) {
                        if (next == hVar) {
                            segmentB.modCount++;
                            h hVarI = segmentB.i(e10, next);
                            int i11 = segmentB.count - 1;
                            atomicReferenceArray.set(length, (E) hVarI);
                            segmentB.count = i11;
                            break;
                        }
                    }
                    segmentB.unlock();
                    i10++;
                } catch (Throwable th) {
                    segmentB.unlock();
                    throw th;
                }
            } while (i10 != 16);
        }

        public final void b(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                s<K, V, E> sVar = (s) referencePoll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.map;
                mapMakerInternalMap.getClass();
                h entry = sVar.getEntry();
                int iB = entry.b();
                Segment<K, V, E, S> segmentB = mapMakerInternalMap.b(iB);
                Object key = entry.getKey();
                segmentB.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segmentB.table;
                    int length = (atomicReferenceArray.length() - 1) & iB;
                    E e10 = atomicReferenceArray.get(length);
                    for (h next = e10; next != null; next = next.getNext()) {
                        Object key2 = next.getKey();
                        if (next.b() == iB && key2 != null && segmentB.map.keyEquivalence.d(key, key2)) {
                            if (((r) next).a() != sVar) {
                                break;
                            }
                            segmentB.modCount++;
                            h hVarI = segmentB.i(e10, next);
                            int i11 = segmentB.count - 1;
                            atomicReferenceArray.set(length, (E) hVarI);
                            segmentB.count = i11;
                            break;
                        }
                    }
                    segmentB.unlock();
                    i10++;
                } catch (Throwable th) {
                    segmentB.unlock();
                    throw th;
                }
            } while (i10 != 16);
        }

        public final void c() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.count;
            ScheduledRunnable scheduledRunnable = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.threshold = (scheduledRunnable.length() * 3) / 4;
            int length2 = scheduledRunnable.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E next = atomicReferenceArray.get(i11);
                if (next != null) {
                    h next2 = next.getNext();
                    int iB = next.b() & length2;
                    if (next2 == null) {
                        scheduledRunnable.set(iB, next);
                    } else {
                        h hVar = next;
                        while (next2 != null) {
                            int iB2 = next2.b() & length2;
                            if (iB2 != iB) {
                                hVar = next2;
                                iB = iB2;
                            }
                            next2 = next2.getNext();
                        }
                        scheduledRunnable.set(iB, hVar);
                        while (next != hVar) {
                            int iB3 = next.b() & length2;
                            h hVarB = this.map.f27899e.b(k(), next, (h) scheduledRunnable.get(iB3));
                            if (hVarB != null) {
                                scheduledRunnable.set(iB3, hVarB);
                            } else {
                                i10--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = scheduledRunnable;
            this.count = i10;
        }

        public final h d(int i10, Object obj) {
            if (this.count != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                for (E next = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i10); next != null; next = next.getNext()) {
                    if (next.b() == i10) {
                        Object key = next.getKey();
                        if (key == null) {
                            m();
                        } else if (this.map.keyEquivalence.d(obj, key)) {
                            return next;
                        }
                    }
                }
            }
            return null;
        }

        public final void g() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                j();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object h(int i10, Object obj, Object obj2, boolean z10) {
            lock();
            try {
                j();
                int i11 = this.count + 1;
                if (i11 > this.threshold) {
                    c();
                    i11 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.b() == i10 && key != null && this.map.keyEquivalence.d(obj, key)) {
                        Object value = next.getValue();
                        if (value == null) {
                            this.modCount++;
                            l(next, obj2);
                            this.count = this.count;
                            return null;
                        }
                        if (z10) {
                            return value;
                        }
                        this.modCount++;
                        l(next, obj2);
                        return value;
                    }
                }
                this.modCount++;
                h hVarF = this.map.f27899e.f(k(), obj, i10, e10);
                l(hVarF, obj2);
                atomicReferenceArray.set(length, (E) hVarF);
                this.count = i11;
                return null;
            } finally {
                unlock();
            }
        }

        public final E i(E e10, E e11) {
            int i10 = this.count;
            E e12 = (E) e11.getNext();
            while (e10 != e11) {
                h hVarB = this.map.f27899e.b(k(), e10, e12);
                if (hVarB != null) {
                    e12 = (E) hVarB;
                } else {
                    i10--;
                }
                e10 = (E) e10.getNext();
            }
            this.count = i10;
            return e12;
        }

        public final void j() {
            if (tryLock()) {
                try {
                    f();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S k();

        public final void l(E e10, V v10) {
            this.map.f27899e.e(k(), e10, v10);
        }

        public final void m() {
            if (tryLock()) {
                try {
                    f();
                } finally {
                    unlock();
                }
            }
        }

        public void e() {
        }

        public void f() {
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, l<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment() {
            throw null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, m<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, m<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.queueForValues.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            b(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, p<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, p<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.queueForKeys.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            a(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, q<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, q<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.queueForKeys.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            a(this.queueForKeys);
            b(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    public class a implements s<Object, Object, d> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.MapMakerInternalMap.s
        public final s a(ReferenceQueue referenceQueue, r rVar) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.s
        public final Object get() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.s
        public final /* bridge */ /* synthetic */ h getEntry() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.s
        public final void clear() {
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z10 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        Segment<K, V, E, S> segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray<E> atomicReferenceArray = segmentB.table;
            int length = (atomicReferenceArray.length() - 1) & iA;
            E e10 = atomicReferenceArray.get(length);
            for (h next = e10; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.b() == iA && key != null && segmentB.map.keyEquivalence.d(obj, key)) {
                    if (!segmentB.map.f27899e.d().a().d(obj2, next.getValue())) {
                        if (next.getValue() != null) {
                            break;
                        }
                        break;
                    }
                    z10 = true;
                    segmentB.modCount++;
                    h hVarI = segmentB.i(e10, next);
                    int i10 = segmentB.count - 1;
                    atomicReferenceArray.set(length, (E) hVarI);
                    segmentB.count = i10;
                    break;
                }
            }
            return z10;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k10, V v10, V v11) {
        k10.getClass();
        v11.getClass();
        if (v10 == null) {
            return false;
        }
        int iA = a(k10);
        Segment<K, V, E, S> segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray<E> atomicReferenceArray = segmentB.table;
            int length = (atomicReferenceArray.length() - 1) & iA;
            E e10 = atomicReferenceArray.get(length);
            for (h next = e10; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.b() == iA && key != null && segmentB.map.keyEquivalence.d(k10, key)) {
                    Object value = next.getValue();
                    if (value == null) {
                        if (next.getValue() != null) {
                            break;
                        }
                        segmentB.modCount++;
                        h hVarI = segmentB.i(e10, next);
                        int i10 = segmentB.count - 1;
                        atomicReferenceArray.set(length, (E) hVarI);
                        segmentB.count = i10;
                        break;
                    }
                    if (!segmentB.map.f27899e.d().a().d(v10, value)) {
                        break;
                    }
                    segmentB.modCount++;
                    segmentB.l(next, v11);
                    return true;
                }
            }
            return false;
        } finally {
            segmentB.unlock();
        }
    }
}
