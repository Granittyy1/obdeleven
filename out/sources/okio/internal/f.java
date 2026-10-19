package okio.internal;

import D2.V;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;
import okio.ByteString;
import p293xa.r;
import p318zb.AbstractC2843j;
import p318zb.C;
import p318zb.F;
import p318zb.H;
import p318zb.J;
import p318zb.k;
import p318zb.l;
import p318zb.t;
import p318zb.v;
import p318zb.z;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f45724e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f45725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f45726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p293xa.g f45727d;

    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    public static final class a {
        public static final boolean a(z zVar) {
            z zVar2 = f.f45724e;
            zVar.getClass();
            ByteString byteString = c.f45714a;
            ByteString byteStringS = zVar.f49123b;
            int iM = ByteString.m(byteStringS, byteString);
            if (iM == -1) {
                iM = ByteString.m(byteStringS, c.f45715b);
            }
            if (iM != -1) {
                byteStringS = ByteString.s(byteStringS, iM + 1, 0, 2);
            } else if (zVar.g() != null && byteStringS.e() == 2) {
                byteStringS = ByteString.f45705d;
            }
            return !m.C(byteStringS.v(), ".class", true);
        }
    }

    static {
        String str = z.f49122c;
        f45724e = z.a.a("/", false);
    }

    public f(ClassLoader classLoader) {
        t systemFileSystem = l.f49101a;
        i.e(systemFileSystem, "systemFileSystem");
        this.f45725b = classLoader;
        this.f45726c = systemFileSystem;
        this.f45727d = kotlin.a.a(new Ia.a<List<? extends Pair<? extends l, ? extends z>>>() { // from class: okio.internal.ResourceFileSystem$roots$2
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:155:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:207:? A[SYNTHETIC] */
            @Override // Ia.a
            public final List<? extends Pair<? extends l, ? extends z>> invoke() throws IOException {
                l fileSystem;
                int iT;
                Throwable th;
                Pair pair;
                d dVar;
                Throwable th2;
                Throwable th3;
                Pair pair2;
                f fVar = this.this$0;
                ClassLoader classLoader2 = fVar.f45725b;
                Enumeration<URL> resources = classLoader2.getResources("");
                i.d(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                i.d(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    fileSystem = fVar.f45726c;
                    if (!zHasNext) {
                        break;
                    }
                    URL url = (URL) it.next();
                    i.b(url);
                    if (i.a(url.getProtocol(), "file")) {
                        String str = z.f49122c;
                        pair2 = new Pair(fileSystem, z.a.b(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader2.getResources("META-INF/MANIFEST.MF");
                i.d(resources2, "getResources(...)");
                ArrayList<URL> list2 = Collections.list(resources2);
                i.d(list2, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    i.b(url2);
                    String string = url2.toString();
                    i.d(string, "toString(...)");
                    if (m.I(string, "jar:file:", false) && (iT = n.T(6, string, "!")) != -1) {
                        String str2 = z.f49122c;
                        String strSubstring = string.substring(4, iT);
                        i.d(strSubstring, "substring(...)");
                        z zVarB = z.a.b(new File(URI.create(strSubstring)));
                        i.e(fileSystem, "fileSystem");
                        ResourceFileSystem$toJarRoot$zip$1 predicate = ResourceFileSystem$toJarRoot$zip$1.f45711h;
                        i.e(predicate, "predicate");
                        AbstractC2843j abstractC2843jG = fileSystem.g(zVarB);
                        try {
                            long jI = abstractC2843jG.i() - ((long) 22);
                            if (jI < 0) {
                                throw new IOException("not a zip: size=" + abstractC2843jG.i());
                            }
                            long jMax = Math.max(jI - 65536, 0L);
                            while (true) {
                                C cB = v.b(abstractC2843jG.j(jI));
                                try {
                                    if (cB.q0() == 101010256) {
                                        int iB0 = cB.B0() & 65535;
                                        int iB1 = cB.B0() & 65535;
                                        long jB0 = cB.B0() & 65535;
                                        if (jB0 != (cB.B0() & 65535) || iB0 != 0 || iB1 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        cB.skip(4L);
                                        long jQ0 = ((long) cB.q0()) & 4294967295L;
                                        int iB2 = cB.B0() & 65535;
                                        d dVar2 = new d(iB2, jB0, jQ0);
                                        cB.s(iB2);
                                        cB.close();
                                        long j = jI - ((long) 20);
                                        long j10 = 0;
                                        if (j > 0) {
                                            C cB2 = v.b(abstractC2843jG.j(j));
                                            try {
                                                if (cB2.q0() == 117853008) {
                                                    int iQ0 = cB2.q0();
                                                    long jF0 = cB2.F0();
                                                    if (cB2.q0() != 1 || iQ0 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    C cB3 = v.b(abstractC2843jG.j(jF0));
                                                    try {
                                                        int iQ1 = cB3.q0();
                                                        if (iQ1 != 101075792) {
                                                            throw new IOException("bad zip: expected " + h.b(101075792) + " but was " + h.b(iQ1));
                                                        }
                                                        cB3.skip(12L);
                                                        int iQ2 = cB3.q0();
                                                        int iQ3 = cB3.q0();
                                                        long jF1 = cB3.F0();
                                                        if (jF1 != cB3.F0() || iQ2 != 0 || iQ3 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        cB3.skip(8L);
                                                        dVar = new d(iB2, jF1, cB3.F0());
                                                        try {
                                                            r rVar = r.f47939a;
                                                            try {
                                                                cB3.close();
                                                                th3 = null;
                                                            } catch (Throwable th4) {
                                                                th3 = th4;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            Throwable th6 = th;
                                                            try {
                                                                cB3.close();
                                                            } catch (Throwable th7) {
                                                                try {
                                                                    V.e(th6, th7);
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    Throwable th9 = th;
                                                                    try {
                                                                        cB2.close();
                                                                    } catch (Throwable th10) {
                                                                        V.e(th9, th10);
                                                                    }
                                                                    th2 = th9;
                                                                    dVar2 = dVar;
                                                                }
                                                            }
                                                            th3 = th6;
                                                        }
                                                        dVar2 = dVar;
                                                        if (th3 != null) {
                                                            throw th3;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        dVar = dVar2;
                                                    }
                                                }
                                                r rVar2 = r.f47939a;
                                                try {
                                                    cB2.close();
                                                    th2 = null;
                                                } catch (Throwable th12) {
                                                    th2 = th12;
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                dVar = dVar2;
                                            }
                                            if (th2 != null) {
                                                throw th2;
                                            }
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        C cB4 = v.b(abstractC2843jG.j(dVar2.f45720b));
                                        try {
                                            long j11 = dVar2.f45719a;
                                            while (j10 < j11) {
                                                g gVarC = h.c(cB4);
                                                long j12 = j11;
                                                if (gVarC.f45735h >= dVar2.f45720b) {
                                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                                }
                                                if (((Boolean) predicate.invoke(gVarC)).booleanValue()) {
                                                    arrayList3.add(gVarC);
                                                }
                                                j10++;
                                                j11 = j12;
                                            }
                                            r rVar3 = r.f47939a;
                                            try {
                                                cB4.close();
                                                th = null;
                                            } catch (Throwable th14) {
                                                th = th14;
                                            }
                                        } catch (Throwable th15) {
                                            try {
                                                cB4.close();
                                            } catch (Throwable th16) {
                                                V.e(th15, th16);
                                            }
                                            th = th15;
                                        }
                                        if (th != null) {
                                            throw th;
                                        }
                                        J j13 = new J(zVarB, fileSystem, h.a(arrayList3));
                                        try {
                                            abstractC2843jG.close();
                                        } catch (Throwable unused) {
                                        }
                                        pair = new Pair(j13, f.f45724e);
                                        break;
                                        if (abstractC2843jG != null) {
                                            throw th;
                                        }
                                        try {
                                            abstractC2843jG.close();
                                            throw th;
                                        } catch (Throwable th17) {
                                            V.e(th, th17);
                                            throw th;
                                        }
                                    }
                                    cB.close();
                                    jI--;
                                    if (jI < jMax) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                } catch (Throwable th18) {
                                    cB.close();
                                    throw th18;
                                }
                            }
                        } catch (Throwable th19) {
                            if (abstractC2843jG != null) {
                                throw th19;
                            }
                            abstractC2843jG.close();
                            throw th19;
                        }
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return q.c0(arrayList, arrayList2);
            }
        });
    }

    @Override // p318zb.l
    public final void a(z path) throws IOException {
        i.e(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // p318zb.l
    public final List<z> d(z dir) throws FileNotFoundException {
        i.e(dir, "dir");
        z zVar = f45724e;
        zVar.getClass();
        String strV = c.b(zVar, dir, true).c(zVar).f49123b.v();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair pair : (List) this.f45727d.getValue()) {
            l lVar = (l) pair.a();
            z zVar2 = (z) pair.b();
            try {
                List<z> listD = lVar.d(zVar2.d(strV));
                ArrayList<z> arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (a.a((z) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
                for (z zVar3 : arrayList) {
                    i.e(zVar3, "<this>");
                    String strReplace = n.Z(zVar3.f49123b.v(), zVar2.f49123b.v()).replace('\\', '/');
                    i.d(strReplace, "replace(...)");
                    arrayList2.add(zVar.d(strReplace));
                }
                p.z(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return q.o0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // p318zb.l
    public final k f(z path) throws IOException {
        i.e(path, "path");
        if (!a.a(path)) {
            return null;
        }
        z zVar = f45724e;
        zVar.getClass();
        String strV = c.b(zVar, path, true).c(zVar).f49123b.v();
        for (Pair pair : (List) this.f45727d.getValue()) {
            k kVarF = ((l) pair.a()).f(((z) pair.b()).d(strV));
            if (kVarF != null) {
                return kVarF;
            }
        }
        return null;
    }

    @Override // p318zb.l
    public final AbstractC2843j g(z file) throws FileNotFoundException {
        i.e(file, "file");
        if (!a.a(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        z zVar = f45724e;
        zVar.getClass();
        String strV = c.b(zVar, file, true).c(zVar).f49123b.v();
        for (Pair pair : (List) this.f45727d.getValue()) {
            try {
                return ((l) pair.a()).g(((z) pair.b()).d(strV));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // p318zb.l
    public final F h(z file) throws IOException {
        i.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // p318zb.l
    public final H i(z file) throws IOException {
        i.e(file, "file");
        if (!a.a(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        z zVar = f45724e;
        zVar.getClass();
        URL resource = this.f45725b.getResource(c.b(zVar, file, false).c(zVar).f49123b.v());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        i.d(inputStream, "getInputStream(...)");
        return v.g(inputStream);
    }
}
