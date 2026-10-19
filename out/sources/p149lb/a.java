package p149lb;

import androidx.appcompat.widget.C0858k;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.ui.text.font.s;
import com.braze.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.zip.CRC32;
import javax.crypto.Mac;
import net.lingala.zip4j.exception.ZipException;
import p087gb.b;
import p087gb.c;
import p137kb.e;
import p137kb.f;
import p137kb.j;

/* JADX INFO: compiled from: UnzipEngine.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f44513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f44514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f44516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f44517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CRC32 f44518f;

    public final void a() throws ZipException {
        e eVar = this.f44514b;
        if (eVar != null) {
            if (eVar.f42935k != 99) {
                if ((this.f44518f.getValue() & 4294967295L) != (4294967295L & eVar.f42927b)) {
                    String strB = "invalid CRC for file: " + eVar.f42934i;
                    f fVar = this.f44516d;
                    if (fVar.f42948h && fVar.f42949i == 0) {
                        strB = s.b(strB, " - Wrong Password?");
                    }
                    throw new ZipException(strB);
                }
                return;
            }
            b bVar = this.f44517e;
            if (bVar == null || !(bVar instanceof p087gb.a)) {
                return;
            }
            byte[] bArrDoFinal = ((Mac) ((p087gb.a) bVar).f35675b.f13218b).doFinal();
            byte[] bArr = ((p087gb.a) this.f44517e).f35682i;
            byte[] bArr2 = new byte[10];
            if (bArr == null) {
                throw new ZipException("CRC (MAC) check failed for " + eVar.f42934i);
            }
            System.arraycopy(bArrDoFinal, 0, bArr2, 0, 10);
            if (Arrays.equals(bArr2, bArr)) {
                return;
            }
            throw new ZipException("invalid CRC (MAC) for file: " + eVar.f42934i);
        }
    }

    public final boolean b() throws ZipException {
        e eVar = this.f44514b;
        RandomAccessFile randomAccessFileC = null;
        try {
            try {
                randomAccessFileC = c();
                if (randomAccessFileC == null) {
                    randomAccessFileC = new RandomAccessFile(new File(this.f44513a.f42967g), "r");
                }
                f fVarG = new p075fb.a(randomAccessFileC).g(eVar);
                this.f44516d = fVarG;
                if (fVarG.f42941a != eVar.f42926a) {
                    try {
                        randomAccessFileC.close();
                        return false;
                    } catch (IOException | Exception unused) {
                        return false;
                    }
                }
                try {
                    randomAccessFileC.close();
                    return true;
                } catch (IOException | Exception unused2) {
                    return true;
                }
            } catch (FileNotFoundException e10) {
                throw new ZipException((Exception) e10);
            }
        } catch (Throwable th) {
            if (randomAccessFileC != null) {
                try {
                    randomAccessFileC.close();
                } catch (IOException | Exception unused3) {
                }
            }
            throw th;
        }
    }

    public final RandomAccessFile c() throws ZipException {
        j jVar = this.f44513a;
        if (!jVar.f42966f) {
            return null;
        }
        int i10 = this.f44514b.f42932g;
        int i11 = i10 + 1;
        this.f44515c = i11;
        String str = jVar.f42967g;
        if (i10 != jVar.f42963c.f42920a) {
            if (i10 >= 9) {
                str = str.substring(0, str.lastIndexOf(".")) + ".z" + i11;
            } else {
                str = str.substring(0, str.lastIndexOf(".")) + ".z0" + i11;
            }
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            if (this.f44515c == 1) {
                byte[] bArr = new byte[4];
                randomAccessFile.read(bArr);
                if (p159mb.a.b(bArr) != 134695760) {
                    throw new ZipException("invalid first part split file signature");
                }
            }
            return randomAccessFile;
        } catch (FileNotFoundException e10) {
            throw new ZipException((Exception) e10);
        } catch (IOException e11) {
            throw new ZipException((Exception) e11);
        }
    }

    public final RandomAccessFile d() throws ZipException {
        j jVar = this.f44513a;
        if (jVar == null || !p159mb.b.c(jVar.f42967g)) {
            throw new ZipException("input parameter is null in getFilePointer");
        }
        try {
            return jVar.f42966f ? c() : new RandomAccessFile(new File(jVar.f42967g), "r");
        } catch (FileNotFoundException e10) {
            throw new ZipException((Exception) e10);
        } catch (Exception e11) {
            throw new ZipException(e11);
        }
    }

    public final void e(RandomAccessFile randomAccessFile) throws ZipException {
        if (this.f44516d == null) {
            throw new ZipException("local file header is null, cannot initialize input stream");
        }
        try {
            f(randomAccessFile);
        } catch (ZipException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new ZipException(e11);
        }
    }

    public final void f(RandomAccessFile randomAccessFile) throws ZipException {
        int i10;
        byte[] bArr;
        f fVar = this.f44516d;
        if (fVar == null) {
            throw new ZipException("local file header is null, cannot init decrypter");
        }
        if (fVar.f42948h) {
            int i11 = fVar.f42949i;
            int i12 = 0;
            if (i11 == 0) {
                try {
                    byte[] bArr2 = new byte[12];
                    randomAccessFile.seek(fVar.f42947g);
                    randomAccessFile.read(bArr2, 0, 12);
                    c cVar = new c();
                    e eVar = this.f44514b;
                    if (eVar == null) {
                        throw new ZipException("one of more of the input parameters were null in StandardDecryptor");
                    }
                    p112ib.b bVar = new p112ib.b();
                    cVar.f35686a = bVar;
                    byte[] bArr3 = eVar.f42928c;
                    byte b10 = bArr3[3];
                    byte b11 = bArr3[3];
                    byte b12 = (byte) ((b11 >> 8) & 255);
                    byte b13 = (byte) ((b11 >> 16) & 255);
                    byte b14 = (byte) ((b11 >> 24) & 255);
                    if (b12 > 0 || b13 > 0 || b14 > 0) {
                        throw new IllegalStateException("Invalid CRC in File Header");
                    }
                    char[] cArr = eVar.f42936l;
                    if (cArr == null || cArr.length <= 0) {
                        throw new ZipException("Wrong password!", 5);
                    }
                    int[] iArr = bVar.f36861a;
                    iArr[0] = 305419896;
                    iArr[1] = 591751049;
                    iArr[2] = 878082192;
                    for (char c10 : cArr) {
                        bVar.a((byte) (c10 & 255));
                    }
                    try {
                        byte b15 = bArr2[0];
                        while (i12 < 12) {
                            int i13 = iArr[2] | 2;
                            bVar.a((byte) (((byte) ((i13 * (i13 ^ 1)) >>> 8)) ^ b15));
                            i12++;
                            if (i12 != 12) {
                                b15 = bArr2[i12];
                            }
                        }
                        this.f44517e = cVar;
                        return;
                    } catch (Exception e10) {
                        throw new ZipException(e10);
                    }
                } catch (IOException e11) {
                    throw new ZipException((Exception) e11);
                } catch (Exception e12) {
                    throw new ZipException(e12);
                }
            }
            if (i11 != 99) {
                throw new ZipException("unsupported encryption method");
            }
            p137kb.a aVar = fVar.f42951l;
            if (aVar == null) {
                bArr = null;
            } else {
                try {
                    int i14 = aVar.f42917a;
                    if (i14 == 1) {
                        i10 = 8;
                    } else if (i14 == 2) {
                        i10 = 12;
                    } else {
                        if (i14 != 3) {
                            throw new ZipException("unable to determine salt length: invalid aes key strength");
                        }
                        i10 = 16;
                    }
                    bArr = new byte[i10];
                    randomAccessFile.seek(fVar.f42947g);
                    randomAccessFile.read(bArr);
                } catch (IOException e13) {
                    throw new ZipException((Exception) e13);
                }
            }
            try {
                byte[] bArr4 = new byte[2];
                randomAccessFile.read(bArr4);
                p087gb.a aVar2 = new p087gb.a();
                aVar2.j = 1;
                aVar2.f35685m = 0;
                aVar2.f35682i = null;
                aVar2.f35683k = new byte[16];
                aVar2.f35684l = new byte[16];
                p137kb.a aVar3 = fVar.f42951l;
                if (aVar3 == null) {
                    throw new ZipException("invalid aes extra data record - in init method of AESDecryptor");
                }
                int i15 = aVar3.f42917a;
                if (i15 == 1) {
                    aVar2.f35676c = 16;
                    aVar2.f35677d = 16;
                    aVar2.f35678e = 8;
                } else if (i15 == 2) {
                    aVar2.f35676c = 24;
                    aVar2.f35677d = 24;
                    aVar2.f35678e = 12;
                } else {
                    if (i15 != 3) {
                        throw new ZipException("invalid aes key strength for file: " + fVar.f42946f);
                    }
                    aVar2.f35676c = 32;
                    aVar2.f35677d = 32;
                    aVar2.f35678e = 16;
                }
                char[] cArr2 = fVar.j;
                if (cArr2 == null || cArr2.length <= 0) {
                    throw new ZipException("empty or null password provided for AES Decryptor");
                }
                try {
                    p099hb.a aVar4 = new p099hb.a();
                    aVar4.f36270c = "HmacSHA1";
                    aVar4.f36268a = bArr;
                    aVar4.f36269b = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                    C0858k c0858k = new C0858k();
                    c0858k.f8997a = aVar4;
                    c0858k.f8998b = null;
                    byte[] bArrA = c0858k.a(cArr2, aVar2.f35676c + aVar2.f35677d + 2);
                    int length = bArrA.length;
                    int i16 = aVar2.f35676c;
                    int i17 = aVar2.f35677d;
                    if (length != i16 + i17 + 2) {
                        throw new ZipException("invalid derived key");
                    }
                    byte[] bArr5 = new byte[i16];
                    aVar2.f35679f = bArr5;
                    aVar2.f35680g = new byte[i17];
                    aVar2.f35681h = new byte[2];
                    System.arraycopy(bArrA, 0, bArr5, 0, i16);
                    System.arraycopy(bArrA, aVar2.f35676c, aVar2.f35680g, 0, aVar2.f35677d);
                    System.arraycopy(bArrA, aVar2.f35676c + aVar2.f35677d, aVar2.f35681h, 0, 2);
                    byte[] bArr6 = aVar2.f35681h;
                    if (bArr6 == null) {
                        throw new ZipException("invalid derived password verifier for AES");
                    }
                    if (!Arrays.equals(bArr4, bArr6)) {
                        throw new ZipException("Wrong Password for file: " + fVar.f42946f, 5);
                    }
                    byte[] bArr7 = aVar2.f35679f;
                    p112ib.a aVar5 = new p112ib.a();
                    aVar5.f36855b = null;
                    int length2 = bArr7.length / 4;
                    if ((length2 != 4 && length2 != 6 && length2 != 8) || length2 * 4 != bArr7.length) {
                        throw new ZipException("invalid key length (not 128/192/256)");
                    }
                    aVar5.f36854a = length2 + 6;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length2 + 7, 4);
                    int i18 = 0;
                    while (i12 < bArr7.length) {
                        iArr2[i18 >> 2][i18 & 3] = (bArr7[i12] & 255) | ((bArr7[i12 + 1] & 255) << 8) | ((bArr7[i12 + 2] & 255) << 16) | (bArr7[i12 + 3] << 24);
                        i12 += 4;
                        i18++;
                    }
                    int i19 = (aVar5.f36854a + 1) << 2;
                    for (int i20 = length2; i20 < i19; i20++) {
                        int i21 = i20 - 1;
                        int iC = iArr2[i21 >> 2][i21 & 3];
                        int i22 = i20 % length2;
                        if (i22 == 0) {
                            iC = p112ib.a.c(p112ib.a.b(iC, 8)) ^ p112ib.a.f36852h[(i20 / length2) - 1];
                        } else if (length2 > 6 && i22 == 4) {
                            iC = p112ib.a.c(iC);
                        }
                        int i23 = i20 - length2;
                        iArr2[i20 >> 2][i20 & 3] = iC ^ iArr2[i23 >> 2][i23 & 3];
                    }
                    aVar5.f36855b = iArr2;
                    aVar2.f35674a = aVar5;
                    m mVar = new m("HmacSHA1");
                    aVar2.f35675b = mVar;
                    mVar.a(aVar2.f35680g);
                    this.f44517e = aVar2;
                } catch (Exception e14) {
                    throw new ZipException(e14);
                }
            } catch (IOException e15) {
                throw new ZipException((Exception) e15);
            }
        }
    }

    public final RandomAccessFile g() throws IOException {
        j jVar = this.f44513a;
        String str = jVar.f42967g;
        int i10 = this.f44515c;
        if (i10 != jVar.f42963c.f42920a) {
            if (i10 >= 9) {
                str = str.substring(0, str.lastIndexOf(".")) + ".z" + (this.f44515c + 1);
            } else {
                str = str.substring(0, str.lastIndexOf(".")) + ".z0" + (this.f44515c + 1);
            }
        }
        this.f44515c++;
        try {
            if (p159mb.b.a(str)) {
                return new RandomAccessFile(str, "r");
            }
            throw new IOException("zip split file does not exist: " + str);
        } catch (ZipException e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
