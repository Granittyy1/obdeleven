package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: ProfileTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f19472a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f19473b = {112, 114, 109, 0};

    public static byte[] a(p201q2.b[] bVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (p201q2.b bVar : bVarArr) {
            length += ((((bVar.f46016g * 2) + 7) & (-8)) / 8) + (bVar.f46014e * 2) + b(bVar.f46010a, bArr, bVar.f46011b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f46015f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, p201q2.e.f46023c)) {
            int length2 = bVarArr.length;
            while (i10 < length2) {
                p201q2.b bVar2 = bVarArr[i10];
                k(byteArrayOutputStream, bVar2, b(bVar2.f46010a, bArr, bVar2.f46011b));
                j(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (p201q2.b bVar3 : bVarArr) {
                k(byteArrayOutputStream, bVar3, b(bVar3.f46010a, bArr, bVar3.f46011b));
            }
            int length3 = bVarArr.length;
            while (i10 < length3) {
                j(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, byte[] bArr, String str2) {
        byte[] bArr2 = p201q2.e.f46025e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = p201q2.e.f46024d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return Q8.d.a(C4.b.e(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i10) throws IOException {
        int[] iArr = new int[i10];
        int iD = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iD += (int) p201q2.c.d(byteArrayInputStream, 2);
            iArr[i11] = iD;
        }
        return iArr;
    }

    public static p201q2.b[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, p201q2.b[] bVarArr) throws IOException {
        byte[] bArr3 = p201q2.e.f46026f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, p201q2.e.f46027g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iD = (int) p201q2.c.d(fileInputStream, 2);
            byte[] bArrC = p201q2.c.c(fileInputStream, (int) p201q2.c.d(fileInputStream, 4), (int) p201q2.c.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                p201q2.b[] bVarArrF = f(byteArrayInputStream, bArr2, iD, bVarArr);
                byteArrayInputStream.close();
                return bVarArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(p201q2.e.f46021a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iD2 = (int) p201q2.c.d(fileInputStream, 1);
        byte[] bArrC2 = p201q2.c.c(fileInputStream, (int) p201q2.c.d(fileInputStream, 4), (int) p201q2.c.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            p201q2.b[] bVarArrE = e(byteArrayInputStream2, iD2, bVarArr);
            byteArrayInputStream2.close();
            return bVarArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static p201q2.b[] e(ByteArrayInputStream byteArrayInputStream, int i10, p201q2.b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new p201q2.b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iD = (int) p201q2.c.d(byteArrayInputStream, 2);
            iArr[i11] = (int) p201q2.c.d(byteArrayInputStream, 2);
            strArr[i11] = new String(p201q2.c.b(byteArrayInputStream, iD), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            p201q2.b bVar = bVarArr[i12];
            if (!bVar.f46011b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            bVar.f46014e = i13;
            bVar.f46017h = c(byteArrayInputStream, i13);
        }
        return bVarArr;
    }

    public static p201q2.b[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, p201q2.b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new p201q2.b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            p201q2.c.d(byteArrayInputStream, 2);
            String str = new String(p201q2.c.b(byteArrayInputStream, (int) p201q2.c.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jD = p201q2.c.d(byteArrayInputStream, 4);
            int iD = (int) p201q2.c.d(byteArrayInputStream, 2);
            p201q2.b bVar = null;
            if (bVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i12 = 0; i12 < bVarArr.length; i12++) {
                    if (bVarArr[i12].f46011b.equals(strSubstring)) {
                        bVar = bVarArr[i12];
                        break;
                    }
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f46013d = jD;
            int[] iArrC = c(byteArrayInputStream, iD);
            if (Arrays.equals(bArr, p201q2.e.f46025e)) {
                bVar.f46014e = iD;
                bVar.f46017h = iArrC;
            }
        }
        return bVarArr;
    }

    public static p201q2.b[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, p201q2.e.f46022b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iD = (int) p201q2.c.d(fileInputStream, 1);
        byte[] bArrC = p201q2.c.c(fileInputStream, (int) p201q2.c.d(fileInputStream, 4), (int) p201q2.c.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            p201q2.b[] bVarArrH = h(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return bVarArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static p201q2.b[] h(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new p201q2.b[0];
        }
        p201q2.b[] bVarArr = new p201q2.b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iD = (int) p201q2.c.d(byteArrayInputStream, 2);
            int iD2 = (int) p201q2.c.d(byteArrayInputStream, 2);
            bVarArr[i11] = new p201q2.b(str, new String(p201q2.c.b(byteArrayInputStream, iD), StandardCharsets.UTF_8), p201q2.c.d(byteArrayInputStream, 4), iD2, (int) p201q2.c.d(byteArrayInputStream, 4), (int) p201q2.c.d(byteArrayInputStream, 4), new int[iD2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            p201q2.b bVar = bVarArr[i12];
            int iAvailable = byteArrayInputStream.available() - bVar.f46015f;
            int iD3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = bVar.f46018i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iD3 += (int) p201q2.c.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iD3), 1);
                for (int iD4 = (int) p201q2.c.d(byteArrayInputStream, 2); iD4 > 0; iD4--) {
                    p201q2.c.d(byteArrayInputStream, 2);
                    int iD5 = (int) p201q2.c.d(byteArrayInputStream, 1);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            p201q2.c.d(byteArrayInputStream, 1);
                            for (int iD6 = (int) p201q2.c.d(byteArrayInputStream, 1); iD6 > 0; iD6--) {
                                p201q2.c.d(byteArrayInputStream, 2);
                            }
                            iD5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f46017h = c(byteArrayInputStream, bVar.f46014e);
            int i13 = bVar.f46016g;
            BitSet bitSetValueOf = BitSet.valueOf(p201q2.c.b(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bitSetValueOf.get(i14) ? 2 : 0;
                if (bitSetValueOf.get(i14 + i13)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
        }
        return bVarArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, p201q2.b[] bVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = p201q2.e.f46021a;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = p201q2.e.f46022b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(bVarArr, bArr3);
                p201q2.c.e(byteArrayOutputStream, bVarArr.length, 1);
                p201q2.c.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = p201q2.c.a(bArrA);
                p201q2.c.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = p201q2.e.f46024d;
            if (Arrays.equals(bArr, bArr4)) {
                p201q2.c.e(byteArrayOutputStream, bVarArr.length, 1);
                for (p201q2.b bVar : bVarArr) {
                    int size = bVar.f46018i.size() * 4;
                    String strB = b(bVar.f46010a, bArr4, bVar.f46011b);
                    Charset charset = StandardCharsets.UTF_8;
                    p201q2.c.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    p201q2.c.f(byteArrayOutputStream, bVar.f46017h.length);
                    p201q2.c.e(byteArrayOutputStream, size, 4);
                    p201q2.c.e(byteArrayOutputStream, bVar.f46012c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = bVar.f46018i.keySet().iterator();
                    while (it.hasNext()) {
                        p201q2.c.f(byteArrayOutputStream, it.next().intValue());
                        p201q2.c.f(byteArrayOutputStream, 0);
                    }
                    for (int i11 : bVar.f46017h) {
                        p201q2.c.f(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = p201q2.e.f46023c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(bVarArr, bArr5);
                p201q2.c.e(byteArrayOutputStream, bVarArr.length, 1);
                p201q2.c.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = p201q2.c.a(bArrA3);
                p201q2.c.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = p201q2.e.f46025e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            p201q2.c.f(byteArrayOutputStream, bVarArr.length);
            for (p201q2.b bVar2 : bVarArr) {
                String strB2 = b(bVar2.f46010a, bArr6, bVar2.f46011b);
                Charset charset2 = StandardCharsets.UTF_8;
                p201q2.c.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = bVar2.f46018i;
                p201q2.c.f(byteArrayOutputStream, treeMap.size());
                p201q2.c.f(byteArrayOutputStream, bVar2.f46017h.length);
                p201q2.c.e(byteArrayOutputStream, bVar2.f46012c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    p201q2.c.f(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i12 : bVar2.f46017h) {
                    p201q2.c.f(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            p201q2.c.f(byteArrayOutputStream2, bVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (p201q2.b bVar3 : bVarArr) {
                p201q2.c.e(byteArrayOutputStream2, bVar3.f46012c, 4);
                p201q2.c.e(byteArrayOutputStream2, bVar3.f46013d, 4);
                p201q2.c.e(byteArrayOutputStream2, bVar3.f46016g, 4);
                String strB3 = b(bVar3.f46010a, bArr2, bVar3.f46011b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                p201q2.c.f(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            f fVar = new f(FileSectionType.f19458b, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(fVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < bVarArr.length) {
                try {
                    p201q2.b bVar4 = bVarArr[i15];
                    p201q2.c.f(byteArrayOutputStream3, i15);
                    p201q2.c.f(byteArrayOutputStream3, bVar4.f46014e);
                    i16 = i16 + 4 + (bVar4.f46014e * 2);
                    int[] iArr = bVar4.f46017h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i17;
                    while (i17 < length3) {
                        int i19 = iArr[i17];
                        p201q2.c.f(byteArrayOutputStream3, i19 - i18);
                        i17++;
                        i18 = i19;
                    }
                    i15++;
                    i10 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            f fVar2 = new f(FileSectionType.f19459c, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < bVarArr.length) {
                try {
                    p201q2.b bVar5 = bVarArr[i20];
                    Iterator<Map.Entry<Integer, Integer>> it3 = bVar5.f46018i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream5, iIntValue, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream6, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            p201q2.c.f(byteArrayOutputStream4, i20);
                            int length4 = byteArray3.length + i13 + byteArray4.length;
                            int i22 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            p201q2.c.e(byteArrayOutputStream4, length4, 4);
                            p201q2.c.f(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i21 = i22 + length4;
                            i20++;
                            arrayList3 = arrayList4;
                            i13 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            f fVar3 = new f(FileSectionType.f19460d, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(fVar3);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList2.size() * 16));
            p201q2.c.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                f fVar4 = (f) arrayList2.get(i23);
                p201q2.c.e(byteArrayOutputStream, fVar4.f19481a.a(), 4);
                p201q2.c.e(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = fVar4.f19482b;
                if (fVar4.f19483c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = p201q2.c.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    p201q2.c.e(byteArrayOutputStream, bArrA5.length, 4);
                    p201q2.c.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    p201q2.c.e(byteArrayOutputStream, bArr7.length, 4);
                    p201q2.c.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, p201q2.b bVar) throws IOException {
        m(byteArrayOutputStream, bVar);
        int[] iArr = bVar.f46017h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            p201q2.c.f(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        int i13 = bVar.f46016g;
        byte[] bArr = new byte[(((i13 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : bVar.f46018i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i13;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, p201q2.b bVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        p201q2.c.f(byteArrayOutputStream, str.getBytes(charset).length);
        p201q2.c.f(byteArrayOutputStream, bVar.f46014e);
        p201q2.c.e(byteArrayOutputStream, bVar.f46015f, 4);
        p201q2.c.e(byteArrayOutputStream, bVar.f46012c, 4);
        p201q2.c.e(byteArrayOutputStream, bVar.f46016g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i10, p201q2.b bVar) throws IOException {
        int iBitCount = Integer.bitCount(i10 & (-2));
        int i11 = bVar.f46016g;
        byte[] bArr = new byte[(((iBitCount * i11) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : bVar.f46018i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, p201q2.b bVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f46018i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                p201q2.c.f(byteArrayOutputStream, iIntValue - i10);
                p201q2.c.f(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }
}
