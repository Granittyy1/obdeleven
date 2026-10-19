package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.R;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1976i1<T> implements InterfaceC1994o1<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f26187l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Unsafe f26188m = D1.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f26189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f26190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1967f1 f26193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f26195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26197i;
    public final C2023y1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2019x0 f26198k;

    public C1976i1(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC1967f1 interfaceC1967f1, int[] iArr2, int i12, int i13, C2023y1 c2023y1, C2019x0 c2019x0) {
        this.f26189a = iArr;
        this.f26190b = objArr;
        this.f26191c = i10;
        this.f26192d = i11;
        boolean z10 = false;
        if (c2019x0 != null && (interfaceC1967f1 instanceof F0)) {
            z10 = true;
        }
        this.f26194f = z10;
        this.f26195g = iArr2;
        this.f26196h = i12;
        this.f26197i = i13;
        this.j = c2023y1;
        this.f26198k = c2019x0;
        this.f26193e = interfaceC1967f1;
    }

    public static long A(Object obj, long j) {
        return ((Long) D1.i(obj, j)).longValue();
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbC = B6.a.c("Field ", str, " for ", name, " not found. Known fields are ");
            sbC.append(string);
            throw new RuntimeException(sbC.toString(), e10);
        }
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof I0) {
            return ((I0) obj).p();
        }
        return true;
    }

    public static C2020x1 t(Object obj) {
        I0 i10 = (I0) obj;
        C2020x1 c2020x1 = i10.zzc;
        if (c2020x1 != C2020x1.f26298f) {
            return c2020x1;
        }
        C2020x1 c2020x1B = C2020x1.b();
        i10.zzc = c2020x1B;
        return c2020x1B;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0267  */
    /* JADX WARN: Code duplicated, block: B:126:0x026a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0281  */
    /* JADX WARN: Code duplicated, block: B:131:0x0285  */
    /* JADX WARN: Code duplicated, block: B:170:0x034a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0396  */
    /* JADX WARN: Code duplicated, block: B:188:0x039e  */
    public static C1976i1 u(InterfaceC1958c1 interfaceC1958c1, C2023y1 c2023y1, C2019x0 c2019x0) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        Field fieldF;
        int i31;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field fieldF2;
        int i37;
        Object obj2;
        Field fieldF3;
        int i38;
        char cCharAt10;
        int i39;
        char cCharAt11;
        int i40;
        char cCharAt12;
        int i41;
        char cCharAt13;
        if (!(interfaceC1958c1 instanceof C1991n1)) {
            throw null;
        }
        C1991n1 c1991n1 = (C1991n1) interfaceC1958c1;
        String strB = c1991n1.b();
        int length = strB.length();
        char c10 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i10 = i42 + 1;
                if (strB.charAt(i42) < 55296) {
                    break;
                }
                i42 = i10;
            }
        } else {
            i10 = 1;
        }
        int i43 = i10 + 1;
        int iCharAt3 = strB.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i44 = iCharAt3 & 8191;
            int i45 = 13;
            while (true) {
                i41 = i43 + 1;
                cCharAt13 = strB.charAt(i43);
                if (cCharAt13 < 55296) {
                    break;
                }
                i44 |= (cCharAt13 & 8191) << i45;
                i45 += 13;
                i43 = i41;
            }
            iCharAt3 = i44 | (cCharAt13 << i45);
            i43 = i41;
        }
        if (iCharAt3 == 0) {
            i12 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            i14 = 0;
            i13 = 0;
            iArr = f26187l;
            i15 = 0;
        } else {
            int i46 = i43 + 1;
            int iCharAt4 = strB.charAt(i43);
            if (iCharAt4 >= 55296) {
                int i47 = iCharAt4 & 8191;
                int i48 = 13;
                while (true) {
                    i23 = i46 + 1;
                    cCharAt8 = strB.charAt(i46);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i23;
                }
                iCharAt4 = i47 | (cCharAt8 << i48);
                i46 = i23;
            }
            int i49 = i46 + 1;
            int iCharAt5 = strB.charAt(i46);
            if (iCharAt5 >= 55296) {
                int i50 = iCharAt5 & 8191;
                int i51 = 13;
                while (true) {
                    i22 = i49 + 1;
                    cCharAt7 = strB.charAt(i49);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i22;
                }
                iCharAt5 = i50 | (cCharAt7 << i51);
                i49 = i22;
            }
            int i52 = i49 + 1;
            int iCharAt6 = strB.charAt(i49);
            if (iCharAt6 >= 55296) {
                int i53 = iCharAt6 & 8191;
                int i54 = 13;
                while (true) {
                    i21 = i52 + 1;
                    cCharAt6 = strB.charAt(i52);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i21;
                }
                iCharAt6 = i53 | (cCharAt6 << i54);
                i52 = i21;
            }
            int i55 = i52 + 1;
            int iCharAt7 = strB.charAt(i52);
            if (iCharAt7 >= 55296) {
                int i56 = iCharAt7 & 8191;
                int i57 = 13;
                while (true) {
                    i20 = i55 + 1;
                    cCharAt5 = strB.charAt(i55);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i20;
                }
                iCharAt7 = i56 | (cCharAt5 << i57);
                i55 = i20;
            }
            int i58 = i55 + 1;
            iCharAt = strB.charAt(i55);
            if (iCharAt >= 55296) {
                int i59 = iCharAt & 8191;
                int i60 = 13;
                while (true) {
                    i19 = i58 + 1;
                    cCharAt4 = strB.charAt(i58);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i19;
                }
                iCharAt = i59 | (cCharAt4 << i60);
                i58 = i19;
            }
            int i61 = i58 + 1;
            iCharAt2 = strB.charAt(i58);
            if (iCharAt2 >= 55296) {
                int i62 = iCharAt2 & 8191;
                int i63 = 13;
                while (true) {
                    i18 = i61 + 1;
                    cCharAt3 = strB.charAt(i61);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt3 & 8191) << i63;
                    i63 += 13;
                    i61 = i18;
                }
                iCharAt2 = i62 | (cCharAt3 << i63);
                i61 = i18;
            }
            int i64 = i61 + 1;
            int iCharAt8 = strB.charAt(i61);
            if (iCharAt8 >= 55296) {
                int i65 = iCharAt8 & 8191;
                int i66 = 13;
                while (true) {
                    i17 = i64 + 1;
                    cCharAt2 = strB.charAt(i64);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt2 & 8191) << i66;
                    i66 += 13;
                    i64 = i17;
                }
                iCharAt8 = i65 | (cCharAt2 << i66);
                i64 = i17;
            }
            int i67 = i64 + 1;
            int iCharAt9 = strB.charAt(i64);
            if (iCharAt9 >= 55296) {
                int i68 = iCharAt9 & 8191;
                int i69 = 13;
                while (true) {
                    i16 = i67 + 1;
                    cCharAt = strB.charAt(i67);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i68 |= (cCharAt & 8191) << i69;
                    i69 += 13;
                    i67 = i16;
                }
                iCharAt9 = i68 | (cCharAt << i69);
                i67 = i16;
            }
            int i70 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i11 = iCharAt6;
            i12 = i70;
            i13 = iCharAt9;
            i14 = iCharAt7;
            i15 = iCharAt4;
            i43 = i67;
            iArr = iArr2;
        }
        Unsafe unsafe = f26188m;
        Object[] objArrC = c1991n1.c();
        Class<?> cls = c1991n1.a().getClass();
        int i71 = i13 + iCharAt2;
        int i72 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i72];
        int i73 = i13;
        int i74 = i71;
        int i75 = 0;
        int i76 = 0;
        while (i43 < length) {
            int i77 = i43 + 1;
            int iCharAt10 = strB.charAt(i43);
            if (iCharAt10 >= c10) {
                int i78 = iCharAt10 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i40 = i79 + 1;
                    cCharAt12 = strB.charAt(i79);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i78 |= (cCharAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i40;
                }
                iCharAt10 = i78 | (cCharAt12 << i80);
                i24 = i40;
            } else {
                i24 = i77;
            }
            int i81 = i24 + 1;
            int iCharAt11 = strB.charAt(i24);
            if (iCharAt11 >= c10) {
                int i82 = iCharAt11 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i39 = i83 + 1;
                    cCharAt11 = strB.charAt(i83);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i82 |= (cCharAt11 & 8191) << i84;
                    i84 += 13;
                    i83 = i39;
                }
                iCharAt11 = i82 | (cCharAt11 << i84);
                i25 = i39;
            } else {
                i25 = i81;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = iCharAt11 & 255;
            int i86 = length;
            int i87 = iCharAt11 & 2048;
            int i88 = i14;
            if (i85 >= 51) {
                int i89 = i25 + 1;
                int iCharAt12 = strB.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i90 = iCharAt12 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i38 = i91 + 1;
                        cCharAt10 = strB.charAt(i91);
                        i26 = i11;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i90 |= (cCharAt10 & 8191) << i92;
                        i92 += 13;
                        i91 = i38;
                        i11 = i26;
                    }
                    iCharAt12 = i90 | (cCharAt10 << i92);
                    i34 = i38;
                } else {
                    i26 = i11;
                    i34 = i89;
                }
                int i93 = i85 - 51;
                int i94 = i34;
                if (i93 == 9 || i93 == 17) {
                    i35 = i12 + 1;
                    int i95 = i76 / 3;
                    objArr[i95 + i95 + 1] = objArrC[i12];
                } else {
                    if (i93 == 12) {
                        if (c1991n1.y() == 1 || i87 != 0) {
                            i35 = i12 + 1;
                            int i96 = i76 / 3;
                            objArr[i96 + i96 + 1] = objArrC[i12];
                        } else {
                            i87 = 0;
                        }
                    }
                    i36 = iCharAt12 + iCharAt12;
                    obj = objArrC[i36];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArrC[i36] = fieldF2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                    i37 = i36 + 1;
                    obj2 = objArrC[i37];
                    int i97 = i87;
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArrC[i37] = fieldF3;
                    }
                    i27 = i12;
                    i28 = i94;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                    i29 = 0;
                    strB = strB;
                    c1991n1 = c1991n1;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i30 = i97;
                }
                i12 = i35;
                i36 = iCharAt12 + iCharAt12;
                obj = objArrC[i36];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArrC[i36] = fieldF2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF2);
                i37 = i36 + 1;
                obj2 = objArrC[i37];
                int i98 = i87;
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArrC[i37] = fieldF3;
                }
                i27 = i12;
                i28 = i94;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                i29 = 0;
                strB = strB;
                c1991n1 = c1991n1;
                iObjectFieldOffset = iObjectFieldOffset4;
                i30 = i98;
            } else {
                i26 = i11;
                i27 = i12 + 1;
                Field fieldF4 = F(cls, (String) objArrC[i12]);
                if (i85 == 9 || i85 == 17) {
                    int i99 = i76 / 3;
                    objArr[i99 + i99 + 1] = fieldF4.getType();
                } else {
                    if (i85 != 27) {
                        if (i85 == 49) {
                            i33 = i12 + 2;
                            i32 = 1;
                        } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                            c1991n1 = c1991n1;
                            if (c1991n1.y() == 1 || i87 != 0) {
                                i33 = i12 + 2;
                                int i100 = i76 / 3;
                                objArr[i100 + i100 + 1] = objArrC[i27];
                                i27 = i33;
                            } else {
                                i87 = 0;
                            }
                        } else if (i85 == 50) {
                            int i101 = i12 + 2;
                            int i102 = i73 + 1;
                            iArr[i73] = i76;
                            int i103 = i76 / 3;
                            int i104 = i103 + i103;
                            objArr[i104] = objArrC[i27];
                            if (i87 != 0) {
                                i27 = i12 + 3;
                                objArr[i104 + 1] = objArrC[i101];
                                i73 = i102;
                                c1991n1 = c1991n1;
                            } else {
                                i27 = i101;
                                i73 = i102;
                                i87 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i85 > 17) {
                            i28 = i25;
                            i29 = 0;
                        } else {
                            int i105 = i25 + 1;
                            int iCharAt13 = strB.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i106 = iCharAt13 & 8191;
                                int i107 = 13;
                                while (true) {
                                    i31 = i105 + 1;
                                    cCharAt9 = strB.charAt(i105);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i106 |= (cCharAt9 & 8191) << i107;
                                    i107 += 13;
                                    i105 = i31;
                                }
                                iCharAt13 = i106 | (cCharAt9 << i107);
                                i105 = i31;
                            }
                            int i108 = (iCharAt13 / 32) + i15 + i15;
                            Object obj3 = objArrC[i108];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArrC[i108] = fieldF;
                            }
                            i28 = i105;
                            i29 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i74] = iObjectFieldOffset;
                            i74++;
                        }
                        i30 = i87;
                    } else {
                        i32 = 1;
                        i33 = i12 + 2;
                    }
                    int i109 = i76 / 3;
                    objArr[i109 + i109 + i32] = objArrC[i27];
                    i27 = i33;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i28 = i25;
                        i29 = 0;
                    } else {
                        i28 = i25;
                        i29 = 0;
                    }
                    if (i85 >= 18) {
                        iArr[i74] = iObjectFieldOffset;
                        i74++;
                    }
                    i30 = i87;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i28 = i25;
                    i29 = 0;
                } else {
                    i28 = i25;
                    i29 = 0;
                }
                if (i85 >= 18) {
                    iArr[i74] = iObjectFieldOffset;
                    i74++;
                }
                i30 = i87;
            }
            int i110 = i76 + 1;
            iArr3[i76] = iCharAt10;
            int i111 = i76 + 2;
            Class<?> cls2 = cls;
            iArr3[i110] = iObjectFieldOffset | (i30 != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i85 << 20);
            i76 += 3;
            iArr3[i111] = (i29 << 20) | iObjectFieldOffset2;
            strB = strB;
            i12 = i27;
            i43 = i28;
            length = i86;
            i14 = i88;
            cls = cls2;
            c1991n1 = c1991n1;
            i11 = i26;
            c10 = 55296;
        }
        return new C1976i1(iArr3, objArr, i11, i14, c1991n1.a(), iArr, i13, i71, c2023y1, c2019x0);
    }

    public static int v(Object obj, long j) {
        return ((Integer) D1.i(obj, j)).intValue();
    }

    public static int x(int i10) {
        return (i10 >>> 20) & 255;
    }

    public final L0 B(int i10) {
        int i11 = i10 / 3;
        return (L0) this.f26190b[i11 + i11 + 1];
    }

    public final InterfaceC1994o1 C(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f26190b;
        InterfaceC1994o1 interfaceC1994o1 = (InterfaceC1994o1) objArr[i12];
        if (interfaceC1994o1 != null) {
            return interfaceC1994o1;
        }
        InterfaceC1994o1 interfaceC1994o1A = C1985l1.f26210c.a((Class) objArr[i12 + 1]);
        objArr[i12] = interfaceC1994o1A;
        return interfaceC1994o1A;
    }

    public final Object D(int i10, Object obj) {
        InterfaceC1994o1 interfaceC1994o1C = C(i10);
        int iY = y(i10) & 1048575;
        if (!o(i10, obj)) {
            return interfaceC1994o1C.z();
        }
        Object object = f26188m.getObject(obj, iY);
        if (q(object)) {
            return object;
        }
        I0 i0Z = interfaceC1994o1C.z();
        if (object != null) {
            interfaceC1994o1C.g(i0Z, object);
        }
        return i0Z;
    }

    public final Object E(int i10, int i11, Object obj) {
        InterfaceC1994o1 interfaceC1994o1C = C(i11);
        if (!r(i10, i11, obj)) {
            return interfaceC1994o1C.z();
        }
        Object object = f26188m.getObject(obj, y(i11) & 1048575);
        if (q(object)) {
            return object;
        }
        I0 i0Z = interfaceC1994o1C.z();
        if (object != null) {
            interfaceC1994o1C.g(i0Z, object);
        }
        return i0Z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final void a(Object obj, F1 f10) throws IOException {
        Map.Entry entry;
        int i10;
        int i11;
        int i12;
        int i13;
        Map.Entry entry2;
        boolean z10;
        boolean z11;
        ?? r10 = 1;
        if (this.f26194f) {
            A0 a10 = ((F0) obj).zzb;
            if (a10.f26103a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) a10.b().next();
            }
        } else {
            entry = null;
        }
        Unsafe unsafe = f26188m;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f26189a;
            if (i16 >= iArr.length) {
                Map.Entry entry3 = entry;
                if (entry3 == null) {
                    ((I0) obj).zzc.d(f10);
                    return;
                } else {
                    throw null;
                }
            }
            int iY = y(i16);
            int iX = x(iY);
            int i17 = iArr[i16];
            if (iX <= 17) {
                int i18 = iArr[i16 + 2];
                int i19 = i18 & 1048575;
                if (i19 != i14) {
                    i15 = i19 == 1048575 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                int i20 = r10 << (i18 >>> 20);
                i11 = i15;
                i12 = i20;
                i10 = i14;
            } else {
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iY & 1048575;
            switch (iX) {
                case 0:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).i(i17, D1.d(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 1:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).m(D1.e(obj, j), i17);
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 2:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).p(i17, unsafe.getLong(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 3:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).e(i17, unsafe.getLong(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 4:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).o(i17, unsafe.getInt(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 5:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).l(i17, unsafe.getLong(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 6:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).k(i17, unsafe.getInt(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 7:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).f(i17, D1.t(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 8:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C2004s0) f10).f26249a.F(i17, (String) object);
                        } else {
                            ((C2004s0) f10).g(i17, (zzei) object);
                        }
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 9:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).q(i17, unsafe.getObject(obj, j), C(i16));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 10:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).g(i17, (zzei) unsafe.getObject(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 11:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).d(i17, unsafe.getInt(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 12:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).j(i17, unsafe.getInt(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 13:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).r(i17, unsafe.getInt(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 14:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).s(i17, unsafe.getLong(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 15:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i13, i11, i12)) {
                        ((C2004s0) f10).a(i17, unsafe.getInt(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 16:
                    i13 = i10;
                    entry2 = entry;
                    if (p(obj, i16, i10, i11, i12)) {
                        ((C2004s0) f10).b(i17, unsafe.getLong(obj, j));
                    }
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 17:
                    if (p(obj, i16, i10, i11, i12)) {
                        ((C2004s0) f10).n(i17, unsafe.getObject(obj, j), C(i16));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 18:
                    z10 = false;
                    C1997p1.u(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 19:
                    z10 = false;
                    C1997p1.y(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 20:
                    z10 = false;
                    C1997p1.A(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 21:
                    z10 = false;
                    C1997p1.d(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 22:
                    z10 = false;
                    C1997p1.z(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 23:
                    z10 = false;
                    C1997p1.x(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 24:
                    z10 = false;
                    C1997p1.w(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 25:
                    z10 = false;
                    C1997p1.t(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 26:
                    int i21 = iArr[i16];
                    List list = (List) unsafe.getObject(obj, j);
                    C2023y1 c2023y1 = C1997p1.f26239a;
                    if (list != null && !list.isEmpty()) {
                        ((C2004s0) f10).c(i21, list);
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 27:
                    int i22 = iArr[i16];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC1994o1 interfaceC1994o1C = C(i16);
                    C2023y1 c2023y2 = C1997p1.f26239a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23 += r10) {
                            ((C2004s0) f10).q(i22, list2.get(i23), interfaceC1994o1C);
                        }
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 28:
                    int i24 = iArr[i16];
                    List list3 = (List) unsafe.getObject(obj, j);
                    C2023y1 c2023y3 = C1997p1.f26239a;
                    if (list3 != null && !list3.isEmpty()) {
                        ((C2004s0) f10).h(i24, list3);
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 29:
                    z11 = false;
                    C1997p1.c(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    z11 = false;
                    C1997p1.v(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    z11 = false;
                    C1997p1.B(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    z11 = false;
                    C1997p1.C(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    z11 = false;
                    C1997p1.a(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    z11 = false;
                    C1997p1.b(iArr[i16], (List) unsafe.getObject(obj, j), f10, false);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    C1997p1.u(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    C1997p1.y(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    C1997p1.A(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    C1997p1.d(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    C1997p1.z(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    C1997p1.x(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    C1997p1.w(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    C1997p1.t(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    C1997p1.c(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case 44:
                    C1997p1.v(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    C1997p1.B(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    C1997p1.C(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    C1997p1.a(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    C1997p1.b(iArr[i16], (List) unsafe.getObject(obj, j), f10, r10);
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    int i25 = iArr[i16];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC1994o1 interfaceC1994o1C2 = C(i16);
                    C2023y1 c2023y4 = C1997p1.f26239a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26 += r10) {
                            ((C2004s0) f10).n(i25, list4.get(i26), interfaceC1994o1C2);
                        }
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        int i27 = i16 / 3;
                        throw null;
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).i(i17, ((Double) D1.i(obj, j)).doubleValue());
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).m(((Float) D1.i(obj, j)).floatValue(), i17);
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).p(i17, A(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).e(i17, A(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).o(i17, v(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).l(i17, A(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).k(i17, v(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).f(i17, ((Boolean) D1.i(obj, j)).booleanValue());
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i17, i16, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((C2004s0) f10).f26249a.F(i17, (String) object2);
                        } else {
                            ((C2004s0) f10).g(i17, (zzei) object2);
                        }
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).q(i17, unsafe.getObject(obj, j), C(i16));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).g(i17, (zzei) unsafe.getObject(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).d(i17, v(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).j(i17, v(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).r(i17, v(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).s(i17, A(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).a(i17, v(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).b(i17, A(obj, j));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (r(i17, i16, obj)) {
                        ((C2004s0) f10).n(i17, unsafe.getObject(obj, j), C(i16));
                    }
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
                default:
                    i13 = i10;
                    entry2 = entry;
                    i16 += 3;
                    i15 = i11;
                    entry = entry2;
                    i14 = i13;
                    r10 = 1;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final void b(Object obj) {
        if (!q(obj)) {
            return;
        }
        int i10 = 0;
        if (obj instanceof I0) {
            I0 i11 = (I0) obj;
            i11.o();
            i11.zza = 0;
            i11.m();
        }
        while (true) {
            int[] iArr = this.f26189a;
            if (i10 >= iArr.length) {
                this.j.getClass();
                C2023y1.a(obj);
                if (this.f26194f) {
                    this.f26198k.a(obj);
                    return;
                }
                return;
            }
            int iY = y(i10);
            int i12 = 1048575 & iY;
            int iX = x(iY);
            long j = i12;
            if (iX != 9) {
                if (iX != 60 && iX != 68) {
                    switch (iX) {
                        case 17:
                            if (o(i10, obj)) {
                                C(i10).b(f26188m.getObject(obj, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        case 44:
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            ((N0) D1.i(obj, j)).x();
                            break;
                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                            Unsafe unsafe = f26188m;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzgf) object).c();
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (r(iArr[i10], i10, obj)) {
                    C(i10).b(f26188m.getObject(obj, j));
                }
            } else if (o(i10, obj)) {
                C(i10).b(f26188m.getObject(obj, j));
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:139:0x0390  */
    /* JADX WARN: Code duplicated, block: B:196:0x04de  */
    /* JADX WARN: Code duplicated, block: B:223:0x05c3 A[PHI: r13 r18
      0x05c3: PHI (r13v16 int) = 
      (r13v1 int)
      (r13v1 int)
      (r13v10 int)
      (r13v1 int)
      (r13v11 int)
      (r13v1 int)
      (r13v1 int)
      (r13v12 int)
      (r13v1 int)
      (r13v13 int)
      (r13v1 int)
      (r13v14 int)
      (r13v15 int)
      (r13v1 int)
      (r13v1 int)
     binds: [B:243:0x06a6, B:240:0x067a, B:241:0x067c, B:237:0x0657, B:238:0x0659, B:234:0x0633, B:231:0x0619, B:232:0x061b, B:228:0x05ff, B:229:0x0601, B:225:0x05d8, B:226:0x05da, B:222:0x05c1, B:220:0x05ac, B:216:0x0584] A[DONT_GENERATE, DONT_INLINE]
      0x05c3: PHI (r18v9 int) = 
      (r18v0 int)
      (r18v1 int)
      (r18v1 int)
      (r18v2 int)
      (r18v2 int)
      (r18v3 int)
      (r18v4 int)
      (r18v4 int)
      (r18v5 int)
      (r18v5 int)
      (r18v6 int)
      (r18v6 int)
      (r18v7 int)
      (r18v8 int)
      (r18v10 int)
     binds: [B:243:0x06a6, B:240:0x067a, B:241:0x067c, B:237:0x0657, B:238:0x0659, B:234:0x0633, B:231:0x0619, B:232:0x061b, B:228:0x05ff, B:229:0x0601, B:225:0x05d8, B:226:0x05da, B:222:0x05c1, B:220:0x05ac, B:216:0x0584] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final int c(I0 i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int iR;
        int iS;
        int i15;
        int i16;
        int iM;
        int iR2;
        int iS2;
        int i17;
        int iR3;
        int size;
        int iQ;
        int iR4;
        int iR5;
        int iR6;
        int iJ;
        int iR7;
        int iR8;
        int iT;
        int iR9;
        int iS3;
        Unsafe unsafe = f26188m;
        int i18 = 1048575;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        int iA = 0;
        while (true) {
            int[] iArr = this.f26189a;
            if (i21 >= iArr.length) {
                int iA2 = i10.zzc.a() + iA;
                if (!this.f26194f) {
                    return iA2;
                }
                C2000q1 c2000q1 = ((F0) i10).zzb.f26103a;
                if (c2000q1.b() > 0) {
                    C2002r1 c2002r1F = c2000q1.f(0);
                    A0.a((InterfaceC2025z0) c2002r1F.a(), c2002r1F.getValue());
                    throw null;
                }
                Iterator<T> it = c2000q1.c().iterator();
                if (!it.hasNext()) {
                    return iA2;
                }
                Map.Entry entry = (Map.Entry) it.next();
                A0.a((InterfaceC2025z0) entry.getKey(), entry.getValue());
                throw null;
            }
            int iY = y(i21);
            int iX = x(iY);
            int i22 = iArr[i21];
            int i23 = iArr[i21 + 2];
            int i24 = i23 & i18;
            if (iX <= 17) {
                if (i24 != i19) {
                    i20 = i24 == i18 ? 0 : unsafe.getInt(i10, i24);
                    i19 = i24;
                }
                i11 = i19;
                i12 = i20;
                i13 = 1 << (i23 >>> 20);
            } else {
                i11 = i19;
                i12 = i20;
                i13 = 0;
            }
            int i25 = iY & i18;
            if (iX >= zzfa.f26346b.a()) {
                zzfa.f26347c.getClass();
            }
            long j = i25;
            switch (iX) {
                case 0:
                    i14 = i21;
                    if (p(i10, i14, i11, i12, i13)) {
                        iA = B1.a.a(i22 << 3, 8, iA);
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 1:
                    i14 = i21;
                    if (p(i10, i14, i11, i12, i13)) {
                        iA = B1.a.a(i22 << 3, 4, iA);
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 2:
                    i14 = i21;
                    if (p(i10, i14, i11, i12, i13)) {
                        long j10 = unsafe.getLong(i10, j);
                        iR = AbstractC2001r0.r(i22 << 3);
                        iS = AbstractC2001r0.s(j10);
                        iA += iS + iR;
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 3:
                    i14 = i21;
                    if (p(i10, i14, i11, i12, i13)) {
                        long j11 = unsafe.getLong(i10, j);
                        iR = AbstractC2001r0.r(i22 << 3);
                        iS = AbstractC2001r0.s(j11);
                        iA += iS + iR;
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 4:
                    i14 = i21;
                    if (p(i10, i14, i11, i12, i13)) {
                        long j12 = unsafe.getInt(i10, j);
                        iR = AbstractC2001r0.r(i22 << 3);
                        iS = AbstractC2001r0.s(j12);
                        iA += iS + iR;
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 5:
                    i14 = i21;
                    if (p(i10, i14, i11, i12, i13)) {
                        iA = B1.a.a(i22 << 3, 8, iA);
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 6:
                    i14 = i21;
                    if (p(i10, i14, i11, i12, i13)) {
                        iA = B1.a.a(i22 << 3, 4, iA);
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 7:
                    i14 = i21;
                    if (p(i10, i14, i11, i12, i13)) {
                        iA = B1.a.a(i22 << 3, 1, iA);
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 8:
                    int i26 = i21;
                    i14 = i26;
                    if (p(i10, i26, i11, i12, i13)) {
                        int i27 = i22 << 3;
                        Object object = unsafe.getObject(i10, j);
                        if (object instanceof zzei) {
                            int iR10 = AbstractC2001r0.r(i27);
                            int iG = ((zzei) object).g();
                            iA += AbstractC2001r0.r(iG) + iG + iR10;
                        } else {
                            iR = AbstractC2001r0.r(i27);
                            iS = AbstractC2001r0.q((String) object);
                            iA += iS + iR;
                        }
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 9:
                    i15 = i21;
                    if (p(i10, i15, i11, i12, i13)) {
                        i16 = i15;
                        iM = C1997p1.m(i22, unsafe.getObject(i10, j), C(i16));
                        iA += iM;
                        i14 = i16;
                    } else {
                        i14 = i15;
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 10:
                    i15 = i21;
                    if (p(i10, i15, i11, i12, i13)) {
                        zzei zzeiVar = (zzei) unsafe.getObject(i10, j);
                        int iR11 = AbstractC2001r0.r(i22 << 3);
                        int iG2 = zzeiVar.g();
                        iA += AbstractC2001r0.r(iG2) + iG2 + iR11;
                    }
                    i14 = i15;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 11:
                    i15 = i21;
                    if (p(i10, i15, i11, i12, i13)) {
                        iA = B1.a.a(unsafe.getInt(i10, j), AbstractC2001r0.r(i22 << 3), iA);
                    }
                    i14 = i15;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 12:
                    i15 = i21;
                    if (p(i10, i15, i11, i12, i13)) {
                        long j13 = unsafe.getInt(i10, j);
                        iR2 = AbstractC2001r0.r(i22 << 3);
                        iS2 = AbstractC2001r0.s(j13);
                        iA += iS2 + iR2;
                    }
                    i14 = i15;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 13:
                    i15 = i21;
                    if (p(i10, i15, i11, i12, i13)) {
                        iA = B1.a.a(i22 << 3, 4, iA);
                    }
                    i14 = i15;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 14:
                    i15 = i21;
                    if (p(i10, i15, i11, i12, i13)) {
                        iA = B1.a.a(i22 << 3, 8, iA);
                    }
                    i14 = i15;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 15:
                    i15 = i21;
                    if (p(i10, i15, i11, i12, i13)) {
                        int i28 = unsafe.getInt(i10, j);
                        iA = B1.a.a((i28 >> 31) ^ (i28 + i28), AbstractC2001r0.r(i22 << 3), iA);
                    }
                    i14 = i15;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 16:
                    int i29 = i21;
                    i15 = i29;
                    if (p(i10, i29, i11, i12, i13)) {
                        long j14 = unsafe.getLong(i10, j);
                        iR2 = AbstractC2001r0.r(i22 << 3);
                        iS2 = AbstractC2001r0.s((j14 >> 63) ^ (j14 + j14));
                        iA += iS2 + iR2;
                    }
                    i14 = i15;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 17:
                    i15 = i21;
                    if (p(i10, i21, i11, i12, i13)) {
                        i16 = i15;
                        iM = AbstractC2001r0.t(i22, (InterfaceC1967f1) unsafe.getObject(i10, j), C(i16));
                        iA += iM;
                        i14 = i16;
                    } else {
                        i14 = i15;
                    }
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 18:
                    i17 = C1997p1.i(i22, (List) unsafe.getObject(i10, j));
                    iA += i17;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 19:
                    i17 = C1997p1.g(i22, (List) unsafe.getObject(i10, j));
                    iA += i17;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y1 = C1997p1.f26239a;
                    if (list.size() == 0) {
                        iR3 = 0;
                    } else {
                        iR3 = (AbstractC2001r0.r(i22 << 3) * list.size()) + C1997p1.l(list);
                    }
                    iA += iR3;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y2 = C1997p1.f26239a;
                    size = list2.size();
                    if (size == 0) {
                        iR5 = 0;
                    } else {
                        iQ = C1997p1.q(list2);
                        iR4 = AbstractC2001r0.r(i22 << 3);
                        iR5 = (iR4 * size) + iQ;
                    }
                    iA += iR5;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y3 = C1997p1.f26239a;
                    size = list3.size();
                    if (size == 0) {
                        iR5 = 0;
                    } else {
                        iQ = C1997p1.k(list3);
                        iR4 = AbstractC2001r0.r(i22 << 3);
                        iR5 = (iR4 * size) + iQ;
                    }
                    iA += iR5;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 23:
                    i17 = C1997p1.i(i22, (List) unsafe.getObject(i10, j));
                    iA += i17;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 24:
                    i17 = C1997p1.g(i22, (List) unsafe.getObject(i10, j));
                    iA += i17;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y4 = C1997p1.f26239a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iR3 = 0;
                    } else {
                        iR3 = (AbstractC2001r0.r(i22 << 3) + 1) * size2;
                    }
                    iA += iR3;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y5 = C1997p1.f26239a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iR5 = 0;
                    } else {
                        iR5 = AbstractC2001r0.r(i22 << 3) * size3;
                        if (list5 instanceof T0) {
                            T0 t8 = (T0) list5;
                            for (int i30 = 0; i30 < size3; i30++) {
                                Object objA = t8.a();
                                if (objA instanceof zzei) {
                                    int iG3 = ((zzei) objA).g();
                                    iR5 = B1.a.a(iG3, iG3, iR5);
                                } else {
                                    iR5 = AbstractC2001r0.q((String) objA) + iR5;
                                }
                            }
                        } else {
                            for (int i31 = 0; i31 < size3; i31++) {
                                Object obj = list5.get(i31);
                                if (obj instanceof zzei) {
                                    int iG4 = ((zzei) obj).g();
                                    iR5 = B1.a.a(iG4, iG4, iR5);
                                } else {
                                    iR5 = AbstractC2001r0.q((String) obj) + iR5;
                                }
                            }
                        }
                    }
                    iA += iR5;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(i10, j);
                    InterfaceC1994o1 interfaceC1994o1C = C(i21);
                    C2023y1 c2023y6 = C1997p1.f26239a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iR6 = 0;
                    } else {
                        iR6 = AbstractC2001r0.r(i22 << 3) * size4;
                        for (int i32 = 0; i32 < size4; i32++) {
                            Object obj2 = list6.get(i32);
                            if (obj2 instanceof S0) {
                                int iA3 = ((S0) obj2).a();
                                iR6 = B1.a.a(iA3, iA3, iR6);
                            } else {
                                iR6 = AbstractC2001r0.p((InterfaceC1967f1) obj2, interfaceC1994o1C) + iR6;
                            }
                        }
                    }
                    iA += iR6;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y7 = C1997p1.f26239a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iR5 = 0;
                    } else {
                        iR5 = AbstractC2001r0.r(i22 << 3) * size5;
                        for (int i33 = 0; i33 < list7.size(); i33++) {
                            int iG5 = ((zzei) list7.get(i33)).g();
                            iR5 = B1.a.a(iG5, iG5, iR5);
                        }
                    }
                    iA += iR5;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y8 = C1997p1.f26239a;
                    size = list8.size();
                    if (size == 0) {
                        iR5 = 0;
                    } else {
                        iQ = C1997p1.p(list8);
                        iR4 = AbstractC2001r0.r(i22 << 3);
                        iR5 = (iR4 * size) + iQ;
                    }
                    iA += iR5;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    List list9 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y9 = C1997p1.f26239a;
                    size = list9.size();
                    if (size == 0) {
                        iR5 = 0;
                    } else {
                        iQ = C1997p1.f(list9);
                        iR4 = AbstractC2001r0.r(i22 << 3);
                        iR5 = (iR4 * size) + iQ;
                    }
                    iA += iR5;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    i17 = C1997p1.g(i22, (List) unsafe.getObject(i10, j));
                    iA += i17;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    i17 = C1997p1.i(i22, (List) unsafe.getObject(i10, j));
                    iA += i17;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    List list10 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y10 = C1997p1.f26239a;
                    size = list10.size();
                    if (size == 0) {
                        iR5 = 0;
                    } else {
                        iQ = C1997p1.n(list10);
                        iR4 = AbstractC2001r0.r(i22 << 3);
                        iR5 = (iR4 * size) + iQ;
                    }
                    iA += iR5;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    List list11 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y11 = C1997p1.f26239a;
                    size = list11.size();
                    if (size == 0) {
                        iR5 = 0;
                    } else {
                        iQ = C1997p1.o(list11);
                        iR4 = AbstractC2001r0.r(i22 << 3);
                        iR5 = (iR4 * size) + iQ;
                    }
                    iA += iR5;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    iJ = C1997p1.j((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    iJ = C1997p1.h((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    iJ = C1997p1.l((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    iJ = C1997p1.q((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    iJ = C1997p1.k((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    iJ = C1997p1.j((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    iJ = C1997p1.h((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    List list12 = (List) unsafe.getObject(i10, j);
                    C2023y1 c2023y12 = C1997p1.f26239a;
                    iJ = list12.size();
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    iJ = C1997p1.p((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case 44:
                    iJ = C1997p1.f((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    iJ = C1997p1.h((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    iJ = C1997p1.j((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    iJ = C1997p1.n((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    iJ = C1997p1.o((List) unsafe.getObject(i10, j));
                    if (iJ > 0) {
                        iR7 = AbstractC2001r0.r(i22 << 3);
                        iR8 = AbstractC2001r0.r(iJ);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    List list13 = (List) unsafe.getObject(i10, j);
                    InterfaceC1994o1 interfaceC1994o1C2 = C(i21);
                    C2023y1 c2023y13 = C1997p1.f26239a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iT = 0;
                    } else {
                        iT = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            iT += AbstractC2001r0.t(i22, (InterfaceC1967f1) list13.get(i34), interfaceC1994o1C2);
                        }
                    }
                    iA += iT;
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    int i35 = i21 / 3;
                    zzgf zzgfVar = (zzgf) unsafe.getObject(i10, j);
                    if (!zzgfVar.isEmpty()) {
                        Iterator it2 = zzgfVar.entrySet().iterator();
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (r(i22, i21, i10)) {
                        iA = B1.a.a(i22 << 3, 8, iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (r(i22, i21, i10)) {
                        iA = B1.a.a(i22 << 3, 4, iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (r(i22, i21, i10)) {
                        long jA = A(i10, j);
                        iR9 = AbstractC2001r0.r(i22 << 3);
                        iS3 = AbstractC2001r0.s(jA);
                        iA += iS3 + iR9;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (r(i22, i21, i10)) {
                        long jA2 = A(i10, j);
                        iR9 = AbstractC2001r0.r(i22 << 3);
                        iS3 = AbstractC2001r0.s(jA2);
                        iA += iS3 + iR9;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (r(i22, i21, i10)) {
                        long jV = v(i10, j);
                        iR9 = AbstractC2001r0.r(i22 << 3);
                        iS3 = AbstractC2001r0.s(jV);
                        iA += iS3 + iR9;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (r(i22, i21, i10)) {
                        iA = B1.a.a(i22 << 3, 8, iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (r(i22, i21, i10)) {
                        iA = B1.a.a(i22 << 3, 4, iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (r(i22, i21, i10)) {
                        iA = B1.a.a(i22 << 3, 1, iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i22, i21, i10)) {
                        int i36 = i22 << 3;
                        Object object2 = unsafe.getObject(i10, j);
                        if (object2 instanceof zzei) {
                            iJ = AbstractC2001r0.r(i36);
                            iR7 = ((zzei) object2).g();
                            iR8 = AbstractC2001r0.r(iR7);
                            iA += iR8 + iR7 + iJ;
                        } else {
                            iR9 = AbstractC2001r0.r(i36);
                            iS3 = AbstractC2001r0.q((String) object2);
                            iA += iS3 + iR9;
                        }
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (r(i22, i21, i10)) {
                        i17 = C1997p1.m(i22, unsafe.getObject(i10, j), C(i21));
                        iA += i17;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (r(i22, i21, i10)) {
                        zzei zzeiVar2 = (zzei) unsafe.getObject(i10, j);
                        iJ = AbstractC2001r0.r(i22 << 3);
                        iR7 = zzeiVar2.g();
                        iR8 = AbstractC2001r0.r(iR7);
                        iA += iR8 + iR7 + iJ;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (r(i22, i21, i10)) {
                        iA = B1.a.a(v(i10, j), AbstractC2001r0.r(i22 << 3), iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (r(i22, i21, i10)) {
                        long jV2 = v(i10, j);
                        iR9 = AbstractC2001r0.r(i22 << 3);
                        iS3 = AbstractC2001r0.s(jV2);
                        iA += iS3 + iR9;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (r(i22, i21, i10)) {
                        iA = B1.a.a(i22 << 3, 4, iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (r(i22, i21, i10)) {
                        iA = B1.a.a(i22 << 3, 8, iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (r(i22, i21, i10)) {
                        int iV = v(i10, j);
                        iA = B1.a.a((iV >> 31) ^ (iV + iV), AbstractC2001r0.r(i22 << 3), iA);
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i22, i21, i10)) {
                        long jA3 = A(i10, j);
                        iR9 = AbstractC2001r0.r(i22 << 3);
                        iS3 = AbstractC2001r0.s((jA3 >> 63) ^ (jA3 + jA3));
                        iA += iS3 + iR9;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (r(i22, i21, i10)) {
                        i17 = AbstractC2001r0.t(i22, (InterfaceC1967f1) unsafe.getObject(i10, j), C(i21));
                        iA += i17;
                    }
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
                default:
                    i14 = i21;
                    i21 = i14 + 3;
                    i19 = i11;
                    i20 = i12;
                    i18 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final int d(I0 i10) {
        int i11;
        long jDoubleToLongBits;
        int i12;
        int iFloatToIntBits;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f26189a;
            if (i15 >= iArr.length) {
                int iHashCode = i10.zzc.hashCode() + (i16 * 53);
                if (!this.f26194f) {
                    return iHashCode;
                }
                return ((F0) i10).zzb.f26103a.hashCode() + (iHashCode * 53);
            }
            int iY = y(i15);
            int i17 = 1048575 & iY;
            int iX = x(iY);
            int i18 = iArr[i15];
            long j = i17;
            int i19 = 1237;
            int iHashCode2 = 37;
            switch (iX) {
                case 0:
                    i11 = i16 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(D1.f26113c.a(i10, j));
                    Charset charset = O0.f26148a;
                    i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i12 = i16 * 53;
                    iFloatToIntBits = Float.floatToIntBits(D1.f26113c.b(i10, j));
                    i16 = iFloatToIntBits + i12;
                    break;
                case 2:
                    i11 = i16 * 53;
                    jDoubleToLongBits = D1.g(i10, j);
                    Charset charset2 = O0.f26148a;
                    i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i11 = i16 * 53;
                    jDoubleToLongBits = D1.g(i10, j);
                    Charset charset3 = O0.f26148a;
                    i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.f(i10, j);
                    i16 = iFloatToIntBits + i12;
                    break;
                case 5:
                    i11 = i16 * 53;
                    jDoubleToLongBits = D1.g(i10, j);
                    Charset charset4 = O0.f26148a;
                    i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.f(i10, j);
                    i16 = iFloatToIntBits + i12;
                    break;
                case 7:
                    i13 = i16 * 53;
                    boolean zG = D1.f26113c.g(i10, j);
                    Charset charset5 = O0.f26148a;
                    if (zG) {
                        i19 = 1231;
                    }
                    i16 = i19 + i13;
                    break;
                case 8:
                    i12 = i16 * 53;
                    iFloatToIntBits = ((String) D1.i(i10, j)).hashCode();
                    i16 = iFloatToIntBits + i12;
                    break;
                case 9:
                    i14 = i16 * 53;
                    Object objI = D1.i(i10, j);
                    if (objI != null) {
                        iHashCode2 = objI.hashCode();
                    }
                    i16 = i14 + iHashCode2;
                    break;
                case 10:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.i(i10, j).hashCode();
                    i16 = iFloatToIntBits + i12;
                    break;
                case 11:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.f(i10, j);
                    i16 = iFloatToIntBits + i12;
                    break;
                case 12:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.f(i10, j);
                    i16 = iFloatToIntBits + i12;
                    break;
                case 13:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.f(i10, j);
                    i16 = iFloatToIntBits + i12;
                    break;
                case 14:
                    i11 = i16 * 53;
                    jDoubleToLongBits = D1.g(i10, j);
                    Charset charset6 = O0.f26148a;
                    i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.f(i10, j);
                    i16 = iFloatToIntBits + i12;
                    break;
                case 16:
                    i11 = i16 * 53;
                    jDoubleToLongBits = D1.g(i10, j);
                    Charset charset7 = O0.f26148a;
                    i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i14 = i16 * 53;
                    Object objI2 = D1.i(i10, j);
                    if (objI2 != null) {
                        iHashCode2 = objI2.hashCode();
                    }
                    i16 = i14 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case 44:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.i(i10, j).hashCode();
                    i16 = iFloatToIntBits + i12;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    i12 = i16 * 53;
                    iFloatToIntBits = D1.i(i10, j).hashCode();
                    i16 = iFloatToIntBits + i12;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (r(i18, i15, i10)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) D1.i(i10, j)).doubleValue());
                        Charset charset8 = O0.f26148a;
                        i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) D1.i(i10, j)).floatValue());
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (r(i18, i15, i10)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = A(i10, j);
                        Charset charset9 = O0.f26148a;
                        i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (r(i18, i15, i10)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = A(i10, j);
                        Charset charset10 = O0.f26148a;
                        i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = v(i10, j);
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (r(i18, i15, i10)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = A(i10, j);
                        Charset charset11 = O0.f26148a;
                        i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = v(i10, j);
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (r(i18, i15, i10)) {
                        i13 = i16 * 53;
                        boolean zBooleanValue = ((Boolean) D1.i(i10, j)).booleanValue();
                        Charset charset12 = O0.f26148a;
                        if (zBooleanValue) {
                            i19 = 1231;
                        }
                        i16 = i19 + i13;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = ((String) D1.i(i10, j)).hashCode();
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = D1.i(i10, j).hashCode();
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = D1.i(i10, j).hashCode();
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = v(i10, j);
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = v(i10, j);
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = v(i10, j);
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (r(i18, i15, i10)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = A(i10, j);
                        Charset charset13 = O0.f26148a;
                        i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = v(i10, j);
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i18, i15, i10)) {
                        i11 = i16 * 53;
                        jDoubleToLongBits = A(i10, j);
                        Charset charset14 = O0.f26148a;
                        i16 = i11 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (r(i18, i15, i10)) {
                        i12 = i16 * 53;
                        iFloatToIntBits = D1.i(i10, j).hashCode();
                        i16 = iFloatToIntBits + i12;
                    }
                    break;
            }
            i15 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9 A[LOOP:1: B:45:0x00b8->B:50:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ed A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final boolean e(Object obj) {
        int i10;
        int i11;
        List list;
        InterfaceC1994o1 interfaceC1994o1C;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f26196h) {
            int i16 = this.f26195g[i14];
            int[] iArr = this.f26189a;
            int i17 = iArr[i16];
            int iY = y(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = f26188m.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                i10 = i15;
                i11 = i13;
            }
            if ((268435456 & iY) != 0 && !p(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iX = x(iY);
            if (iX == 9 || iX == 17) {
                if (p(obj, i16, i10, i11, i20) && !C(i16).e(D1.i(obj, iY & 1048575))) {
                    return false;
                }
            } else if (iX == 27) {
                list = (List) D1.i(obj, iY & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC1994o1C = C(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!interfaceC1994o1C.e(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iX == 60 || iX == 68) {
                if (r(i17, i16, obj) && !C(i16).e(D1.i(obj, iY & 1048575))) {
                    return false;
                }
            } else if (iX == 49) {
                list = (List) D1.i(obj, iY & 1048575);
                if (list.isEmpty()) {
                    interfaceC1994o1C = C(i16);
                    while (i12 < list.size()) {
                        if (!interfaceC1994o1C.e(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iX == 50 && !((zzgf) D1.i(obj, iY & 1048575)).isEmpty()) {
                int i21 = i16 / 3;
                throw null;
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        if (this.f26194f) {
            ((F0) obj).zzb.d();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final boolean f(I0 i10, Object obj) {
        boolean zE;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f26189a;
            if (i11 >= iArr.length) {
                if (!i10.zzc.equals(((I0) obj).zzc)) {
                    return false;
                }
                if (this.f26194f) {
                    return ((F0) i10).zzb.equals(((F0) obj).zzb);
                }
                return true;
            }
            int iY = y(i11);
            long j = iY & 1048575;
            switch (x(iY)) {
                case 0:
                    if (n(i10, obj, i11)) {
                        C1 c10 = D1.f26113c;
                        if (Double.doubleToLongBits(c10.a(i10, j)) == Double.doubleToLongBits(c10.a(obj, j))) {
                            continue;
                            i11 += 3;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (n(i10, obj, i11)) {
                        C1 c11 = D1.f26113c;
                        if (Float.floatToIntBits(c11.b(i10, j)) == Float.floatToIntBits(c11.b(obj, j))) {
                            continue;
                            i11 += 3;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (!n(i10, obj, i11) || D1.g(i10, j) != D1.g(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 3:
                    if (!n(i10, obj, i11) || D1.g(i10, j) != D1.g(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 4:
                    if (!n(i10, obj, i11) || D1.f(i10, j) != D1.f(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 5:
                    if (!n(i10, obj, i11) || D1.g(i10, j) != D1.g(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 6:
                    if (!n(i10, obj, i11) || D1.f(i10, j) != D1.f(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 7:
                    if (n(i10, obj, i11)) {
                        C1 c12 = D1.f26113c;
                        if (c12.g(i10, j) == c12.g(obj, j)) {
                            continue;
                            i11 += 3;
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (!n(i10, obj, i11) || !C1997p1.e(D1.i(i10, j), D1.i(obj, j))) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 9:
                    if (!n(i10, obj, i11) || !C1997p1.e(D1.i(i10, j), D1.i(obj, j))) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 10:
                    if (!n(i10, obj, i11) || !C1997p1.e(D1.i(i10, j), D1.i(obj, j))) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 11:
                    if (!n(i10, obj, i11) || D1.f(i10, j) != D1.f(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 12:
                    if (!n(i10, obj, i11) || D1.f(i10, j) != D1.f(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 13:
                    if (!n(i10, obj, i11) || D1.f(i10, j) != D1.f(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 14:
                    if (!n(i10, obj, i11) || D1.g(i10, j) != D1.g(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 15:
                    if (!n(i10, obj, i11) || D1.f(i10, j) != D1.f(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 16:
                    if (!n(i10, obj, i11) || D1.g(i10, j) != D1.g(obj, j)) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 17:
                    if (!n(i10, obj, i11) || !C1997p1.e(D1.i(i10, j), D1.i(obj, j))) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case 44:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    zE = C1997p1.e(D1.i(i10, j), D1.i(obj, j));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    zE = C1997p1.e(D1.i(i10, j), D1.i(obj, j));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long j10 = iArr[i11 + 2] & 1048575;
                    if (D1.f(i10, j10) != D1.f(obj, j10) || !C1997p1.e(D1.i(i10, j), D1.i(obj, j))) {
                        return false;
                    }
                    continue;
                    i11 += 3;
                    break;
                    break;
                default:
                    continue;
                    i11 += 3;
                    break;
            }
            if (!zE) {
                return false;
            }
            i11 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final void g(Object obj, Object obj2) {
        if (!q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f26189a;
            if (i10 >= iArr.length) {
                C1997p1.s(obj, obj2);
                if (!this.f26194f || ((F0) obj2).zzb.f26103a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int iY = y(i10);
            int i11 = iY & 1048575;
            int iX = x(iY);
            int i12 = iArr[i10];
            long j = i11;
            switch (iX) {
                case 0:
                    if (o(i10, obj2)) {
                        D1.l(obj, j, D1.f26113c.a(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 1:
                    if (o(i10, obj2)) {
                        D1.m(obj, j, D1.f26113c.b(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 2:
                    if (o(i10, obj2)) {
                        D1.o(obj, j, D1.g(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 3:
                    if (o(i10, obj2)) {
                        D1.o(obj, j, D1.g(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 4:
                    if (o(i10, obj2)) {
                        D1.n(D1.f(obj2, j), j, obj);
                        k(i10, obj);
                    }
                    break;
                case 5:
                    if (o(i10, obj2)) {
                        D1.o(obj, j, D1.g(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 6:
                    if (o(i10, obj2)) {
                        D1.n(D1.f(obj2, j), j, obj);
                        k(i10, obj);
                    }
                    break;
                case 7:
                    if (o(i10, obj2)) {
                        D1.k(obj, j, D1.f26113c.g(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 8:
                    if (o(i10, obj2)) {
                        D1.p(j, obj, D1.i(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 9:
                    i(obj, i10, obj2);
                    break;
                case 10:
                    if (o(i10, obj2)) {
                        D1.p(j, obj, D1.i(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 11:
                    if (o(i10, obj2)) {
                        D1.n(D1.f(obj2, j), j, obj);
                        k(i10, obj);
                    }
                    break;
                case 12:
                    if (o(i10, obj2)) {
                        D1.n(D1.f(obj2, j), j, obj);
                        k(i10, obj);
                    }
                    break;
                case 13:
                    if (o(i10, obj2)) {
                        D1.n(D1.f(obj2, j), j, obj);
                        k(i10, obj);
                    }
                    break;
                case 14:
                    if (o(i10, obj2)) {
                        D1.o(obj, j, D1.g(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 15:
                    if (o(i10, obj2)) {
                        D1.n(D1.f(obj2, j), j, obj);
                        k(i10, obj);
                    }
                    break;
                case 16:
                    if (o(i10, obj2)) {
                        D1.o(obj, j, D1.g(obj2, j));
                        k(i10, obj);
                    }
                    break;
                case 17:
                    i(obj, i10, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case 44:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    N0 n0O = (N0) D1.i(obj, j);
                    N0 n10 = (N0) D1.i(obj2, j);
                    int size = n0O.size();
                    int size2 = n10.size();
                    if (size > 0 && size2 > 0) {
                        if (!n0O.y()) {
                            n0O = n0O.o(size2 + size);
                        }
                        n0O.addAll(n10);
                    }
                    if (size > 0) {
                        n10 = n0O;
                    }
                    D1.p(j, obj, n10);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    C2023y1 c2023y1 = C1997p1.f26239a;
                    D1.p(j, obj, C1952a1.a(D1.i(obj, j), D1.i(obj2, j)));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i12, i10, obj2)) {
                        D1.p(j, obj, D1.i(obj2, j));
                        D1.n(i12, iArr[i10 + 2] & 1048575, obj);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    j(obj, i10, obj2);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i12, i10, obj2)) {
                        D1.p(j, obj, D1.i(obj2, j));
                        D1.n(i12, iArr[i10 + 2] & 1048575, obj);
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    j(obj, i10, obj2);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final void h(Object obj, byte[] bArr, int i10, int i11, C1981k0 c1981k0) throws IOException {
        s(obj, bArr, i10, i11, 0, c1981k0);
    }

    public final void i(Object obj, int i10, Object obj2) {
        if (o(i10, obj2)) {
            int iY = y(i10) & 1048575;
            Unsafe unsafe = f26188m;
            long j = iY;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f26189a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC1994o1 interfaceC1994o1C = C(i10);
            if (!o(i10, obj)) {
                if (q(object)) {
                    I0 i0Z = interfaceC1994o1C.z();
                    interfaceC1994o1C.g(i0Z, object);
                    unsafe.putObject(obj, j, i0Z);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                k(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!q(object2)) {
                I0 i0Z2 = interfaceC1994o1C.z();
                interfaceC1994o1C.g(i0Z2, object2);
                unsafe.putObject(obj, j, i0Z2);
                object2 = i0Z2;
            }
            interfaceC1994o1C.g(object2, object);
        }
    }

    public final void j(Object obj, int i10, Object obj2) {
        int[] iArr = this.f26189a;
        int i11 = iArr[i10];
        if (r(i11, i10, obj2)) {
            int iY = y(i10) & 1048575;
            Unsafe unsafe = f26188m;
            long j = iY;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC1994o1 interfaceC1994o1C = C(i10);
            if (!r(i11, i10, obj)) {
                if (q(object)) {
                    I0 i0Z = interfaceC1994o1C.z();
                    interfaceC1994o1C.g(i0Z, object);
                    unsafe.putObject(obj, j, i0Z);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                D1.n(i11, iArr[i10 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!q(object2)) {
                I0 i0Z2 = interfaceC1994o1C.z();
                interfaceC1994o1C.g(i0Z2, object2);
                unsafe.putObject(obj, j, i0Z2);
                object2 = i0Z2;
            }
            interfaceC1994o1C.g(object2, object);
        }
    }

    public final void k(int i10, Object obj) {
        int i11 = this.f26189a[i10 + 2];
        long j = 1048575 & i11;
        if (j == 1048575) {
            return;
        }
        D1.n((1 << (i11 >>> 20)) | D1.f(obj, j), j, obj);
    }

    public final void l(Object obj, int i10, Object obj2) {
        f26188m.putObject(obj, y(i10) & 1048575, obj2);
        k(i10, obj);
    }

    public final void m(int i10, int i11, Object obj, Object obj2) {
        f26188m.putObject(obj, y(i11) & 1048575, obj2);
        D1.n(i10, this.f26189a[i11 + 2] & 1048575, obj);
    }

    public final boolean n(I0 i10, Object obj, int i11) {
        return o(i11, i10) == o(i11, obj);
    }

    public final boolean o(int i10, Object obj) {
        int i11 = this.f26189a[i10 + 2];
        long j = i11 & 1048575;
        if (j != 1048575) {
            return ((1 << (i11 >>> 20)) & D1.f(obj, j)) != 0;
        }
        int iY = y(i10);
        long j10 = iY & 1048575;
        switch (x(iY)) {
            case 0:
                return Double.doubleToRawLongBits(D1.f26113c.a(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(D1.f26113c.b(obj, j10)) != 0;
            case 2:
                return D1.g(obj, j10) != 0;
            case 3:
                return D1.g(obj, j10) != 0;
            case 4:
                return D1.f(obj, j10) != 0;
            case 5:
                return D1.g(obj, j10) != 0;
            case 6:
                return D1.f(obj, j10) != 0;
            case 7:
                return D1.f26113c.g(obj, j10);
            case 8:
                Object objI = D1.i(obj, j10);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof zzei) {
                    return !zzei.f26345b.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return D1.i(obj, j10) != null;
            case 10:
                return !zzei.f26345b.equals(D1.i(obj, j10));
            case 11:
                return D1.f(obj, j10) != 0;
            case 12:
                return D1.f(obj, j10) != 0;
            case 13:
                return D1.f(obj, j10) != 0;
            case 14:
                return D1.g(obj, j10) != 0;
            case 15:
                return D1.f(obj, j10) != 0;
            case 16:
                return D1.g(obj, j10) != 0;
            case 17:
                return D1.i(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean p(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return o(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final boolean r(int i10, int i11, Object obj) {
        return D1.f(obj, (long) (this.f26189a[i11 + 2] & 1048575)) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 39661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int s(java.lang.Object r42, byte[] r43, int r44, int r5, int r46, com.google.android.gms.internal.play_billing.C1981k0 r47) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1976i1.s(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.k0):int");
    }

    public final int w(int i10, int i11) {
        int[] iArr = this.f26189a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final int y(int i10) {
        return this.f26189a[i10 + 1];
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final I0 z() {
        return (I0) ((I0) this.f26193e).g(4);
    }
}
