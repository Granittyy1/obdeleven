package p037cb;

import Na.l;
import Ya.b;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import p011ab.e;
import p011ab.m;
import p011ab.n;

/* JADX INFO: renamed from: cb.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public class C1536l0 implements e, InterfaceC1535l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D<?> f22627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22629d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f22630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Annotation>[] f22631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f22632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f22633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f22634i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f22635k;

    public C1536l0(String str, D<?> d10, int i10) {
        this.f22626a = str;
        this.f22627b = d10;
        this.f22628c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f22630e = strArr;
        int i12 = this.f22628c;
        this.f22631f = new List[i12];
        this.f22632g = new boolean[i12];
        this.f22633h = y.p();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42972c;
        int i13 = 0;
        this.f22634i = a.b(lazyThreadSafetyMode, new C1532j0(i13, this));
        this.j = a.b(lazyThreadSafetyMode, new C1534k0(i13, this));
        this.f22635k = a.b(lazyThreadSafetyMode, new Q9.a(2, this));
    }

    @Override // p011ab.e
    public final String a() {
        return this.f22626a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p037cb.InterfaceC1535l
    public final Set<String> b() {
        return this.f22633h.keySet();
    }

    @Override // p011ab.e
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // p011ab.e
    public final int d(String name) {
        i.e(name, "name");
        Integer num = (Integer) this.f22633h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p011ab.e
    public m e() {
        return n.a.f8124a;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, xa.g] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1536l0) {
            e eVar = (e) obj;
            if (this.f22626a.equals(eVar.a()) && Arrays.equals((e[]) this.j.getValue(), (e[]) ((C1536l0) obj).j.getValue())) {
                int iF = eVar.f();
                int i10 = this.f22628c;
                if (i10 == iF) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (i.a(i(i11).a(), eVar.i(i11).a()) && i.a(i(i11).e(), eVar.i(i11).e())) {
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
        return this.f22628c;
    }

    @Override // p011ab.e
    public final String g(int i10) {
        return this.f22630e[i10];
    }

    @Override // p011ab.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f42983b;
    }

    @Override // p011ab.e
    public final List<Annotation> h(int i10) {
        List<Annotation> list = this.f22631f[i10];
        return list == null ? EmptyList.f42983b : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public int hashCode() {
        return ((Number) this.f22635k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // p011ab.e
    public e i(int i10) {
        return ((b[]) this.f22634i.getValue())[i10].getDescriptor();
    }

    @Override // p011ab.e
    public boolean isInline() {
        return false;
    }

    @Override // p011ab.e
    public final boolean j(int i10) {
        return this.f22632g[i10];
    }

    public final void k(String name, boolean z10) {
        i.e(name, "name");
        int i10 = this.f22629d + 1;
        this.f22629d = i10;
        String[] strArr = this.f22630e;
        strArr[i10] = name;
        this.f22632g[i10] = z10;
        this.f22631f[i10] = null;
        if (i10 == this.f22628c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f22633h = map;
        }
    }

    public String toString() {
        return q.U(l.J(0, this.f22628c), ", ", this.f22626a.concat("("), ")", new C1530i0(0, this), 24);
    }
}
