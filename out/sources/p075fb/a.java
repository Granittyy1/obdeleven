package p075fb;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import net.lingala.zip4j.exception.ZipException;
import p137kb.b;
import p137kb.c;
import p137kb.d;
import p137kb.e;
import p137kb.f;
import p137kb.g;
import p137kb.h;
import p137kb.i;
import p137kb.j;

/* JADX INFO: compiled from: HeaderReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f35068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f35069b;

    public a(RandomAccessFile randomAccessFile) {
        this.f35068a = randomAccessFile;
    }

    public static byte[] a(byte[] bArr) throws ZipException {
        if (bArr.length == 4) {
            return new byte[]{bArr[0], bArr[1], bArr[2], bArr[3], 0, 0, 0, 0};
        }
        throw new ZipException("invalid byte length, cannot expand to 8 bytes");
    }

    public static p137kb.a b(ArrayList arrayList) throws ZipException {
        if (arrayList == null) {
            return null;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar != null && dVar.f42923a == 39169) {
                byte[] bArr = dVar.f42925c;
                if (bArr == null) {
                    throw new ZipException("corrput AES extra data records");
                }
                p137kb.a aVar = new p137kb.a();
                aVar.f42917a = -1;
                aVar.f42918b = -1;
                p159mb.a.e(0, bArr);
                byte[] bArr2 = new byte[2];
                System.arraycopy(bArr, 2, bArr2, 0, 2);
                new String(bArr2);
                aVar.f42917a = bArr[4] & 255;
                aVar.f42918b = p159mb.a.e(5, bArr);
                return aVar;
            }
        }
        return null;
    }

    public static void d(e eVar) throws ZipException {
        i iVarH;
        ArrayList arrayList = eVar.f42939o;
        if (arrayList == null || arrayList.size() <= 0 || (iVarH = h(eVar.f42939o, eVar.f42930e, eVar.f42929d, eVar.f42933h, eVar.f42932g)) == null) {
            return;
        }
        eVar.f42937m = iVarH;
        long j = iVarH.f42959b;
        if (j != -1) {
            eVar.f42930e = j;
        }
        long j10 = iVarH.f42958a;
        if (j10 != -1) {
            eVar.f42929d = j10;
        }
        long j11 = iVarH.f42960c;
        if (j11 != -1) {
            eVar.f42933h = j11;
        }
        int i10 = iVarH.f42961d;
        if (i10 != -1) {
            eVar.f42932g = i10;
        }
    }

    public static void f(RandomAccessFile randomAccessFile, byte[] bArr) throws ZipException {
        try {
            if (randomAccessFile.read(bArr, 0, bArr.length) != -1) {
            } else {
                throw new ZipException("unexpected end of file when reading short buff");
            }
        } catch (IOException e10) {
            throw new ZipException(e10);
        }
    }

    public static i h(ArrayList arrayList, long j, long j10, long j11, int i10) throws ZipException {
        int i11;
        boolean z10;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            d dVar = (d) arrayList.get(i12);
            if (dVar != null && dVar.f42923a == 1) {
                i iVar = new i();
                iVar.f42958a = -1L;
                iVar.f42959b = -1L;
                iVar.f42960c = -1L;
                iVar.f42961d = -1;
                byte[] bArr = dVar.f42925c;
                int i13 = dVar.f42924b;
                if (i13 <= 0) {
                    return null;
                }
                byte[] bArr2 = new byte[8];
                byte[] bArr3 = new byte[4];
                boolean z11 = true;
                if ((j & 65535) != 65535 || i13 <= 0) {
                    i11 = 0;
                    z10 = false;
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, 8);
                    iVar.f42959b = p159mb.a.d(bArr2);
                    i11 = 8;
                    z10 = true;
                }
                if ((j10 & 65535) == 65535 && i11 < dVar.f42924b) {
                    System.arraycopy(bArr, i11, bArr2, 0, 8);
                    iVar.f42958a = p159mb.a.d(bArr2);
                    i11 += 8;
                    z10 = true;
                }
                if ((j11 & 65535) == 65535 && i11 < dVar.f42924b) {
                    System.arraycopy(bArr, i11, bArr2, 0, 8);
                    iVar.f42960c = p159mb.a.d(bArr2);
                    i11 += 8;
                    z10 = true;
                }
                if ((i10 & 65535) != 65535 || i11 >= dVar.f42924b) {
                    z11 = z10;
                } else {
                    System.arraycopy(bArr, i11, bArr3, 0, 4);
                    iVar.f42961d = p159mb.a.b(bArr3);
                }
                if (z11) {
                    return iVar;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    public final j c() throws ZipException {
        p137kb.a aVarB;
        j jVar = new j();
        this.f35069b = jVar;
        RandomAccessFile randomAccessFile = this.f35068a;
        boolean z10 = false;
        try {
            byte[] bArr = new byte[4];
            long length = randomAccessFile.length() - 22;
            c cVar = new c();
            int i10 = 0;
            while (true) {
                long j = length - 1;
                randomAccessFile.seek(length);
                i10++;
                if (p159mb.a.c(randomAccessFile, bArr) == 101010256 || i10 > 3000) {
                    break;
                    break;
                }
                length = j;
            }
            if (p159mb.a.b(bArr) != 101010256) {
                throw new ZipException("zip headers not found. probably not a zip file");
            }
            byte[] bArr2 = new byte[4];
            byte[] bArr3 = new byte[2];
            f(randomAccessFile, bArr3);
            cVar.f42920a = p159mb.a.e(0, bArr3);
            f(randomAccessFile, bArr3);
            p159mb.a.e(0, bArr3);
            f(randomAccessFile, bArr3);
            p159mb.a.e(0, bArr3);
            f(randomAccessFile, bArr3);
            cVar.f42921b = p159mb.a.e(0, bArr3);
            f(randomAccessFile, bArr2);
            p159mb.a.b(bArr2);
            f(randomAccessFile, bArr2);
            cVar.f42922c = p159mb.a.d(a(bArr2));
            f(randomAccessFile, bArr3);
            int iE = p159mb.a.e(0, bArr3);
            if (iE > 0) {
                byte[] bArr4 = new byte[iE];
                f(randomAccessFile, bArr4);
                new String(bArr4);
            }
            if (cVar.f42920a > 0) {
                this.f35069b.f42966f = true;
            } else {
                this.f35069b.f42966f = false;
            }
            jVar.f42963c = cVar;
            j jVar2 = this.f35069b;
            try {
                g gVar = new g();
                try {
                    byte[] bArr5 = new byte[4];
                    long length2 = randomAccessFile.length() - 22;
                    while (true) {
                        long j10 = length2 - 1;
                        randomAccessFile.seek(length2);
                        if (p159mb.a.c(randomAccessFile, bArr5) == 101010256) {
                            break;
                        }
                        length2 = j10;
                        z10 = false;
                    }
                    randomAccessFile.seek(randomAccessFile.getFilePointer() - 24);
                    byte[] bArr6 = new byte[4];
                    byte[] bArr7 = new byte[8];
                    f(randomAccessFile, bArr6);
                    if (p159mb.a.b(bArr6) == 117853008) {
                        this.f35069b.f42968h = true;
                        f(randomAccessFile, bArr6);
                        p159mb.a.b(bArr6);
                        f(randomAccessFile, bArr7);
                        gVar.f42953a = p159mb.a.d(bArr7);
                        f(randomAccessFile, bArr6);
                        p159mb.a.b(bArr6);
                    } else {
                        this.f35069b.f42968h = z10;
                        gVar = null;
                    }
                    jVar2.f42964d = gVar;
                    j jVar3 = this.f35069b;
                    if (jVar3.f42968h) {
                        g gVar2 = jVar3.f42964d;
                        if (gVar2 == null) {
                            throw new ZipException("invalid zip64 end of central directory locator");
                        }
                        long j11 = gVar2.f42953a;
                        if (j11 < 0) {
                            throw new ZipException("invalid offset for start of end of central directory record");
                        }
                        try {
                            randomAccessFile.seek(j11);
                            h hVar = new h();
                            byte[] bArr8 = new byte[2];
                            byte[] bArr9 = new byte[4];
                            byte[] bArr10 = new byte[8];
                            f(randomAccessFile, bArr9);
                            if (p159mb.a.b(bArr9) != 101075792) {
                                throw new ZipException("invalid signature for zip64 end of central directory record");
                            }
                            f(randomAccessFile, bArr10);
                            hVar.f42954a = p159mb.a.d(bArr10);
                            f(randomAccessFile, bArr8);
                            p159mb.a.e(z10 ? 1 : 0, bArr8);
                            f(randomAccessFile, bArr8);
                            p159mb.a.e(z10 ? 1 : 0, bArr8);
                            f(randomAccessFile, bArr9);
                            hVar.f42955b = p159mb.a.b(bArr9);
                            f(randomAccessFile, bArr9);
                            p159mb.a.b(bArr9);
                            f(randomAccessFile, bArr10);
                            p159mb.a.d(bArr10);
                            f(randomAccessFile, bArr10);
                            hVar.f42956c = p159mb.a.d(bArr10);
                            f(randomAccessFile, bArr10);
                            p159mb.a.d(bArr10);
                            f(randomAccessFile, bArr10);
                            hVar.f42957d = p159mb.a.d(bArr10);
                            long j12 = hVar.f42954a - 44;
                            if (j12 > 0) {
                                f(randomAccessFile, new byte[(int) j12]);
                            }
                            jVar3.f42965e = hVar;
                            j jVar4 = this.f35069b;
                            h hVar2 = jVar4.f42965e;
                            if (hVar2 == null || hVar2.f42955b <= 0) {
                                jVar4.f42966f = z10;
                            } else {
                                jVar4.f42966f = true;
                            }
                        } catch (IOException e10) {
                            throw new ZipException((Exception) e10);
                        }
                    }
                    j jVar5 = this.f35069b;
                    if (jVar5.f42963c == null) {
                        throw new ZipException("EndCentralRecord was null, maybe a corrupt zip file");
                    }
                    try {
                        b bVar = new b();
                        ArrayList arrayList = new ArrayList();
                        j jVar6 = this.f35069b;
                        c cVar2 = jVar6.f42963c;
                        long j13 = cVar2.f42922c;
                        int i11 = cVar2.f42921b;
                        if (jVar6.f42968h) {
                            h hVar3 = jVar6.f42965e;
                            j13 = hVar3.f42957d;
                            i11 = (int) hVar3.f42956c;
                        }
                        randomAccessFile.seek(j13);
                        byte[] bArr11 = new byte[4];
                        byte[] bArr12 = new byte[2];
                        int i12 = z10 ? 1 : 0;
                        ?? r10 = z10;
                        while (i12 < i11) {
                            e eVar = new e();
                            f(randomAccessFile, bArr11);
                            if (p159mb.a.b(bArr11) != 33639248) {
                                throw new ZipException("Expected central directory entry not found (#" + (i12 + 1) + ")");
                            }
                            f(randomAccessFile, bArr12);
                            p159mb.a.e(r10, bArr12);
                            f(randomAccessFile, bArr12);
                            p159mb.a.e(r10, bArr12);
                            f(randomAccessFile, bArr12);
                            r17.f42940p = (p159mb.a.e(r10, bArr12) & 2048) != 0 ? 1 : r10;
                            if ((bArr12[r10] & 1) != 0) {
                                eVar.j = true;
                            }
                            f(randomAccessFile, bArr12);
                            r17.f42926a = p159mb.a.e(r10, bArr12);
                            f(randomAccessFile, bArr11);
                            p159mb.a.b(bArr11);
                            f(randomAccessFile, bArr11);
                            byte[] bArr13 = bArr11;
                            r17.f42927b = p159mb.a.b(bArr11);
                            r17.f42928c = (byte[]) bArr13.clone();
                            f(randomAccessFile, bArr13);
                            r17.f42929d = p159mb.a.d(a(bArr13));
                            f(randomAccessFile, bArr13);
                            r17.f42930e = p159mb.a.d(a(bArr13));
                            f(randomAccessFile, bArr12);
                            int iE2 = p159mb.a.e(0, bArr12);
                            f(randomAccessFile, bArr12);
                            r17.f42931f = p159mb.a.e(0, bArr12);
                            f(randomAccessFile, bArr12);
                            int iE3 = p159mb.a.e(0, bArr12);
                            new String(bArr12);
                            f(randomAccessFile, bArr12);
                            r17.f42932g = p159mb.a.e(0, bArr12);
                            f(randomAccessFile, bArr12);
                            f(randomAccessFile, bArr13);
                            f(randomAccessFile, bArr13);
                            int i13 = i11;
                            byte[] bArr14 = bArr12;
                            r17.f42933h = p159mb.a.d(a(bArr13)) & 4294967295L;
                            if (iE2 > 0) {
                                byte[] bArr15 = new byte[iE2];
                                f(randomAccessFile, bArr15);
                                this.f35069b.getClass();
                                String strB = p159mb.b.b(bArr15, r17.f42940p);
                                if (strB.indexOf(":" + System.getProperty("file.separator")) >= 0) {
                                    strB = strB.substring(strB.indexOf(":" + System.getProperty("file.separator")) + 2);
                                }
                                r17.f42934i = strB;
                                if (!strB.endsWith("/")) {
                                    strB.endsWith("\\");
                                }
                            } else {
                                r17.f42934i = null;
                            }
                            int i14 = r17.f42931f;
                            if (i14 > 0) {
                                r17.f42939o = e(i14);
                            }
                            d(r17);
                            ArrayList arrayList2 = r17.f42939o;
                            if (arrayList2 != null && arrayList2.size() > 0 && (aVarB = b(r17.f42939o)) != null) {
                                r17.f42938n = aVarB;
                                r17.f42935k = 99;
                            }
                            if (iE3 > 0) {
                                byte[] bArr16 = new byte[iE3];
                                f(randomAccessFile, bArr16);
                                new String(bArr16);
                            }
                            arrayList.add(r17);
                            i12++;
                            i11 = i13;
                            bArr11 = bArr13;
                            bArr12 = bArr14;
                            r10 = 0;
                        }
                        byte[] bArr17 = bArr11;
                        byte[] bArr18 = bArr12;
                        bVar.f42919a = arrayList;
                        f(randomAccessFile, bArr17);
                        if (p159mb.a.b(bArr17) == 84233040) {
                            f(randomAccessFile, bArr18);
                            int iE4 = p159mb.a.e(0, bArr18);
                            if (iE4 > 0) {
                                byte[] bArr19 = new byte[iE4];
                                f(randomAccessFile, bArr19);
                                new String(bArr19);
                            }
                        }
                        jVar5.f42962b = bVar;
                        return this.f35069b;
                    } catch (IOException e11) {
                        throw new ZipException((Exception) e11);
                    }
                } catch (IOException e12) {
                    throw new ZipException((Exception) e12);
                }
            } catch (Exception e13) {
                throw new ZipException(e13);
            }
        } catch (IOException e14) {
            throw new ZipException(e14, 0);
        }
    }

    public final ArrayList e(int i10) throws ZipException {
        if (i10 <= 0) {
            return null;
        }
        try {
            byte[] bArr = new byte[i10];
            this.f35068a.read(bArr);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (i11 < i10) {
                d dVar = new d();
                dVar.f42923a = p159mb.a.e(i11, bArr);
                int i12 = i11 + 2;
                int iE = p159mb.a.e(i12, bArr);
                if (iE + 2 > i10) {
                    iE = (short) (((short) (((short) (bArr[i12] & 255)) << 8)) | (bArr[i11 + 3] & 255));
                    if (iE + 2 > i10) {
                        break;
                    }
                }
                dVar.f42924b = iE;
                int i13 = i11 + 4;
                if (iE > 0) {
                    byte[] bArr2 = new byte[iE];
                    System.arraycopy(bArr, i13, bArr2, 0, iE);
                    dVar.f42925c = bArr2;
                }
                i11 = i13 + iE;
                arrayList.add(dVar);
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        } catch (IOException e10) {
            throw new ZipException((Exception) e10);
        }
    }

    public final f g(e eVar) throws ZipException {
        p137kb.a aVarB;
        i iVarH;
        if (eVar == null) {
            throw new ZipException("invalid read parameters for local header");
        }
        RandomAccessFile randomAccessFile = this.f35068a;
        long j = eVar.f42933h;
        i iVar = eVar.f42937m;
        if (iVar != null) {
            int i10 = (iVar.f42960c > 0L ? 1 : (iVar.f42960c == 0L ? 0 : -1));
        }
        if (j < 0) {
            throw new ZipException("invalid local header offset");
        }
        try {
            randomAccessFile.seek(j);
            f fVar = new f();
            fVar.f42949i = -1;
            fVar.f42942b = 0L;
            fVar.f42944d = 0L;
            byte[] bArr = new byte[2];
            byte[] bArr2 = new byte[4];
            f(randomAccessFile, bArr2);
            if (p159mb.a.b(bArr2) != 67324752) {
                throw new ZipException("invalid local header signature for file: " + eVar.f42934i);
            }
            f(randomAccessFile, bArr);
            p159mb.a.e(0, bArr);
            f(randomAccessFile, bArr);
            fVar.f42952m = (p159mb.a.e(0, bArr) & 2048) != 0;
            byte b10 = bArr[0];
            if ((b10 & 1) != 0) {
                fVar.f42948h = true;
            }
            String binaryString = Integer.toBinaryString(b10);
            if (binaryString.length() >= 4) {
                binaryString.charAt(3);
            }
            f(randomAccessFile, bArr);
            fVar.f42941a = p159mb.a.e(0, bArr);
            f(randomAccessFile, bArr2);
            p159mb.a.b(bArr2);
            f(randomAccessFile, bArr2);
            fVar.f42942b = p159mb.a.b(bArr2);
            f(randomAccessFile, bArr2);
            fVar.f42943c = p159mb.a.d(a(bArr2));
            f(randomAccessFile, bArr2);
            fVar.f42944d = p159mb.a.d(a(bArr2));
            f(randomAccessFile, bArr);
            int iE = p159mb.a.e(0, bArr);
            f(randomAccessFile, bArr);
            int iE2 = p159mb.a.e(0, bArr);
            fVar.f42945e = iE2;
            int i11 = 30;
            if (iE > 0) {
                byte[] bArr3 = new byte[iE];
                f(randomAccessFile, bArr3);
                String strB = p159mb.b.b(bArr3, fVar.f42952m);
                if (strB.indexOf(":" + System.getProperty("file.separator")) >= 0) {
                    strB = strB.substring(strB.indexOf(":" + System.getProperty("file.separator")) + 2);
                }
                fVar.f42946f = strB;
                i11 = 30 + iE;
            } else {
                fVar.f42946f = null;
            }
            int i12 = fVar.f42945e;
            if (i12 > 0) {
                fVar.f42950k = e(i12);
            }
            fVar.f42947g = j + ((long) (i11 + iE2));
            fVar.j = eVar.f42936l;
            ArrayList arrayList = fVar.f42950k;
            if (arrayList != null && arrayList.size() > 0 && (iVarH = h(fVar.f42950k, fVar.f42944d, fVar.f42943c, -1L, -1)) != null) {
                long j10 = iVarH.f42959b;
                if (j10 != -1) {
                    fVar.f42944d = j10;
                }
                long j11 = iVarH.f42958a;
                if (j11 != -1) {
                    fVar.f42943c = j11;
                }
            }
            ArrayList arrayList2 = fVar.f42950k;
            if (arrayList2 != null && arrayList2.size() > 0 && (aVarB = b(fVar.f42950k)) != null) {
                fVar.f42951l = aVarB;
                fVar.f42949i = 99;
            }
            if (fVar.f42948h && fVar.f42949i != 99) {
                if ((b10 & 64) == 64) {
                    fVar.f42949i = 1;
                } else {
                    fVar.f42949i = 0;
                }
            }
            if (fVar.f42942b <= 0) {
                fVar.f42942b = eVar.f42927b & 4294967295L;
            }
            if (fVar.f42943c <= 0) {
                fVar.f42943c = eVar.f42929d;
            }
            if (fVar.f42944d <= 0) {
                fVar.f42944d = eVar.f42930e;
            }
            return fVar;
        } catch (IOException e10) {
            throw new ZipException((Exception) e10);
        }
    }
}
