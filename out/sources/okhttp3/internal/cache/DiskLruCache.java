package okhttp3.internal.cache;

import Ia.l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlin.text.n;
import p005a4.o;
import p244tb.h;
import p293xa.r;
import p318zb.B;
import p318zb.C;
import p318zb.C2838e;
import p318zb.F;
import p318zb.H;
import p318zb.I;
import p318zb.v;
import p318zb.w;
import p318zb.y;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Regex f45394s = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f45395t = "CLEAN";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f45396u = "DIRTY";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f45397v = "REMOVE";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f45398w = "READ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f45399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f45400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f45401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f45402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B f45404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap<String, a> f45405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45406i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f45412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p184ob.c f45413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f45414r;

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f45415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f45416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45417c;

        public Editor(a aVar) {
            boolean[] zArr;
            this.f45415a = aVar;
            if (aVar.f45423e) {
                zArr = null;
            } else {
                DiskLruCache.this.getClass();
                zArr = new boolean[2];
            }
            this.f45416b = zArr;
        }

        public final void a() throws IOException {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.f45417c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (i.a(this.f45415a.f45425g, this)) {
                        diskLruCache.c(this, false);
                    }
                    this.f45417c = true;
                    r rVar = r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() throws IOException {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.f45417c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (i.a(this.f45415a.f45425g, this)) {
                        diskLruCache.c(this, true);
                    }
                    this.f45417c = true;
                    r rVar = r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() throws IOException {
            a aVar = this.f45415a;
            if (i.a(aVar.f45425g, this)) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.f45407k) {
                    diskLruCache.c(this, false);
                } else {
                    aVar.f45424f = true;
                }
            }
        }

        public final F d(int i10) {
            y yVar;
            final DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.f45417c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!i.a(this.f45415a.f45425g, this)) {
                        return new C2838e();
                    }
                    if (!this.f45415a.f45423e) {
                        boolean[] zArr = this.f45416b;
                        i.b(zArr);
                        zArr[i10] = true;
                    }
                    File file = (File) this.f45415a.f45422d.get(i10);
                    try {
                        i.e(file, "file");
                        try {
                            Logger logger = w.f49117a;
                            yVar = new y(new FileOutputStream(file, false), new I());
                        } catch (FileNotFoundException unused) {
                            file.getParentFile().mkdirs();
                            Logger logger2 = w.f49117a;
                            yVar = new y(new FileOutputStream(file, false), new I());
                        }
                        return new f(yVar, new l<IOException, r>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(IOException iOException) {
                                IOException it = iOException;
                                i.e(it, "it");
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Editor editor = this;
                                synchronized (diskLruCache2) {
                                    editor.c();
                                }
                                return r.f47939a;
                            }
                        });
                    } catch (FileNotFoundException unused2) {
                        return new C2838e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f45420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f45421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f45422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Editor f45425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45426h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f45427i;
        public final /* synthetic */ DiskLruCache j;

        public a(DiskLruCache diskLruCache, String key) {
            i.e(key, "key");
            this.j = diskLruCache;
            this.f45419a = key;
            diskLruCache.getClass();
            this.f45420b = new long[2];
            this.f45421c = new ArrayList();
            this.f45422d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < 2; i10++) {
                sb2.append(i10);
                this.f45421c.add(new File(this.j.f45399b, sb2.toString()));
                sb2.append(".tmp");
                this.f45422d.add(new File(this.j.f45399b, sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final b a() {
            byte[] bArr = p172nb.b.f45026a;
            if (!this.f45423e) {
                return null;
            }
            DiskLruCache diskLruCache = this.j;
            if (!diskLruCache.f45407k && (this.f45425g != null || this.f45424f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f45420b.clone();
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    File file = (File) this.f45421c.get(i10);
                    i.e(file, "file");
                    H hF = v.f(file);
                    if (!diskLruCache.f45407k) {
                        this.f45426h++;
                        hF = new d(hF, diskLruCache, this);
                    }
                    arrayList.add(hF);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        p172nb.b.c((H) it.next());
                    }
                    try {
                        diskLruCache.C(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            return new b(this.j, this.f45419a, this.f45427i, arrayList, jArr);
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class b implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f45429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f45430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f45431e;

        public b(DiskLruCache diskLruCache, String key, long j, ArrayList arrayList, long[] lengths) {
            i.e(key, "key");
            i.e(lengths, "lengths");
            this.f45431e = diskLruCache;
            this.f45428b = key;
            this.f45429c = j;
            this.f45430d = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.f45430d.iterator();
            while (it.hasNext()) {
                p172nb.b.c((H) it.next());
            }
        }
    }

    public DiskLruCache(File file, p184ob.d taskRunner) {
        i.e(taskRunner, "taskRunner");
        this.f45399b = file;
        this.f45405h = new LinkedHashMap<>(0, 0.75f, true);
        this.f45413q = taskRunner.e();
        this.f45414r = new e(this, Q8.d.a(new StringBuilder(), p172nb.b.f45032g, " Cache"));
        this.f45400c = new File(file, "journal");
        this.f45401d = new File(file, "journal.tmp");
        this.f45402e = new File(file, "journal.bkp");
    }

    public static void N(String str) {
        if (!f45394s.e(str)) {
            throw new IllegalArgumentException(o.c('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final synchronized void B() throws IOException {
        y yVar;
        y yVar2;
        try {
            B b10 = this.f45404g;
            if (b10 != null) {
                b10.close();
            }
            File file = this.f45401d;
            i.e(file, "file");
            try {
                Logger logger = w.f49117a;
                yVar = new y(new FileOutputStream(file, false), new I());
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = w.f49117a;
                yVar = new y(new FileOutputStream(file, false), new I());
            }
            B bA = v.a(yVar);
            try {
                bA.Z("libcore.io.DiskLruCache");
                bA.E(10);
                bA.Z("1");
                bA.E(10);
                bA.Q0(201105);
                bA.E(10);
                bA.Q0(2);
                bA.E(10);
                bA.E(10);
                for (a aVar : this.f45405h.values()) {
                    if (aVar.f45425g != null) {
                        bA.Z(f45396u);
                        bA.E(32);
                        bA.Z(aVar.f45419a);
                        bA.E(10);
                    } else {
                        bA.Z(f45395t);
                        bA.E(32);
                        bA.Z(aVar.f45419a);
                        for (long j : aVar.f45420b) {
                            bA.E(32);
                            bA.Q0(j);
                        }
                        bA.E(10);
                    }
                }
                r rVar = r.f47939a;
                p241t7.b.n(bA, null);
                p232sb.a aVar2 = p232sb.a.f46995a;
                if (aVar2.c(this.f45400c)) {
                    aVar2.d(this.f45400c, this.f45402e);
                }
                aVar2.d(this.f45401d, this.f45400c);
                aVar2.a(this.f45402e);
                File file2 = this.f45400c;
                i.e(file2, "file");
                try {
                    Logger logger3 = w.f49117a;
                    yVar2 = new y(new FileOutputStream(file2, true), new I());
                } catch (FileNotFoundException unused2) {
                    file2.getParentFile().mkdirs();
                    Logger logger4 = w.f49117a;
                    yVar2 = new y(new FileOutputStream(file2, true), new I());
                }
                this.f45404g = v.a(new f(yVar2, new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                this.j = false;
                this.f45411o = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(bA, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void C(a entry) throws IOException {
        B b10;
        i.e(entry, "entry");
        boolean z10 = this.f45407k;
        String str = entry.f45419a;
        if (!z10) {
            if (entry.f45426h > 0 && (b10 = this.f45404g) != null) {
                b10.Z(f45396u);
                b10.E(32);
                b10.Z(str);
                b10.E(10);
                b10.flush();
            }
            if (entry.f45426h > 0 || entry.f45425g != null) {
                entry.f45424f = true;
                return;
            }
        }
        Editor editor = entry.f45425g;
        if (editor != null) {
            editor.c();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            File file = (File) entry.f45421c.get(i10);
            i.e(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
            long j = this.f45403f;
            long[] jArr = entry.f45420b;
            this.f45403f = j - jArr[i10];
            jArr[i10] = 0;
        }
        this.f45406i++;
        B b11 = this.f45404g;
        if (b11 != null) {
            b11.Z(f45397v);
            b11.E(32);
            b11.Z(str);
            b11.E(10);
        }
        this.f45405h.remove(str);
        if (k()) {
            this.f45413q.c(this.f45414r, 0L);
        }
    }

    public final void M() throws IOException {
        while (this.f45403f > 10485760) {
            for (a aVar : this.f45405h.values()) {
                if (!aVar.f45424f) {
                    C(aVar);
                }
            }
            return;
        }
        this.f45410n = false;
    }

    public final synchronized void b() {
        if (this.f45409m) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c(Editor editor, boolean z10) throws IOException {
        i.e(editor, "editor");
        a aVar = editor.f45415a;
        if (!i.a(aVar.f45425g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !aVar.f45423e) {
            for (int i10 = 0; i10 < 2; i10++) {
                boolean[] zArr = editor.f45416b;
                i.b(zArr);
                if (!zArr[i10]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                File file = (File) aVar.f45422d.get(i10);
                i.e(file, "file");
                if (!file.exists()) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            File file2 = (File) aVar.f45422d.get(i11);
            if (!z10 || aVar.f45424f) {
                i.e(file2, "file");
                if (!file2.delete() && file2.exists()) {
                    throw new IOException("failed to delete " + file2);
                }
            } else {
                p232sb.a aVar2 = p232sb.a.f46995a;
                if (aVar2.c(file2)) {
                    File file3 = (File) aVar.f45421c.get(i11);
                    aVar2.d(file2, file3);
                    long j = aVar.f45420b[i11];
                    long length = file3.length();
                    aVar.f45420b[i11] = length;
                    this.f45403f = (this.f45403f - j) + length;
                }
            }
        }
        aVar.f45425g = null;
        if (aVar.f45424f) {
            C(aVar);
            return;
        }
        this.f45406i++;
        B b10 = this.f45404g;
        i.b(b10);
        if (aVar.f45423e || z10) {
            aVar.f45423e = true;
            b10.Z(f45395t);
            b10.E(32);
            b10.Z(aVar.f45419a);
            for (long j10 : aVar.f45420b) {
                b10.E(32);
                b10.Q0(j10);
            }
            b10.E(10);
            if (z10) {
                long j11 = this.f45412p;
                this.f45412p = 1 + j11;
                aVar.f45427i = j11;
            }
        } else {
            this.f45405h.remove(aVar.f45419a);
            b10.Z(f45397v);
            b10.E(32);
            b10.Z(aVar.f45419a);
            b10.E(10);
        }
        b10.flush();
        if (this.f45403f > 10485760 || k()) {
            this.f45413q.c(this.f45414r, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.f45408l && !this.f45409m) {
                Collection<a> collectionValues = this.f45405h.values();
                i.d(collectionValues, "lruEntries.values");
                for (a aVar : (a[]) collectionValues.toArray(new a[0])) {
                    Editor editor = aVar.f45425g;
                    if (editor != null) {
                        editor.c();
                    }
                }
                M();
                B b10 = this.f45404g;
                i.b(b10);
                b10.close();
                this.f45404g = null;
                this.f45409m = true;
                return;
            }
            this.f45409m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        if (this.f45408l) {
            b();
            M();
            B b10 = this.f45404g;
            i.b(b10);
            b10.flush();
        }
    }

    public final synchronized Editor h(long j, String key) throws IOException {
        try {
            i.e(key, "key");
            j();
            b();
            N(key);
            a aVar = this.f45405h.get(key);
            if (j != -1 && (aVar == null || aVar.f45427i != j)) {
                return null;
            }
            if ((aVar != null ? aVar.f45425g : null) != null) {
                return null;
            }
            if (aVar != null && aVar.f45426h != 0) {
                return null;
            }
            if (!this.f45410n && !this.f45411o) {
                B b10 = this.f45404g;
                i.b(b10);
                b10.Z(f45396u);
                b10.E(32);
                b10.Z(key);
                b10.E(10);
                b10.flush();
                if (this.j) {
                    return null;
                }
                if (aVar == null) {
                    aVar = new a(this, key);
                    this.f45405h.put(key, aVar);
                }
                Editor editor = new Editor(aVar);
                aVar.f45425g = editor;
                return editor;
            }
            this.f45413q.c(this.f45414r, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized b i(String key) throws IOException {
        i.e(key, "key");
        j();
        b();
        N(key);
        a aVar = this.f45405h.get(key);
        if (aVar == null) {
            return null;
        }
        b bVarA = aVar.a();
        if (bVarA == null) {
            return null;
        }
        this.f45406i++;
        B b10 = this.f45404g;
        i.b(b10);
        b10.Z(f45398w);
        b10.E(32);
        b10.Z(key);
        b10.E(10);
        if (k()) {
            this.f45413q.c(this.f45414r, 0L);
        }
        return bVarA;
    }

    public final synchronized void j() throws IOException {
        boolean z10;
        try {
            byte[] bArr = p172nb.b.f45026a;
            if (this.f45408l) {
                return;
            }
            p232sb.a aVar = p232sb.a.f46995a;
            if (aVar.c(this.f45402e)) {
                if (aVar.c(this.f45400c)) {
                    aVar.a(this.f45402e);
                } else {
                    aVar.d(this.f45402e, this.f45400c);
                }
            }
            File file = this.f45402e;
            i.e(file, "file");
            y yVarE = aVar.e(file);
            try {
                try {
                    aVar.a(file);
                    p241t7.b.n(yVarE, null);
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p241t7.b.n(yVarE, th);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                r rVar = r.f47939a;
                p241t7.b.n(yVarE, null);
                aVar.a(file);
                z10 = false;
            }
            this.f45407k = z10;
            File file2 = this.f45400c;
            i.e(file2, "file");
            if (file2.exists()) {
                try {
                    s();
                    p();
                    this.f45408l = true;
                    return;
                } catch (IOException e10) {
                    h hVar = h.f47384a;
                    h hVar2 = h.f47384a;
                    String str = "DiskLruCache " + this.f45399b + " is corrupt: " + e10.getMessage() + ", removing";
                    hVar2.getClass();
                    h.i(5, str, e10);
                    try {
                        close();
                        p232sb.a.f46995a.b(this.f45399b);
                        this.f45409m = false;
                        B();
                        this.f45408l = true;
                    } catch (Throwable th3) {
                        this.f45409m = false;
                        throw th3;
                    }
                }
            }
            B();
            this.f45408l = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final boolean k() {
        int i10 = this.f45406i;
        return i10 >= 2000 && i10 >= this.f45405h.size();
    }

    public final void p() throws IOException {
        File file = this.f45401d;
        p232sb.a aVar = p232sb.a.f46995a;
        aVar.a(file);
        Iterator<a> it = this.f45405h.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            i.d(next, "i.next()");
            a aVar2 = next;
            int i10 = 0;
            if (aVar2.f45425g == null) {
                while (i10 < 2) {
                    this.f45403f += aVar2.f45420b[i10];
                    i10++;
                }
            } else {
                aVar2.f45425g = null;
                while (i10 < 2) {
                    aVar.a((File) aVar2.f45421c.get(i10));
                    aVar.a((File) aVar2.f45422d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void s() throws IOException {
        y yVar;
        File file = this.f45400c;
        i.e(file, "file");
        C cB = v.b(v.f(file));
        try {
            String strX = cB.x(Long.MAX_VALUE);
            String strX2 = cB.x(Long.MAX_VALUE);
            String strX3 = cB.x(Long.MAX_VALUE);
            String strX4 = cB.x(Long.MAX_VALUE);
            String strX5 = cB.x(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strX) || !"1".equals(strX2) || !i.a(String.valueOf(201105), strX3) || !i.a(String.valueOf(2), strX4) || strX5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strX + ", " + strX2 + ", " + strX4 + ", " + strX5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    x(cB.x(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f45406i = i10 - this.f45405h.size();
                    if (cB.b()) {
                        i.e(file, "file");
                        try {
                            Logger logger = w.f49117a;
                            yVar = new y(new FileOutputStream(file, true), new I());
                        } catch (FileNotFoundException unused2) {
                            file.getParentFile().mkdirs();
                            Logger logger2 = w.f49117a;
                            yVar = new y(new FileOutputStream(file, true), new I());
                        }
                        this.f45404g = v.a(new f(yVar, new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                    } else {
                        B();
                    }
                    r rVar = r.f47939a;
                    p241t7.b.n(cB, null);
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p241t7.b.n(cB, th);
                throw th2;
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
        LinkedHashMap<String, a> linkedHashMap = this.f45405h;
        if (iP2 == -1) {
            strSubstring = str.substring(i10);
            i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f45397v;
            if (iP == str2.length() && m.I(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iP2);
            i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        a aVar = linkedHashMap.get(strSubstring);
        if (aVar == null) {
            aVar = new a(this, strSubstring);
            linkedHashMap.put(strSubstring, aVar);
        }
        if (iP2 != -1) {
            String str3 = f45395t;
            if (iP == str3.length() && m.I(str, str3, false)) {
                String strSubstring2 = str.substring(iP2 + 1);
                i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listF0 = n.f0(strSubstring2, new char[]{' '});
                aVar.f45423e = true;
                aVar.f45425g = null;
                int size = listF0.size();
                aVar.j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listF0);
                }
                try {
                    int size2 = listF0.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        aVar.f45420b[i11] = Long.parseLong((String) listF0.get(i11));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listF0);
                }
            }
        }
        if (iP2 == -1) {
            String str4 = f45396u;
            if (iP == str4.length() && m.I(str, str4, false)) {
                aVar.f45425g = new Editor(aVar);
                return;
            }
        }
        if (iP2 == -1) {
            String str5 = f45398w;
            if (iP == str5.length() && m.I(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }
}
