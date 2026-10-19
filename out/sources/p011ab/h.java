package p011ab;

import B7.b;
import Na.l;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.k;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import p037cb.C1528h0;
import p037cb.InterfaceC1535l;
import p293xa.g;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements e, InterfaceC1535l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f8108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Annotation> f8110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f8111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f8112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e[] f8113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Annotation>[] f8114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f8115i;
    public final Map<String, Integer> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e[] f8116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f8117l;

    public h(String serialName, m kind, int i10, List<? extends e> typeParameters, a aVar) {
        i.e(serialName, "serialName");
        i.e(kind, "kind");
        i.e(typeParameters, "typeParameters");
        this.f8107a = serialName;
        this.f8108b = kind;
        this.f8109c = i10;
        this.f8110d = aVar.f8083b;
        ArrayList arrayList = aVar.f8084c;
        i.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(x.n(m.y(arrayList, 12)));
        q.l0(arrayList, hashSet);
        this.f8111e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f8112f = strArr;
        this.f8113g = C1528h0.b(aVar.f8086e);
        this.f8114h = (List[]) aVar.f8087f.toArray(new List[0]);
        this.f8115i = q.j0(aVar.f8088g);
        t tVarG0 = k.g0(strArr);
        ArrayList arrayList2 = new ArrayList(m.y(tVarG0, 10));
        Iterator it = tVarG0.iterator();
        while (true) {
            u uVar = (u) it;
            if (!uVar.f43025b.hasNext()) {
                this.j = y.w(arrayList2);
                this.f8116k = C1528h0.b(typeParameters);
                this.f8117l = a.a(new f(0, this));
                return;
            }
            s sVar = (s) uVar.next();
            arrayList2.add(new Pair(sVar.f43023b, Integer.valueOf(sVar.f43022a)));
        }
    }

    @Override // p011ab.e
    public final String a() {
        return this.f8107a;
    }

    @Override // p037cb.InterfaceC1535l
    public final Set<String> b() {
        return this.f8111e;
    }

    @Override // p011ab.e
    public final boolean c() {
        return false;
    }

    @Override // p011ab.e
    public final int d(String name) {
        i.e(name, "name");
        Integer num = this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p011ab.e
    public final m e() {
        return this.f8108b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            e eVar = (e) obj;
            if (i.a(this.f8107a, eVar.a()) && Arrays.equals(this.f8116k, ((h) obj).f8116k)) {
                int iF = eVar.f();
                int i10 = this.f8109c;
                if (i10 == iF) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        e[] eVarArr = this.f8113g;
                        if (i.a(eVarArr[i11].a(), eVar.i(i11).a()) && i.a(eVarArr[i11].e(), eVar.i(i11).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p011ab.e
    public final int f() {
        return this.f8109c;
    }

    @Override // p011ab.e
    public final String g(int i10) {
        return this.f8112f[i10];
    }

    @Override // p011ab.e
    public final List<Annotation> getAnnotations() {
        return this.f8110d;
    }

    @Override // p011ab.e
    public final List<Annotation> h(int i10) {
        return this.f8114h[i10];
    }

    public final int hashCode() {
        return ((Number) this.f8117l.getValue()).intValue();
    }

    @Override // p011ab.e
    public final e i(int i10) {
        return this.f8113g[i10];
    }

    @Override // p011ab.e
    public final boolean isInline() {
        return false;
    }

    @Override // p011ab.e
    public final boolean j(int i10) {
        return this.f8115i[i10];
    }

    public final String toString() {
        return q.U(l.J(0, this.f8109c), ", ", b.g(new StringBuilder(), this.f8107a, '('), ")", new g(0, this), 24);
    }
}
