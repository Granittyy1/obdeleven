package androidx.compose.ui.graphics.vector;

import Z3.n;
import androidx.compose.ui.graphics.C1149z;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import java.util.ArrayList;
import java.util.List;
import p005a4.q;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f13867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f13868l = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f13874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13877i;
    public final int j;

    /* JADX INFO: compiled from: ImageVector.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f13879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f13883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f13884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f13885h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ArrayList<C0156a> f13886i;
        public final C0156a j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f13887k;

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImageVector.kt */
        public static final class C0156a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f13888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f13889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f13890c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final float f13891d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final float f13892e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final float f13893f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final float f13894g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final float f13895h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final List<? extends e> f13896i;
            public final List<j> j;

            public C0156a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }

            public C0156a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
                str = (i10 & 1) != 0 ? "" : str;
                f10 = (i10 & 2) != 0 ? 0.0f : f10;
                f11 = (i10 & 4) != 0 ? 0.0f : f11;
                f12 = (i10 & 8) != 0 ? 0.0f : f12;
                f13 = (i10 & 16) != 0 ? 1.0f : f13;
                f14 = (i10 & 32) != 0 ? 1.0f : f14;
                f15 = (i10 & 64) != 0 ? 0.0f : f15;
                f16 = (i10 & 128) != 0 ? 0.0f : f16;
                list = (i10 & 256) != 0 ? i.f13970a : list;
                ArrayList arrayList = new ArrayList();
                this.f13888a = str;
                this.f13889b = f10;
                this.f13890c = f11;
                this.f13891d = f12;
                this.f13892e = f13;
                this.f13893f = f14;
                this.f13894g = f15;
                this.f13895h = f16;
                this.f13896i = list;
                this.j = arrayList;
            }
        }

        public a(String str, float f10, float f11, float f12, float f13, long j, int i10, boolean z10, int i11) {
            String str2 = (i11 & 1) != 0 ? "" : str;
            long j10 = (i11 & 32) != 0 ? H.f13504l : j;
            int i12 = (i11 & 64) != 0 ? 5 : i10;
            this.f13878a = str2;
            this.f13879b = f10;
            this.f13880c = f11;
            this.f13881d = f12;
            this.f13882e = f13;
            this.f13883f = j10;
            this.f13884g = i12;
            this.f13885h = z10;
            ArrayList<C0156a> arrayList = new ArrayList<>();
            this.f13886i = arrayList;
            C0156a c0156a = new C0156a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.j = c0156a;
            arrayList.add(c0156a);
        }

        public static void a(a aVar, ArrayList arrayList, m0 m0Var) {
            if (aVar.f13887k) {
                R.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((C0156a) n.f(1, aVar.f13886i)).j.add(new l("", arrayList, 0, m0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
        }

        public final c b() {
            if (this.f13887k) {
                R.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (true) {
                ArrayList<C0156a> arrayList = this.f13886i;
                if (arrayList.size() <= 1) {
                    C0156a c0156a = this.j;
                    c cVar = new c(this.f13878a, this.f13879b, this.f13880c, this.f13881d, this.f13882e, new h(c0156a.f13888a, c0156a.f13889b, c0156a.f13890c, c0156a.f13891d, c0156a.f13892e, c0156a.f13893f, c0156a.f13894g, c0156a.f13895h, c0156a.f13896i, c0156a.j), this.f13883f, this.f13884g, this.f13885h);
                    this.f13887k = true;
                    return cVar;
                }
                if (this.f13887k) {
                    R.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                C0156a c0156aRemove = arrayList.remove(arrayList.size() - 1);
                ((C0156a) n.f(1, arrayList)).j.add(new h(c0156aRemove.f13888a, c0156aRemove.f13889b, c0156aRemove.f13890c, c0156aRemove.f13891d, c0156aRemove.f13892e, c0156aRemove.f13893f, c0156aRemove.f13894g, c0156aRemove.f13895h, c0156aRemove.f13896i, c0156aRemove.j));
            }
        }
    }

    /* JADX INFO: compiled from: ImageVector.kt */
    public static final class b {
    }

    public c(String str, float f10, float f11, float f12, float f13, h hVar, long j, int i10, boolean z10) {
        int i11;
        synchronized (f13868l) {
            i11 = f13867k;
            f13867k = i11 + 1;
        }
        this.f13869a = str;
        this.f13870b = f10;
        this.f13871c = f11;
        this.f13872d = f12;
        this.f13873e = f13;
        this.f13874f = hVar;
        this.f13875g = j;
        this.f13876h = i10;
        this.f13877i = z10;
        this.j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.i.a(this.f13869a, cVar.f13869a) && p013b0.f.a(this.f13870b, cVar.f13870b) && p013b0.f.a(this.f13871c, cVar.f13871c) && this.f13872d == cVar.f13872d && this.f13873e == cVar.f13873e && this.f13874f.equals(cVar.f13874f) && H.c(this.f13875g, cVar.f13875g) && C1149z.a(this.f13876h, cVar.f13876h) && this.f13877i == cVar.f13877i;
    }

    public final int hashCode() {
        int iHashCode = (this.f13874f.hashCode() + O.a.d(this.f13873e, O.a.d(this.f13872d, O.a.d(this.f13871c, O.a.d(this.f13870b, this.f13869a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = H.f13505m;
        return Boolean.hashCode(this.f13877i) + q.b(this.f13876h, C4.b.c(this.f13875g, iHashCode, 31), 31);
    }
}
