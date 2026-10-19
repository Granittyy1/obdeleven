package coil.disk;

import D2.V;
import Sa.j;
import androidx.navigation.compose.x;
import coil.util.k;
import com.google.android.gms.internal.measurement.M1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.coroutines.e;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlin.text.n;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.internal.f;
import p005a4.o;
import p293xa.r;
import p318zb.B;
import p318zb.C;
import p318zb.I;
import p318zb.t;
import p318zb.v;
import p318zb.w;
import p318zb.y;
import p318zb.z;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Regex f22913r = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f22914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f22916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f22917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f22918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap<String, b> f22919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f22920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22921i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public B f22922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final coil.disk.b f22928q;

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f22929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f22931c;

        public a(b bVar) {
            this.f22929a = bVar;
            DiskLruCache.this.getClass();
            this.f22931c = new boolean[2];
        }

        public final void a(boolean z10) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.f22930b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (i.a(this.f22929a.f22939g, this)) {
                        DiskLruCache.b(diskLruCache, this, z10);
                    }
                    this.f22930b = true;
                    r rVar = r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final z b(int i10) {
            z zVar;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (this.f22930b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f22931c[i10] = true;
                z zVar2 = this.f22929a.f22936d.get(i10);
                coil.disk.b bVar = diskLruCache.f22928q;
                z zVar3 = zVar2;
                if (!bVar.c(zVar3)) {
                    k.a(bVar.h(zVar3));
                }
                zVar = zVar2;
            }
            return zVar;
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f22934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<z> f22935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList<z> f22936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a f22939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22940h;

        public b(String str) {
            this.f22933a = str;
            DiskLruCache.this.getClass();
            this.f22934b = new long[2];
            DiskLruCache.this.getClass();
            this.f22935c = new ArrayList<>(2);
            DiskLruCache.this.getClass();
            this.f22936d = new ArrayList<>(2);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            DiskLruCache.this.getClass();
            for (int i10 = 0; i10 < 2; i10++) {
                sb2.append(i10);
                this.f22935c.add(DiskLruCache.this.f22914b.d(sb2.toString()));
                sb2.append(".tmp");
                this.f22936d.add(DiskLruCache.this.f22914b.d(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final c a() {
            if (!this.f22937e || this.f22939g != null || this.f22938f) {
                return null;
            }
            ArrayList<z> arrayList = this.f22935c;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (i10 >= size) {
                    this.f22940h++;
                    return diskLruCache.new c(this);
                }
                if (!diskLruCache.f22928q.c(arrayList.get(i10))) {
                    try {
                        diskLruCache.B(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i10++;
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class c implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f22942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22943c;

        public c(b bVar) {
            this.f22942b = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f22943c) {
                return;
            }
            this.f22943c = true;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                b bVar = this.f22942b;
                int i10 = bVar.f22940h - 1;
                bVar.f22940h = i10;
                if (i10 == 0 && bVar.f22938f) {
                    Regex regex = DiskLruCache.f22913r;
                    diskLruCache.B(bVar);
                }
                r rVar = r.f47939a;
            }
        }
    }

    public DiskLruCache(long j, Sa.a aVar, t tVar, z zVar) {
        this.f22914b = zVar;
        this.f22915c = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f22916d = zVar.d("journal");
        this.f22917e = zVar.d("journal.tmp");
        this.f22918f = zVar.d("journal.bkp");
        this.f22919g = new LinkedHashMap<>(0, 0.75f, true);
        B0 b0A = M1.a();
        aVar.getClass();
        this.f22920h = kotlinx.coroutines.B.a(e.a.C0479a.d(b0A, j.f5721c.c1(1)));
        this.f22928q = new coil.disk.b(tVar);
    }

    public static void M(String str) {
        if (!f22913r.e(str)) {
            throw new IllegalArgumentException(o.c('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0116 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:11:0x0016, B:13:0x001c, B:15:0x002c, B:23:0x003b, B:25:0x0053, B:29:0x0070, B:31:0x007e, B:33:0x0085, B:26:0x0059, B:28:0x0069, B:37:0x00a5, B:39:0x00ac, B:42:0x00b1, B:44:0x00c2, B:47:0x00c7, B:52:0x0102, B:54:0x010d, B:58:0x0116, B:48:0x00df, B:50:0x00f4, B:51:0x00ff, B:36:0x0095, B:61:0x011b, B:62:0x0122), top: B:65:0x0001 }] */
    public static final void b(DiskLruCache diskLruCache, a aVar, boolean z10) {
        synchronized (diskLruCache) {
            b bVar = aVar.f22929a;
            if (!i.a(bVar.f22939g, aVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z10 || bVar.f22938f) {
                for (int i10 = 0; i10 < 2; i10++) {
                    diskLruCache.f22928q.b(bVar.f22936d.get(i10));
                }
            } else {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (aVar.f22931c[i11] && !diskLruCache.f22928q.c(bVar.f22936d.get(i11))) {
                        aVar.a(false);
                        return;
                    }
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    z zVar = bVar.f22936d.get(i12);
                    z zVar2 = bVar.f22935c.get(i12);
                    if (diskLruCache.f22928q.c(zVar)) {
                        diskLruCache.f22928q.j(zVar, zVar2);
                    } else {
                        coil.disk.b bVar2 = diskLruCache.f22928q;
                        z zVar3 = bVar.f22935c.get(i12);
                        if (!bVar2.c(zVar3)) {
                            k.a(bVar2.h(zVar3));
                        }
                    }
                    long j = bVar.f22934b[i12];
                    Long l10 = diskLruCache.f22928q.e(zVar2).f49096d;
                    long jLongValue = l10 != null ? l10.longValue() : 0L;
                    bVar.f22934b[i12] = jLongValue;
                    diskLruCache.f22921i = (diskLruCache.f22921i - j) + jLongValue;
                }
            }
            bVar.f22939g = null;
            if (bVar.f22938f) {
                diskLruCache.B(bVar);
                return;
            }
            diskLruCache.j++;
            B b10 = diskLruCache.f22922k;
            i.b(b10);
            if (z10 || bVar.f22937e) {
                bVar.f22937e = true;
                b10.Z("CLEAN");
                b10.E(32);
                b10.Z(bVar.f22933a);
                for (long j10 : bVar.f22934b) {
                    b10.E(32);
                    b10.Q0(j10);
                }
                b10.E(10);
            } else {
                diskLruCache.f22919g.remove(bVar.f22933a);
                b10.Z("REMOVE");
                b10.E(32);
                b10.Z(bVar.f22933a);
                b10.E(10);
            }
            b10.flush();
            if (diskLruCache.f22921i > diskLruCache.f22915c) {
                diskLruCache.j();
            } else if (diskLruCache.j >= 2000) {
                diskLruCache.j();
            }
        }
    }

    public final void B(b bVar) throws IOException {
        B b10;
        int i10 = bVar.f22940h;
        String str = bVar.f22933a;
        if (i10 > 0 && (b10 = this.f22922k) != null) {
            b10.Z("DIRTY");
            b10.E(32);
            b10.Z(str);
            b10.E(10);
            b10.flush();
        }
        if (bVar.f22940h > 0 || bVar.f22939g != null) {
            bVar.f22938f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.f22928q.b(bVar.f22935c.get(i11));
            long j = this.f22921i;
            long[] jArr = bVar.f22934b;
            this.f22921i = j - jArr[i11];
            jArr[i11] = 0;
        }
        this.j++;
        B b11 = this.f22922k;
        if (b11 != null) {
            b11.Z("REMOVE");
            b11.E(32);
            b11.Z(str);
            b11.E(10);
        }
        this.f22919g.remove(str);
        if (this.j >= 2000) {
            j();
        }
    }

    public final void C() throws IOException {
        while (this.f22921i > this.f22915c) {
            for (b bVar : this.f22919g.values()) {
                if (!bVar.f22938f) {
                    B(bVar);
                }
            }
            return;
        }
        this.f22926o = false;
    }

    public final synchronized void N() {
        try {
            B b10 = this.f22922k;
            if (b10 != null) {
                b10.close();
            }
            B bA = v.a(this.f22928q.h(this.f22917e));
            try {
                bA.Z("libcore.io.DiskLruCache");
                bA.E(10);
                bA.Z("1");
                bA.E(10);
                bA.Q0(1);
                bA.E(10);
                bA.Q0(2);
                bA.E(10);
                bA.E(10);
                for (b bVar : this.f22919g.values()) {
                    if (bVar.f22939g != null) {
                        bA.Z("DIRTY");
                        bA.E(32);
                        bA.Z(bVar.f22933a);
                        bA.E(10);
                    } else {
                        bA.Z("CLEAN");
                        bA.E(32);
                        bA.Z(bVar.f22933a);
                        for (long j : bVar.f22934b) {
                            bA.E(32);
                            bA.Q0(j);
                        }
                        bA.E(10);
                    }
                }
                r rVar = r.f47939a;
                try {
                    bA.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    bA.close();
                } catch (Throwable th3) {
                    V.e(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            if (this.f22928q.c(this.f22916d)) {
                this.f22928q.j(this.f22916d, this.f22918f);
                this.f22928q.j(this.f22917e, this.f22916d);
                this.f22928q.b(this.f22918f);
            } else {
                this.f22928q.j(this.f22917e, this.f22916d);
            }
            this.f22922k = k();
            this.j = 0;
            this.f22923l = false;
            this.f22927p = false;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized a c(String str) {
        try {
            if (this.f22925n) {
                throw new IllegalStateException("cache is closed");
            }
            M(str);
            i();
            b bVar = this.f22919g.get(str);
            if ((bVar != null ? bVar.f22939g : null) != null) {
                return null;
            }
            if (bVar != null && bVar.f22940h != 0) {
                return null;
            }
            if (!this.f22926o && !this.f22927p) {
                B b10 = this.f22922k;
                i.b(b10);
                b10.Z("DIRTY");
                b10.E(32);
                b10.Z(str);
                b10.E(10);
                b10.flush();
                if (this.f22923l) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(str);
                    this.f22919g.put(str, bVar);
                }
                a aVar = new a(bVar);
                bVar.f22939g = aVar;
                return aVar;
            }
            j();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f22924m && !this.f22925n) {
                for (b bVar : (b[]) this.f22919g.values().toArray(new b[0])) {
                    a aVar = bVar.f22939g;
                    if (aVar != null) {
                        b bVar2 = aVar.f22929a;
                        if (i.a(bVar2.f22939g, aVar)) {
                            bVar2.f22938f = true;
                        }
                    }
                }
                C();
                kotlinx.coroutines.B.c(this.f22920h, null);
                B b10 = this.f22922k;
                i.b(b10);
                b10.close();
                this.f22922k = null;
                this.f22925n = true;
                return;
            }
            this.f22925n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f22924m) {
            if (this.f22925n) {
                throw new IllegalStateException("cache is closed");
            }
            C();
            B b10 = this.f22922k;
            i.b(b10);
            b10.flush();
        }
    }

    public final synchronized c h(String str) {
        c cVarA;
        if (this.f22925n) {
            throw new IllegalStateException("cache is closed");
        }
        M(str);
        i();
        b bVar = this.f22919g.get(str);
        if (bVar != null && (cVarA = bVar.a()) != null) {
            boolean z10 = true;
            this.j++;
            B b10 = this.f22922k;
            i.b(b10);
            b10.Z("READ");
            b10.E(32);
            b10.Z(str);
            b10.E(10);
            if (this.j < 2000) {
                z10 = false;
            }
            if (z10) {
                j();
            }
            return cVarA;
        }
        return null;
    }

    public final synchronized void i() {
        try {
            if (this.f22924m) {
                return;
            }
            this.f22928q.b(this.f22917e);
            if (this.f22928q.c(this.f22918f)) {
                if (this.f22928q.c(this.f22916d)) {
                    this.f22928q.b(this.f22918f);
                } else {
                    this.f22928q.j(this.f22918f, this.f22916d);
                }
            }
            if (this.f22928q.c(this.f22916d)) {
                try {
                    s();
                    p();
                    this.f22924m = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        O3.d.p(this.f22928q, this.f22914b);
                        this.f22925n = false;
                        N();
                        this.f22924m = true;
                    } catch (Throwable th) {
                        this.f22925n = false;
                        throw th;
                    }
                }
            }
            N();
            this.f22924m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void j() {
        C2680e.c(this.f22920h, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    public final B k() {
        coil.disk.b bVar = this.f22928q;
        bVar.getClass();
        z file = this.f22916d;
        i.e(file, "file");
        bVar.getClass();
        i.e(file, "file");
        bVar.f22951b.getClass();
        File fileE = file.e();
        Logger logger = w.f49117a;
        return v.a(new coil.disk.c(new y(new FileOutputStream(fileE, true), new I()), new x(1, this)));
    }

    public final void p() throws IOException {
        Iterator<b> it = this.f22919g.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            b next = it.next();
            int i10 = 0;
            if (next.f22939g == null) {
                while (i10 < 2) {
                    j += next.f22934b[i10];
                    i10++;
                }
            } else {
                next.f22939g = null;
                while (i10 < 2) {
                    z zVar = next.f22935c.get(i10);
                    coil.disk.b bVar = this.f22928q;
                    bVar.b(zVar);
                    bVar.b(next.f22936d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f22921i = j;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    public final void s() throws Throwable {
        C cB = v.b(this.f22928q.i(this.f22916d));
        try {
            String strX = cB.x(Long.MAX_VALUE);
            String strX2 = cB.x(Long.MAX_VALUE);
            String strX3 = cB.x(Long.MAX_VALUE);
            String strX4 = cB.x(Long.MAX_VALUE);
            String strX5 = cB.x(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strX) || !"1".equals(strX2) || !i.a(String.valueOf(1), strX3) || !i.a(String.valueOf(2), strX4) || strX5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strX + ", " + strX2 + ", " + strX3 + ", " + strX4 + ", " + strX5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    x(cB.x(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.j = i10 - this.f22919g.size();
                    if (cB.b()) {
                        this.f22922k = k();
                    } else {
                        N();
                    }
                    r rVar = r.f47939a;
                    try {
                        cB.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                cB.close();
            } catch (Throwable th3) {
                V.e(th, th3);
            }
            if (th == null) {
                throw th;
            }
        }
    }

    public final void x(String str) throws IOException {
        String strSubstring;
        int iP = n.P(str, ' ', 0, false, 6);
        if (iP == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iP + 1;
        int iP2 = n.P(str, ' ', i10, false, 4);
        LinkedHashMap<String, b> linkedHashMap = this.f22919g;
        if (iP2 == -1) {
            strSubstring = str.substring(i10);
            i.d(strSubstring, "substring(...)");
            if (iP == 6 && m.I(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iP2);
            i.d(strSubstring, "substring(...)");
        }
        b bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = bVar;
        if (iP2 == -1 || iP != 5 || !m.I(str, "CLEAN", false)) {
            if (iP2 == -1 && iP == 5 && m.I(str, "DIRTY", false)) {
                bVar2.f22939g = new a(bVar2);
                return;
            } else {
                if (iP2 != -1 || iP != 4 || !m.I(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iP2 + 1);
        i.d(strSubstring2, "substring(...)");
        List listF0 = n.f0(strSubstring2, new char[]{' '});
        bVar2.f22937e = true;
        bVar2.f22939g = null;
        int size = listF0.size();
        DiskLruCache.this.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listF0);
        }
        try {
            int size2 = listF0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                bVar2.f22934b[i11] = Long.parseLong((String) listF0.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listF0);
        }
    }
}
