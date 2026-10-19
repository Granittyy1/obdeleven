package com.google.common.collect;

import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: MapMaker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27981b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27982c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MapMakerInternalMap.Strength f27983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MapMakerInternalMap.Strength f27984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Equivalence<Object> f27985f;

    public final <K, V> ConcurrentMap<K, V> a() {
        if (!this.f27980a) {
            int i10 = this.f27981b;
            if (i10 == -1) {
                i10 = 16;
            }
            int i11 = this.f27982c;
            if (i11 == -1) {
                i11 = 4;
            }
            return new ConcurrentHashMap(i10, 0.75f, i11);
        }
        MapMakerInternalMap.a aVar = MapMakerInternalMap.f27895i;
        MapMakerInternalMap.Strength strength = this.f27983d;
        MapMakerInternalMap.Strength.AnonymousClass1 anonymousClass1 = MapMakerInternalMap.Strength.f27905b;
        if (((MapMakerInternalMap.Strength) com.google.common.base.d.a(strength, anonymousClass1)) == anonymousClass1 && ((MapMakerInternalMap.Strength) com.google.common.base.d.a(this.f27984e, anonymousClass1)) == anonymousClass1) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.l.a.f27922a);
        }
        MapMakerInternalMap.Strength strength2 = (MapMakerInternalMap.Strength) com.google.common.base.d.a(this.f27983d, anonymousClass1);
        MapMakerInternalMap.Strength.AnonymousClass2 anonymousClass2 = MapMakerInternalMap.Strength.f27906c;
        if (strength2 == anonymousClass1 && ((MapMakerInternalMap.Strength) com.google.common.base.d.a(this.f27984e, anonymousClass1)) == anonymousClass2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.m.a.f27925a);
        }
        if (((MapMakerInternalMap.Strength) com.google.common.base.d.a(this.f27983d, anonymousClass1)) == anonymousClass2 && ((MapMakerInternalMap.Strength) com.google.common.base.d.a(this.f27984e, anonymousClass1)) == anonymousClass1) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.p.a.f27929a);
        }
        if (((MapMakerInternalMap.Strength) com.google.common.base.d.a(this.f27983d, anonymousClass1)) == anonymousClass2 && ((MapMakerInternalMap.Strength) com.google.common.base.d.a(this.f27984e, anonymousClass1)) == anonymousClass2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.q.a.f27932a);
        }
        throw new AssertionError();
    }

    public final void b() {
        MapMakerInternalMap.Strength.AnonymousClass2 anonymousClass2 = MapMakerInternalMap.Strength.f27906c;
        MapMakerInternalMap.Strength strength = this.f27983d;
        A8.p.o(strength, "Key strength was already set to %s", strength == null);
        this.f27983d = anonymousClass2;
        this.f27980a = true;
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        int i10 = this.f27981b;
        if (i10 != -1) {
            aVarB.a(i10, "initialCapacity");
        }
        int i11 = this.f27982c;
        if (i11 != -1) {
            aVarB.a(i11, "concurrencyLevel");
        }
        MapMakerInternalMap.Strength strength = this.f27983d;
        if (strength != null) {
            aVarB.c(I.e.l(strength.toString()), "keyStrength");
        }
        MapMakerInternalMap.Strength strength2 = this.f27984e;
        if (strength2 != null) {
            aVarB.c(I.e.l(strength2.toString()), "valueStrength");
        }
        if (this.f27985f != null) {
            com.google.common.base.d.a.b bVar = new com.google.common.base.d.a.b();
            aVarB.f27794c.f27798c = bVar;
            aVarB.f27794c = bVar;
            bVar.f27797b = "keyEquivalence";
        }
        return aVarB.toString();
    }
}
