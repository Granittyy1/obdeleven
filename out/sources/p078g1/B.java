package p078g1;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import p114j1.A;
import p241t7.b;

/* JADX INFO: compiled from: Tracks.java */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f35220b = new B(ImmutableList.K());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<a> f35221a;

    /* JADX INFO: compiled from: Tracks.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f35223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f35224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f35225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean[] f35226e;

        static {
            A.B(0);
            A.B(1);
            A.B(3);
            A.B(4);
        }

        public a(y yVar, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = yVar.f35491a;
            this.f35222a = i10;
            boolean z11 = false;
            b.e(i10 == iArr.length && i10 == zArr.length);
            this.f35223b = yVar;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f35224c = z11;
            this.f35225d = (int[]) iArr.clone();
            this.f35226e = (boolean[]) zArr.clone();
        }

        public final int a() {
            return this.f35223b.f35493c;
        }

        public final boolean b(int i10) {
            return this.f35225d[i10] == 4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35224c == aVar.f35224c && this.f35223b.equals(aVar.f35223b) && Arrays.equals(this.f35225d, aVar.f35225d) && Arrays.equals(this.f35226e, aVar.f35226e);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f35226e) + ((Arrays.hashCode(this.f35225d) + (((this.f35223b.hashCode() * 31) + (this.f35224c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        A.B(0);
    }

    public B(List<a> list) {
        this.f35221a = ImmutableList.G(list);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.f35221a;
            if (i11 >= immutableList.size()) {
                return false;
            }
            a aVar = immutableList.get(i11);
            boolean z10 = false;
            for (boolean z11 : aVar.f35226e) {
                if (z11) {
                    z10 = true;
                    break;
                }
            }
            if (z10 && aVar.a() == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        return this.f35221a.equals(((B) obj).f35221a);
    }

    public final int hashCode() {
        return this.f35221a.hashCode();
    }
}
