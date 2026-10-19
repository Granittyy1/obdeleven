package bo.app;

import com.braze.support.BrazeLogger;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Pattern f21483o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f21484p = BrazeLogger.getBrazeLogTag((Class<?>) m0.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final OutputStream f21485q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f21486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f21487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f21488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f21489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f21491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21492g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Writer f21494i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21495k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21493h = 0;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f21496l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f21497m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callable f21498n = new a();

    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (m0.this) {
                try {
                    if (m0.this.f21494i == null) {
                        return null;
                    }
                    m0.this.i();
                    if (m0.this.e()) {
                        m0.this.h();
                        m0.this.f21495k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b1 f21500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f21501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21503d;

        public class a extends FilterOutputStream {
            public /* synthetic */ a(c cVar, OutputStream outputStream, a aVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f21502c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f21502c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    c.this.f21502c = true;
                }
            }

            private a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    c.this.f21502c = true;
                }
            }
        }

        public /* synthetic */ c(m0 m0Var, b1 b1Var, a aVar) {
            this(b1Var);
        }

        private c(b1 b1Var) {
            this.f21500a = b1Var;
            this.f21501b = b1Var.f20745c ? null : new boolean[m0.this.f21492g];
        }

        public void b() {
            if (this.f21502c) {
                m0.this.a(this, false);
                m0.this.d(this.f21500a.f20743a);
            } else {
                m0.this.a(this, true);
            }
            this.f21503d = true;
        }

        public OutputStream a(int i10) {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i10 >= 0 && i10 < m0.this.f21492g) {
                synchronized (m0.this) {
                    try {
                        b1 b1Var = this.f21500a;
                        if (b1Var.f20746d == this) {
                            if (!b1Var.f20745c) {
                                this.f21501b[i10] = true;
                            }
                            File fileB = b1Var.b(i10);
                            try {
                                fileOutputStream = new FileOutputStream(fileB);
                            } catch (FileNotFoundException unused) {
                                m0.this.f21486a.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(fileB);
                                } catch (FileNotFoundException unused2) {
                                    return m0.f21485q;
                                }
                            }
                            aVar = new a(this, fileOutputStream, null);
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return aVar;
            }
            StringBuilder sbE = A8.f.e(i10, "Expected index ", " to be greater than 0 and less than the maximum value count of ");
            sbE.append(m0.this.f21492g);
            throw new IllegalArgumentException(sbE.toString());
        }

        public void a() {
            m0.this.a(this, false);
        }
    }

    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f21507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InputStream[] f21508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long[] f21509d;

        public /* synthetic */ d(m0 m0Var, String str, long j, InputStream[] inputStreamArr, long[] jArr, a aVar) {
            this(str, j, inputStreamArr, jArr);
        }

        public InputStream a(int i10) {
            return this.f21508c[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f21508c) {
                g7.a(inputStream);
            }
        }

        private d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f21506a = str;
            this.f21507b = j;
            this.f21508c = inputStreamArr;
            this.f21509d = jArr;
        }
    }

    private m0(File file, int i10, int i11, long j) {
        this.f21486a = file;
        this.f21490e = i10;
        this.f21487b = new File(file, "journal");
        this.f21488c = new File(file, "journal.tmp");
        this.f21489d = new File(file, "journal.bkp");
        this.f21492g = i11;
        this.f21491f = j;
    }

    private void g() {
        d6 d6Var = new d6(new FileInputStream(this.f21487b), g7.f21152a);
        try {
            String strC = d6Var.c();
            String strC2 = d6Var.c();
            String strC3 = d6Var.c();
            String strC4 = d6Var.c();
            String strC5 = d6Var.c();
            if (!"libcore.io.DiskLruCache".equals(strC) || !"1".equals(strC2) || !Integer.toString(this.f21490e).equals(strC3) || !Integer.toString(this.f21492g).equals(strC4) || !"".equals(strC5)) {
                throw new IOException("unexpected journal header: [" + strC + ", " + strC2 + ", " + strC4 + ", " + strC5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    c(d6Var.c());
                    i10++;
                } catch (EOFException unused) {
                    this.f21495k = i10 - this.j.size();
                    if (d6Var.b()) {
                        h();
                    } else {
                        this.f21494i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21487b, true), g7.f21152a));
                    }
                    g7.a(d6Var);
                    return;
                }
            }
        } catch (Throwable th) {
            g7.a(d6Var);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        try {
            Writer writer = this.f21494i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21488c), g7.f21152a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f21490e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f21492g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (b1 b1Var : this.j.values()) {
                    if (b1Var.f20746d != null) {
                        bufferedWriter.write("DIRTY " + b1Var.f20743a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + b1Var.f20743a + b1Var.a() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f21487b.exists()) {
                    a(this.f21487b, this.f21489d, true);
                }
                a(this.f21488c, this.f21487b, false);
                this.f21489d.delete();
                this.f21494i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21487b, true), g7.f21152a));
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        while (this.f21493h > this.f21491f) {
            d((String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey());
        }
    }

    private void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        b1 b1Var = (b1) this.j.get(strSubstring);
        if (b1Var == null) {
            b1Var = new b1(strSubstring, this.f21492g, this.f21486a);
            this.j.put(strSubstring, b1Var);
        }
        a aVar = null;
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            b1Var.f20745c = true;
            b1Var.f20746d = null;
            b1Var.b(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            b1Var.f20746d = new c(this, b1Var, aVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        int i10 = this.f21495k;
        return i10 >= 2000 && i10 >= this.j.size();
    }

    private void f() throws IOException {
        a(this.f21488c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            b1 b1Var = (b1) it.next();
            int i10 = 0;
            if (b1Var.f20746d == null) {
                while (i10 < this.f21492g) {
                    this.f21493h += b1Var.f20744b[i10];
                    i10++;
                }
            } else {
                b1Var.f20746d = null;
                while (i10 < this.f21492g) {
                    a(b1Var.a(i10));
                    a(b1Var.b(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public synchronized d b(String str) {
        InputStream inputStream;
        b();
        e(str);
        b1 b1Var = (b1) this.j.get(str);
        if (b1Var == null) {
            return null;
        }
        if (!b1Var.f20745c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f21492g];
        for (int i10 = 0; i10 < this.f21492g; i10++) {
            try {
                inputStreamArr[i10] = new FileInputStream(b1Var.a(i10));
            } catch (FileNotFoundException unused) {
                for (int i11 = 0; i11 < this.f21492g && (inputStream = inputStreamArr[i11]) != null; i11++) {
                    g7.a(inputStream);
                }
                return null;
            }
        }
        this.f21495k++;
        this.f21494i.append((CharSequence) ("READ " + str + '\n'));
        if (e()) {
            this.f21497m.submit(this.f21498n);
        }
        return new d(this, str, b1Var.f20747e, inputStreamArr, b1Var.f20744b, null);
    }

    public synchronized boolean d(String str) {
        try {
            b();
            e(str);
            b1 b1Var = (b1) this.j.get(str);
            if (b1Var != null && b1Var.f20746d == null) {
                for (int i10 = 0; i10 < this.f21492g; i10++) {
                    File fileA = b1Var.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException("failed to delete " + fileA);
                    }
                    long j = this.f21493h;
                    long[] jArr = b1Var.f20744b;
                    this.f21493h = j - jArr[i10];
                    jArr[i10] = 0;
                }
                this.f21495k++;
                this.f21494i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.j.remove(str);
                if (e()) {
                    this.f21497m.submit(this.f21498n);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void e(String str) {
        if (!f21483o.matcher(str).matches()) {
            throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public static m0 a(File file, int i10, int i11, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            m0 m0Var = new m0(file, i10, i11, j);
            if (m0Var.f21487b.exists()) {
                try {
                    m0Var.g();
                    m0Var.f();
                    return m0Var;
                } catch (IOException e10) {
                    BrazeLogger.w(f21484p, "DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    m0Var.d();
                }
            }
            file.mkdirs();
            m0 m0Var2 = new m0(file, i10, i11, j);
            m0Var2.h();
            return m0Var2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    private void b() {
        if (this.f21494i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public void d() throws IOException {
        c();
        g7.a(this.f21486a);
    }

    public synchronized void c() {
        try {
            if (this.f21494i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((b1) it.next()).f20746d;
                if (cVar != null) {
                    cVar.a();
                }
            }
            i();
            this.f21494i.close();
            this.f21494i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i10) {
        }
    }

    public c a(String str) {
        return a(str, -1L);
    }

    private synchronized c a(String str, long j) {
        b();
        e(str);
        b1 b1Var = (b1) this.j.get(str);
        a aVar = null;
        if (j != -1 && (b1Var == null || b1Var.f20747e != j)) {
            return null;
        }
        if (b1Var == null) {
            b1Var = new b1(str, this.f21492g, this.f21486a);
            this.j.put(str, b1Var);
        } else if (b1Var.f20746d != null) {
            return null;
        }
        c cVar = new c(this, b1Var, aVar);
        b1Var.f20746d = cVar;
        this.f21494i.write("DIRTY " + str + '\n');
        this.f21494i.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(c cVar, boolean z10) {
        b1 b1Var = cVar.f21500a;
        if (b1Var.f20746d == cVar) {
            if (z10 && !b1Var.f20745c) {
                for (int i10 = 0; i10 < this.f21492g; i10++) {
                    if (cVar.f21501b[i10]) {
                        if (!b1Var.b(i10).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f21492g; i11++) {
                File fileB = b1Var.b(i11);
                if (z10) {
                    if (fileB.exists()) {
                        File fileA = b1Var.a(i11);
                        fileB.renameTo(fileA);
                        long j = b1Var.f20744b[i11];
                        long length = fileA.length();
                        b1Var.f20744b[i11] = length;
                        this.f21493h = (this.f21493h - j) + length;
                    }
                } else {
                    a(fileB);
                }
            }
            this.f21495k++;
            b1Var.f20746d = null;
            if (b1Var.f20745c | z10) {
                b1Var.f20745c = true;
                this.f21494i.write("CLEAN " + b1Var.f20743a + b1Var.a() + '\n');
                if (z10) {
                    long j10 = this.f21496l;
                    this.f21496l = 1 + j10;
                    b1Var.f20747e = j10;
                }
            } else {
                this.j.remove(b1Var.f20743a);
                this.f21494i.write("REMOVE " + b1Var.f20743a + '\n');
            }
            this.f21494i.flush();
            if (this.f21493h > this.f21491f || e()) {
                this.f21497m.submit(this.f21498n);
            }
            return;
        }
        throw new IllegalStateException();
    }
}
