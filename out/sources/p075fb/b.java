package p075fb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import p124jb.c;
import p137kb.e;
import p137kb.f;
import p137kb.j;
import p149lb.a;

/* JADX INFO: compiled from: ZipFile.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f35072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35073d;

    public final c a(e eVar) throws Throwable {
        long j;
        if (eVar == null) {
            throw new ZipException("FileHeader is null, cannot get InputStream");
        }
        if (this.f35072c == null) {
            String str = this.f35070a;
            if (p159mb.b.a(str)) {
                c();
            } else {
                j jVar = new j();
                this.f35072c = jVar;
                jVar.f42967g = str;
            }
        }
        j jVar2 = this.f35072c;
        if (jVar2 == null) {
            throw new ZipException("zip model is null, cannot get inputstream");
        }
        a aVar = new a();
        aVar.f44515c = 0;
        aVar.f44513a = jVar2;
        aVar.f44514b = eVar;
        aVar.f44518f = new CRC32();
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFileD = aVar.d();
            try {
                if (!aVar.b()) {
                    throw new ZipException("local header and file header do not match");
                }
                aVar.e(randomAccessFileD);
                f fVar = aVar.f44516d;
                long j10 = fVar.f42943c;
                long j11 = fVar.f42947g;
                if (fVar.f42948h) {
                    int i10 = fVar.f42949i;
                    if (i10 == 99) {
                        p087gb.b bVar = aVar.f44517e;
                        if (!(bVar instanceof p087gb.a)) {
                            throw new ZipException("invalid decryptor when trying to calculate compressed size for AES encrypted file: " + eVar.f42934i);
                        }
                        int i11 = ((p087gb.a) bVar).f35678e;
                        ((p087gb.a) bVar).getClass();
                        j10 -= (long) (i11 + 12);
                        p087gb.b bVar2 = aVar.f44517e;
                        int i12 = ((p087gb.a) bVar2).f35678e;
                        ((p087gb.a) bVar2).getClass();
                        j = i12 + 2;
                    } else if (i10 == 0) {
                        j = 12;
                        j10 -= 12;
                    }
                    j11 += j;
                }
                long j12 = j10;
                long j13 = j11;
                int i13 = eVar.f42926a;
                if (eVar.f42935k == 99) {
                    p137kb.a aVar2 = eVar.f42938n;
                    if (aVar2 == null) {
                        throw new ZipException("AESExtraDataRecord does not exist for AES encrypted file: " + eVar.f42934i);
                    }
                    i13 = aVar2.f42918b;
                }
                randomAccessFileD.seek(j13);
                if (i13 == 0) {
                    return new c(new p124jb.b(randomAccessFileD, j12, aVar));
                }
                if (i13 == 8) {
                    return new c(new p124jb.a(randomAccessFileD, j13, j12, aVar));
                }
                throw new ZipException("compression type not supported");
            } catch (ZipException e10) {
                e = e10;
                randomAccessFile = randomAccessFileD;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            } catch (Exception e11) {
                e = e11;
                randomAccessFile = randomAccessFileD;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                }
                throw new ZipException(e);
            }
        } catch (ZipException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
    }

    public final boolean b() throws Throwable {
        ArrayList arrayList;
        if (this.f35072c == null) {
            c();
            if (this.f35072c == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        p137kb.b bVar = this.f35072c.f42962b;
        if (bVar == null || (arrayList = (ArrayList) bVar.f42919a) == null) {
            throw new ZipException("invalid zip file");
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e eVar = (e) arrayList.get(i10);
            if (eVar != null && eVar.j) {
                this.f35073d = true;
                break;
            }
        }
        return this.f35073d;
    }

    public final void c() throws Throwable {
        String str = this.f35070a;
        if (!p159mb.b.a(str)) {
            throw new ZipException("zip file does not exist");
        }
        if (!p159mb.b.c(str)) {
            throw new ZipException("path is null");
        }
        if (!p159mb.b.a(str)) {
            throw new ZipException(B7.b.c("file does not exist: ", str));
        }
        try {
            if (!new File(str).canRead()) {
                throw new ZipException("no read access for the input zip file");
            }
            if (this.f35071b != 2) {
                throw new ZipException("Invalid mode");
            }
            RandomAccessFile randomAccessFile = null;
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(str), "r");
                    try {
                        if (this.f35072c == null) {
                            j jVarC = new a(randomAccessFile2).c();
                            this.f35072c = jVarC;
                            if (jVarC != null) {
                                jVarC.f42967g = str;
                            }
                        }
                        try {
                            randomAccessFile2.close();
                        } catch (IOException unused) {
                        }
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        throw new ZipException((Exception) e);
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e11) {
                e = e11;
            }
        } catch (Exception unused3) {
            throw new ZipException("cannot read zip file");
        }
    }

    public final void d(String str) throws Throwable {
        if (!p159mb.b.c(str)) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        if (this.f35072c == null) {
            c();
            if (this.f35072c == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        p137kb.b bVar = this.f35072c.f42962b;
        if (bVar == null || ((ArrayList) bVar.f42919a) == null) {
            throw new ZipException("invalid zip file");
        }
        for (int i10 = 0; i10 < ((ArrayList) this.f35072c.f42962b.f42919a).size(); i10++) {
            if (((ArrayList) this.f35072c.f42962b.f42919a).get(i10) != null && ((e) ((ArrayList) this.f35072c.f42962b.f42919a).get(i10)).j) {
                ((e) ((ArrayList) this.f35072c.f42962b.f42919a).get(i10)).f42936l = charArray;
            }
        }
    }
}
