package R7;

import A8.f;
import O.e;
import P7.b;
import T7.c;
import T7.d;
import Z3.n;
import androidx.recyclerview.widget.t;
import com.braze.support.BrazeLogger;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: QRCodeWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:421:0x082e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0098  */
    /* JADX WARN: Code duplicated, block: B:455:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8 A[EDGE_INSN: B:51:0x00a8->B:54:0x00af BREAK  A[LOOP:0: B:35:0x0084->B:48:0x00a1]] */
    /* JADX WARN: Code duplicated, block: B:528:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad A[EDGE_INSN: B:53:0x00ad->B:54:0x00af BREAK  A[LOOP:0: B:35:0x0084->B:48:0x00a1]] */
    public final b a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        Mode mode;
        int i10;
        S7.a aVarA;
        int i11;
        int i12;
        byte[][] bArr;
        P7.a aVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        Q7.b bVar;
        Q7.b bVar2;
        Q7.b bVar3;
        int i13;
        char c11;
        Q7.b bVar4;
        int i14;
        int i15;
        int i16;
        int i17;
        CharacterSetECI characterSetECI;
        int i18;
        boolean z14;
        boolean z15;
        char cCharAt;
        int i19;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        EncodeHintType encodeHintType = EncodeHintType.f29209b;
        if (enumMap.containsKey(encodeHintType)) {
            errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.f29211d;
        int i20 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 4;
        EncodeHintType encodeHintType3 = EncodeHintType.f29210c;
        boolean zContainsKey = enumMap.containsKey(encodeHintType3);
        String string = zContainsKey ? enumMap.get(encodeHintType3).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string);
        Mode mode2 = Mode.BYTE;
        int[] iArr = c.f6044a;
        if (!zEquals) {
            i18 = 0;
            z14 = false;
            z15 = false;
            while (true) {
                if (i18 < str.length()) {
                    cCharAt = str.charAt(i18);
                    if (cCharAt >= '0') {
                        if (cCharAt < '`') {
                            i19 = iArr[cCharAt];
                        } else {
                            i19 = -1;
                        }
                        if (i19 != -1) {
                            z14 = true;
                        }
                    } else {
                        if (cCharAt < '`') {
                            i19 = iArr[cCharAt];
                        } else {
                            i19 = -1;
                        }
                        if (i19 != -1) {
                            z14 = true;
                        }
                    }
                    i18++;
                } else {
                    if (z14) {
                        mode = Mode.ALPHANUMERIC;
                        break;
                    }
                    if (z15) {
                        mode = Mode.NUMERIC;
                        break;
                    }
                }
                mode = mode2;
                break;
            }
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                i18 = 0;
                z14 = false;
                z15 = false;
                while (true) {
                    if (i18 < str.length()) {
                        cCharAt = str.charAt(i18);
                        if (cCharAt >= '0' || cCharAt > '9') {
                            if (cCharAt < '`') {
                                i19 = iArr[cCharAt];
                            } else {
                                i19 = -1;
                            }
                            if (i19 != -1) {
                                z14 = true;
                            }
                        } else {
                            z15 = true;
                        }
                        i18++;
                    } else {
                        if (z14) {
                            mode = Mode.ALPHANUMERIC;
                            break;
                        }
                        if (z15) {
                            mode = Mode.NUMERIC;
                            break;
                        }
                    }
                    mode = mode2;
                    break;
                }
            }
            int i21 = 0;
            while (true) {
                if (i21 >= length) {
                    mode = Mode.KANJI;
                } else {
                    int i22 = bytes[i21] & 255;
                    if ((i22 < 129 || i22 > 159) && (i22 < 224 || i22 > 235)) {
                        i18 = 0;
                        z14 = false;
                        z15 = false;
                        while (true) {
                            if (i18 < str.length()) {
                                cCharAt = str.charAt(i18);
                                if (cCharAt >= '0') {
                                    if (cCharAt < '`') {
                                        i19 = iArr[cCharAt];
                                    } else {
                                        i19 = -1;
                                    }
                                    if (i19 != -1) {
                                        z14 = true;
                                    }
                                } else {
                                    if (cCharAt < '`') {
                                        i19 = iArr[cCharAt];
                                    } else {
                                        i19 = -1;
                                    }
                                    if (i19 != -1) {
                                        z14 = true;
                                    }
                                }
                                i18++;
                            } else {
                                if (z14) {
                                    mode = Mode.ALPHANUMERIC;
                                    break;
                                }
                                if (z15) {
                                    mode = Mode.NUMERIC;
                                    break;
                                }
                            }
                            mode = mode2;
                            break;
                        }
                    }
                    i21 += 2;
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        P7.a aVar2 = new P7.a();
        if (mode == mode2 && zContainsKey && (characterSetECI = (CharacterSetECI) CharacterSetECI.f29217c.get(string)) != null) {
            aVar2.b(Mode.ECI.a(), 4);
            aVar2.b(characterSetECI.a(), 8);
        }
        EncodeHintType encodeHintType4 = EncodeHintType.f29213f;
        if (enumMap.containsKey(encodeHintType4) && Boolean.valueOf(enumMap.get(encodeHintType4).toString()).booleanValue()) {
            i10 = 4;
            aVar2.b(Mode.FNC1_FIRST_POSITION.a(), 4);
        } else {
            i10 = 4;
        }
        aVar2.b(mode.a(), i10);
        P7.a aVar3 = new P7.a();
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 1) {
            int length2 = str.length();
            int i23 = 0;
            while (i23 < length2) {
                int iCharAt = str.charAt(i23) - '0';
                int i24 = i23 + 2;
                if (i24 < length2) {
                    aVar3.b(((str.charAt(i23 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i24) - '0'), 10);
                    i23 += 3;
                } else {
                    i23++;
                    if (i23 < length2) {
                        aVar3.b((iCharAt * 10) + (str.charAt(i23) - '0'), 7);
                        i23 = i24;
                    } else {
                        aVar3.b(iCharAt, 4);
                    }
                }
            }
        } else if (iOrdinal == 2) {
            int length3 = str.length();
            int i25 = 0;
            while (i25 < length3) {
                char cCharAt2 = str.charAt(i25);
                if (cCharAt2 < '`') {
                    i15 = iArr[cCharAt2];
                    i14 = -1;
                } else {
                    i14 = -1;
                    i15 = -1;
                }
                if (i15 == i14) {
                    throw new WriterException();
                }
                int i26 = i25 + 1;
                if (i26 < length3) {
                    char cCharAt3 = str.charAt(i26);
                    int i27 = cCharAt3 < '`' ? iArr[cCharAt3] : i14;
                    if (i27 == i14) {
                        throw new WriterException();
                    }
                    aVar3.b((i15 * 45) + i27, 11);
                    i25 += 2;
                } else {
                    aVar3.b(i15, 6);
                    i25 = i26;
                }
            }
        } else if (iOrdinal == 4) {
            try {
                for (byte b10 : str.getBytes(string)) {
                    aVar3.b(b10, 8);
                }
            } catch (UnsupportedEncodingException e10) {
                throw new WriterException(e10);
            }
        } else {
            if (iOrdinal != 6) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            try {
                byte[] bytes2 = str.getBytes("Shift_JIS");
                int length4 = bytes2.length;
                for (int i28 = 0; i28 < length4; i28 += 2) {
                    int i29 = ((bytes2[i28] & 255) << 8) | (bytes2[i28 + 1] & 255);
                    int i30 = 33088;
                    if (i29 >= 33088 && i29 <= 40956) {
                        i17 = i29 - i30;
                        i16 = -1;
                    } else if (i29 < 57408 || i29 > 60351) {
                        i16 = -1;
                        i17 = -1;
                    } else {
                        i30 = 49472;
                        i17 = i29 - i30;
                        i16 = -1;
                    }
                    if (i17 == i16) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    aVar3.b(((i17 >> 8) * 192) + (i17 & 255), 13);
                }
            } catch (UnsupportedEncodingException e11) {
                throw new WriterException(e11);
            }
        }
        EncodeHintType encodeHintType5 = EncodeHintType.f29212e;
        if (enumMap.containsKey(encodeHintType5)) {
            aVarA = S7.a.a(Integer.parseInt(enumMap.get(encodeHintType5).toString()));
            int iB = mode.b(aVarA) + aVar2.f4952c + aVar3.f4952c;
            S7.a.b bVar5 = aVarA.f5692b[errorCorrectionLevelValueOf.ordinal()];
            int i31 = 0;
            for (S7.a.C0080a c0080a : bVar5.f5697b) {
                i31 += c0080a.f5694a;
            }
            if (!(aVarA.f5693c - (i31 * bVar5.f5696a) >= (iB + 7) / 8)) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            int iB2 = mode.b(S7.a.a(1)) + aVar2.f4952c + aVar3.f4952c;
            int i32 = 1;
            while (true) {
                if (i32 > 40) {
                    throw new WriterException("Data too big");
                }
                S7.a aVarA2 = S7.a.a(i32);
                int i33 = aVarA2.f5693c;
                S7.a.b bVar6 = aVarA2.f5692b[errorCorrectionLevelValueOf.ordinal()];
                int i34 = 0;
                for (S7.a.C0080a c0080a2 : bVar6.f5697b) {
                    i34 += c0080a2.f5694a;
                }
                if (i33 - (i34 * bVar6.f5696a) >= (iB2 + 7) / 8) {
                    int iB3 = mode.b(aVarA2) + aVar2.f4952c + aVar3.f4952c;
                    int i35 = 40;
                    int i36 = 1;
                    while (true) {
                        if (i36 > i35) {
                            throw new WriterException("Data too big");
                        }
                        S7.a aVarA3 = S7.a.a(i36);
                        int i37 = aVarA3.f5693c;
                        S7.a.b bVar7 = aVarA3.f5692b[errorCorrectionLevelValueOf.ordinal()];
                        int i38 = 0;
                        for (S7.a.C0080a c0080a3 : bVar7.f5697b) {
                            i38 += c0080a3.f5694a;
                        }
                        if (i37 - (i38 * bVar7.f5696a) >= (iB3 + 7) / 8) {
                            aVarA = aVarA3;
                            break;
                        }
                        i36++;
                        errorCorrectionLevelValueOf = errorCorrectionLevelValueOf;
                        i20 = i20;
                        i35 = 40;
                    }
                } else {
                    i32++;
                    errorCorrectionLevelValueOf = errorCorrectionLevelValueOf;
                    i20 = i20;
                }
            }
        }
        P7.a aVar4 = new P7.a();
        int i39 = aVar2.f4952c;
        aVar4.c(aVar4.f4952c + i39);
        for (int i40 = 0; i40 < i39; i40++) {
            aVar4.a(aVar2.d(i40));
        }
        int iE = mode == mode2 ? aVar3.e() : str.length();
        int iB4 = mode.b(aVarA);
        int i41 = 1 << iB4;
        if (iE >= i41) {
            throw new WriterException(iE + " is bigger than " + (i41 - 1));
        }
        aVar4.b(iE, iB4);
        int i42 = aVar3.f4952c;
        aVar4.c(aVar4.f4952c + i42);
        for (int i43 = 0; i43 < i42; i43++) {
            aVar4.a(aVar3.d(i43));
        }
        S7.a.b bVar8 = aVarA.f5692b[errorCorrectionLevelValueOf.ordinal()];
        int i44 = 0;
        for (S7.a.C0080a c0080a4 : bVar8.f5697b) {
            i44 += c0080a4.f5694a;
        }
        int i45 = i44 * bVar8.f5696a;
        int i46 = aVarA.f5693c;
        int i47 = i46 - i45;
        int i48 = i47 << 3;
        if (aVar4.f4952c > i48) {
            throw new WriterException("data bits cannot fit in the QR Code" + aVar4.f4952c + " > " + i48);
        }
        for (int i49 = 0; i49 < 4 && aVar4.f4952c < i48; i49++) {
            aVar4.a(false);
        }
        int i50 = aVar4.f4952c & 7;
        if (i50 > 0) {
            while (i50 < 8) {
                aVar4.a(false);
                i50++;
            }
        }
        int iE2 = i47 - aVar4.e();
        for (int i51 = 0; i51 < iE2; i51++) {
            aVar4.b((i51 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar4.f4952c != i48) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i52 = 0;
        for (S7.a.C0080a c0080a5 : bVar8.f5697b) {
            i52 += c0080a5.f5694a;
        }
        if (aVar4.e() != i47) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i52);
        int i53 = 0;
        int i54 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i53 < i52) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (i53 >= i52) {
                throw new WriterException("Block ID too large");
            }
            int i55 = i46 % i52;
            int i56 = i52 - i55;
            int i57 = i46 / i52;
            int i58 = i57 + 1;
            int i59 = i47 / i52;
            int i60 = i59 + 1;
            int i61 = i20;
            int i62 = i57 - i59;
            ErrorCorrectionLevel errorCorrectionLevel = errorCorrectionLevelValueOf;
            int i63 = i58 - i60;
            if (i62 != i63) {
                throw new WriterException("EC bytes mismatch");
            }
            S7.a aVar5 = aVarA;
            if (i52 != i56 + i55) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i46 != ((i60 + i63) * i55) + ((i59 + i62) * i56)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i53 < i56) {
                c10 = 0;
                iArr2[0] = i59;
                iArr3[0] = i62;
            } else {
                c10 = 0;
                iArr2[0] = i60;
                iArr3[0] = i63;
            }
            int i64 = iArr2[c10];
            byte[] bArr2 = new byte[i64];
            int i65 = i54 << 3;
            int i66 = 0;
            while (i66 < i64) {
                int i67 = i46;
                int i68 = i52;
                int i69 = i65;
                int i70 = 0;
                int i71 = 0;
                for (int i72 = 8; i70 < i72; i72 = 8) {
                    if (aVar4.d(i69)) {
                        i71 = (1 << (7 - i70)) | i71;
                    }
                    i69++;
                    i70++;
                }
                bArr2[i66] = (byte) i71;
                i66++;
                i65 = i69;
                i46 = i67;
                i52 = i68;
            }
            int i73 = i46;
            int i74 = i52;
            int i75 = iArr3[0];
            int[] iArr4 = new int[i64 + i75];
            for (int i76 = 0; i76 < i64; i76++) {
                iArr4[i76] = bArr2[i76] & 255;
            }
            Q7.c cVar = new Q7.c(Q7.a.f5114g);
            if (i75 == 0) {
                throw new IllegalArgumentException("No error correction bytes");
            }
            int length5 = iArr4.length - i75;
            if (length5 <= 0) {
                throw new IllegalArgumentException("No data bytes provided");
            }
            ArrayList arrayList2 = (ArrayList) cVar.f5124c;
            int size = arrayList2.size();
            P7.a aVar6 = aVar4;
            Q7.a aVar7 = (Q7.a) cVar.f5123b;
            if (i75 >= size) {
                Q7.b bVar9 = (Q7.b) n.f(1, arrayList2);
                int size2 = arrayList2.size();
                while (size2 <= i75) {
                    int i77 = i47;
                    int i78 = i53;
                    int[] iArr5 = {1, aVar7.f5115a[(size2 - 1) + aVar7.f5120f]};
                    if (iArr5[0] == 0) {
                        i13 = i54;
                        int i79 = 1;
                        while (i79 < 2 && iArr5[i79] == 0) {
                            i79++;
                        }
                        if (i79 == 2) {
                            c11 = 0;
                            iArr5 = new int[]{0};
                        } else {
                            c11 = 0;
                            int i80 = 2 - i79;
                            int[] iArr6 = new int[i80];
                            System.arraycopy(iArr5, i79, iArr6, 0, i80);
                            iArr5 = iArr6;
                        }
                    } else {
                        i13 = i54;
                        c11 = 0;
                    }
                    bVar9.getClass();
                    Q7.b bVar10 = bVar9;
                    Q7.a aVar8 = bVar10.f5121a;
                    if (!aVar8.equals(aVar7)) {
                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                    }
                    int[] iArr7 = bVar10.f5122b;
                    if (iArr7[c11] == 0 || iArr5[c11] == 0) {
                        bVar4 = aVar8.f5117c;
                    } else {
                        int length6 = iArr7.length;
                        int length7 = iArr5.length;
                        int[] iArr8 = new int[(length6 + length7) - 1];
                        int i81 = 0;
                        while (i81 < length6) {
                            int i82 = length6;
                            int i83 = iArr7[i81];
                            int[] iArr9 = iArr7;
                            int i84 = 0;
                            while (i84 < length7) {
                                int i85 = i81 + i84;
                                iArr8[i85] = iArr8[i85] ^ aVar8.a(i83, iArr5[i84]);
                                i84++;
                                length7 = length7;
                            }
                            i81++;
                            length6 = i82;
                            iArr7 = iArr9;
                        }
                        bVar4 = new Q7.b(aVar8, iArr8);
                    }
                    arrayList2.add(bVar4);
                    size2++;
                    i53 = i78;
                    i47 = i77;
                    i54 = i13;
                    iArr2 = iArr2;
                    iMax2 = iMax2;
                    iMax = iMax;
                    bVar9 = bVar4;
                    arrayList = arrayList;
                }
            }
            ArrayList arrayList3 = arrayList;
            int i86 = i47;
            int i87 = i53;
            int i88 = i54;
            int i89 = iMax;
            int i90 = iMax2;
            int[] iArr10 = iArr2;
            Q7.b bVar11 = (Q7.b) arrayList2.get(i75);
            int[] iArr11 = new int[length5];
            System.arraycopy(iArr4, 0, iArr11, 0, length5);
            if (length5 == 0) {
                throw new IllegalArgumentException();
            }
            if (length5 > 1 && iArr11[0] == 0) {
                int i91 = 1;
                while (i91 < length5 && iArr11[i91] == 0) {
                    i91++;
                }
                if (i91 == length5) {
                    iArr11 = new int[]{0};
                } else {
                    int i92 = length5 - i91;
                    int[] iArr12 = new int[i92];
                    System.arraycopy(iArr11, i91, iArr12, 0, i92);
                    iArr11 = iArr12;
                }
            }
            if (i75 < 0) {
                throw new IllegalArgumentException();
            }
            int length8 = iArr11.length;
            int[] iArr13 = new int[length8 + i75];
            for (int i93 = 0; i93 < length8; i93++) {
                iArr13[i93] = aVar7.a(iArr11[i93], 1);
            }
            Q7.b bVar12 = new Q7.b(aVar7, iArr13);
            if (!aVar7.equals(bVar11.f5121a)) {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            int[] iArr14 = bVar11.f5122b;
            if (iArr14[0] == 0) {
                throw new IllegalArgumentException("Divide by 0");
            }
            int i94 = iArr14[(iArr14.length - 1) - bVar11.b()];
            if (i94 == 0) {
                throw new ArithmeticException();
            }
            int i95 = aVar7.f5115a[(aVar7.f5118d - aVar7.f5116b[i94]) - 1];
            Q7.b bVar13 = aVar7.f5117c;
            Q7.b bVarA = bVar13;
            while (bVar12.b() >= bVar11.b()) {
                int[] iArr15 = bVar12.f5122b;
                if (iArr15[0] == 0) {
                    break;
                }
                int iB5 = bVar12.b() - bVar11.b();
                int iA = aVar7.a(iArr15[(iArr15.length - 1) - bVar12.b()], i95);
                if (iB5 < 0) {
                    throw new IllegalArgumentException();
                }
                Q7.a aVar9 = bVar11.f5121a;
                if (iA == 0) {
                    bVar2 = aVar9.f5117c;
                    bVar = bVar13;
                } else {
                    int length9 = iArr14.length;
                    int[] iArr16 = new int[length9 + iB5];
                    int i96 = 0;
                    while (i96 < length9) {
                        iArr16[i96] = aVar9.a(iArr14[i96], iA);
                        i96++;
                        bVar13 = bVar13;
                    }
                    bVar = bVar13;
                    bVar2 = new Q7.b(aVar9, iArr16);
                }
                if (iB5 < 0) {
                    throw new IllegalArgumentException();
                }
                if (iA == 0) {
                    bVar3 = bVar;
                } else {
                    int[] iArr17 = new int[iB5 + 1];
                    iArr17[0] = iA;
                    bVar3 = new Q7.b(aVar7, iArr17);
                }
                bVarA = bVarA.a(bVar3);
                bVar12 = bVar12.a(bVar2);
                bVar11 = bVar11;
                i95 = i95;
                bVar13 = bVar;
            }
            int[] iArr18 = new Q7.b[]{bVarA, bVar12}[1].f5122b;
            int length10 = i75 - iArr18.length;
            for (int i97 = 0; i97 < length10; i97++) {
                iArr4[length5 + i97] = 0;
            }
            System.arraycopy(iArr18, 0, iArr4, length5 + length10, iArr18.length);
            byte[] bArr3 = new byte[i75];
            for (int i98 = 0; i98 < i75; i98++) {
                bArr3[i98] = (byte) iArr4[i64 + i98];
            }
            arrayList3.add(new T7.a(bArr2, bArr3));
            iMax = Math.max(i89, i64);
            iMax2 = Math.max(i90, i75);
            i54 = i88 + iArr10[0];
            i53 = i87 + 1;
            i52 = i74;
            arrayList = arrayList3;
            errorCorrectionLevelValueOf = errorCorrectionLevel;
            aVarA = aVar5;
            i46 = i73;
            aVar4 = aVar6;
            i20 = i61;
            i47 = i86;
        }
        S7.a aVar10 = aVarA;
        ErrorCorrectionLevel errorCorrectionLevel2 = errorCorrectionLevelValueOf;
        int i99 = i20;
        ArrayList arrayList4 = arrayList;
        int i100 = i46;
        int i101 = iMax;
        int i102 = iMax2;
        if (i47 != i54) {
            throw new WriterException("Data bytes does not match offset");
        }
        P7.a aVar11 = new P7.a();
        for (int i103 = 0; i103 < i101; i103++) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                byte[] bArr4 = ((T7.a) it.next()).f6039a;
                if (i103 < bArr4.length) {
                    aVar11.b(bArr4[i103], 8);
                }
            }
        }
        for (int i104 = 0; i104 < i102; i104++) {
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                byte[] bArr5 = ((T7.a) it2.next()).f6040b;
                if (i104 < bArr5.length) {
                    aVar11.b(bArr5[i104], 8);
                }
            }
        }
        if (i100 != aVar11.e()) {
            StringBuilder sbE = f.e(i100, "Interleaving error: ", " and ");
            sbE.append(aVar11.e());
            sbE.append(" differ.");
            throw new WriterException(sbE.toString());
        }
        int i105 = (aVar10.f5691a * 4) + 17;
        T7.b bVar14 = new T7.b(i105, i105);
        int i106 = BrazeLogger.SUPPRESS;
        int i107 = 0;
        int i108 = -1;
        while (true) {
            i11 = bVar14.f6042b;
            i12 = bVar14.f6043c;
            if (i107 >= 8) {
                break;
            }
            ErrorCorrectionLevel errorCorrectionLevel3 = errorCorrectionLevel2;
            d.a(aVar11, errorCorrectionLevel3, aVar10, i107, bVar14);
            int iH = e.h(bVar14, false) + e.h(bVar14, true);
            int i109 = 0;
            int i110 = 0;
            while (true) {
                int i111 = i12 - 1;
                bArr = bVar14.f6041a;
                if (i109 >= i111) {
                    break;
                }
                byte[] bArr6 = bArr[i109];
                int i112 = i110;
                int i113 = 0;
                while (i113 < i11 - 1) {
                    byte b11 = bArr6[i113];
                    int i114 = i113 + 1;
                    T7.b bVar15 = bVar14;
                    if (b11 == bArr6[i114]) {
                        byte[] bArr7 = bArr[i109 + 1];
                        if (b11 == bArr7[i113] && b11 == bArr7[i114]) {
                            i112++;
                        }
                    }
                    bVar14 = bVar15;
                    i113 = i114;
                }
                i109++;
                i110 = i112;
            }
            T7.b bVar16 = bVar14;
            int i115 = (i110 * 3) + iH;
            int i116 = 0;
            for (int i117 = 0; i117 < i12; i117++) {
                int i118 = 0;
                while (i118 < i11) {
                    byte[] bArr8 = bArr[i117];
                    int i119 = i118 + 6;
                    if (i119 < i11) {
                        aVar = aVar11;
                        byte b12 = 1;
                        if (bArr8[i118] == 1 && bArr8[i118 + 1] == 0 && bArr8[i118 + 2] == 1 && bArr8[i118 + 3] == 1 && bArr8[i118 + 4] == 1 && bArr8[i118 + 5] == 0 && bArr8[i119] == 1) {
                            int iMax3 = Math.max(i118 - 4, 0);
                            int iMin = Math.min(i118, bArr8.length);
                            while (true) {
                                if (iMax3 >= iMin) {
                                    z12 = true;
                                    break;
                                }
                                int i120 = iMin;
                                if (bArr8[iMax3] == b12) {
                                    z12 = false;
                                    break;
                                }
                                iMax3++;
                                iMin = i120;
                                b12 = 1;
                            }
                            if (z12) {
                                i116++;
                            } else {
                                int iMax4 = Math.max(i118 + 7, 0);
                                int iMin2 = Math.min(i118 + 11, bArr8.length);
                                while (true) {
                                    if (iMax4 >= iMin2) {
                                        z13 = true;
                                        break;
                                    }
                                    byte[] bArr9 = bArr8;
                                    if (bArr8[iMax4] == 1) {
                                        z13 = false;
                                        break;
                                    }
                                    iMax4++;
                                    bArr8 = bArr9;
                                }
                                if (z13) {
                                    i116++;
                                }
                            }
                        }
                    } else {
                        aVar = aVar11;
                    }
                    int i121 = i117 + 6;
                    if (i121 < i12) {
                        byte b13 = 1;
                        if (bArr[i117][i118] == 1 && bArr[i117 + 1][i118] == 0 && bArr[i117 + 2][i118] == 1 && bArr[i117 + 3][i118] == 1 && bArr[i117 + 4][i118] == 1 && bArr[i117 + 5][i118] == 0 && bArr[i121][i118] == 1) {
                            int iMax5 = Math.max(i117 - 4, 0);
                            int iMin3 = Math.min(i117, bArr.length);
                            while (true) {
                                if (iMax5 >= iMin3) {
                                    z10 = true;
                                    break;
                                }
                                if (bArr[iMax5][i118] == b13) {
                                    z10 = false;
                                    break;
                                }
                                iMax5++;
                                b13 = 1;
                            }
                            if (z10) {
                                i116++;
                            } else {
                                int iMax6 = Math.max(i117 + 7, 0);
                                int iMin4 = Math.min(i117 + 11, bArr.length);
                                while (true) {
                                    if (iMax6 >= iMin4) {
                                        z11 = true;
                                        break;
                                    }
                                    if (bArr[iMax6][i118] == 1) {
                                        z11 = false;
                                        break;
                                    }
                                    iMax6++;
                                }
                                if (z11) {
                                    i116++;
                                }
                            }
                        }
                    }
                    i118++;
                    aVar11 = aVar;
                }
            }
            P7.a aVar12 = aVar11;
            int i122 = (i116 * 40) + i115;
            int i123 = 0;
            for (int i124 = 0; i124 < i12; i124++) {
                byte[] bArr10 = bArr[i124];
                for (int i125 = 0; i125 < i11; i125++) {
                    if (bArr10[i125] == 1) {
                        i123++;
                    }
                }
            }
            int i126 = i12 * i11;
            int iAbs = (((Math.abs((i123 << 1) - i126) * 10) / i126) * 10) + i122;
            if (iAbs < i106) {
                i106 = iAbs;
                i108 = i107;
            }
            i107++;
            bVar14 = bVar16;
            aVar11 = aVar12;
            errorCorrectionLevel2 = errorCorrectionLevel3;
        }
        d.a(aVar11, errorCorrectionLevel2, aVar10, i108, bVar14);
        int i127 = i99 << 1;
        int i128 = i11 + i127;
        int i129 = i127 + i12;
        int iMax7 = Math.max(t.d.DEFAULT_DRAG_ANIMATION_DURATION, i128);
        int iMax8 = Math.max(t.d.DEFAULT_DRAG_ANIMATION_DURATION, i129);
        int iMin5 = Math.min(iMax7 / i128, iMax8 / i129);
        int i130 = (iMax7 - (i11 * iMin5)) / 2;
        int i131 = (iMax8 - (i12 * iMin5)) / 2;
        b bVar17 = new b(iMax7, iMax8);
        int i132 = 0;
        while (i132 < i12) {
            int i133 = i130;
            int i134 = 0;
            while (i134 < i11) {
                if (bVar14.a(i134, i132) == 1) {
                    if (i131 < 0 || i133 < 0) {
                        throw new IllegalArgumentException("Left and top must be nonnegative");
                    }
                    if (iMin5 <= 0 || iMin5 <= 0) {
                        throw new IllegalArgumentException("Height and width must be at least 1");
                    }
                    int i135 = i133 + iMin5;
                    int i136 = i131 + iMin5;
                    if (i136 > bVar17.f4954c || i135 > bVar17.f4953b) {
                        throw new IllegalArgumentException("The region must fit inside the matrix");
                    }
                    for (int i137 = i131; i137 < i136; i137++) {
                        int i138 = bVar17.f4955d * i137;
                        int i139 = i133;
                        while (i139 < i135) {
                            int i140 = (i139 / 32) + i138;
                            T7.b bVar18 = bVar14;
                            int[] iArr19 = bVar17.f4956e;
                            iArr19[i140] = iArr19[i140] | (1 << (i139 & 31));
                            i139++;
                            bVar14 = bVar18;
                        }
                    }
                }
                i134++;
                i133 += iMin5;
                bVar14 = bVar14;
            }
            i132++;
            i131 += iMin5;
        }
        return bVar17;
    }
}
