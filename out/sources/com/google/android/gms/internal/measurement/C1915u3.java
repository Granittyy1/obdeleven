package com.google.android.gms.internal.measurement;

import com.braze.support.BrazeLogger;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.R;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1915u3<T> implements E3<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f25869o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f25870p = V3.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f25871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f25872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1894r3 f25875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f25877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25879i;
    public final InterfaceC1936x3 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC1783b3 f25880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Q3<?, ?> f25881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F2<?> f25882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC1853l3 f25883n;

    public C1915u3(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC1894r3 interfaceC1894r3, int[] iArr2, int i12, int i13, InterfaceC1936x3 interfaceC1936x3, AbstractC1783b3 abstractC1783b3, Q3 q10, F2 f10, InterfaceC1853l3 interfaceC1853l3) {
        this.f25871a = iArr;
        this.f25872b = objArr;
        this.f25873c = i10;
        this.f25874d = i11;
        boolean z10 = interfaceC1894r3 instanceof N2;
        this.f25876f = f10 != null && f10.e(interfaceC1894r3);
        this.f25877g = iArr2;
        this.f25878h = i12;
        this.f25879i = i13;
        this.j = interfaceC1936x3;
        this.f25880k = abstractC1783b3;
        this.f25881l = q10;
        this.f25882m = f10;
        this.f25875e = interfaceC1894r3;
        this.f25883n = interfaceC1853l3;
    }

    public static <T> long A(T t8, long j) {
        return ((Long) V3.o(t8, j)).longValue();
    }

    public static S3 D(Object obj) {
        N2 n10 = (N2) obj;
        S3 s10 = n10.zzb;
        if (s10 != S3.f25587f) {
            return s10;
        }
        S3 s11 = new S3();
        n10.zzb = s11;
        return s11;
    }

    public static boolean F(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof N2) {
            return ((N2) obj).u();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0271  */
    /* JADX WARN: Code duplicated, block: B:130:0x0286  */
    /* JADX WARN: Code duplicated, block: B:131:0x0289  */
    public static C1915u3 l(InterfaceC1888q3 interfaceC1888q3, InterfaceC1936x3 interfaceC1936x3, AbstractC1783b3 abstractC1783b3, Q3 q10, F2 f10, InterfaceC1853l3 interfaceC1853l3) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
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
        int i28;
        int i29;
        int i30;
        int iObjectFieldOffset2;
        Field fieldO;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldO2;
        int i36;
        Object obj2;
        Field fieldO3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(interfaceC1888q3 instanceof D3)) {
            throw new NoSuchMethodError();
        }
        D3 d10 = (D3) interfaceC1888q3;
        String strB = d10.b();
        int length = strB.length();
        char c10 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (strB.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt3 = strB.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i43 = iCharAt3 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = strB.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            iCharAt3 = i43 | (cCharAt13 << i44);
            i42 = i40;
        }
        if (iCharAt3 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i12 = 0;
            i15 = 0;
            i14 = 0;
            iArr = f25869o;
            i11 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt4 = strB.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt8 = strB.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt4 = i46 | (cCharAt8 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt5 = strB.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt7 = strB.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt5 = i49 | (cCharAt7 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int iCharAt6 = strB.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt6 = strB.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt6 = i52 | (cCharAt6 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            int iCharAt7 = strB.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt5 = strB.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt7 = i55 | (cCharAt5 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            iCharAt = strB.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt4 = strB.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt = i58 | (cCharAt4 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            iCharAt2 = strB.charAt(i57);
            if (iCharAt2 >= 55296) {
                int i61 = iCharAt2 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt3 = strB.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt2 = i61 | (cCharAt3 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int iCharAt8 = strB.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt2 = strB.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i17;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i17;
            }
            int i66 = i63 + 1;
            int iCharAt9 = strB.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i16 = i66 + 1;
                    cCharAt = strB.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i16;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i16;
            }
            int i69 = (iCharAt4 << 1) + iCharAt5;
            i11 = iCharAt4;
            i42 = i66;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i12 = iCharAt6;
            i13 = i69;
            i14 = iCharAt9;
            i15 = iCharAt7;
        }
        Unsafe unsafe = f25870p;
        Object[] objArrC = d10.c();
        Class<?> cls = d10.a().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt << 1];
        int i70 = i14 + iCharAt2;
        int i71 = i14;
        int i72 = i70;
        int i73 = 0;
        int i74 = 0;
        while (i42 < length) {
            int i75 = i42 + 1;
            int iCharAt10 = strB.charAt(i42);
            if (iCharAt10 >= c10) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i39 = i77 + 1;
                    cCharAt12 = strB.charAt(i77);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i39;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i24 = i39;
            } else {
                i24 = i75;
            }
            int i79 = i24 + 1;
            int iCharAt11 = strB.charAt(i24);
            if (iCharAt11 >= c10) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i38 = i81 + 1;
                    cCharAt11 = strB.charAt(i81);
                    i25 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i38;
                    length = i25;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i26 = i38;
            } else {
                i25 = length;
                i26 = i79;
            }
            int i83 = iCharAt11 & 255;
            int i84 = i15;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            zzlr zzlrVar = zzlr.f26078b;
            int i85 = i12;
            if (i83 >= 51) {
                int i86 = i26 + 1;
                int iCharAt12 = strB.charAt(i26);
                if (iCharAt12 >= 55296) {
                    int i87 = iCharAt12 & 8191;
                    int i88 = i86;
                    int i89 = 13;
                    while (true) {
                        i37 = i88 + 1;
                        cCharAt10 = strB.charAt(i88);
                        i27 = iCharAt10;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i87 |= (cCharAt10 & 8191) << i89;
                        i89 += 13;
                        i88 = i37;
                        iCharAt10 = i27;
                    }
                    iCharAt12 = i87 | (cCharAt10 << i89);
                    i32 = i37;
                } else {
                    i27 = iCharAt10;
                    i32 = i86;
                }
                int i90 = i83 - 51;
                int i91 = i32;
                if (i90 == 9 || i90 == 17) {
                    i33 = 1;
                    i34 = i13 + 1;
                    objArr[((i73 / 3) << 1) + 1] = objArrC[i13];
                } else {
                    if (i90 != 12 || (!d10.x().equals(zzlrVar) && (iCharAt11 & 2048) == 0)) {
                        i33 = 1;
                    } else {
                        i33 = 1;
                        i34 = i13 + 1;
                        objArr[((i73 / 3) << 1) + 1] = objArrC[i13];
                    }
                    i35 = iCharAt12 << i33;
                    obj = objArrC[i35];
                    if (obj instanceof Field) {
                        fieldO2 = (Field) obj;
                    } else {
                        fieldO2 = o(cls, (String) obj);
                        objArrC[i35] = fieldO2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO2);
                    i36 = i35 + 1;
                    obj2 = objArrC[i36];
                    if (obj2 instanceof Field) {
                        fieldO3 = (Field) obj2;
                    } else {
                        fieldO3 = o(cls, (String) obj2);
                        objArrC[i36] = fieldO3;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                    i28 = i91;
                    i29 = 0;
                    i30 = i13;
                }
                i13 = i34;
                i35 = iCharAt12 << i33;
                obj = objArrC[i35];
                if (obj instanceof Field) {
                    fieldO2 = (Field) obj;
                } else {
                    fieldO2 = o(cls, (String) obj);
                    objArrC[i35] = fieldO2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO2);
                i36 = i35 + 1;
                obj2 = objArrC[i36];
                if (obj2 instanceof Field) {
                    fieldO3 = (Field) obj2;
                } else {
                    fieldO3 = o(cls, (String) obj2);
                    objArrC[i36] = fieldO3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                i28 = i91;
                i29 = 0;
                i30 = i13;
            } else {
                i27 = iCharAt10;
                int i92 = i13 + 1;
                Field fieldO4 = o(cls, (String) objArrC[i13]);
                if (i83 == 9 || i83 == 17) {
                    objArr[((i73 / 3) << 1) + 1] = fieldO4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i31 = i13 + 2;
                        objArr[((i73 / 3) << 1) + 1] = objArrC[i92];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        if (d10.x() == zzlrVar || (iCharAt11 & 2048) != 0) {
                            i31 = i13 + 2;
                            objArr[((i73 / 3) << 1) + 1] = objArrC[i92];
                        }
                    } else if (i83 == 50) {
                        int i93 = i71 + 1;
                        iArr[i71] = i73;
                        int i94 = (i73 / 3) << 1;
                        int i95 = i13 + 2;
                        objArr[i94] = objArrC[i92];
                        if ((iCharAt11 & 2048) != 0) {
                            i92 = i13 + 3;
                            objArr[i94 + 1] = objArrC[i95];
                        } else {
                            i92 = i95;
                        }
                        i71 = i93;
                    }
                    i92 = i31;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO4);
                if ((iCharAt11 & 4096) == 0 || i83 > 17) {
                    iObjectFieldOffset = 1048575;
                    i28 = i26;
                    i29 = 0;
                } else {
                    int i96 = i26 + 1;
                    int iCharAt13 = strB.charAt(i26);
                    if (iCharAt13 >= 55296) {
                        int i97 = iCharAt13 & 8191;
                        int i98 = 13;
                        while (true) {
                            i28 = i96 + 1;
                            cCharAt9 = strB.charAt(i96);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i97 |= (cCharAt9 & 8191) << i98;
                            i98 += 13;
                            i96 = i28;
                        }
                        iCharAt13 = i97 | (cCharAt9 << i98);
                    } else {
                        i28 = i96;
                    }
                    int i99 = (iCharAt13 / 32) + (i11 << 1);
                    Object obj3 = objArrC[i99];
                    if (obj3 instanceof Field) {
                        fieldO = (Field) obj3;
                    } else {
                        fieldO = o(cls, (String) obj3);
                        objArrC[i99] = fieldO;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO);
                    i29 = iCharAt13 % 32;
                }
                if (i83 >= 18 && i83 <= 49) {
                    iArr[i72] = iObjectFieldOffset3;
                    i72++;
                }
                i30 = i92;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i100 = i73 + 1;
            iArr2[i73] = i27;
            int i101 = i73 + 2;
            String str = strB;
            iArr2[i100] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | iObjectFieldOffset2;
            i73 += 3;
            iArr2[i101] = (i29 << 20) | iObjectFieldOffset;
            i13 = i30;
            i15 = i84;
            i42 = i28;
            i12 = i85;
            length = i25;
            iArr2 = iArr2;
            strB = str;
            c10 = 55296;
        }
        return new C1915u3(iArr2, objArr, i12, i15, d10.a(), iArr, i14, i70, interfaceC1936x3, abstractC1783b3, q10, f10, interfaceC1853l3);
    }

    public static Field o(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
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
            throw new RuntimeException(sbC.toString());
        }
    }

    public static <T> int w(T t8, long j) {
        return ((Integer) V3.o(t8, j)).intValue();
    }

    public final R2 B(int i10) {
        return (R2) this.f25872b[((i10 / 3) << 1) + 1];
    }

    public final E3 C(int i10) {
        int i11 = (i10 / 3) << 1;
        Object[] objArr = this.f25872b;
        E3 e10 = (E3) objArr[i11];
        if (e10 != null) {
            return e10;
        }
        E3<T> e3A = C3.f25411c.a((Class) objArr[i11 + 1]);
        objArr[i11] = e3A;
        return e3A;
    }

    public final Object E(int i10) {
        return this.f25872b[(i10 / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final void a(T t8, T t10) {
        if (!F(t8)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(t8)));
        }
        t10.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f25871a;
            if (i10 >= iArr.length) {
                Class<?> cls = H3.f25466a;
                Q3<?, ?> q10 = this.f25881l;
                q10.h(t8, q10.b(q10.i(t8), q10.i(t10)));
                if (this.f25876f) {
                    H3.h(this.f25882m, t8, t10);
                    return;
                }
                return;
            }
            int iV = v(i10);
            long j = iV & 1048575;
            int i11 = iArr[i10];
            switch ((iV & 267386880) >>> 20) {
                case 0:
                    if (y(i10, t10)) {
                        V3.e(t8, j, V3.f25612c.a(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 1:
                    if (y(i10, t10)) {
                        V3.f(t8, j, V3.f25612c.i(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 2:
                    if (y(i10, t10)) {
                        V3.b bVar = V3.f25612c;
                        bVar.f(t8, j, bVar.m(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 3:
                    if (y(i10, t10)) {
                        V3.b bVar2 = V3.f25612c;
                        bVar2.f(t8, j, bVar2.m(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 4:
                    if (y(i10, t10)) {
                        V3.c(V3.f25612c.l(t10, j), j, t8);
                        t(i10, t8);
                    }
                    break;
                case 5:
                    if (y(i10, t10)) {
                        V3.b bVar3 = V3.f25612c;
                        bVar3.f(t8, j, bVar3.m(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 6:
                    if (y(i10, t10)) {
                        V3.c(V3.f25612c.l(t10, j), j, t8);
                        t(i10, t8);
                    }
                    break;
                case 7:
                    if (y(i10, t10)) {
                        V3.l(t8, j, V3.f25612c.k(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 8:
                    if (y(i10, t10)) {
                        V3.d(j, t8, V3.o(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 9:
                    r(t8, t10, i10);
                    break;
                case 10:
                    if (y(i10, t10)) {
                        V3.d(j, t8, V3.o(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 11:
                    if (y(i10, t10)) {
                        V3.c(V3.f25612c.l(t10, j), j, t8);
                        t(i10, t8);
                    }
                    break;
                case 12:
                    if (y(i10, t10)) {
                        V3.c(V3.f25612c.l(t10, j), j, t8);
                        t(i10, t8);
                    }
                    break;
                case 13:
                    if (y(i10, t10)) {
                        V3.c(V3.f25612c.l(t10, j), j, t8);
                        t(i10, t8);
                    }
                    break;
                case 14:
                    if (y(i10, t10)) {
                        V3.b bVar4 = V3.f25612c;
                        bVar4.f(t8, j, bVar4.m(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 15:
                    if (y(i10, t10)) {
                        V3.c(V3.f25612c.l(t10, j), j, t8);
                        t(i10, t8);
                    }
                    break;
                case 16:
                    if (y(i10, t10)) {
                        V3.b bVar5 = V3.f25612c;
                        bVar5.f(t8, j, bVar5.m(t10, j));
                        t(i10, t8);
                    }
                    break;
                case 17:
                    r(t8, t10, i10);
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
                    this.f25880k.a(j, t8, t10);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    Class<?> cls2 = H3.f25466a;
                    V3.d(j, t8, this.f25883n.a(V3.o(t8, j), V3.o(t10, j)));
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
                    if (x(i11, i10, t10)) {
                        V3.d(j, t8, V3.o(t10, j));
                        V3.c(i11, iArr[i10 + 2] & 1048575, t8);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    u(t8, i10, t10);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (x(i11, i10, t10)) {
                        V3.d(j, t8, V3.o(t10, j));
                        V3.c(i11, iArr[i10 + 2] & 1048575, t8);
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    u(t8, i10, t10);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final void b(T t8, byte[] bArr, int i10, int i11, C1921v2 c1921v2) throws IOException {
        k(t8, bArr, i10, i11, 0, c1921v2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb A[LOOP:1: B:44:0x00ba->B:49:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.E3
    public final boolean c(T t8) {
        int i10;
        int i11;
        List list;
        E3 e3C;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f25878h) {
            int i16 = this.f25877g[i15];
            int[] iArr = this.f25871a;
            int i17 = iArr[i16];
            int iV = v(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f25870p.getInt(t8, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i13;
                i11 = i14;
            }
            if ((268435456 & iV) != 0 && !s(t8, i16, i10, i11, i20)) {
                return false;
            }
            int i21 = (267386880 & iV) >>> 20;
            if (i21 == 9 || i21 == 17) {
                if (s(t8, i16, i10, i11, i20) && !C(i16).c(V3.o(t8, iV & 1048575))) {
                    return false;
                }
            } else if (i21 == 27) {
                list = (List) V3.o(t8, iV & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    e3C = C(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!e3C.c(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (i21 == 60 || i21 == 68) {
                if (x(i17, i16, t8) && !C(i16).c(V3.o(t8, iV & 1048575))) {
                    return false;
                }
            } else if (i21 == 49) {
                list = (List) V3.o(t8, iV & 1048575);
                if (list.isEmpty()) {
                    e3C = C(i16);
                    while (i12 < list.size()) {
                        if (!e3C.c(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i21 != 50) {
                continue;
            } else {
                Object objO = V3.o(t8, iV & 1048575);
                InterfaceC1853l3 interfaceC1853l3 = this.f25883n;
                if (!interfaceC1853l3.c(objO).isEmpty()) {
                    interfaceC1853l3.e(E(i16));
                    throw null;
                }
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        if (this.f25876f) {
            this.f25882m.b(t8).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.E3
    public final void d(T t8) {
        if (F(t8)) {
            if (t8 instanceof N2) {
                N2 n10 = (N2) t8;
                n10.j(BrazeLogger.SUPPRESS);
                n10.zza = 0;
                n10.t();
            }
            int[] iArr = this.f25871a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iV = v(i10);
                long j = 1048575 & iV;
                int i11 = (iV & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 != 60 && i11 != 68) {
                        switch (i11) {
                            case 17:
                                if (y(i10, t8)) {
                                    C(i10).d(f25870p.getObject(t8, j));
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
                                this.f25880k.b(t8, j);
                                break;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Unsafe unsafe = f25870p;
                                Object object = unsafe.getObject(t8, j);
                                if (object != null) {
                                    unsafe.putObject(t8, j, this.f25883n.d(object));
                                }
                                break;
                        }
                    } else if (x(iArr[i10], i10, t8)) {
                        C(i10).d(f25870p.getObject(t8, j));
                    }
                } else if (y(i10, t8)) {
                    C(i10).d(f25870p.getObject(t8, j));
                }
            }
            this.f25881l.j(t8);
            if (this.f25876f) {
                this.f25882m.g(t8);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // com.google.android.gms.internal.measurement.E3
    public final void e(T t8, InterfaceC1791c4 interfaceC1791c4) throws IOException {
        Map.Entry<?, ?> entry;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        interfaceC1791c4.getClass();
        boolean z12 = this.f25876f;
        F2<?> f10 = this.f25882m;
        if (z12) {
            G2<T> g2B = f10.b(t8);
            if (g2B.f25457a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) g2B.e().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.f25871a;
        int length = iArr.length;
        Unsafe unsafe = f25870p;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < length) {
            int iV = v(i17);
            int i18 = iArr[i17];
            int i19 = (iV & 267386880) >>> 20;
            if (i19 <= 17) {
                int i20 = iArr[i17 + 2];
                int i21 = i16;
                int i22 = i20 & 1048575;
                if (i22 != i15) {
                    i14 = i22 == 1048575 ? 0 : unsafe.getInt(t8, i22);
                    i15 = i22;
                } else {
                    iArr = iArr;
                    length = length;
                    i14 = i21;
                }
                i10 = i14;
                i12 = 1 << (i20 >>> 20);
                i11 = i15;
            } else {
                i10 = i16;
                iArr = iArr;
                length = length;
                i11 = i15;
                i12 = 0;
            }
            if (entry != null) {
                f10.a(entry);
                throw null;
            }
            long j = iV & 1048575;
            switch (i19) {
                case 0:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).b(i18, V3.a(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 1:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).a(V3.g(t8, j), i18);
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 2:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).i(i18, unsafe.getLong(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 3:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).p(i18, unsafe.getLong(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 4:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).k(i18, unsafe.getInt(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 5:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).d(i18, unsafe.getLong(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 6:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).h(i18, unsafe.getInt(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 7:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).g(i18, V3.p(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 8:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        Object object = unsafe.getObject(t8, j);
                        if (object instanceof String) {
                            ((B2) interfaceC1791c4).f25401a.F0(i18, (String) object);
                        } else {
                            ((B2) interfaceC1791c4).e(i18, (zzij) object);
                        }
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 9:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).j(i18, unsafe.getObject(t8, j), C(i13));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 10:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).e(i18, (zzij) unsafe.getObject(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 11:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).q(i18, unsafe.getInt(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 12:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).c(i18, unsafe.getInt(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 13:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).m(i18, unsafe.getInt(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 14:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).l(i18, unsafe.getLong(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 15:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).o(i18, unsafe.getInt(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 16:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i13, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).n(i18, unsafe.getLong(t8, j));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 17:
                    f10 = f10;
                    entry = entry;
                    iArr = iArr;
                    i13 = i17;
                    if (s(t8, i17, i11, i10, i12)) {
                        ((B2) interfaceC1791c4).f(i18, unsafe.getObject(t8, j), C(i13));
                    }
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 18:
                    z10 = false;
                    H3.q(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 19:
                    z10 = false;
                    H3.D(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 20:
                    z10 = false;
                    H3.J(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 21:
                    z10 = false;
                    H3.T(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 22:
                    z10 = false;
                    H3.G(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 23:
                    z10 = false;
                    H3.A(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 24:
                    z10 = false;
                    H3.x(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 25:
                    z10 = false;
                    H3.g(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 26:
                    H3.o(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 27:
                    H3.p(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, C(i17));
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 28:
                    H3.e(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 29:
                    z11 = false;
                    H3.S(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    z11 = false;
                    H3.u(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    z11 = false;
                    H3.M(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    z11 = false;
                    H3.P(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    z11 = false;
                    H3.Q(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    z11 = false;
                    H3.R(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, false);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    H3.q(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    H3.D(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    H3.J(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    H3.T(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    H3.G(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    H3.A(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    H3.x(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    H3.g(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    H3.S(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case 44:
                    H3.u(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    H3.M(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    H3.P(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    H3.Q(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    H3.R(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, true);
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    H3.f(iArr[i17], (List) unsafe.getObject(t8, j), interfaceC1791c4, C(i17));
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    if (unsafe.getObject(t8, j) != null) {
                        this.f25883n.e(E(i17));
                        throw null;
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).b(i18, ((Double) V3.o(t8, j)).doubleValue());
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).a(((Float) V3.o(t8, j)).floatValue(), i18);
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).i(i18, A(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).p(i18, A(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).k(i18, w(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).d(i18, A(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).h(i18, w(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).g(i18, ((Boolean) V3.o(t8, j)).booleanValue());
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (x(i18, i17, t8)) {
                        Object object2 = unsafe.getObject(t8, j);
                        if (object2 instanceof String) {
                            ((B2) interfaceC1791c4).f25401a.F0(i18, (String) object2);
                        } else {
                            ((B2) interfaceC1791c4).e(i18, (zzij) object2);
                        }
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).j(i18, unsafe.getObject(t8, j), C(i17));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).e(i18, (zzij) unsafe.getObject(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).q(i18, w(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).c(i18, w(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).m(i18, w(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).l(i18, A(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).o(i18, w(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).n(i18, A(t8, j));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (x(i18, i17, t8)) {
                        ((B2) interfaceC1791c4).f(i18, unsafe.getObject(t8, j), C(i17));
                    }
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
                default:
                    i13 = i17;
                    i17 = i13 + 3;
                    i15 = i11;
                    f10 = f10;
                    entry = entry;
                    i16 = i10;
                    length = length;
                    iArr = iArr;
                    break;
            }
        }
        F2<?> f11 = f10;
        Map.Entry<?, ?> entry2 = entry;
        if (entry2 != null) {
            f11.d(entry2);
            throw null;
        }
        Q3<?, ?> q10 = this.f25881l;
        q10.f(q10.i(t8), interfaceC1791c4);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @Override // com.google.android.gms.internal.measurement.E3
    public final boolean f(N2 n10, Object obj) {
        int[] iArr = this.f25871a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zJ = true;
            if (i10 >= length) {
                Q3<?, ?> q10 = this.f25881l;
                if (!q10.i(n10).equals(q10.i(obj))) {
                    return false;
                }
                if (!this.f25876f) {
                    return true;
                }
                F2<?> f10 = this.f25882m;
                return f10.b(n10).equals(f10.b(obj));
            }
            int iV = v(i10);
            long j = iV & 1048575;
            switch ((iV & 267386880) >>> 20) {
                case 0:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar = V3.f25612c;
                        if (Double.doubleToLongBits(bVar.a(n10, j)) != Double.doubleToLongBits(bVar.a(obj, j))) {
                            zJ = false;
                        }
                    }
                    break;
                case 1:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar2 = V3.f25612c;
                        if (Float.floatToIntBits(bVar2.i(n10, j)) != Float.floatToIntBits(bVar2.i(obj, j))) {
                            zJ = false;
                        }
                    }
                    break;
                case 2:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar3 = V3.f25612c;
                        if (bVar3.m(n10, j) != bVar3.m(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 3:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar4 = V3.f25612c;
                        if (bVar4.m(n10, j) != bVar4.m(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 4:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar5 = V3.f25612c;
                        if (bVar5.l(n10, j) != bVar5.l(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 5:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar6 = V3.f25612c;
                        if (bVar6.m(n10, j) != bVar6.m(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 6:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar7 = V3.f25612c;
                        if (bVar7.l(n10, j) != bVar7.l(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 7:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar8 = V3.f25612c;
                        if (bVar8.k(n10, j) != bVar8.k(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 8:
                    if (!z(n10, obj, i10) || !H3.j(V3.o(n10, j), V3.o(obj, j))) {
                        zJ = false;
                    }
                    break;
                case 9:
                    if (!z(n10, obj, i10) || !H3.j(V3.o(n10, j), V3.o(obj, j))) {
                        zJ = false;
                    }
                    break;
                case 10:
                    if (!z(n10, obj, i10) || !H3.j(V3.o(n10, j), V3.o(obj, j))) {
                        zJ = false;
                    }
                    break;
                case 11:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar9 = V3.f25612c;
                        if (bVar9.l(n10, j) != bVar9.l(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 12:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar10 = V3.f25612c;
                        if (bVar10.l(n10, j) != bVar10.l(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 13:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar11 = V3.f25612c;
                        if (bVar11.l(n10, j) != bVar11.l(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 14:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar12 = V3.f25612c;
                        if (bVar12.m(n10, j) != bVar12.m(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 15:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar13 = V3.f25612c;
                        if (bVar13.l(n10, j) != bVar13.l(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 16:
                    if (!z(n10, obj, i10)) {
                        zJ = false;
                    } else {
                        V3.b bVar14 = V3.f25612c;
                        if (bVar14.m(n10, j) != bVar14.m(obj, j)) {
                            zJ = false;
                        }
                    }
                    break;
                case 17:
                    if (!z(n10, obj, i10) || !H3.j(V3.o(n10, j), V3.o(obj, j))) {
                        zJ = false;
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
                    zJ = H3.j(V3.o(n10, j), V3.o(obj, j));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    zJ = H3.j(V3.o(n10, j), V3.o(obj, j));
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
                    long j10 = iArr[i10 + 2] & 1048575;
                    V3.b bVar15 = V3.f25612c;
                    if (bVar15.l(n10, j10) != bVar15.l(obj, j10) || !H3.j(V3.o(n10, j), V3.o(obj, j))) {
                        zJ = false;
                    }
                    break;
            }
            if (!zJ) {
                return false;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[PHI: r3
      0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fd, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.E3
    public final int g(N2 n10) {
        int i10;
        int iA;
        int i11;
        int[] iArr = this.f25871a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iV = v(i13);
            int i14 = iArr[i13];
            long j = 1048575 & iV;
            int i15 = 1237;
            int iHashCode = 37;
            switch ((iV & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    iA = Q2.a(Double.doubleToLongBits(V3.f25612c.a(n10, j)));
                    i12 = iA + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iA = Float.floatToIntBits(V3.f25612c.i(n10, j));
                    i12 = iA + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iA = Q2.a(V3.f25612c.m(n10, j));
                    i12 = iA + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iA = Q2.a(V3.f25612c.m(n10, j));
                    i12 = iA + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iA = V3.f25612c.l(n10, j);
                    i12 = iA + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iA = Q2.a(V3.f25612c.m(n10, j));
                    i12 = iA + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iA = V3.f25612c.l(n10, j);
                    i12 = iA + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zK = V3.f25612c.k(n10, j);
                    Charset charset = Q2.f25563a;
                    if (zK) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iA = ((String) V3.o(n10, j)).hashCode();
                    i12 = iA + i10;
                    break;
                case 9:
                    Object objO = V3.o(n10, j);
                    if (objO != null) {
                        iHashCode = objO.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iA = V3.o(n10, j).hashCode();
                    i12 = iA + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iA = V3.f25612c.l(n10, j);
                    i12 = iA + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iA = V3.f25612c.l(n10, j);
                    i12 = iA + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iA = V3.f25612c.l(n10, j);
                    i12 = iA + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iA = Q2.a(V3.f25612c.m(n10, j));
                    i12 = iA + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iA = V3.f25612c.l(n10, j);
                    i12 = iA + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iA = Q2.a(V3.f25612c.m(n10, j));
                    i12 = iA + i10;
                    break;
                case 17:
                    Object objO2 = V3.o(n10, j);
                    if (objO2 != null) {
                        iHashCode = objO2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
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
                    i10 = i12 * 53;
                    iA = V3.o(n10, j).hashCode();
                    i12 = iA + i10;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    i10 = i12 * 53;
                    iA = V3.o(n10, j).hashCode();
                    i12 = iA + i10;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = Q2.a(Double.doubleToLongBits(((Double) V3.o(n10, j)).doubleValue()));
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = Float.floatToIntBits(((Float) V3.o(n10, j)).floatValue());
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = Q2.a(A(n10, j));
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = Q2.a(A(n10, j));
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = w(n10, j);
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = Q2.a(A(n10, j));
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = w(n10, j);
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (x(i14, i13, n10)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) V3.o(n10, j)).booleanValue();
                        Charset charset2 = Q2.f25563a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = ((String) V3.o(n10, j)).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = V3.o(n10, j).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = V3.o(n10, j).hashCode();
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = w(n10, j);
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = w(n10, j);
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = w(n10, j);
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = Q2.a(A(n10, j));
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = w(n10, j);
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = Q2.a(A(n10, j));
                        i12 = iA + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (x(i14, i13, n10)) {
                        i10 = i12 * 53;
                        iA = V3.o(n10, j).hashCode();
                        i12 = iA + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f25881l.i(n10).hashCode() + (i12 * 53);
        return this.f25876f ? (iHashCode2 * 53) + this.f25882m.b(n10).f25457a.hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final T h() {
        return (T) this.j.e(this.f25875e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.E3
    public final int i(AbstractC1887q2 abstractC1887q2) {
        int i10;
        int i11;
        int i12;
        int iO0;
        int iW;
        int iA0;
        int iC0;
        Unsafe unsafe = f25870p;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = this.f25871a;
            if (i16 >= iArr.length) {
                Q3<?, ?> q10 = this.f25881l;
                int iA = q10.a(q10.i(abstractC1887q2)) + i17;
                if (this.f25876f) {
                    G2<T> g2B = this.f25882m.b(abstractC1887q2);
                    int iA2 = g2B.f25457a.a();
                    I3 i18 = g2B.f25457a;
                    if (iA2 > 0) {
                        Map.Entry entryF = i18.f(0);
                        G2.a((I2) entryF.getKey(), entryF.getValue());
                        throw null;
                    }
                    Iterator<T> it = i18.e().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        G2.a((I2) entry.getKey(), entry.getValue());
                        throw null;
                    }
                }
                return iA;
            }
            int iV = v(i16);
            int i19 = (267386880 & iV) >>> 20;
            int i20 = iArr[i16];
            int i21 = iArr[i16 + 2];
            int i22 = i21 & i13;
            if (i19 <= 17) {
                if (i22 != i14) {
                    i15 = i22 == i13 ? 0 : unsafe.getInt(abstractC1887q2, i22);
                    i14 = i22;
                }
                i10 = i14;
                i11 = i15;
                i12 = 1 << (i21 >>> 20);
            } else {
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            long j = iV & i13;
            if (i19 >= zzjo.f26057b.a()) {
                zzjo.f26058c.a();
            }
            switch (i19) {
                case 0:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.o0(i20);
                        i17 += iO0;
                    }
                    break;
                case 1:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.q0(i20);
                        i17 += iO0;
                    }
                    break;
                case 2:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.s0(i20, unsafe.getLong(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case 3:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.y0(i20, unsafe.getLong(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case 4:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.u0(i20, unsafe.getInt(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case 5:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.p0(i20);
                        i17 += iO0;
                    }
                    break;
                case 6:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.r0(i20);
                        i17 += iO0;
                    }
                    break;
                case 7:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.i0(i20);
                        i17 += iO0;
                    }
                    break;
                case 8:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        Object object = unsafe.getObject(abstractC1887q2, j);
                        iO0 = object instanceof zzij ? zzja.k0(i20, (zzij) object) : zzja.m0(i20, (String) object);
                        i17 += iO0;
                    }
                    break;
                case 9:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = H3.a(i20, unsafe.getObject(abstractC1887q2, j), C(i16));
                        i17 += iO0;
                    }
                    break;
                case 10:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.k0(i20, (zzij) unsafe.getObject(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case 11:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.B0(i20, unsafe.getInt(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case 12:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.j0(i20, unsafe.getInt(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case 13:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.v0(i20);
                        i17 += iO0;
                    }
                    break;
                case 14:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.t0(i20);
                        i17 += iO0;
                    }
                    break;
                case 15:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.x0(i20, unsafe.getInt(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case 16:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.w0(i20, unsafe.getLong(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case 17:
                    if (s(abstractC1887q2, i16, i10, i11, i12)) {
                        iO0 = zzja.l0(i20, (InterfaceC1894r3) unsafe.getObject(abstractC1887q2, j), C(i16));
                        i17 += iO0;
                    }
                    break;
                case 18:
                    iO0 = H3.v(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 19:
                    iO0 = H3.s(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 20:
                    iO0 = H3.B(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 21:
                    iO0 = H3.N(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 22:
                    iO0 = H3.y(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 23:
                    iO0 = H3.v(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 24:
                    iO0 = H3.s(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 25:
                    iO0 = H3.b(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 26:
                    iO0 = H3.r(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 27:
                    iO0 = H3.m(i20, (List) unsafe.getObject(abstractC1887q2, j), C(i16));
                    i17 += iO0;
                    break;
                case 28:
                    iO0 = H3.k(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case 29:
                    iO0 = H3.K(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    iO0 = H3.l(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iO0 = H3.s(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    iO0 = H3.v(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iO0 = H3.E(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    iO0 = H3.H(i20, (List) unsafe.getObject(abstractC1887q2, j));
                    i17 += iO0;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    iW = H3.w((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    iW = H3.t((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    iW = H3.C((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    iW = H3.O((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    iW = H3.z((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    iW = H3.w((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    iW = H3.t((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    iW = H3.d((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    iW = H3.L((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case 44:
                    iW = H3.n((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    iW = H3.t((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    iW = H3.w((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    iW = H3.F((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    iW = H3.I((List) unsafe.getObject(abstractC1887q2, j));
                    if (iW > 0) {
                        iA0 = zzja.A0(i20);
                        iC0 = zzja.C0(iW);
                        i17 += iC0 + iA0 + iW;
                    }
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iO0 = H3.c(i20, (List) unsafe.getObject(abstractC1887q2, j), C(i16));
                    i17 += iO0;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    this.f25883n.mo8a(unsafe.getObject(abstractC1887q2, j), E(i16));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.o0(i20);
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.q0(i20);
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.s0(i20, A(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.y0(i20, A(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.u0(i20, w(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.p0(i20);
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.r0(i20);
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.i0(i20);
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        Object object2 = unsafe.getObject(abstractC1887q2, j);
                        iO0 = object2 instanceof zzij ? zzja.k0(i20, (zzij) object2) : zzja.m0(i20, (String) object2);
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = H3.a(i20, unsafe.getObject(abstractC1887q2, j), C(i16));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.k0(i20, (zzij) unsafe.getObject(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.B0(i20, w(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.j0(i20, w(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.v0(i20);
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.t0(i20);
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.x0(i20, w(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.w0(i20, A(abstractC1887q2, j));
                        i17 += iO0;
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (x(i20, i16, abstractC1887q2)) {
                        iO0 = zzja.l0(i20, (InterfaceC1894r3) unsafe.getObject(abstractC1887q2, j), C(i16));
                        i17 += iO0;
                    }
                    break;
            }
            i16 += 3;
            i14 = i10;
            i15 = i11;
            i13 = 1048575;
        }
    }

    public final int j(int i10, int i11) {
        int[] iArr = this.f25871a;
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

    /* JADX WARN: Code duplicated, block: B:394:0x0992 A[PHI: r0 r7 r8 r9 r11 r12 r13 r14 r16
      0x0992: PHI (r0v62 int) = (r0v24 int), (r0v26 int), (r0v29 int), (r0v52 int), (r14v36 int) binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x0992: PHI (r7v47 com.google.android.gms.internal.measurement.v2) = 
      (r7v13 com.google.android.gms.internal.measurement.v2)
      (r7v14 com.google.android.gms.internal.measurement.v2)
      (r7v16 com.google.android.gms.internal.measurement.v2)
      (r7v29 com.google.android.gms.internal.measurement.v2)
      (r13v47 com.google.android.gms.internal.measurement.v2)
     binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x0992: PHI (r8v97 int) = (r8v46 int), (r8v47 int), (r8v49 int), (r8v85 int), (r8v98 int) binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x0992: PHI (r9v61 int) = (r9v33 int), (r9v34 int), (r9v36 int), (r9v47 int), (r9v62 int) binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x0992: PHI (r11v72 int) = (r11v56 int), (r11v57 int), (r11v59 int), (r11v67 int), (r11v73 int) binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x0992: PHI (r12v85 int) = (r12v55 int), (r12v56 int), (r12v58 int), (r12v72 int), (r11v55 int) binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x0992: PHI (r13v72 com.google.android.gms.internal.measurement.l3) = 
      (r13v48 com.google.android.gms.internal.measurement.l3)
      (r13v49 com.google.android.gms.internal.measurement.l3)
      (r13v51 com.google.android.gms.internal.measurement.l3)
      (r13v64 com.google.android.gms.internal.measurement.l3)
      (r28v4 com.google.android.gms.internal.measurement.l3)
     binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x0992: PHI (r14v66 sun.misc.Unsafe) = 
      (r14v42 sun.misc.Unsafe)
      (r14v43 sun.misc.Unsafe)
      (r14v45 sun.misc.Unsafe)
      (r14v58 sun.misc.Unsafe)
      (r12v53 sun.misc.Unsafe)
     binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x0992: PHI (r16v45 int[]) = (r16v15 int[]), (r16v16 int[]), (r16v18 int[]), (r16v30 int[]), (r16v46 int[]) binds: [B:388:0x0970, B:372:0x091c, B:356:0x08c9, B:226:0x0651, B:144:0x04a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:484:0x0c21 A[PHI: r6 r13 r14 r28 r31 r33
      0x0c21: PHI (r6v96 int) = 
      (r6v71 int)
      (r6v72 int)
      (r6v73 int)
      (r6v74 int)
      (r6v75 int)
      (r6v76 int)
      (r6v78 int)
      (r6v79 int)
      (r6v88 int)
      (r3v103 int)
     binds: [B:482:0x0c0e, B:479:0x0bf4, B:476:0x0bda, B:473:0x0bc1, B:470:0x0ba7, B:467:0x0b8c, B:459:0x0b67, B:457:0x0b5d, B:424:0x0a83, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r13v99 int) = 
      (r13v77 int)
      (r13v78 int)
      (r13v79 int)
      (r13v80 int)
      (r13v81 int)
      (r13v82 int)
      (r13v84 int)
      (r13v85 int)
      (r13v90 int)
      (r12v89 int)
     binds: [B:482:0x0c0e, B:479:0x0bf4, B:476:0x0bda, B:473:0x0bc1, B:470:0x0ba7, B:467:0x0b8c, B:459:0x0b67, B:457:0x0b5d, B:424:0x0a83, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r14v92 int) = 
      (r14v70 int)
      (r14v71 int)
      (r14v72 int)
      (r14v73 int)
      (r14v74 int)
      (r14v75 int)
      (r14v77 int)
      (r14v78 int)
      (r14v83 int)
      (r14v93 int)
     binds: [B:482:0x0c0e, B:479:0x0bf4, B:476:0x0bda, B:473:0x0bc1, B:470:0x0ba7, B:467:0x0b8c, B:459:0x0b67, B:457:0x0b5d, B:424:0x0a83, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r28v15 com.google.android.gms.internal.measurement.l3) = 
      (r28v8 com.google.android.gms.internal.measurement.l3)
      (r28v8 com.google.android.gms.internal.measurement.l3)
      (r28v8 com.google.android.gms.internal.measurement.l3)
      (r28v8 com.google.android.gms.internal.measurement.l3)
      (r28v8 com.google.android.gms.internal.measurement.l3)
      (r28v8 com.google.android.gms.internal.measurement.l3)
      (r28v8 com.google.android.gms.internal.measurement.l3)
      (r28v8 com.google.android.gms.internal.measurement.l3)
      (r28v9 com.google.android.gms.internal.measurement.l3)
      (r28v8 com.google.android.gms.internal.measurement.l3)
     binds: [B:482:0x0c0e, B:479:0x0bf4, B:476:0x0bda, B:473:0x0bc1, B:470:0x0ba7, B:467:0x0b8c, B:459:0x0b67, B:457:0x0b5d, B:424:0x0a83, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r31v14 int) = 
      (r31v4 int)
      (r31v4 int)
      (r31v4 int)
      (r31v4 int)
      (r31v4 int)
      (r31v4 int)
      (r31v4 int)
      (r31v5 int)
      (r31v10 int)
      (r31v4 int)
     binds: [B:482:0x0c0e, B:479:0x0bf4, B:476:0x0bda, B:473:0x0bc1, B:470:0x0ba7, B:467:0x0b8c, B:459:0x0b67, B:457:0x0b5d, B:424:0x0a83, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]
      0x0c21: PHI (r33v28 sun.misc.Unsafe) = 
      (r33v8 sun.misc.Unsafe)
      (r33v9 sun.misc.Unsafe)
      (r33v10 sun.misc.Unsafe)
      (r33v11 sun.misc.Unsafe)
      (r33v12 sun.misc.Unsafe)
      (r33v13 sun.misc.Unsafe)
      (r33v15 sun.misc.Unsafe)
      (r33v16 sun.misc.Unsafe)
      (r33v21 sun.misc.Unsafe)
      (r14v69 sun.misc.Unsafe)
     binds: [B:482:0x0c0e, B:479:0x0bf4, B:476:0x0bda, B:473:0x0bc1, B:470:0x0ba7, B:467:0x0b8c, B:459:0x0b67, B:457:0x0b5d, B:424:0x0a83, B:413:0x0a23] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:502:0x0c76  */
    /* JADX WARN: Code duplicated, block: B:569:0x09a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x0c87 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0995 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0c24 A[SYNTHETIC] */
    public final int k(T t8, byte[] bArr, int i10, int i11, int i12, C1921v2 c1921v2) throws IOException {
        int[] iArr;
        Unsafe unsafe;
        T t10;
        InterfaceC1853l3 interfaceC1853l3;
        C1915u3<T> c1915u3;
        int i13;
        int iE;
        int i14;
        int iJ;
        int iJ2;
        C1921v2 c1921v3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Unsafe unsafe2;
        int i20;
        int i21;
        int iO;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        InterfaceC1853l3 interfaceC1853l4;
        int i30;
        int i31;
        int iO2;
        int iC;
        int i32;
        int i33;
        int i34;
        int iF;
        int iO3;
        Object obj;
        int i35;
        int i36;
        int i37;
        int i38;
        int iP;
        int i39;
        int iJ3;
        C1915u3<T> c1915u4 = this;
        T t11 = t8;
        int i40 = i11;
        int i41 = i12;
        c1921v2 = c1921v2;
        if (!F(t8)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(t8)));
        }
        Unsafe unsafe3 = f25870p;
        int iD = i10;
        int i42 = -1;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 1048575;
        while (true) {
            int[] iArr2 = c1915u4.f25871a;
            InterfaceC1853l3 interfaceC1853l5 = c1915u4.f25883n;
            if (iD < i40) {
                int i47 = iD + 1;
                int i48 = bArr[iD];
                if (i48 < 0) {
                    iE = C1928w2.e(i48, bArr, i47, c1921v2);
                    i13 = c1921v2.f25890a;
                } else {
                    i13 = i48;
                    iE = i47;
                }
                i42 = i13 >>> 3;
                int i49 = i13 & 7;
                int i50 = c1915u4.f25874d;
                int i51 = iE;
                int i52 = c1915u4.f25873c;
                if (i42 > i42) {
                    iJ2 = (i42 < i52 || i42 > i50) ? -1 : c1915u4.j(i42, i43 / 3);
                    i14 = 0;
                } else {
                    if (i42 < i52 || i42 > i50) {
                        i14 = 0;
                        iJ = -1;
                    } else {
                        i14 = 0;
                        iJ = c1915u4.j(i42, 0);
                    }
                    iJ2 = iJ;
                }
                if (iJ2 != -1) {
                    int i53 = iArr2[iJ2 + 1];
                    int i54 = (i53 & 267386880) >>> 20;
                    long j = i53 & 1048575;
                    int i55 = i13;
                    interfaceC1853l3 = interfaceC1853l5;
                    if (i54 <= 17) {
                        int i56 = iArr2[iJ2 + 2];
                        int i57 = 1 << (i56 >>> 20);
                        int i58 = 1048575;
                        int i59 = i56 & 1048575;
                        if (i59 != i46) {
                            if (i46 != 1048575) {
                                unsafe3.putInt(t11, i46, i45);
                                i58 = 1048575;
                            }
                            i19 = i59 == i58 ? 0 : unsafe3.getInt(t11, i59);
                            i46 = i59;
                        } else {
                            i19 = i45;
                            i46 = i46;
                        }
                        switch (i54) {
                            case 0:
                                c1921v2 = c1921v2;
                                i42 = i42;
                                iJ2 = iJ2;
                                i51 = i51;
                                i55 = i55;
                                unsafe2 = unsafe3;
                                i20 = i12;
                                if (i49 == 1) {
                                    V3.e(t11, j, C1928w2.a(i51, bArr));
                                    iD = i51 + 8;
                                    i21 = i19 | i57;
                                    i41 = i20;
                                    unsafe3 = unsafe2;
                                    i42 = i42;
                                    i40 = i11;
                                    i45 = i21;
                                    i43 = iJ2;
                                    c1921v2 = c1921v2;
                                    i44 = i55;
                                } else {
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 1:
                                c1921v2 = c1921v2;
                                i42 = i42;
                                iJ2 = iJ2;
                                i51 = i51;
                                i55 = i55;
                                unsafe2 = unsafe3;
                                i20 = i12;
                                if (i49 == 5) {
                                    V3.f(t11, j, C1928w2.l(i51, bArr));
                                    iD = i51 + 4;
                                    i21 = i19 | i57;
                                    i41 = i20;
                                    unsafe3 = unsafe2;
                                    i42 = i42;
                                    i40 = i11;
                                    i45 = i21;
                                    i43 = iJ2;
                                    c1921v2 = c1921v2;
                                    i44 = i55;
                                } else {
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 2:
                            case 3:
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                iJ2 = iJ2;
                                i51 = i51;
                                i55 = i55;
                                unsafe2 = unsafe3;
                                if (i49 == 0) {
                                    int iP2 = C1928w2.p(bArr, i51, c1921v2);
                                    unsafe2.putLong(t8, j, c1921v2.f25891b);
                                    i41 = i41;
                                    unsafe3 = unsafe2;
                                    c1921v2 = c1921v2;
                                    i40 = i11;
                                    iD = iP2;
                                    i44 = i55;
                                    i46 = i46;
                                    i43 = iJ2;
                                    i42 = i42;
                                    i45 = i19 | i57;
                                } else {
                                    i20 = i41;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 4:
                            case 11:
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                iJ2 = iJ2;
                                i51 = i51;
                                i55 = i55;
                                unsafe2 = unsafe3;
                                if (i49 == 0) {
                                    iO = C1928w2.o(bArr, i51, c1921v2);
                                    unsafe2.putInt(t11, j, c1921v2.f25890a);
                                    iD = iO;
                                    unsafe3 = unsafe2;
                                    i42 = i42;
                                    i40 = i11;
                                    i45 = i19 | i57;
                                    i43 = iJ2;
                                    c1921v2 = c1921v2;
                                    i44 = i55;
                                } else {
                                    i20 = i41;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 5:
                            case 14:
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                iJ2 = iJ2;
                                i51 = i51;
                                i55 = i55;
                                unsafe2 = unsafe3;
                                if (i49 == 1) {
                                    i22 = iJ2;
                                    unsafe2.putLong(t8, j, C1928w2.q(i51, bArr));
                                    i23 = i19 | i57;
                                    i41 = i41;
                                    unsafe3 = unsafe2;
                                    c1921v2 = c1921v2;
                                    i40 = i11;
                                    i44 = i55;
                                    iD = i51 + 8;
                                    i43 = i22;
                                    i42 = i42;
                                    i45 = i23;
                                } else {
                                    i20 = i41;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 6:
                            case 13:
                                i11 = i11;
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                iJ2 = iJ2;
                                i51 = i51;
                                i55 = i55;
                                unsafe2 = unsafe3;
                                if (i49 == 5) {
                                    unsafe2.putInt(t11, j, C1928w2.n(i51, bArr));
                                    iD = i51 + 4;
                                    i21 = i19 | i57;
                                    unsafe3 = unsafe2;
                                    i42 = i42;
                                    i40 = i11;
                                    i45 = i21;
                                    i43 = iJ2;
                                    c1921v2 = c1921v2;
                                    i44 = i55;
                                } else {
                                    i20 = i41;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 7:
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                iJ2 = iJ2;
                                i51 = i51;
                                i55 = i55;
                                unsafe2 = unsafe3;
                                if (i49 == 0) {
                                    iO = C1928w2.p(bArr, i51, c1921v2);
                                    V3.l(t11, j, c1921v2.f25891b != 0);
                                    iD = iO;
                                    unsafe3 = unsafe2;
                                    i42 = i42;
                                    i40 = i11;
                                    i45 = i19 | i57;
                                    i43 = iJ2;
                                    c1921v2 = c1921v2;
                                    i44 = i55;
                                } else {
                                    i20 = i41;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 8:
                                i41 = i12;
                                i42 = i42;
                                iJ2 = iJ2;
                                i51 = i51;
                                i55 = i55;
                                c1921v2 = c1921v2;
                                unsafe2 = unsafe3;
                                if (i49 == 2) {
                                    if ((i53 & 536870912) != 0) {
                                        iO = C1928w2.m(bArr, i51, c1921v2);
                                    } else {
                                        iO = C1928w2.o(bArr, i51, c1921v2);
                                        int i60 = c1921v2.f25890a;
                                        if (i60 < 0) {
                                            throw zzkb.b();
                                        }
                                        if (i60 == 0) {
                                            c1921v2.f25892c = "";
                                        } else {
                                            c1921v2.f25892c = new String(bArr, iO, i60, Q2.f25563a);
                                            iO += i60;
                                        }
                                    }
                                    unsafe2.putObject(t11, j, c1921v2.f25892c);
                                    iD = iO;
                                    unsafe3 = unsafe2;
                                    i42 = i42;
                                    i40 = i11;
                                    i45 = i19 | i57;
                                    i43 = iJ2;
                                    c1921v2 = c1921v2;
                                    i44 = i55;
                                } else {
                                    i20 = i41;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 9:
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                i51 = i51;
                                i55 = i55;
                                int i61 = iJ2;
                                unsafe2 = unsafe3;
                                i24 = i61;
                                if (i49 == 2) {
                                    Object objN = c1915u4.n(i24, t11);
                                    i22 = i24;
                                    int i62 = C1928w2.i(objN, c1915u4.C(i24), bArr, i51, i11, c1921v2);
                                    c1915u4.q(t11, i22, objN);
                                    i23 = i19 | i57;
                                    iD = i62;
                                    unsafe3 = unsafe2;
                                    c1921v2 = c1921v2;
                                    i40 = i11;
                                    i41 = i41;
                                    i44 = i55;
                                    i43 = i22;
                                    i42 = i42;
                                    i45 = i23;
                                } else {
                                    iJ2 = i24;
                                    i20 = i41;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 10:
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                i51 = i51;
                                i55 = i55;
                                int i63 = iJ2;
                                unsafe2 = unsafe3;
                                i24 = i63;
                                if (i49 == 2) {
                                    int iJ4 = C1928w2.j(bArr, i51, c1921v2);
                                    unsafe2.putObject(t11, j, c1921v2.f25892c);
                                    iD = iJ4;
                                    c1921v2 = c1921v2;
                                    i42 = i42;
                                    i40 = i11;
                                    i44 = i55;
                                    i45 = i19 | i57;
                                    Unsafe unsafe4 = unsafe2;
                                    i43 = i24;
                                    unsafe3 = unsafe4;
                                } else {
                                    iJ2 = i24;
                                    i20 = i41;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 12:
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                i25 = iJ2;
                                i51 = i51;
                                unsafe2 = unsafe3;
                                if (i49 == 0) {
                                    iD = C1928w2.o(bArr, i51, c1921v2);
                                    int i64 = c1921v2.f25890a;
                                    i24 = i25;
                                    R2 r2B = c1915u4.B(i24);
                                    if ((i53 & Integer.MIN_VALUE) == 0 || r2B == null || r2B.c(i64)) {
                                        i26 = i55;
                                        unsafe2.putInt(t11, j, i64);
                                        i45 = i19 | i57;
                                    } else {
                                        i26 = i55;
                                        D(t8).c(i26, Long.valueOf(i64));
                                        i45 = i19;
                                    }
                                    i44 = i26;
                                    i40 = i11;
                                    Unsafe unsafe5 = unsafe2;
                                    i43 = i24;
                                    unsafe3 = unsafe5;
                                } else {
                                    i20 = i41;
                                    i55 = i55;
                                    iJ2 = i25;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 15:
                                i41 = i12;
                                c1921v2 = c1921v2;
                                i42 = i42;
                                i25 = iJ2;
                                i51 = i51;
                                unsafe2 = unsafe3;
                                if (i49 == 0) {
                                    int iO4 = C1928w2.o(bArr, i51, c1921v2);
                                    unsafe2.putInt(t11, j, AbstractC1947z2.a(c1921v2.f25890a));
                                    i23 = i19 | i57;
                                    iD = iO4;
                                    unsafe3 = unsafe2;
                                    c1921v2 = c1921v2;
                                    i42 = i42;
                                    i40 = i11;
                                    i44 = i55;
                                    i46 = i46;
                                    i43 = i25;
                                    i45 = i23;
                                } else {
                                    i20 = i41;
                                    i55 = i55;
                                    iJ2 = i25;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 16:
                                int i65 = iJ2;
                                i51 = i51;
                                if (i49 == 0) {
                                    int iP3 = C1928w2.p(bArr, i51, c1921v2);
                                    unsafe3.putLong(t8, j, AbstractC1947z2.b(c1921v2.f25891b));
                                    i45 = i19 | i57;
                                    i40 = i11;
                                    i41 = i12;
                                    unsafe3 = unsafe3;
                                    c1921v2 = c1921v2;
                                    i42 = i42;
                                    i44 = i55;
                                    i46 = i46;
                                    i43 = i65;
                                    iD = iP3;
                                } else {
                                    c1921v2 = c1921v2;
                                    i42 = i42;
                                    unsafe2 = unsafe3;
                                    i20 = i12;
                                    iJ2 = i65;
                                    i55 = i55;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            case 17:
                                if (i49 == 3) {
                                    Object objN2 = c1915u4.n(iJ2, t11);
                                    int i66 = iJ2;
                                    iD = C1928w2.h(objN2, c1915u4.C(iJ2), bArr, i51, i11, (i42 << 3) | 4, c1921v2);
                                    c1915u4.q(t11, i66, objN2);
                                    i45 = i19 | i57;
                                    c1921v2 = c1921v2;
                                    i42 = i42;
                                    i44 = i55;
                                    i43 = i66;
                                    i46 = i46;
                                    i40 = i11;
                                    i41 = i12;
                                } else {
                                    unsafe2 = unsafe3;
                                    i20 = i12;
                                    i15 = iJ2;
                                    unsafe = unsafe2;
                                    i18 = i42;
                                    i17 = i51;
                                    i45 = i19;
                                    i16 = i55;
                                    iArr = iArr2;
                                    i12 = i20;
                                    t10 = t11;
                                    c1915u3 = c1915u4;
                                    c1921v3 = c1921v2;
                                }
                                break;
                            default:
                                unsafe2 = unsafe3;
                                i20 = i12;
                                i15 = iJ2;
                                unsafe = unsafe2;
                                i18 = i42;
                                i17 = i51;
                                i45 = i19;
                                i16 = i55;
                                iArr = iArr2;
                                i12 = i20;
                                t10 = t11;
                                c1915u3 = c1915u4;
                                c1921v3 = c1921v2;
                                break;
                        }
                    } else {
                        int i67 = i51;
                        C1921v2 c1921v4 = c1921v2;
                        int i68 = iJ2;
                        Unsafe unsafe6 = unsafe3;
                        if (i54 != 27) {
                            i46 = i46;
                            C1921v2 c1921v5 = c1921v4;
                            i16 = i55;
                            i27 = i45;
                            Unsafe unsafe7 = unsafe6;
                            if (i54 <= 49) {
                                long j10 = i53;
                                Unsafe unsafe8 = f25870p;
                                V2 v2C = (V2) unsafe8.getObject(t11, j);
                                if (!v2C.y()) {
                                    int size = v2C.size();
                                    v2C = v2C.c(size != 0 ? size << 1 : 10);
                                    unsafe8.putObject(t11, j, v2C);
                                }
                                V2 v10 = v2C;
                                switch (i54) {
                                    case 18:
                                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                        i30 = i11;
                                        i15 = i68;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        iArr = iArr2;
                                        i16 = i16;
                                        i31 = i42;
                                        if (i49 != 2) {
                                            if (i49 == 1) {
                                                C2 c10 = (C2) v10;
                                                c10.e(C1928w2.a(i67, bArr));
                                                iO2 = i67 + 8;
                                                while (iO2 < i30) {
                                                    int iO5 = C1928w2.o(bArr, iO2, c1921v5);
                                                    if (i16 == c1921v5.f25890a) {
                                                        c10.e(C1928w2.a(iO5, bArr));
                                                        iO2 = iO5 + 8;
                                                    }
                                                }
                                            } else {
                                                iC = i67;
                                            }
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            C2 c11 = (C2) v10;
                                            iO2 = C1928w2.o(bArr, i67, c1921v5);
                                            int i69 = c1921v5.f25890a + iO2;
                                            while (iO2 < i69) {
                                                c11.e(C1928w2.a(iO2, bArr));
                                                iO2 += 8;
                                            }
                                            if (iO2 != i69) {
                                                throw zzkb.d();
                                            }
                                        }
                                        iC = iO2;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case 19:
                                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                        i30 = i11;
                                        i15 = i68;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        iArr = iArr2;
                                        i16 = i16;
                                        i31 = i42;
                                        if (i49 != 2) {
                                            if (i49 == 5) {
                                                K2 k10 = (K2) v10;
                                                k10.e(C1928w2.l(i67, bArr));
                                                iO2 = i67 + 4;
                                                while (iO2 < i30) {
                                                    int iO6 = C1928w2.o(bArr, iO2, c1921v5);
                                                    if (i16 == c1921v5.f25890a) {
                                                        k10.e(C1928w2.l(iO6, bArr));
                                                        iO2 = iO6 + 4;
                                                    }
                                                }
                                            } else {
                                                iC = i67;
                                            }
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            K2 k11 = (K2) v10;
                                            iO2 = C1928w2.o(bArr, i67, c1921v5);
                                            int i70 = c1921v5.f25890a + iO2;
                                            while (iO2 < i70) {
                                                k11.e(C1928w2.l(iO2, bArr));
                                                iO2 += 4;
                                            }
                                            if (iO2 != i70) {
                                                throw zzkb.d();
                                            }
                                        }
                                        iC = iO2;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                        i30 = i11;
                                        i15 = i68;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        iArr = iArr2;
                                        i16 = i16;
                                        i31 = i42;
                                        if (i49 != 2) {
                                            if (i49 == 0) {
                                                C1811f3 c1811f3 = (C1811f3) v10;
                                                iO2 = C1928w2.p(bArr, i67, c1921v5);
                                                c1811f3.e(c1921v5.f25891b);
                                                while (iO2 < i30) {
                                                    int iO7 = C1928w2.o(bArr, iO2, c1921v5);
                                                    if (i16 == c1921v5.f25890a) {
                                                        iO2 = C1928w2.p(bArr, iO7, c1921v5);
                                                        c1811f3.e(c1921v5.f25891b);
                                                    }
                                                }
                                            } else {
                                                iC = i67;
                                            }
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            C1811f3 c1811f4 = (C1811f3) v10;
                                            iO2 = C1928w2.o(bArr, i67, c1921v5);
                                            int i71 = c1921v5.f25890a + iO2;
                                            while (iO2 < i71) {
                                                iO2 = C1928w2.p(bArr, iO2, c1921v5);
                                                c1811f4.e(c1921v5.f25891b);
                                            }
                                            if (iO2 != i71) {
                                                throw zzkb.d();
                                            }
                                        }
                                        iC = iO2;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                        i32 = i68;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        iArr = iArr2;
                                        i33 = i42;
                                        i34 = i11;
                                        i16 = i16;
                                        if (i49 == 2) {
                                            iC = C1928w2.k(bArr, i67, v10, c1921v5);
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                        } else if (i49 == 0) {
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                            iC = C1928w2.c(i16, bArr, i67, i11, v10, c1921v2);
                                        } else {
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                            iC = i67;
                                        }
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case 23:
                                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                        i32 = i68;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        iArr = iArr2;
                                        i33 = i42;
                                        i34 = i11;
                                        i16 = i16;
                                        if (i49 != 2) {
                                            if (i49 == 1) {
                                                C1811f3 c1811f5 = (C1811f3) v10;
                                                c1811f5.e(C1928w2.q(i67, bArr));
                                                iF = i67 + 8;
                                                while (iF < i34) {
                                                    int iO8 = C1928w2.o(bArr, iF, c1921v5);
                                                    if (i16 != c1921v5.f25890a) {
                                                        i15 = i32;
                                                        i31 = i33;
                                                        iC = iF;
                                                        i30 = i34;
                                                        if (iC == i67) {
                                                            t10 = t8;
                                                            i17 = iC;
                                                            c1921v3 = c1921v5;
                                                            i18 = i31;
                                                            interfaceC1853l3 = interfaceC1853l3;
                                                            unsafe = unsafe7;
                                                            c1915u3 = this;
                                                            i16 = i16;
                                                            i45 = i27;
                                                        } else {
                                                            c1915u4 = this;
                                                            i41 = i12;
                                                            c1921v2 = c1921v5;
                                                            i40 = i30;
                                                            i43 = i15;
                                                            i42 = i31;
                                                            i44 = i16;
                                                            unsafe3 = unsafe7;
                                                            i45 = i27;
                                                            i46 = i46;
                                                            t11 = t8;
                                                            iD = iC;
                                                        }
                                                    } else {
                                                        c1811f5.e(C1928w2.q(iO8, bArr));
                                                        iF = iO8 + 8;
                                                    }
                                                    break;
                                                }
                                                i15 = i32;
                                                i31 = i33;
                                                iC = iF;
                                                i30 = i34;
                                                if (iC == i67) {
                                                    t10 = t8;
                                                    i17 = iC;
                                                    c1921v3 = c1921v5;
                                                    i18 = i31;
                                                    interfaceC1853l3 = interfaceC1853l3;
                                                    unsafe = unsafe7;
                                                    c1915u3 = this;
                                                    i16 = i16;
                                                    i45 = i27;
                                                } else {
                                                    c1915u4 = this;
                                                    i41 = i12;
                                                    c1921v2 = c1921v5;
                                                    i40 = i30;
                                                    i43 = i15;
                                                    i42 = i31;
                                                    i44 = i16;
                                                    unsafe3 = unsafe7;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    t11 = t8;
                                                    iD = iC;
                                                }
                                            }
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                            break;
                                        } else {
                                            C1811f3 c1811f6 = (C1811f3) v10;
                                            iO3 = C1928w2.o(bArr, i67, c1921v5);
                                            int i72 = c1921v5.f25890a + iO3;
                                            while (iO3 < i72) {
                                                c1811f6.e(C1928w2.q(iO3, bArr));
                                                iO3 += 8;
                                            }
                                            if (iO3 != i72) {
                                                throw zzkb.d();
                                            }
                                            iC = iO3;
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                        i32 = i68;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        iArr = iArr2;
                                        i33 = i42;
                                        i34 = i11;
                                        i16 = i16;
                                        if (i49 != 2) {
                                            if (i49 == 5) {
                                                O2 o10 = (O2) v10;
                                                o10.e(C1928w2.n(i67, bArr));
                                                iF = i67 + 4;
                                                while (iF < i34) {
                                                    int iO9 = C1928w2.o(bArr, iF, c1921v5);
                                                    if (i16 != c1921v5.f25890a) {
                                                        i15 = i32;
                                                        i31 = i33;
                                                        iC = iF;
                                                        i30 = i34;
                                                        if (iC == i67) {
                                                            t10 = t8;
                                                            i17 = iC;
                                                            c1921v3 = c1921v5;
                                                            i18 = i31;
                                                            interfaceC1853l3 = interfaceC1853l3;
                                                            unsafe = unsafe7;
                                                            c1915u3 = this;
                                                            i16 = i16;
                                                            i45 = i27;
                                                        } else {
                                                            c1915u4 = this;
                                                            i41 = i12;
                                                            c1921v2 = c1921v5;
                                                            i40 = i30;
                                                            i43 = i15;
                                                            i42 = i31;
                                                            i44 = i16;
                                                            unsafe3 = unsafe7;
                                                            i45 = i27;
                                                            i46 = i46;
                                                            t11 = t8;
                                                            iD = iC;
                                                        }
                                                    } else {
                                                        o10.e(C1928w2.n(iO9, bArr));
                                                        iF = iO9 + 4;
                                                    }
                                                    break;
                                                }
                                                i15 = i32;
                                                i31 = i33;
                                                iC = iF;
                                                i30 = i34;
                                                if (iC == i67) {
                                                    t10 = t8;
                                                    i17 = iC;
                                                    c1921v3 = c1921v5;
                                                    i18 = i31;
                                                    interfaceC1853l3 = interfaceC1853l3;
                                                    unsafe = unsafe7;
                                                    c1915u3 = this;
                                                    i16 = i16;
                                                    i45 = i27;
                                                } else {
                                                    c1915u4 = this;
                                                    i41 = i12;
                                                    c1921v2 = c1921v5;
                                                    i40 = i30;
                                                    i43 = i15;
                                                    i42 = i31;
                                                    i44 = i16;
                                                    unsafe3 = unsafe7;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    t11 = t8;
                                                    iD = iC;
                                                }
                                            }
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                            break;
                                        } else {
                                            O2 o11 = (O2) v10;
                                            iO3 = C1928w2.o(bArr, i67, c1921v5);
                                            int i73 = c1921v5.f25890a + iO3;
                                            while (iO3 < i73) {
                                                o11.e(C1928w2.n(iO3, bArr));
                                                iO3 += 4;
                                            }
                                            if (iO3 != i73) {
                                                throw zzkb.d();
                                            }
                                            iC = iO3;
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        }
                                        break;
                                    case 25:
                                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                        i32 = i68;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        iArr = iArr2;
                                        i33 = i42;
                                        i34 = i11;
                                        i16 = i16;
                                        if (i49 != 2) {
                                            if (i49 == 0) {
                                                C1935x2 c1935x2 = (C1935x2) v10;
                                                iO3 = C1928w2.p(bArr, i67, c1921v5);
                                                c1935x2.e(c1921v5.f25891b != 0);
                                                while (iO3 < i34) {
                                                    int iO10 = C1928w2.o(bArr, iO3, c1921v5);
                                                    if (i16 == c1921v5.f25890a) {
                                                        iO3 = C1928w2.p(bArr, iO10, c1921v5);
                                                        c1935x2.e(c1921v5.f25891b != 0);
                                                    }
                                                }
                                            }
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            C1935x2 c1935x3 = (C1935x2) v10;
                                            iO3 = C1928w2.o(bArr, i67, c1921v5);
                                            int i74 = c1921v5.f25890a + iO3;
                                            while (iO3 < i74) {
                                                iO3 = C1928w2.p(bArr, iO3, c1921v5);
                                                c1935x3.e(c1921v5.f25891b != 0);
                                            }
                                            if (iO3 != i74) {
                                                throw zzkb.d();
                                            }
                                        }
                                        iC = iO3;
                                        i30 = i34;
                                        i15 = i32;
                                        i31 = i33;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case 26:
                                        i32 = i68;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        iArr = iArr2;
                                        i33 = i42;
                                        i34 = i11;
                                        i16 = i16;
                                        if (i49 == 2) {
                                            if ((j10 & 536870912) == 0) {
                                                iC = C1928w2.o(bArr, i67, c1921v5);
                                                int i75 = c1921v5.f25890a;
                                                if (i75 < 0) {
                                                    throw zzkb.b();
                                                }
                                                if (i75 == 0) {
                                                    obj = "";
                                                    v10.add(obj);
                                                } else {
                                                    obj = "";
                                                    v10.add(new String(bArr, iC, i75, Q2.f25563a));
                                                    iC += i75;
                                                }
                                                while (iC < i34) {
                                                    int iO11 = C1928w2.o(bArr, iC, c1921v5);
                                                    if (i16 == c1921v5.f25890a) {
                                                        iC = C1928w2.o(bArr, iO11, c1921v5);
                                                        int i76 = c1921v5.f25890a;
                                                        if (i76 < 0) {
                                                            throw zzkb.b();
                                                        }
                                                        if (i76 == 0) {
                                                            v10.add(obj);
                                                        } else {
                                                            v10.add(new String(bArr, iC, i76, Q2.f25563a));
                                                            iC += i76;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iC = C1928w2.o(bArr, i67, c1921v5);
                                                int i77 = c1921v5.f25890a;
                                                if (i77 < 0) {
                                                    throw zzkb.b();
                                                }
                                                if (i77 == 0) {
                                                    v10.add("");
                                                } else {
                                                    int i78 = iC + i77;
                                                    if (!Z3.d(bArr, iC, i78)) {
                                                        throw zzkb.a();
                                                    }
                                                    v10.add(new String(bArr, iC, i77, Q2.f25563a));
                                                    iC = i78;
                                                }
                                                while (iC < i34) {
                                                    int iO12 = C1928w2.o(bArr, iC, c1921v5);
                                                    if (i16 == c1921v5.f25890a) {
                                                        iC = C1928w2.o(bArr, iO12, c1921v5);
                                                        int i79 = c1921v5.f25890a;
                                                        if (i79 < 0) {
                                                            throw zzkb.b();
                                                        }
                                                        if (i79 == 0) {
                                                            v10.add("");
                                                        } else {
                                                            int i80 = iC + i79;
                                                            if (!Z3.d(bArr, iC, i80)) {
                                                                throw zzkb.a();
                                                            }
                                                            v10.add(new String(bArr, iC, i79, Q2.f25563a));
                                                            iC = i80;
                                                        }
                                                    }
                                                }
                                            }
                                            i30 = i34;
                                            i15 = i32;
                                            i31 = i33;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        }
                                        i30 = i34;
                                        i15 = i32;
                                        i31 = i33;
                                        iC = i67;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case 27:
                                        iArr = iArr2;
                                        i33 = i42;
                                        if (i49 == 2) {
                                            E3 e3C = c1915u4.C(i68);
                                            i34 = i11;
                                            c1921v5 = c1921v5;
                                            i67 = i67;
                                            iF = C1928w2.f(e3C, i16, bArr, i67, i11, v10, c1921v2);
                                            i16 = i16;
                                            unsafe7 = unsafe7;
                                            i15 = i68;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            i31 = i33;
                                            iC = iF;
                                            i30 = i34;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            i15 = i68;
                                            i30 = i11;
                                            unsafe7 = unsafe7;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            i31 = i33;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        }
                                        break;
                                    case 28:
                                        i35 = i11;
                                        i36 = i68;
                                        iArr = iArr2;
                                        i33 = i42;
                                        if (i49 == 2) {
                                            iC = C1928w2.o(bArr, i67, c1921v5);
                                            int i81 = c1921v5.f25890a;
                                            if (i81 < 0) {
                                                throw zzkb.b();
                                            }
                                            if (i81 > bArr.length - iC) {
                                                throw zzkb.d();
                                            }
                                            if (i81 == 0) {
                                                v10.add(zzij.f26049b);
                                            } else {
                                                v10.add(zzij.q(bArr, iC, i81));
                                                iC += i81;
                                            }
                                            while (iC < i35) {
                                                int iO13 = C1928w2.o(bArr, iC, c1921v5);
                                                if (i16 != c1921v5.f25890a) {
                                                    i15 = i36;
                                                    i30 = i35;
                                                    i16 = i16;
                                                    c1921v5 = c1921v5;
                                                    i67 = i67;
                                                    unsafe7 = unsafe7;
                                                    interfaceC1853l3 = interfaceC1853l3;
                                                    i31 = i33;
                                                    if (iC == i67) {
                                                        t10 = t8;
                                                        i17 = iC;
                                                        c1921v3 = c1921v5;
                                                        i18 = i31;
                                                        interfaceC1853l3 = interfaceC1853l3;
                                                        unsafe = unsafe7;
                                                        c1915u3 = this;
                                                        i16 = i16;
                                                        i45 = i27;
                                                    } else {
                                                        c1915u4 = this;
                                                        i41 = i12;
                                                        c1921v2 = c1921v5;
                                                        i40 = i30;
                                                        i43 = i15;
                                                        i42 = i31;
                                                        i44 = i16;
                                                        unsafe3 = unsafe7;
                                                        i45 = i27;
                                                        i46 = i46;
                                                        t11 = t8;
                                                        iD = iC;
                                                    }
                                                    break;
                                                } else {
                                                    iC = C1928w2.o(bArr, iO13, c1921v5);
                                                    int i82 = c1921v5.f25890a;
                                                    if (i82 < 0) {
                                                        throw zzkb.b();
                                                    }
                                                    if (i82 > bArr.length - iC) {
                                                        throw zzkb.d();
                                                    }
                                                    if (i82 == 0) {
                                                        v10.add(zzij.f26049b);
                                                    } else {
                                                        v10.add(zzij.q(bArr, iC, i82));
                                                        iC += i82;
                                                    }
                                                }
                                            }
                                            i15 = i36;
                                            i30 = i35;
                                            i16 = i16;
                                            c1921v5 = c1921v5;
                                            i67 = i67;
                                            unsafe7 = unsafe7;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            i31 = i33;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            i15 = i36;
                                            i30 = i35;
                                            unsafe7 = unsafe7;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            i31 = i33;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                    case 44:
                                        i35 = i11;
                                        iArr = iArr2;
                                        if (i49 == 2) {
                                            iC = C1928w2.k(bArr, i67, v10, c1921v5);
                                        } else if (i49 != 0) {
                                            i15 = i68;
                                            i30 = i35;
                                            i31 = i42;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            iC = C1928w2.c(i16, bArr, i67, i11, v10, c1921v2);
                                        }
                                        i36 = i68;
                                        i33 = i42;
                                        H3.i(t8, i33, v10, c1915u4.B(i68), c1915u4.f25881l);
                                        i15 = i36;
                                        i30 = i35;
                                        i16 = i16;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        i31 = i33;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                        i35 = i11;
                                        i37 = i68;
                                        iArr = iArr2;
                                        if (i49 != 2) {
                                            if (i49 == 0) {
                                                O2 o12 = (O2) v10;
                                                iC = C1928w2.o(bArr, i67, c1921v5);
                                                o12.e(AbstractC1947z2.a(c1921v5.f25890a));
                                                while (iC < i35) {
                                                    int iO14 = C1928w2.o(bArr, iC, c1921v5);
                                                    if (i16 == c1921v5.f25890a) {
                                                        iC = C1928w2.o(bArr, iO14, c1921v5);
                                                        o12.e(AbstractC1947z2.a(c1921v5.f25890a));
                                                    }
                                                }
                                            }
                                            i15 = i37;
                                            i30 = i35;
                                            i31 = i42;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            O2 o13 = (O2) v10;
                                            iC = C1928w2.o(bArr, i67, c1921v5);
                                            int i83 = c1921v5.f25890a + iC;
                                            while (iC < i83) {
                                                iC = C1928w2.o(bArr, iC, c1921v5);
                                                o13.e(AbstractC1947z2.a(c1921v5.f25890a));
                                            }
                                            if (iC != i83) {
                                                throw zzkb.d();
                                            }
                                        }
                                        i15 = i37;
                                        i30 = i35;
                                        i16 = i16;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        i31 = i42;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                        i35 = i11;
                                        i37 = i68;
                                        iArr = iArr2;
                                        if (i49 != 2) {
                                            if (i49 == 0) {
                                                C1811f3 c1811f7 = (C1811f3) v10;
                                                iC = C1928w2.p(bArr, i67, c1921v5);
                                                c1811f7.e(AbstractC1947z2.b(c1921v5.f25891b));
                                                while (iC < i35) {
                                                    int iO15 = C1928w2.o(bArr, iC, c1921v5);
                                                    if (i16 == c1921v5.f25890a) {
                                                        iC = C1928w2.p(bArr, iO15, c1921v5);
                                                        c1811f7.e(AbstractC1947z2.b(c1921v5.f25891b));
                                                    }
                                                }
                                            }
                                            i15 = i37;
                                            i30 = i35;
                                            i31 = i42;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            C1811f3 c1811f8 = (C1811f3) v10;
                                            iC = C1928w2.o(bArr, i67, c1921v5);
                                            int i84 = c1921v5.f25890a + iC;
                                            while (iC < i84) {
                                                iC = C1928w2.p(bArr, iC, c1921v5);
                                                c1811f8.e(AbstractC1947z2.b(c1921v5.f25891b));
                                            }
                                            if (iC != i84) {
                                                throw zzkb.d();
                                            }
                                        }
                                        i15 = i37;
                                        i30 = i35;
                                        i16 = i16;
                                        c1921v5 = c1921v5;
                                        i67 = i67;
                                        unsafe7 = unsafe7;
                                        interfaceC1853l3 = interfaceC1853l3;
                                        i31 = i42;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                        if (i49 == 3) {
                                            E3 e3C2 = c1915u4.C(i68);
                                            int i85 = (i16 & (-8)) | 4;
                                            i35 = i11;
                                            iArr = iArr2;
                                            i37 = i68;
                                            iC = C1928w2.g(e3C2, bArr, i67, i11, i85, c1921v2);
                                            v10.add(c1921v5.f25892c);
                                            while (iC < i35) {
                                                int iO16 = C1928w2.o(bArr, iC, c1921v5);
                                                if (i16 != c1921v5.f25890a) {
                                                    i15 = i37;
                                                    i30 = i35;
                                                    i16 = i16;
                                                    c1921v5 = c1921v5;
                                                    i67 = i67;
                                                    unsafe7 = unsafe7;
                                                    interfaceC1853l3 = interfaceC1853l3;
                                                    i31 = i42;
                                                    if (iC == i67) {
                                                        t10 = t8;
                                                        i17 = iC;
                                                        c1921v3 = c1921v5;
                                                        i18 = i31;
                                                        interfaceC1853l3 = interfaceC1853l3;
                                                        unsafe = unsafe7;
                                                        c1915u3 = this;
                                                        i16 = i16;
                                                        i45 = i27;
                                                    } else {
                                                        c1915u4 = this;
                                                        i41 = i12;
                                                        c1921v2 = c1921v5;
                                                        i40 = i30;
                                                        i43 = i15;
                                                        i42 = i31;
                                                        i44 = i16;
                                                        unsafe3 = unsafe7;
                                                        i45 = i27;
                                                        i46 = i46;
                                                        t11 = t8;
                                                        iD = iC;
                                                    }
                                                } else {
                                                    iC = C1928w2.g(e3C2, bArr, iO16, i11, i85, c1921v2);
                                                    v10.add(c1921v5.f25892c);
                                                }
                                                break;
                                            }
                                            i15 = i37;
                                            i30 = i35;
                                            i16 = i16;
                                            c1921v5 = c1921v5;
                                            i67 = i67;
                                            unsafe7 = unsafe7;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            i31 = i42;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        } else {
                                            iArr = iArr2;
                                            i30 = i11;
                                            i15 = i68;
                                            i31 = i42;
                                            iC = i67;
                                            if (iC == i67) {
                                                t10 = t8;
                                                i17 = iC;
                                                c1921v3 = c1921v5;
                                                i18 = i31;
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe = unsafe7;
                                                c1915u3 = this;
                                                i16 = i16;
                                                i45 = i27;
                                            } else {
                                                c1915u4 = this;
                                                i41 = i12;
                                                c1921v2 = c1921v5;
                                                i40 = i30;
                                                i43 = i15;
                                                i42 = i31;
                                                i44 = i16;
                                                unsafe3 = unsafe7;
                                                i45 = i27;
                                                i46 = i46;
                                                t11 = t8;
                                                iD = iC;
                                            }
                                        }
                                        break;
                                    default:
                                        i30 = i11;
                                        i15 = i68;
                                        iArr = iArr2;
                                        i31 = i42;
                                        iC = i67;
                                        if (iC == i67) {
                                            t10 = t8;
                                            i17 = iC;
                                            c1921v3 = c1921v5;
                                            i18 = i31;
                                            interfaceC1853l3 = interfaceC1853l3;
                                            unsafe = unsafe7;
                                            c1915u3 = this;
                                            i16 = i16;
                                            i45 = i27;
                                        } else {
                                            c1915u4 = this;
                                            i41 = i12;
                                            c1921v2 = c1921v5;
                                            i40 = i30;
                                            i43 = i15;
                                            i42 = i31;
                                            i44 = i16;
                                            unsafe3 = unsafe7;
                                            i45 = i27;
                                            i46 = i46;
                                            t11 = t8;
                                            iD = iC;
                                        }
                                        break;
                                }
                            } else {
                                interfaceC1853l4 = interfaceC1853l3;
                                iArr = iArr2;
                                unsafe = unsafe7;
                                i16 = i16;
                                i28 = i68;
                                i18 = i42;
                                if (i54 != 50) {
                                    t10 = t8;
                                    c1921v3 = c1921v5;
                                    c1915u3 = this;
                                    Unsafe unsafe9 = f25870p;
                                    interfaceC1853l3 = interfaceC1853l4;
                                    int i86 = i28;
                                    long j11 = iArr[i28 + 2] & 1048575;
                                    switch (i54) {
                                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                            i18 = i18;
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            if (i49 == 1) {
                                                unsafe9.putObject(t10, j, Double.valueOf(C1928w2.a(i38, bArr)));
                                                iD = i38 + 8;
                                                unsafe9.putInt(t10, j11, i18);
                                            } else {
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i87 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i87;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                            i18 = i18;
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            if (i49 == 5) {
                                                unsafe9.putObject(t10, j, Float.valueOf(C1928w2.l(i38, bArr)));
                                                iD = i38 + 4;
                                                unsafe9.putInt(t10, j11, i18);
                                            } else {
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i88 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i88;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                            i18 = i18;
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            if (i49 == 0) {
                                                iP = C1928w2.p(bArr, i38, c1921v3);
                                                unsafe9.putObject(t10, j, Long.valueOf(c1921v3.f25891b));
                                                unsafe9.putInt(t10, j11, i18);
                                                iD = iP;
                                            } else {
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i89 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i89;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                            i18 = i18;
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            if (i49 == 0) {
                                                iP = C1928w2.o(bArr, i38, c1921v3);
                                                unsafe9.putObject(t10, j, Integer.valueOf(c1921v3.f25890a));
                                                unsafe9.putInt(t10, j11, i18);
                                                iD = iP;
                                            } else {
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i810 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i810;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                            i18 = i18;
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            if (i49 == 1) {
                                                unsafe9.putObject(t10, j, Long.valueOf(C1928w2.q(i38, bArr)));
                                                iD = i38 + 8;
                                                unsafe9.putInt(t10, j11, i18);
                                            } else {
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i811 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i811;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                            i18 = i18;
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            if (i49 == 5) {
                                                unsafe9.putObject(t10, j, Integer.valueOf(C1928w2.n(i38, bArr)));
                                                iD = i38 + 4;
                                                unsafe9.putInt(t10, j11, i18);
                                            } else {
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i812 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i812;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                            i18 = i18;
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            if (i49 == 0) {
                                                iP = C1928w2.p(bArr, i38, c1921v3);
                                                unsafe9.putObject(t10, j, Boolean.valueOf(c1921v3.f25891b != 0));
                                                unsafe9.putInt(t10, j11, i18);
                                                iD = iP;
                                            } else {
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i813 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i813;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                            i18 = i18;
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            i86 = i86;
                                            if (i49 == 2) {
                                                int iO17 = C1928w2.o(bArr, i38, c1921v3);
                                                int i90 = c1921v3.f25890a;
                                                if (i90 == 0) {
                                                    unsafe9.putObject(t10, j, "");
                                                } else {
                                                    if ((i53 & 536870912) != 0 && !Z3.d(bArr, iO17, iO17 + i90)) {
                                                        throw zzkb.a();
                                                    }
                                                    unsafe9.putObject(t10, j, new String(bArr, iO17, i90, Q2.f25563a));
                                                    iO17 += i90;
                                                }
                                                unsafe9.putInt(t10, j11, i18);
                                                iD = iO17;
                                            } else {
                                                i86 = i86;
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i814 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i814;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            i39 = i86;
                                            if (i49 == 2) {
                                                Object objM = c1915u3.m(i18, i39, t10);
                                                int i91 = C1928w2.i(objM, c1915u3.C(i39), bArr, i38, i11, c1921v2);
                                                c1915u3.p(i18, i39, t10, objM);
                                                iD = i91;
                                                i86 = i39;
                                                i18 = i18;
                                            } else {
                                                i86 = i39;
                                                i18 = i18;
                                                iD = i38;
                                            }
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i815 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i815;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            i39 = i86;
                                            if (i49 == 2) {
                                                iJ3 = C1928w2.j(bArr, i38, c1921v3);
                                                unsafe9.putObject(t10, j, c1921v3.f25892c);
                                                unsafe9.putInt(t10, j11, i18);
                                                iD = iJ3;
                                                i86 = i39;
                                                i18 = i18;
                                                if (iD == i38) {
                                                    i12 = i12;
                                                    i17 = iD;
                                                    i45 = i27;
                                                    i15 = i86;
                                                } else {
                                                    int i816 = i18;
                                                    i40 = i11;
                                                    i41 = i12;
                                                    c1921v2 = c1921v3;
                                                    c1915u4 = c1915u3;
                                                    t11 = t10;
                                                    i42 = i816;
                                                    i44 = i16;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    i43 = i86;
                                                    unsafe3 = unsafe;
                                                }
                                            }
                                            i86 = i39;
                                            i18 = i18;
                                            iD = i38;
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i817 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i817;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            i39 = i86;
                                            if (i49 == 0) {
                                                iJ3 = C1928w2.o(bArr, i38, c1921v3);
                                                int i92 = c1921v3.f25890a;
                                                R2 r2B2 = c1915u3.B(i39);
                                                if (r2B2 == null || r2B2.c(i92)) {
                                                    unsafe9.putObject(t10, j, Integer.valueOf(i92));
                                                    unsafe9.putInt(t10, j11, i18);
                                                } else {
                                                    D(t8).c(i16, Long.valueOf(i92));
                                                }
                                                iD = iJ3;
                                                i86 = i39;
                                                i18 = i18;
                                                if (iD == i38) {
                                                    i12 = i12;
                                                    i17 = iD;
                                                    i45 = i27;
                                                    i15 = i86;
                                                } else {
                                                    int i818 = i18;
                                                    i40 = i11;
                                                    i41 = i12;
                                                    c1921v2 = c1921v3;
                                                    c1915u4 = c1915u3;
                                                    t11 = t10;
                                                    i42 = i818;
                                                    i44 = i16;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    i43 = i86;
                                                    unsafe3 = unsafe;
                                                }
                                            }
                                            i86 = i39;
                                            i18 = i18;
                                            iD = i38;
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i819 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i819;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i38 = i67;
                                            i39 = i86;
                                            if (i49 == 0) {
                                                iJ3 = C1928w2.o(bArr, i38, c1921v3);
                                                unsafe9.putObject(t10, j, Integer.valueOf(AbstractC1947z2.a(c1921v3.f25890a)));
                                                unsafe9.putInt(t10, j11, i18);
                                                iD = iJ3;
                                                i86 = i39;
                                                i18 = i18;
                                                if (iD == i38) {
                                                    i12 = i12;
                                                    i17 = iD;
                                                    i45 = i27;
                                                    i15 = i86;
                                                } else {
                                                    int i8110 = i18;
                                                    i40 = i11;
                                                    i41 = i12;
                                                    c1921v2 = c1921v3;
                                                    c1915u4 = c1915u3;
                                                    t11 = t10;
                                                    i42 = i8110;
                                                    i44 = i16;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    i43 = i86;
                                                    unsafe3 = unsafe;
                                                }
                                            }
                                            i86 = i39;
                                            i18 = i18;
                                            iD = i38;
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i8111 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i8111;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                            i16 = i16;
                                            unsafe = unsafe;
                                            i39 = i86;
                                            if (i49 == 0) {
                                                i38 = i67;
                                                iJ3 = C1928w2.p(bArr, i38, c1921v3);
                                                interfaceC1853l3 = interfaceC1853l3;
                                                unsafe9.putObject(t10, j, Long.valueOf(AbstractC1947z2.b(c1921v3.f25891b)));
                                                unsafe9.putInt(t10, j11, i18);
                                                iD = iJ3;
                                                i86 = i39;
                                                i18 = i18;
                                                if (iD == i38) {
                                                    i12 = i12;
                                                    i17 = iD;
                                                    i45 = i27;
                                                    i15 = i86;
                                                } else {
                                                    int i8112 = i18;
                                                    i40 = i11;
                                                    i41 = i12;
                                                    c1921v2 = c1921v3;
                                                    c1915u4 = c1915u3;
                                                    t11 = t10;
                                                    i42 = i8112;
                                                    i44 = i16;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    i43 = i86;
                                                    unsafe3 = unsafe;
                                                }
                                            } else {
                                                interfaceC1853l3 = interfaceC1853l3;
                                                i38 = i67;
                                                i86 = i39;
                                                i18 = i18;
                                                iD = i38;
                                                if (iD == i38) {
                                                    i12 = i12;
                                                    i17 = iD;
                                                    i45 = i27;
                                                    i15 = i86;
                                                } else {
                                                    int i8113 = i18;
                                                    i40 = i11;
                                                    i41 = i12;
                                                    c1921v2 = c1921v3;
                                                    c1915u4 = c1915u3;
                                                    t11 = t10;
                                                    i42 = i8113;
                                                    i44 = i16;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    i43 = i86;
                                                    unsafe3 = unsafe;
                                                }
                                            }
                                            break;
                                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                            if (i49 == 3) {
                                                Object objM2 = c1915u3.m(i18, i86, t10);
                                                unsafe = unsafe;
                                                iD = C1928w2.h(objM2, c1915u3.C(i86), bArr, i67, i11, (i16 & (-8)) | 4, c1921v2);
                                                c1915u3.p(i18, i86, t10, objM2);
                                                t10 = t10;
                                                i16 = i16;
                                                i38 = i67;
                                                i18 = i18;
                                                if (iD == i38) {
                                                    i12 = i12;
                                                    i17 = iD;
                                                    i45 = i27;
                                                    i15 = i86;
                                                } else {
                                                    int i8114 = i18;
                                                    i40 = i11;
                                                    i41 = i12;
                                                    c1921v2 = c1921v3;
                                                    c1915u4 = c1915u3;
                                                    t11 = t10;
                                                    i42 = i8114;
                                                    i44 = i16;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    i43 = i86;
                                                    unsafe3 = unsafe;
                                                }
                                            } else {
                                                i38 = i67;
                                                iD = i38;
                                                if (iD == i38) {
                                                    i12 = i12;
                                                    i17 = iD;
                                                    i45 = i27;
                                                    i15 = i86;
                                                } else {
                                                    int i8115 = i18;
                                                    i40 = i11;
                                                    i41 = i12;
                                                    c1921v2 = c1921v3;
                                                    c1915u4 = c1915u3;
                                                    t11 = t10;
                                                    i42 = i8115;
                                                    i44 = i16;
                                                    i45 = i27;
                                                    i46 = i46;
                                                    i43 = i86;
                                                    unsafe3 = unsafe;
                                                }
                                            }
                                            break;
                                        default:
                                            i38 = i67;
                                            iD = i38;
                                            if (iD == i38) {
                                                i12 = i12;
                                                i17 = iD;
                                                i45 = i27;
                                                i15 = i86;
                                            } else {
                                                int i8116 = i18;
                                                i40 = i11;
                                                i41 = i12;
                                                c1921v2 = c1921v3;
                                                c1915u4 = c1915u3;
                                                t11 = t10;
                                                i42 = i8116;
                                                i44 = i16;
                                                i45 = i27;
                                                i46 = i46;
                                                i43 = i86;
                                                unsafe3 = unsafe;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i49 == 2) {
                                        Unsafe unsafe10 = f25870p;
                                        Object objE = E(i28);
                                        Object object = unsafe10.getObject(t8, j);
                                        if (interfaceC1853l4.b(object)) {
                                            zzla zzlaVarX = interfaceC1853l4.x();
                                            interfaceC1853l4.a((Object) zzlaVarX, object);
                                            unsafe10.putObject(t8, j, zzlaVarX);
                                        }
                                        interfaceC1853l4.e(objE);
                                        throw null;
                                    }
                                    t10 = t8;
                                    i29 = i67;
                                    c1921v3 = c1921v5;
                                    c1915u3 = this;
                                    i15 = i28;
                                    i18 = i18;
                                    interfaceC1853l3 = interfaceC1853l4;
                                    unsafe = unsafe;
                                    i17 = i29;
                                    i16 = i16;
                                    i45 = i27;
                                }
                            }
                        } else if (i49 == 2) {
                            V2 v2C2 = (V2) unsafe6.getObject(t11, j);
                            if (!v2C2.y()) {
                                int size2 = v2C2.size();
                                v2C2 = v2C2.c(size2 != 0 ? size2 << 1 : 10);
                                unsafe6.putObject(t11, j, v2C2);
                            }
                            iD = C1928w2.f(c1915u4.C(i68), i55, bArr, i67, i11, v2C2, c1921v2);
                            i43 = i68;
                            i44 = i55;
                            c1921v2 = c1921v4;
                            i45 = i45;
                            i46 = i46;
                            i42 = i42;
                            i40 = i11;
                            i41 = i12;
                            unsafe3 = unsafe6;
                        } else {
                            i46 = i46;
                            i27 = i45;
                            i28 = i68;
                            i16 = i55;
                            i29 = i67;
                            interfaceC1853l4 = interfaceC1853l3;
                            iArr = iArr2;
                            i18 = i42;
                            unsafe = unsafe6;
                            t10 = t11;
                            c1915u3 = c1915u4;
                            c1921v3 = c1921v4;
                            i15 = i28;
                            i18 = i18;
                            interfaceC1853l3 = interfaceC1853l4;
                            unsafe = unsafe;
                            i17 = i29;
                            i16 = i16;
                            i45 = i27;
                        }
                    }
                } else {
                    iArr = iArr2;
                    unsafe = unsafe3;
                    t10 = t11;
                    i46 = i46;
                    interfaceC1853l3 = interfaceC1853l5;
                    i12 = i12;
                    c1915u3 = c1915u4;
                    c1921v3 = c1921v2;
                    i15 = i14;
                    i16 = i13;
                    i17 = i51;
                    i18 = i42;
                }
                if (i16 != i12 || i12 == 0) {
                    if (c1915u3.f25876f) {
                        D2 d10 = D2.f25421c;
                        D2 d11 = c1921v3.f25893d;
                        if (d11 == d10) {
                            iD = C1928w2.d(i16, bArr, i17, i11, D(t8), c1921v2);
                        } else {
                            if (d11.a(c1915u3.f25875e, i18) != null) {
                                ((N2.b) t10).v();
                                throw new NoSuchMethodError();
                            }
                            iD = C1928w2.d(i16, bArr, i17, i11, D(t8), c1921v2);
                        }
                    } else {
                        iD = C1928w2.d(i16, bArr, i17, i11, D(t8), c1921v2);
                    }
                    i40 = i11;
                    c1921v2 = c1921v3;
                    c1915u4 = c1915u3;
                    t11 = t10;
                    i41 = i12;
                    unsafe3 = unsafe;
                    i43 = i15;
                    i42 = i18;
                    i44 = i16;
                    i46 = i46;
                } else {
                    iD = i17;
                    i44 = i16;
                    i46 = i46;
                }
            } else {
                iArr = iArr2;
                unsafe = unsafe3;
                t10 = t11;
                interfaceC1853l3 = interfaceC1853l5;
                c1915u3 = c1915u4;
                i12 = i41;
            }
        }
        if (i46 != 1048575) {
            unsafe.putInt(t10, i46, i45);
        }
        for (int i93 = c1915u3.f25878h; i93 < c1915u3.f25879i; i93++) {
            int i94 = c1915u3.f25877g[i93];
            int i95 = iArr[i94];
            Object objO = V3.o(t10, c1915u3.v(i94) & 1048575);
            if (objO != null && c1915u3.B(i94) != null) {
                InterfaceC1853l3 interfaceC1853l6 = interfaceC1853l3;
                interfaceC1853l6.f(objO);
                interfaceC1853l6.e(c1915u3.E(i94));
                throw null;
            }
        }
        if (i12 == 0) {
            if (iD != i11) {
                throw zzkb.c();
            }
        } else if (iD > i11 || i44 != i12) {
            throw zzkb.c();
        }
        return iD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object m(int i10, int i11, Object obj) {
        E3 e3C = C(i11);
        if (!x(i10, i11, obj)) {
            return e3C.h();
        }
        Object object = f25870p.getObject(obj, v(i11) & 1048575);
        if (F(object)) {
            return object;
        }
        Object objH = e3C.h();
        if (object != null) {
            e3C.a(objH, object);
        }
        return objH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object n(int i10, Object obj) {
        E3 e3C = C(i10);
        long jV = v(i10) & 1048575;
        if (!y(i10, obj)) {
            return e3C.h();
        }
        Object object = f25870p.getObject(obj, jV);
        if (F(object)) {
            return object;
        }
        Object objH = e3C.h();
        if (object != null) {
            e3C.a(objH, object);
        }
        return objH;
    }

    public final void p(int i10, int i11, Object obj, Object obj2) {
        f25870p.putObject(obj, v(i11) & 1048575, obj2);
        V3.c(i10, this.f25871a[i11 + 2] & 1048575, obj);
    }

    public final void q(T t8, int i10, Object obj) {
        f25870p.putObject(t8, v(i10) & 1048575, obj);
        t(i10, t8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(T t8, T t10, int i10) {
        if (y(i10, t10)) {
            long jV = v(i10) & 1048575;
            Unsafe unsafe = f25870p;
            Object object = unsafe.getObject(t10, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f25871a[i10] + " is present but null: " + String.valueOf(t10));
            }
            E3 e3C = C(i10);
            if (!y(i10, t8)) {
                if (F(object)) {
                    Object objH = e3C.h();
                    e3C.a(objH, object);
                    unsafe.putObject(t8, jV, objH);
                } else {
                    unsafe.putObject(t8, jV, object);
                }
                t(i10, t8);
                return;
            }
            Object object2 = unsafe.getObject(t8, jV);
            if (!F(object2)) {
                Object objH2 = e3C.h();
                e3C.a(objH2, object2);
                unsafe.putObject(t8, jV, objH2);
                object2 = objH2;
            }
            e3C.a(object2, object);
        }
    }

    public final boolean s(T t8, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return y(i10, t8);
        }
        return (i12 & i13) != 0;
    }

    public final void t(int i10, Object obj) {
        int i11 = this.f25871a[i10 + 2];
        long j = 1048575 & i11;
        if (j == 1048575) {
            return;
        }
        V3.c((1 << (i11 >>> 20)) | V3.f25612c.l(obj, j), j, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(Object obj, int i10, Object obj2) {
        int[] iArr = this.f25871a;
        int i11 = iArr[i10];
        if (x(i11, i10, obj2)) {
            long jV = v(i10) & 1048575;
            Unsafe unsafe = f25870p;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + String.valueOf(obj2));
            }
            E3 e3C = C(i10);
            if (!x(i11, i10, obj)) {
                if (F(object)) {
                    Object objH = e3C.h();
                    e3C.a(objH, object);
                    unsafe.putObject(obj, jV, objH);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                V3.c(i11, iArr[i10 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!F(object2)) {
                Object objH2 = e3C.h();
                e3C.a(objH2, object2);
                unsafe.putObject(obj, jV, objH2);
                object2 = objH2;
            }
            e3C.a(object2, object);
        }
    }

    public final int v(int i10) {
        return this.f25871a[i10 + 1];
    }

    public final boolean x(int i10, int i11, Object obj) {
        return V3.f25612c.l(obj, (long) (this.f25871a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean y(int i10, Object obj) {
        int i11 = this.f25871a[i10 + 2];
        long j = i11 & 1048575;
        if (j != 1048575) {
            return ((1 << (i11 >>> 20)) & V3.f25612c.l(obj, j)) != 0;
        }
        int iV = v(i10);
        long j10 = iV & 1048575;
        switch ((iV & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(V3.f25612c.a(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(V3.f25612c.i(obj, j10)) != 0;
            case 2:
                return V3.f25612c.m(obj, j10) != 0;
            case 3:
                return V3.f25612c.m(obj, j10) != 0;
            case 4:
                return V3.f25612c.l(obj, j10) != 0;
            case 5:
                return V3.f25612c.m(obj, j10) != 0;
            case 6:
                return V3.f25612c.l(obj, j10) != 0;
            case 7:
                return V3.f25612c.k(obj, j10);
            case 8:
                Object objO = V3.o(obj, j10);
                if (objO instanceof String) {
                    return !((String) objO).isEmpty();
                }
                if (objO instanceof zzij) {
                    return !zzij.f26049b.equals(objO);
                }
                throw new IllegalArgumentException();
            case 9:
                return V3.o(obj, j10) != null;
            case 10:
                return !zzij.f26049b.equals(V3.o(obj, j10));
            case 11:
                return V3.f25612c.l(obj, j10) != 0;
            case 12:
                return V3.f25612c.l(obj, j10) != 0;
            case 13:
                return V3.f25612c.l(obj, j10) != 0;
            case 14:
                return V3.f25612c.m(obj, j10) != 0;
            case 15:
                return V3.f25612c.l(obj, j10) != 0;
            case 16:
                return V3.f25612c.m(obj, j10) != 0;
            case 17:
                return V3.o(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean z(N2 n10, Object obj, int i10) {
        return y(i10, n10) == y(i10, obj);
    }
}
