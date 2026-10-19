package p299y3;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f48232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f48233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f48234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f48235e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48237g;
    public BufferedWriter j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f48241l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f48239i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, d> f48240k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f48242m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f48243n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CallableC0556a f48244o = new CallableC0556a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48236f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f48238h = 1;

    /* JADX INFO: renamed from: y3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public class CallableC0556a implements Callable<Void> {
        public CallableC0556a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (a.this) {
                try {
                    a aVar = a.this;
                    if (aVar.j == null) {
                        return null;
                    }
                    aVar.R();
                    if (a.this.p()) {
                        a.this.M();
                        a.this.f48241l = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f48246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f48247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f48248c;

        public c(d dVar) {
            this.f48246a = dVar;
            this.f48247b = dVar.f48254e ? null : new boolean[a.this.f48238h];
        }

        public final void a() throws IOException {
            a.b(a.this, this, false);
        }

        public final File b() throws IOException {
            File file;
            synchronized (a.this) {
                try {
                    d dVar = this.f48246a;
                    if (dVar.f48255f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.f48254e) {
                        this.f48247b[0] = true;
                    }
                    file = dVar.f48253d[0];
                    if (!a.this.f48232b.exists()) {
                        a.this.f48232b.mkdirs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f48251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File[] f48252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f48253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f48254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f48255f;

        public d(String str) {
            this.f48250a = str;
            int i10 = a.this.f48238h;
            this.f48251b = new long[i10];
            this.f48252c = new File[i10];
            this.f48253d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f48238h; i11++) {
                sb2.append(i11);
                File[] fileArr = this.f48252c;
                String string = sb2.toString();
                File file = a.this.f48232b;
                fileArr[i11] = new File(file, string);
                sb2.append(".tmp");
                this.f48253d[i11] = new File(file, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j : this.f48251b) {
                sb2.append(' ');
                sb2.append(j);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File[] f48257a;

        public e(File[] fileArr) {
            this.f48257a = fileArr;
        }
    }

    public a(File file, long j) {
        this.f48232b = file;
        this.f48233c = new File(file, "journal");
        this.f48234d = new File(file, "journal.tmp");
        this.f48235e = new File(file, "journal.bkp");
        this.f48237g = j;
    }

    public static void N(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            h(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void b(a aVar, c cVar, boolean z10) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.f48246a;
            if (dVar.f48255f != cVar) {
                throw new IllegalStateException();
            }
            if (z10 && !dVar.f48254e) {
                for (int i10 = 0; i10 < aVar.f48238h; i10++) {
                    if (!cVar.f48247b[i10]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!dVar.f48253d[i10].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < aVar.f48238h; i11++) {
                File file = dVar.f48253d[i11];
                if (!z10) {
                    h(file);
                } else if (file.exists()) {
                    File file2 = dVar.f48252c[i11];
                    file.renameTo(file2);
                    long j = dVar.f48251b[i11];
                    long length = file2.length();
                    dVar.f48251b[i11] = length;
                    aVar.f48239i = (aVar.f48239i - j) + length;
                }
            }
            aVar.f48241l++;
            dVar.f48255f = null;
            if (dVar.f48254e || z10) {
                dVar.f48254e = true;
                aVar.j.append((CharSequence) "CLEAN");
                aVar.j.append(' ');
                aVar.j.append((CharSequence) dVar.f48250a);
                aVar.j.append((CharSequence) dVar.a());
                aVar.j.append('\n');
                if (z10) {
                    aVar.f48242m++;
                }
            } else {
                aVar.f48240k.remove(dVar.f48250a);
                aVar.j.append((CharSequence) "REMOVE");
                aVar.j.append(' ');
                aVar.j.append((CharSequence) dVar.f48250a);
                aVar.j.append('\n');
            }
            j(aVar.j);
            if (aVar.f48239i > aVar.f48237g || aVar.p()) {
                aVar.f48243n.submit(aVar.f48244o);
            }
        }
    }

    public static void c(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void h(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void j(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a s(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                N(file2, file3, false);
            }
        }
        a aVar = new a(file, j);
        if (aVar.f48233c.exists()) {
            try {
                aVar.B();
                aVar.x();
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.close();
                p299y3.c.a(aVar.f48232b);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, j);
        aVar2.M();
        return aVar2;
    }

    public final void B() throws IOException {
        File file = this.f48233c;
        FileInputStream fileInputStream = new FileInputStream(file);
        Charset charset = p299y3.c.f48263a;
        p299y3.b bVar = new p299y3.b(fileInputStream);
        try {
            String strB = bVar.b();
            String strB2 = bVar.b();
            String strB3 = bVar.b();
            String strB4 = bVar.b();
            String strB5 = bVar.b();
            if (!"libcore.io.DiskLruCache".equals(strB) || !"1".equals(strB2) || !Integer.toString(this.f48236f).equals(strB3) || !Integer.toString(this.f48238h).equals(strB4) || !"".equals(strB5)) {
                throw new IOException("unexpected journal header: [" + strB + ", " + strB2 + ", " + strB4 + ", " + strB5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    C(bVar.b());
                    i10++;
                } catch (EOFException unused) {
                    this.f48241l = i10 - this.f48240k.size();
                    if (bVar.f48261e == -1) {
                        M();
                    } else {
                        this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), p299y3.c.f48263a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void C(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        LinkedHashMap<String, d> linkedHashMap = this.f48240k;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f48255f = new c(dVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f48254e = true;
        dVar.f48255f = null;
        if (strArrSplit.length != a.this.f48238h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                dVar.f48251b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void M() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.j;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48234d), p299y3.c.f48263a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f48236f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f48238h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.f48240k.values()) {
                    if (dVar.f48255f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.f48250a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.f48250a + dVar.a() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.f48233c.exists()) {
                    N(this.f48233c, this.f48235e, true);
                }
                N(this.f48234d, this.f48233c, false);
                this.f48235e.delete();
                this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48233c, true), p299y3.c.f48263a));
            } catch (Throwable th) {
                c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void R() throws IOException {
        while (this.f48239i > this.f48237g) {
            String key = this.f48240k.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.j == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.f48240k.get(key);
                    if (dVar != null && dVar.f48255f == null) {
                        for (int i10 = 0; i10 < this.f48238h; i10++) {
                            File file = dVar.f48252c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f48239i;
                            long[] jArr = dVar.f48251b;
                            this.f48239i = j - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f48241l++;
                        this.j.append((CharSequence) "REMOVE");
                        this.j.append(' ');
                        this.j.append((CharSequence) key);
                        this.j.append('\n');
                        this.f48240k.remove(key);
                        if (p()) {
                            this.f48243n.submit(this.f48244o);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.j == null) {
                return;
            }
            Iterator it = new ArrayList(this.f48240k.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f48255f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            R();
            c(this.j);
            this.j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c i(String str) throws IOException {
        synchronized (this) {
            try {
                if (this.j == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.f48240k.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.f48240k.put(str, dVar);
                } else if (dVar.f48255f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f48255f = cVar;
                this.j.append((CharSequence) "DIRTY");
                this.j.append(' ');
                this.j.append((CharSequence) str);
                this.j.append('\n');
                j(this.j);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e k(String str) throws IOException {
        if (this.j == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.f48240k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f48254e) {
            return null;
        }
        for (File file : dVar.f48252c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f48241l++;
        this.j.append((CharSequence) "READ");
        this.j.append(' ');
        this.j.append((CharSequence) str);
        this.j.append('\n');
        if (p()) {
            this.f48243n.submit(this.f48244o);
        }
        return new e(dVar.f48252c);
    }

    public final boolean p() {
        int i10 = this.f48241l;
        return i10 >= 2000 && i10 >= this.f48240k.size();
    }

    public final void x() throws IOException {
        h(this.f48234d);
        Iterator<d> it = this.f48240k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f48255f;
            int i10 = this.f48238h;
            int i11 = 0;
            if (cVar == null) {
                while (i11 < i10) {
                    this.f48239i += next.f48251b[i11];
                    i11++;
                }
            } else {
                next.f48255f = null;
                while (i11 < i10) {
                    h(next.f48252c[i11]);
                    h(next.f48253d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }
}
