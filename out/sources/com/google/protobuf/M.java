package com.google.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import me.zhanghai.android.materialprogressbar.R;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public final class M<T> implements X<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f29060q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Unsafe f29061r = g0.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f29062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f29063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f29066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f29067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f29070i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f29071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final O f29072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A f29073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0<?, ?> f29074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC2072n<?> f29075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final E f29076p;

    public M(int[] iArr, Object[] objArr, int i10, int i11, J j, boolean z10, int[] iArr2, int i12, int i13, O o10, A a10, c0 c0Var, AbstractC2072n abstractC2072n, E e10) {
        this.f29062a = iArr;
        this.f29063b = objArr;
        this.f29064c = i10;
        this.f29065d = i11;
        this.f29068g = j instanceof GeneratedMessageLite;
        this.f29069h = z10;
        this.f29067f = abstractC2072n != null && abstractC2072n.e(j);
        this.f29070i = iArr2;
        this.j = i12;
        this.f29071k = i13;
        this.f29072l = o10;
        this.f29073m = a10;
        this.f29074n = c0Var;
        this.f29075o = abstractC2072n;
        this.f29066e = j;
        this.f29076p = e10;
    }

    public static M A(H h8, O o10, A a10, c0 c0Var, AbstractC2072n abstractC2072n, E e10) {
        if (h8 instanceof W) {
            return B((W) h8, o10, a10, c0Var, abstractC2072n, e10);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0260  */
    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:128:0x027c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0280  */
    /* JADX WARN: Code duplicated, block: B:164:0x0330  */
    /* JADX WARN: Code duplicated, block: B:180:0x037c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0387  */
    public static <T> M<T> B(W w3, O o10, A a10, c0<?, ?> c0Var, AbstractC2072n<?> abstractC2072n, E e10) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i30;
        int i31;
        Field fieldK;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldK2;
        int i36;
        Object obj2;
        Field fieldK3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        boolean z10 = w3.c() == ProtoSyntax.f29083c;
        String strE = w3.e();
        int length = strE.length();
        char c10 = 55296;
        if (strE.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (strE.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt4 = strE.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i43 = iCharAt4 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = strE.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            iCharAt4 = i43 | (cCharAt13 << i44);
            i42 = i40;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i14 = 0;
            i13 = 0;
            i11 = 0;
            iArr = f29060q;
            i12 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt5 = strE.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i22 = i45 + 1;
                    cCharAt8 = strE.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i22;
                }
                iCharAt5 = i46 | (cCharAt8 << i47);
                i45 = i22;
            }
            int i48 = i45 + 1;
            int iCharAt6 = strE.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt7 = strE.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt6 = i49 | (cCharAt7 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            iCharAt = strE.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt6 = strE.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt = i52 | (cCharAt6 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            iCharAt2 = strE.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt5 = strE.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt2 = i55 | (cCharAt5 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            iCharAt3 = strE.charAt(i54);
            if (iCharAt3 >= 55296) {
                int i58 = iCharAt3 & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt4 = strE.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt3 = i58 | (cCharAt4 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            int iCharAt7 = strE.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i61 = iCharAt7 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt3 = strE.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt7 = i61 | (cCharAt3 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            int iCharAt8 = strE.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    cCharAt2 = strE.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i16;
            }
            int i66 = i63 + 1;
            int iCharAt9 = strE.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i15 = i66 + 1;
                    cCharAt = strE.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i15;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i15;
            }
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt5 * 2) + iCharAt6;
            i12 = iCharAt5;
            i42 = i66;
            int i69 = iCharAt9;
            i13 = iCharAt7;
            i14 = i69;
        }
        Unsafe unsafe = f29061r;
        Object[] objArrD = w3.d();
        Class<?> cls = w3.b().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i70 = i13 + i14;
        int i71 = i14;
        int i72 = i70;
        int i73 = 0;
        int i74 = 0;
        while (i42 < length) {
            int i75 = i42 + 1;
            int iCharAt10 = strE.charAt(i42);
            if (iCharAt10 >= c10) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i39 = i77 + 1;
                    cCharAt12 = strE.charAt(i77);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i39;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i23 = i39;
            } else {
                i23 = i75;
            }
            int i79 = i23 + 1;
            int iCharAt11 = strE.charAt(i23);
            if (iCharAt11 >= c10) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i38 = i81 + 1;
                    cCharAt11 = strE.charAt(i81);
                    i24 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i38;
                    length = i24;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i25 = i38;
            } else {
                i24 = length;
                i25 = i79;
            }
            int i83 = iCharAt11 & 255;
            int i84 = i70;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            if (i83 >= 51) {
                int i85 = i25 + 1;
                int iCharAt12 = strE.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i37 = i87 + 1;
                        cCharAt10 = strE.charAt(i87);
                        i28 = i14;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i88;
                        i88 += 13;
                        i87 = i37;
                        i14 = i28;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i88);
                    i33 = i37;
                } else {
                    i28 = i14;
                    i33 = i85;
                }
                int i89 = i83 - 51;
                int i90 = i33;
                if (i89 == 9 || i89 == 17) {
                    i34 = i11 + 1;
                    objArr[((i74 / 3) * 2) + 1] = objArrD[i11];
                } else {
                    if (i89 == 12 && !z10) {
                        i34 = i11 + 1;
                        objArr[((i74 / 3) * 2) + 1] = objArrD[i11];
                    }
                    i35 = iCharAt12 * 2;
                    obj = objArrD[i35];
                    if (obj instanceof Field) {
                        fieldK2 = (Field) obj;
                    } else {
                        fieldK2 = K(cls, (String) obj);
                        objArrD[i35] = fieldK2;
                    }
                    i26 = iCharAt;
                    i27 = iCharAt2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldK2);
                    i36 = i35 + 1;
                    obj2 = objArrD[i36];
                    if (obj2 instanceof Field) {
                        fieldK3 = (Field) obj2;
                    } else {
                        fieldK3 = K(cls, (String) obj2);
                        objArrD[i36] = fieldK3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK3);
                    z10 = z10;
                    i30 = i90;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i31 = 0;
                }
                i11 = i34;
                i35 = iCharAt12 * 2;
                obj = objArrD[i35];
                if (obj instanceof Field) {
                    fieldK2 = (Field) obj;
                } else {
                    fieldK2 = K(cls, (String) obj);
                    objArrD[i35] = fieldK2;
                }
                i26 = iCharAt;
                i27 = iCharAt2;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldK2);
                i36 = i35 + 1;
                obj2 = objArrD[i36];
                if (obj2 instanceof Field) {
                    fieldK3 = (Field) obj2;
                } else {
                    fieldK3 = K(cls, (String) obj2);
                    objArrD[i36] = fieldK3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK3);
                z10 = z10;
                i30 = i90;
                iObjectFieldOffset = iObjectFieldOffset4;
                i31 = 0;
            } else {
                i26 = iCharAt;
                i27 = iCharAt2;
                i28 = i14;
                int i91 = i11 + 1;
                Field fieldK4 = K(cls, (String) objArrD[i11]);
                if (i83 == 9 || i83 == 17) {
                    objArr[((i74 / 3) * 2) + 1] = fieldK4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i32 = i11 + 2;
                        objArr[((i74 / 3) * 2) + 1] = objArrD[i91];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        if (!z10) {
                            i32 = i11 + 2;
                            objArr[((i74 / 3) * 2) + 1] = objArrD[i91];
                        }
                    } else if (i83 == 50) {
                        int i92 = i71 + 1;
                        iArr[i71] = i74;
                        int i93 = (i74 / 3) * 2;
                        int i94 = i11 + 2;
                        objArr[i93] = objArrD[i91];
                        if ((iCharAt11 & 2048) != 0) {
                            i91 = i11 + 3;
                            objArr[i93 + 1] = objArrD[i94];
                            i71 = i92;
                        } else {
                            i71 = i92;
                            i29 = i94;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                        i11 = i29;
                        if ((iCharAt11 & 4096) == 4096 || i83 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i30 = i25;
                            i31 = 0;
                        } else {
                            int i95 = i25 + 1;
                            int iCharAt13 = strE.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i30 = i95 + 1;
                                    cCharAt9 = strE.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i30;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i30 = i95;
                            }
                            int i98 = (iCharAt13 / 32) + (i12 * 2);
                            Object obj3 = objArrD[i98];
                            if (obj3 instanceof Field) {
                                fieldK = (Field) obj3;
                            } else {
                                fieldK = K(cls, (String) obj3);
                                objArrD[i98] = fieldK;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK);
                            i31 = iCharAt13 % 32;
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i72] = iObjectFieldOffset;
                            i72++;
                        }
                    }
                    i29 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                    i11 = i29;
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i30 = i25;
                        i31 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i30 = i25;
                        i31 = 0;
                    }
                    if (i83 >= 18) {
                        iArr[i72] = iObjectFieldOffset;
                        i72++;
                    }
                }
                i29 = i91;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                i11 = i29;
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i30 = i25;
                    i31 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i30 = i25;
                    i31 = 0;
                }
                if (i83 >= 18) {
                    iArr[i72] = iObjectFieldOffset;
                    i72++;
                }
            }
            int i99 = i74 + 1;
            iArr2[i74] = iCharAt10;
            int i100 = i74 + 2;
            String str = strE;
            iArr2[i99] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i83 << 20) | iObjectFieldOffset;
            i74 += 3;
            iArr2[i100] = (i31 << 20) | iObjectFieldOffset2;
            z10 = z10;
            iCharAt = i26;
            i70 = i84;
            strE = str;
            length = i24;
            i42 = i30;
            iCharAt2 = i27;
            i14 = i28;
            c10 = 55296;
        }
        return new M<>(iArr2, objArr, iCharAt, iCharAt2, w3.b(), z10, iArr, i14, i70, o10, a10, c0Var, abstractC2072n, e10);
    }

    public static long C(int i10) {
        return i10 & 1048575;
    }

    public static <T> int D(T t8, long j) {
        return ((Integer) g0.f29152b.i(t8, j)).intValue();
    }

    public static <T> long E(T t8, long j) {
        return ((Long) g0.f29152b.i(t8, j)).longValue();
    }

    public static Field K(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = C7.g.a("Field ", str, " for ");
            sbA.append(cls.getName());
            sbA.append(" not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    public static int P(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void T(int i10, Object obj, h0 h0Var) throws IOException {
        if (obj instanceof String) {
            ((C2068j) h0Var).f29179a.P(i10, (String) obj);
        } else {
            ((C2068j) h0Var).b(i10, (ByteString) obj);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).B();
        }
        return true;
    }

    public static List t(AbstractC2059a abstractC2059a, long j) {
        return (List) g0.f29152b.i(abstractC2059a, j);
    }

    public final int F(int i10) {
        if (i10 < this.f29064c || i10 > this.f29065d) {
            return -1;
        }
        int[] iArr = this.f29062a;
        int length = (iArr.length / 3) - 1;
        int i11 = 0;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Object obj, long j, C2067i c2067i, X x10, C2071m c2071m) throws IOException {
        int iV;
        List listC = this.f29073m.c(obj, j);
        int i10 = c2067i.f29176b;
        if ((i10 & 7) != 3) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            Object objD = x10.d();
            c2067i.b(objD, x10, c2071m);
            x10.b(objD);
            listC.add(objD);
            AbstractC2066h abstractC2066h = c2067i.f29175a;
            if (abstractC2066h.c() || c2067i.f29178d != 0) {
                return;
            } else {
                iV = abstractC2066h.v();
            }
        } while (iV == i10);
        c2067i.f29178d = iV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Object obj, int i10, C2067i c2067i, X x10, C2071m c2071m) throws IOException {
        int iV;
        List listC = this.f29073m.c(obj, i10 & 1048575);
        int i11 = c2067i.f29176b;
        if ((i11 & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            Object objD = x10.d();
            c2067i.c(objD, x10, c2071m);
            x10.b(objD);
            listC.add(objD);
            AbstractC2066h abstractC2066h = c2067i.f29175a;
            if (abstractC2066h.c() || c2067i.f29178d != 0) {
                return;
            } else {
                iV = abstractC2066h.v();
            }
        } while (iV == i11);
        c2067i.f29178d = iV;
    }

    public final void I(Object obj, int i10, C2067i c2067i) throws IOException {
        if ((536870912 & i10) != 0) {
            c2067i.w(2);
            g0.s(i10 & 1048575, obj, c2067i.f29175a.u());
        } else if (!this.f29068g) {
            g0.s(i10 & 1048575, obj, c2067i.e());
        } else {
            c2067i.w(2);
            g0.s(i10 & 1048575, obj, c2067i.f29175a.t());
        }
    }

    public final void J(Object obj, int i10, C2067i c2067i) throws IOException {
        boolean z10 = (536870912 & i10) != 0;
        A a10 = this.f29073m;
        if (z10) {
            c2067i.s(a10.c(obj, i10 & 1048575), true);
        } else {
            c2067i.s(a10.c(obj, i10 & 1048575), false);
        }
    }

    public final void L(int i10, Object obj) {
        int i11 = this.f29062a[i10 + 2];
        long j = 1048575 & i11;
        if (j == 1048575) {
            return;
        }
        g0.q((1 << (i11 >>> 20)) | g0.f29152b.g(obj, j), j, obj);
    }

    public final void M(int i10, int i11, Object obj) {
        g0.q(i10, this.f29062a[i11 + 2] & 1048575, obj);
    }

    public final void N(Object obj, int i10, J j) {
        f29061r.putObject(obj, Q(i10) & 1048575, j);
        L(i10, obj);
    }

    public final void O(Object obj, int i10, int i11, J j) {
        f29061r.putObject(obj, Q(i11) & 1048575, j);
        M(i10, i11, obj);
    }

    public final int Q(int i10) {
        return this.f29062a[i10 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void R(T t8, h0 h0Var) throws IOException {
        Map.Entry entry;
        int i10;
        boolean z10 = this.f29067f;
        AbstractC2072n<?> abstractC2072n = this.f29075o;
        if (z10) {
            C2075q<T> c2075qC = abstractC2072n.c(t8);
            if (c2075qC.f()) {
                entry = null;
            } else {
                entry = (Map.Entry) c2075qC.i().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.f29062a;
        int length = iArr.length;
        Unsafe unsafe = f29061r;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i11 < length) {
            int iQ = Q(i11);
            int i14 = iArr[i11];
            int iP = P(iQ);
            if (iP <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & 1048575;
                if (i16 != i12) {
                    i13 = unsafe.getInt(t8, i16);
                    i12 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                i10 = 0;
            }
            if (entry != null) {
                abstractC2072n.a(entry);
                if (i14 >= 0) {
                    abstractC2072n.j(entry);
                    throw null;
                }
            }
            Map.Entry entry2 = entry;
            AbstractC2072n<?> abstractC2072n2 = abstractC2072n;
            long j = iQ & 1048575;
            switch (iP) {
                case 0:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).c(i14, g0.f29152b.e(t8, j));
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 1:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).g(g0.f29152b.f(t8, j), i14);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 2:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).j(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 3:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).q(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 4:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).i(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 5:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).f(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 6:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).e(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 7:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).a(i14, g0.f29152b.c(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 8:
                    if ((i10 & i13) != 0) {
                        T(i14, unsafe.getObject(t8, j), h0Var);
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 9:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).k(i14, unsafe.getObject(t8, j), n(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 10:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).b(i14, (ByteString) unsafe.getObject(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 11:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).p(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 12:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).d(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 13:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).l(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 14:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).m(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 15:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).n(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 16:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).o(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 17:
                    if ((i10 & i13) != 0) {
                        ((C2068j) h0Var).h(i14, unsafe.getObject(t8, j), n(i11));
                    } else {
                        continue;
                    }
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 18:
                    Y.G(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 19:
                    Y.K(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 20:
                    Y.N(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 21:
                    Y.V(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 22:
                    Y.M(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 23:
                    Y.J(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 24:
                    Y.I(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 25:
                    Y.E(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case 26:
                    Y.T(iArr[i11], (List) unsafe.getObject(t8, j), h0Var);
                    break;
                case 27:
                    Y.O(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, n(i11));
                    break;
                case 28:
                    Y.F(iArr[i11], (List) unsafe.getObject(t8, j), h0Var);
                    break;
                case 29:
                    Y.U(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    Y.H(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    Y.P(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    Y.Q(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    Y.R(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    Y.S(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i11 += 3;
                    abstractC2072n = abstractC2072n2;
                    entry = entry2;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    Y.G(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    Y.K(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    Y.N(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    Y.V(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    Y.M(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    Y.J(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    Y.I(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    Y.E(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    Y.U(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case 44:
                    Y.H(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    Y.P(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    Y.Q(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    Y.R(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    Y.S(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    Y.L(iArr[i11], (List) unsafe.getObject(t8, j), h0Var, n(i11));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    S(h0Var, i14, unsafe.getObject(t8, j), i11);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).c(i14, ((Double) g0.f29152b.i(t8, j)).doubleValue());
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).g(((Float) g0.f29152b.i(t8, j)).floatValue(), i14);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).j(i14, E(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).q(i14, E(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).i(i14, D(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).f(i14, E(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).e(i14, D(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).a(i14, ((Boolean) g0.f29152b.i(t8, j)).booleanValue());
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (s(i14, i11, t8)) {
                        T(i14, unsafe.getObject(t8, j), h0Var);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).k(i14, unsafe.getObject(t8, j), n(i11));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).b(i14, (ByteString) unsafe.getObject(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).p(i14, D(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).d(i14, D(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).l(i14, D(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).m(i14, E(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).n(i14, D(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).o(i14, E(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (s(i14, i11, t8)) {
                        ((C2068j) h0Var).h(i14, unsafe.getObject(t8, j), n(i11));
                    }
                    break;
            }
            i11 += 3;
            abstractC2072n = abstractC2072n2;
            entry = entry2;
        }
        Map.Entry entry3 = entry;
        AbstractC2072n<?> abstractC2072n3 = abstractC2072n;
        if (entry3 != null) {
            abstractC2072n3.j(entry3);
            throw null;
        }
        c0<?, ?> c0Var = this.f29074n;
        c0Var.r(c0Var.g(t8), h0Var);
    }

    public final <K, V> void S(h0 h0Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object objM = m(i11);
            E e10 = this.f29076p;
            D.a<?, ?> aVarC = e10.c(objM);
            MapFieldLite mapFieldLiteH = e10.h(obj);
            CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
            codedOutputStream.getClass();
            for (Map.Entry<K, V> entry : mapFieldLiteH.entrySet()) {
                codedOutputStream.R(i10, 2);
                codedOutputStream.T(D.a(aVarC, entry.getKey(), entry.getValue()));
                D.b(codedOutputStream, aVarC, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.google.protobuf.X
    public final void a(T t8, T t10) {
        if (!r(t8)) {
            throw new IllegalArgumentException(coil.intercept.a.a(t8, "Mutating immutable message: "));
        }
        t10.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f29062a;
            if (i10 >= iArr.length) {
                Class<?> cls = Y.f29112a;
                c0<?, ?> c0Var = this.f29074n;
                c0Var.o(t8, c0Var.k(c0Var.g(t8), c0Var.g(t10)));
                if (this.f29067f) {
                    Y.B(this.f29075o, t8, t10);
                    return;
                }
                return;
            }
            int iQ = Q(i10);
            long j = 1048575 & iQ;
            int i11 = iArr[i10];
            switch (P(iQ)) {
                case 0:
                    if (q(i10, t10)) {
                        g0.e eVar = g0.f29152b;
                        eVar.m(t8, j, eVar.e(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 1:
                    if (q(i10, t10)) {
                        g0.e eVar2 = g0.f29152b;
                        eVar2.n(t8, j, eVar2.f(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 2:
                    if (q(i10, t10)) {
                        g0.r(t8, j, g0.f29152b.h(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 3:
                    if (q(i10, t10)) {
                        g0.r(t8, j, g0.f29152b.h(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 4:
                    if (q(i10, t10)) {
                        g0.q(g0.f29152b.g(t10, j), j, t8);
                        L(i10, t8);
                    }
                    break;
                case 5:
                    if (q(i10, t10)) {
                        g0.r(t8, j, g0.f29152b.h(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 6:
                    if (q(i10, t10)) {
                        g0.q(g0.f29152b.g(t10, j), j, t8);
                        L(i10, t8);
                    }
                    break;
                case 7:
                    if (q(i10, t10)) {
                        g0.e eVar3 = g0.f29152b;
                        eVar3.k(t8, j, eVar3.c(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 8:
                    if (q(i10, t10)) {
                        g0.s(j, t8, g0.f29152b.i(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 9:
                    w(t8, i10, t10);
                    break;
                case 10:
                    if (q(i10, t10)) {
                        g0.s(j, t8, g0.f29152b.i(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 11:
                    if (q(i10, t10)) {
                        g0.q(g0.f29152b.g(t10, j), j, t8);
                        L(i10, t8);
                    }
                    break;
                case 12:
                    if (q(i10, t10)) {
                        g0.q(g0.f29152b.g(t10, j), j, t8);
                        L(i10, t8);
                    }
                    break;
                case 13:
                    if (q(i10, t10)) {
                        g0.q(g0.f29152b.g(t10, j), j, t8);
                        L(i10, t8);
                    }
                    break;
                case 14:
                    if (q(i10, t10)) {
                        g0.r(t8, j, g0.f29152b.h(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 15:
                    if (q(i10, t10)) {
                        g0.q(g0.f29152b.g(t10, j), j, t8);
                        L(i10, t8);
                    }
                    break;
                case 16:
                    if (q(i10, t10)) {
                        g0.r(t8, j, g0.f29152b.h(t10, j));
                        L(i10, t8);
                    }
                    break;
                case 17:
                    w(t8, i10, t10);
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
                    this.f29073m.b(j, t8, t10);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    Class<?> cls2 = Y.f29112a;
                    g0.e eVar4 = g0.f29152b;
                    g0.s(j, t8, this.f29076p.a(eVar4.i(t8, j), eVar4.i(t10, j)));
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
                    if (s(i11, i10, t10)) {
                        g0.s(j, t8, g0.f29152b.i(t10, j));
                        M(i11, i10, t8);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    x(t8, i10, t10);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (s(i11, i10, t10)) {
                        g0.s(j, t8, g0.f29152b.i(t10, j));
                        M(i11, i10, t8);
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    x(t8, i10, t10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.X
    public final void b(T t8) {
        if (r(t8)) {
            if (t8 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t8;
                generatedMessageLite.u();
                generatedMessageLite.t();
                generatedMessageLite.C();
            }
            int[] iArr = this.f29062a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iQ = Q(i10);
                long j = 1048575 & iQ;
                int iP = P(iQ);
                if (iP != 9) {
                    if (iP != 60 && iP != 68) {
                        switch (iP) {
                            case 17:
                                if (q(i10, t8)) {
                                    n(i10).b(f29061r.getObject(t8, j));
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
                                this.f29073m.a(t8, j);
                                break;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Unsafe unsafe = f29061r;
                                Object object = unsafe.getObject(t8, j);
                                if (object != null) {
                                    unsafe.putObject(t8, j, this.f29076p.b(object));
                                }
                                break;
                        }
                    } else if (s(iArr[i10], i10, t8)) {
                        n(i10).b(f29061r.getObject(t8, j));
                    }
                } else if (q(i10, t8)) {
                    n(i10).b(f29061r.getObject(t8, j));
                }
            }
            this.f29074n.j(t8);
            if (this.f29067f) {
                this.f29075o.f(t8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9 A[LOOP:2: B:59:0x00e8->B:64:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x011e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.protobuf.X] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.protobuf.X] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.protobuf.X] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [com.google.protobuf.X] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    @Override // com.google.protobuf.X
    public final boolean c(T t8) {
        List list;
        ?? N10;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean zQ = true;
            if (i12 >= this.j) {
                if (this.f29067f) {
                    this.f29075o.c(t8).g();
                }
                return true;
            }
            int i14 = this.f29070i[i12];
            int[] iArr = this.f29062a;
            int i15 = iArr[i14];
            int iQ = Q(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i13 = f29061r.getInt(t8, i17);
                }
                i11 = i17;
            }
            if ((268435456 & iQ) != 0) {
                if (!(i11 == 1048575 ? q(i14, t8) : (i13 & i18) != 0)) {
                    return false;
                }
            }
            int iP = P(iQ);
            if (iP == 9 || iP == 17) {
                if (i11 == 1048575) {
                    zQ = q(i14, t8);
                } else if ((i18 & i13) == 0) {
                    zQ = false;
                }
                if (zQ) {
                    if (!n(i14).c(g0.f29152b.i(t8, iQ & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iP == 27) {
                list = (List) g0.f29152b.i(t8, iQ & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    N10 = n(i14);
                    for (i10 = 0; i10 < list.size(); i10++) {
                        if (!N10.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iP == 60 || iP == 68) {
                if (s(i15, i14, t8)) {
                    if (!n(i14).c(g0.f29152b.i(t8, iQ & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iP == 49) {
                list = (List) g0.f29152b.i(t8, iQ & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    N10 = n(i14);
                    while (i10 < list.size()) {
                        if (!N10.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iP != 50) {
                continue;
            } else {
                Object objI = g0.f29152b.i(t8, iQ & 1048575);
                E e10 = this.f29076p;
                MapFieldLite mapFieldLiteH = e10.h(objI);
                if (!mapFieldLiteH.isEmpty() && e10.c(m(i14)).f29025b.a() == WireFormat$JavaType.MESSAGE) {
                    ?? A10 = 0;
                    for (Object obj : mapFieldLiteH.values()) {
                        if (A10 == 0) {
                            A10 = A10;
                            A10 = U.f29087c.a(obj.getClass());
                        }
                        A10 = A10;
                        if (!A10.c(obj)) {
                            return false;
                        }
                    }
                }
            }
            i12++;
        }
    }

    @Override // com.google.protobuf.X
    public final T d() {
        return (T) this.f29072l.a(this.f29066e);
    }

    @Override // com.google.protobuf.X
    public final void e(Object obj, C2067i c2067i, C2071m c2071m) throws Throwable {
        c2071m.getClass();
        if (!r(obj)) {
            throw new IllegalArgumentException(coil.intercept.a.a(obj, "Mutating immutable message: "));
        }
        u(this.f29074n, this.f29075o, obj, c2067i, c2071m);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // com.google.protobuf.X
    public final void f(T t8, h0 h0Var) throws IOException {
        Map.Entry entry;
        h0Var.getClass();
        if (!this.f29069h) {
            R(t8, h0Var);
            return;
        }
        boolean z10 = this.f29067f;
        AbstractC2072n<?> abstractC2072n = this.f29075o;
        if (z10) {
            C2075q<T> c2075qC = abstractC2072n.c(t8);
            if (c2075qC.f29191a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c2075qC.i().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.f29062a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iQ = Q(i10);
            int i11 = iArr[i10];
            if (entry != null) {
                abstractC2072n.a(entry);
                if (i11 >= 0) {
                    abstractC2072n.j(entry);
                    throw null;
                }
            }
            switch (P(iQ)) {
                case 0:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).c(i11, g0.f29152b.e(t8, iQ & 1048575));
                    }
                    break;
                case 1:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).g(g0.f29152b.f(t8, iQ & 1048575), i11);
                    }
                    break;
                case 2:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).j(i11, g0.f29152b.h(t8, iQ & 1048575));
                    }
                    break;
                case 3:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).q(i11, g0.f29152b.h(t8, iQ & 1048575));
                    }
                    break;
                case 4:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).i(i11, g0.f29152b.g(t8, iQ & 1048575));
                    }
                    break;
                case 5:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).f(i11, g0.f29152b.h(t8, iQ & 1048575));
                    }
                    break;
                case 6:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).e(i11, g0.f29152b.g(t8, iQ & 1048575));
                    }
                    break;
                case 7:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).a(i11, g0.f29152b.c(t8, iQ & 1048575));
                    }
                    break;
                case 8:
                    if (q(i10, t8)) {
                        T(i11, g0.f29152b.i(t8, iQ & 1048575), h0Var);
                    }
                    break;
                case 9:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).k(i11, g0.f29152b.i(t8, iQ & 1048575), n(i10));
                    }
                    break;
                case 10:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).b(i11, (ByteString) g0.f29152b.i(t8, iQ & 1048575));
                    }
                    break;
                case 11:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).p(i11, g0.f29152b.g(t8, iQ & 1048575));
                    }
                    break;
                case 12:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).d(i11, g0.f29152b.g(t8, iQ & 1048575));
                    }
                    break;
                case 13:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).l(i11, g0.f29152b.g(t8, iQ & 1048575));
                    }
                    break;
                case 14:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).m(i11, g0.f29152b.h(t8, iQ & 1048575));
                    }
                    break;
                case 15:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).n(i11, g0.f29152b.g(t8, iQ & 1048575));
                    }
                    break;
                case 16:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).o(i11, g0.f29152b.h(t8, iQ & 1048575));
                    }
                    break;
                case 17:
                    if (q(i10, t8)) {
                        ((C2068j) h0Var).h(i11, g0.f29152b.i(t8, iQ & 1048575), n(i10));
                    }
                    break;
                case 18:
                    Y.G(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case 19:
                    Y.K(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case 20:
                    Y.N(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case 21:
                    Y.V(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case 22:
                    Y.M(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case 23:
                    Y.J(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case 24:
                    Y.I(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case 25:
                    Y.E(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case 26:
                    Y.T(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var);
                    break;
                case 27:
                    Y.O(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, n(i10));
                    break;
                case 28:
                    Y.F(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var);
                    break;
                case 29:
                    Y.U(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    Y.H(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    Y.P(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    Y.Q(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    Y.R(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    Y.S(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    Y.G(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    Y.K(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    Y.N(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    Y.V(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    Y.M(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    Y.J(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    Y.I(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    Y.E(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    Y.U(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case 44:
                    Y.H(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    Y.P(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    Y.Q(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    Y.R(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    Y.S(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    Y.L(iArr[i10], (List) g0.f29152b.i(t8, iQ & 1048575), h0Var, n(i10));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    S(h0Var, i11, g0.f29152b.i(t8, iQ & 1048575), i10);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).c(i11, ((Double) g0.f29152b.i(t8, iQ & 1048575)).doubleValue());
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).g(((Float) g0.f29152b.i(t8, iQ & 1048575)).floatValue(), i11);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).j(i11, E(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).q(i11, E(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).i(i11, D(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).f(i11, E(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).e(i11, D(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).a(i11, ((Boolean) g0.f29152b.i(t8, iQ & 1048575)).booleanValue());
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (s(i11, i10, t8)) {
                        T(i11, g0.f29152b.i(t8, iQ & 1048575), h0Var);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).k(i11, g0.f29152b.i(t8, iQ & 1048575), n(i10));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).b(i11, (ByteString) g0.f29152b.i(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).p(i11, D(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).d(i11, D(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).l(i11, D(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).m(i11, E(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).n(i11, D(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).o(i11, E(t8, iQ & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (s(i11, i10, t8)) {
                        ((C2068j) h0Var).h(i11, g0.f29152b.i(t8, iQ & 1048575), n(i10));
                    }
                    break;
            }
        }
        if (entry != null) {
            abstractC2072n.j(entry);
            throw null;
        }
        c0<?, ?> c0Var = this.f29074n;
        c0Var.r(c0Var.g(t8), h0Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.X
    public final int g(GeneratedMessageLite generatedMessageLite) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f29062a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iQ = Q(i13);
            int i14 = iArr[i13];
            long j = 1048575 & iQ;
            int i15 = 1237;
            int iHashCode = 37;
            switch (P(iQ)) {
                case 0:
                    i10 = i12 * 53;
                    iB = C2078u.b(Double.doubleToLongBits(g0.f29152b.e(generatedMessageLite, j)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(g0.f29152b.f(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = C2078u.b(g0.f29152b.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = C2078u.b(g0.f29152b.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = g0.f29152b.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = C2078u.b(g0.f29152b.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = g0.f29152b.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = g0.f29152b.c(generatedMessageLite, j);
                    Charset charset = C2078u.f29200a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) g0.f29152b.i(generatedMessageLite, j)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objI = g0.f29152b.i(generatedMessageLite, j);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = g0.f29152b.i(generatedMessageLite, j).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = g0.f29152b.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = g0.f29152b.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = g0.f29152b.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = C2078u.b(g0.f29152b.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = g0.f29152b.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = C2078u.b(g0.f29152b.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objI2 = g0.f29152b.i(generatedMessageLite, j);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                    iB = g0.f29152b.i(generatedMessageLite, j).hashCode();
                    i12 = iB + i10;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    i10 = i12 * 53;
                    iB = g0.f29152b.i(generatedMessageLite, j).hashCode();
                    i12 = iB + i10;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C2078u.b(Double.doubleToLongBits(((Double) g0.f29152b.i(generatedMessageLite, j)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) g0.f29152b.i(generatedMessageLite, j)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C2078u.b(E(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C2078u.b(E(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = D(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C2078u.b(E(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = D(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) g0.f29152b.i(generatedMessageLite, j)).booleanValue();
                        Charset charset2 = C2078u.f29200a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = ((String) g0.f29152b.i(generatedMessageLite, j)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = g0.f29152b.i(generatedMessageLite, j).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = g0.f29152b.i(generatedMessageLite, j).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = D(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = D(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = D(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C2078u.b(E(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = D(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C2078u.b(E(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (s(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = g0.f29152b.i(generatedMessageLite, j).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f29074n.g(generatedMessageLite).hashCode() + (i12 * 53);
        return this.f29067f ? (iHashCode2 * 53) + this.f29075o.c(generatedMessageLite).f29191a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.protobuf.X
    public final boolean h(GeneratedMessageLite generatedMessageLite, Object obj) {
        int[] iArr = this.f29062a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zC = true;
            if (i10 >= length) {
                c0<?, ?> c0Var = this.f29074n;
                if (!c0Var.g(generatedMessageLite).equals(c0Var.g(obj))) {
                    return false;
                }
                if (!this.f29067f) {
                    return true;
                }
                AbstractC2072n<?> abstractC2072n = this.f29075o;
                return abstractC2072n.c(generatedMessageLite).equals(abstractC2072n.c(obj));
            }
            int iQ = Q(i10);
            long j = iQ & 1048575;
            switch (P(iQ)) {
                case 0:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar = g0.f29152b;
                        if (Double.doubleToLongBits(eVar.e(generatedMessageLite, j)) != Double.doubleToLongBits(eVar.e(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 1:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar2 = g0.f29152b;
                        if (Float.floatToIntBits(eVar2.f(generatedMessageLite, j)) != Float.floatToIntBits(eVar2.f(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 2:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar3 = g0.f29152b;
                        if (eVar3.h(generatedMessageLite, j) != eVar3.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 3:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar4 = g0.f29152b;
                        if (eVar4.h(generatedMessageLite, j) != eVar4.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 4:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar5 = g0.f29152b;
                        if (eVar5.g(generatedMessageLite, j) != eVar5.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 5:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar6 = g0.f29152b;
                        if (eVar6.h(generatedMessageLite, j) != eVar6.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 6:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar7 = g0.f29152b;
                        if (eVar7.g(generatedMessageLite, j) != eVar7.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 7:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar8 = g0.f29152b;
                        if (eVar8.c(generatedMessageLite, j) != eVar8.c(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 8:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar9 = g0.f29152b;
                        if (!Y.C(eVar9.i(generatedMessageLite, j), eVar9.i(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 9:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar10 = g0.f29152b;
                        if (!Y.C(eVar10.i(generatedMessageLite, j), eVar10.i(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 10:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar11 = g0.f29152b;
                        if (!Y.C(eVar11.i(generatedMessageLite, j), eVar11.i(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 11:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar12 = g0.f29152b;
                        if (eVar12.g(generatedMessageLite, j) != eVar12.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 12:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar13 = g0.f29152b;
                        if (eVar13.g(generatedMessageLite, j) != eVar13.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 13:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar14 = g0.f29152b;
                        if (eVar14.g(generatedMessageLite, j) != eVar14.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 14:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar15 = g0.f29152b;
                        if (eVar15.h(generatedMessageLite, j) != eVar15.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 15:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar16 = g0.f29152b;
                        if (eVar16.g(generatedMessageLite, j) != eVar16.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 16:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar17 = g0.f29152b;
                        if (eVar17.h(generatedMessageLite, j) != eVar17.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 17:
                    if (!j(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar18 = g0.f29152b;
                        if (!Y.C(eVar18.i(generatedMessageLite, j), eVar18.i(obj, j))) {
                            zC = false;
                        }
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
                    g0.e eVar19 = g0.f29152b;
                    zC = Y.C(eVar19.i(generatedMessageLite, j), eVar19.i(obj, j));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    g0.e eVar20 = g0.f29152b;
                    zC = Y.C(eVar20.i(generatedMessageLite, j), eVar20.i(obj, j));
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
                    g0.e eVar21 = g0.f29152b;
                    if (eVar21.g(generatedMessageLite, j10) != eVar21.g(obj, j10) || !Y.C(eVar21.i(generatedMessageLite, j), eVar21.i(obj, j))) {
                        zC = false;
                    }
                    break;
            }
            if (!zC) {
                return false;
            }
            i10 += 3;
        }
    }

    @Override // com.google.protobuf.X
    public final int i(AbstractC2059a abstractC2059a) {
        return this.f29069h ? p(abstractC2059a) : o(abstractC2059a);
    }

    public final boolean j(GeneratedMessageLite generatedMessageLite, Object obj, int i10) {
        return q(i10, generatedMessageLite) == q(i10, obj);
    }

    public final <UT, UB> UB k(Object obj, int i10, UB ub2, c0<UT, UB> c0Var, Object obj2) {
        C2078u.b bVarL;
        int i11 = this.f29062a[i10];
        Object objI = g0.f29152b.i(obj, Q(i10) & 1048575);
        if (objI == null || (bVarL = l(i10)) == null) {
            return ub2;
        }
        E e10 = this.f29076p;
        MapFieldLite mapFieldLiteE = e10.e(objI);
        D.a<?, ?> aVarC = e10.c(m(i10));
        Iterator it = mapFieldLiteE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!bVarL.a(((Integer) entry.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) c0Var.f(obj2);
                }
                int iA = D.a(aVarC, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iA];
                Logger logger = CodedOutputStream.f29012b;
                CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, 0, iA);
                try {
                    D.b(bVar, aVarC, entry.getKey(), entry.getValue());
                    if (bVar.W() != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    c0Var.d(ub2, i11, new ByteString.LiteralByteString(bArr));
                    it.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    public final C2078u.b l(int i10) {
        return (C2078u.b) this.f29063b[((i10 / 3) * 2) + 1];
    }

    public final Object m(int i10) {
        return this.f29063b[(i10 / 3) * 2];
    }

    public final X n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f29063b;
        X x10 = (X) objArr[i11];
        if (x10 != null) {
            return x10;
        }
        X<T> xA = U.f29087c.a((Class) objArr[i11 + 1]);
        objArr[i11] = xA;
        return xA;
    }

    public final int o(AbstractC2059a abstractC2059a) {
        int i10;
        int iE;
        int iC;
        Unsafe unsafe = f29061r;
        int i11 = 0;
        int iB = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = this.f29062a;
            if (i11 >= iArr.length) {
                c0<?, ?> c0Var = this.f29074n;
                int iH = c0Var.h(c0Var.g(abstractC2059a)) + iB;
                return this.f29067f ? iH + this.f29075o.c(abstractC2059a).e() : iH;
            }
            int iQ = Q(i11);
            int i14 = iArr[i11];
            int iP = P(iQ);
            if (iP <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & 1048575;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i13) {
                    i12 = unsafe.getInt(abstractC2059a, i16);
                    i13 = i16;
                }
            } else {
                i10 = 0;
            }
            long j = iQ & 1048575;
            switch (iP) {
                case 0:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.e(i14);
                        iB += iE;
                    }
                    break;
                case 1:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.i(i14);
                        iB += iE;
                    }
                    break;
                case 2:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.m(i14, unsafe.getLong(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case 3:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.x(i14, unsafe.getLong(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case 4:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.k(i14, unsafe.getInt(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case 5:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.h(i14);
                        iB += iE;
                    }
                    break;
                case 6:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.g(i14);
                        iB += iE;
                    }
                    break;
                case 7:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.b(i14);
                        iB += iE;
                    }
                    break;
                case 8:
                    if ((i10 & i12) != 0) {
                        Object object = unsafe.getObject(abstractC2059a, j);
                        iC = object instanceof ByteString ? CodedOutputStream.c(i14, (ByteString) object) : CodedOutputStream.s(i14, (String) object);
                        iB = iC + iB;
                    }
                    break;
                case 9:
                    if ((i10 & i12) != 0) {
                        iE = Y.o(i14, unsafe.getObject(abstractC2059a, j), n(i11));
                        iB += iE;
                    }
                    break;
                case 10:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.c(i14, (ByteString) unsafe.getObject(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case 11:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.v(i14, unsafe.getInt(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case 12:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.f(i14, unsafe.getInt(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case 13:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.o(i14);
                        iB += iE;
                    }
                    break;
                case 14:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.p(i14);
                        iB += iE;
                    }
                    break;
                case 15:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.q(i14, unsafe.getInt(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case 16:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.r(i14, unsafe.getLong(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case 17:
                    if ((i10 & i12) != 0) {
                        iE = CodedOutputStream.j(i14, (J) unsafe.getObject(abstractC2059a, j), n(i11));
                        iB += iE;
                    }
                    break;
                case 18:
                    iE = Y.h(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 19:
                    iE = Y.f(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 20:
                    iE = Y.m(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 21:
                    iE = Y.x(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 22:
                    iE = Y.k(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 23:
                    iE = Y.h(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 24:
                    iE = Y.f(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 25:
                    iE = Y.a(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 26:
                    iE = Y.u(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 27:
                    iE = Y.p(i14, (List) unsafe.getObject(abstractC2059a, j), n(i11));
                    iB += iE;
                    break;
                case 28:
                    iE = Y.c(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case 29:
                    iE = Y.v(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    iE = Y.d(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iE = Y.f(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    iE = Y.h(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iE = Y.q(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    iE = Y.s(i14, (List) unsafe.getObject(abstractC2059a, j));
                    iB += iE;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    int i17 = Y.i((List) unsafe.getObject(abstractC2059a, j));
                    if (i17 > 0) {
                        iB = p005a4.o.b(i17, CodedOutputStream.u(i14), i17, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    int iG = Y.g((List) unsafe.getObject(abstractC2059a, j));
                    if (iG > 0) {
                        iB = p005a4.o.b(iG, CodedOutputStream.u(i14), iG, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    int iN = Y.n((List) unsafe.getObject(abstractC2059a, j));
                    if (iN > 0) {
                        iB = p005a4.o.b(iN, CodedOutputStream.u(i14), iN, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    int iY = Y.y((List) unsafe.getObject(abstractC2059a, j));
                    if (iY > 0) {
                        iB = p005a4.o.b(iY, CodedOutputStream.u(i14), iY, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    int iL = Y.l((List) unsafe.getObject(abstractC2059a, j));
                    if (iL > 0) {
                        iB = p005a4.o.b(iL, CodedOutputStream.u(i14), iL, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    int i18 = Y.i((List) unsafe.getObject(abstractC2059a, j));
                    if (i18 > 0) {
                        iB = p005a4.o.b(i18, CodedOutputStream.u(i14), i18, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    int iG2 = Y.g((List) unsafe.getObject(abstractC2059a, j));
                    if (iG2 > 0) {
                        iB = p005a4.o.b(iG2, CodedOutputStream.u(i14), iG2, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    int iB2 = Y.b((List) unsafe.getObject(abstractC2059a, j));
                    if (iB2 > 0) {
                        iB = p005a4.o.b(iB2, CodedOutputStream.u(i14), iB2, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    int iW = Y.w((List) unsafe.getObject(abstractC2059a, j));
                    if (iW > 0) {
                        iB = p005a4.o.b(iW, CodedOutputStream.u(i14), iW, iB);
                    }
                    break;
                case 44:
                    int iE2 = Y.e((List) unsafe.getObject(abstractC2059a, j));
                    if (iE2 > 0) {
                        iB = p005a4.o.b(iE2, CodedOutputStream.u(i14), iE2, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    int iG3 = Y.g((List) unsafe.getObject(abstractC2059a, j));
                    if (iG3 > 0) {
                        iB = p005a4.o.b(iG3, CodedOutputStream.u(i14), iG3, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    int i19 = Y.i((List) unsafe.getObject(abstractC2059a, j));
                    if (i19 > 0) {
                        iB = p005a4.o.b(i19, CodedOutputStream.u(i14), i19, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    int iR = Y.r((List) unsafe.getObject(abstractC2059a, j));
                    if (iR > 0) {
                        iB = p005a4.o.b(iR, CodedOutputStream.u(i14), iR, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    int iT = Y.t((List) unsafe.getObject(abstractC2059a, j));
                    if (iT > 0) {
                        iB = p005a4.o.b(iT, CodedOutputStream.u(i14), iT, iB);
                    }
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iE = Y.j(i14, (List) unsafe.getObject(abstractC2059a, j), n(i11));
                    iB += iE;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    iE = this.f29076p.f(unsafe.getObject(abstractC2059a, j), i14, m(i11));
                    iB += iE;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.e(i14);
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.i(i14);
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.m(i14, E(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.x(i14, E(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.k(i14, D(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.h(i14);
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.g(i14);
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.b(i14);
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (s(i14, i11, abstractC2059a)) {
                        Object object2 = unsafe.getObject(abstractC2059a, j);
                        iC = object2 instanceof ByteString ? CodedOutputStream.c(i14, (ByteString) object2) : CodedOutputStream.s(i14, (String) object2);
                        iB = iC + iB;
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = Y.o(i14, unsafe.getObject(abstractC2059a, j), n(i11));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.c(i14, (ByteString) unsafe.getObject(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.v(i14, D(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.f(i14, D(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.o(i14);
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.p(i14);
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.q(i14, D(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.r(i14, E(abstractC2059a, j));
                        iB += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (s(i14, i11, abstractC2059a)) {
                        iE = CodedOutputStream.j(i14, (J) unsafe.getObject(abstractC2059a, j), n(i11));
                        iB += iE;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    public final int p(AbstractC2059a abstractC2059a) {
        int iE;
        Unsafe unsafe = f29061r;
        int i10 = 0;
        int iB = 0;
        while (true) {
            int[] iArr = this.f29062a;
            if (i10 >= iArr.length) {
                c0<?, ?> c0Var = this.f29074n;
                return c0Var.h(c0Var.g(abstractC2059a)) + iB;
            }
            int iQ = Q(i10);
            int iP = P(iQ);
            int i11 = iArr[i10];
            long j = iQ & 1048575;
            if (iP >= FieldType.f29027b.a() && iP <= FieldType.f29028c.a()) {
                int i12 = iArr[i10 + 2];
            }
            switch (iP) {
                case 0:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.e(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 1:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.i(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 2:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.m(i11, g0.k(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 3:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.x(i11, g0.k(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 4:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.k(i11, g0.j(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 5:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.h(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 6:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.g(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 7:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.b(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 8:
                    if (q(i10, abstractC2059a)) {
                        Object objL = g0.l(abstractC2059a, j);
                        iE = !(objL instanceof ByteString) ? CodedOutputStream.s(i11, (String) objL) : CodedOutputStream.c(i11, (ByteString) objL);
                        break;
                    }
                    i10 += 3;
                    break;
                case 9:
                    if (q(i10, abstractC2059a)) {
                        iE = Y.o(i11, g0.l(abstractC2059a, j), n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 10:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.c(i11, (ByteString) g0.l(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 11:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.v(i11, g0.j(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 12:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.f(i11, g0.j(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 13:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.o(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 14:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.p(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 15:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.q(i11, g0.j(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 16:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.r(i11, g0.k(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 17:
                    if (q(i10, abstractC2059a)) {
                        iE = CodedOutputStream.j(i11, (J) g0.l(abstractC2059a, j), n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 18:
                    iE = Y.h(i11, t(abstractC2059a, j));
                    break;
                case 19:
                    iE = Y.f(i11, t(abstractC2059a, j));
                    break;
                case 20:
                    iE = Y.m(i11, t(abstractC2059a, j));
                    break;
                case 21:
                    iE = Y.x(i11, t(abstractC2059a, j));
                    break;
                case 22:
                    iE = Y.k(i11, t(abstractC2059a, j));
                    break;
                case 23:
                    iE = Y.h(i11, t(abstractC2059a, j));
                    break;
                case 24:
                    iE = Y.f(i11, t(abstractC2059a, j));
                    break;
                case 25:
                    iE = Y.a(i11, t(abstractC2059a, j));
                    break;
                case 26:
                    iE = Y.u(i11, t(abstractC2059a, j));
                    break;
                case 27:
                    iE = Y.p(i11, t(abstractC2059a, j), n(i10));
                    break;
                case 28:
                    iE = Y.c(i11, t(abstractC2059a, j));
                    break;
                case 29:
                    iE = Y.v(i11, t(abstractC2059a, j));
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    iE = Y.d(i11, t(abstractC2059a, j));
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iE = Y.f(i11, t(abstractC2059a, j));
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    iE = Y.h(i11, t(abstractC2059a, j));
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iE = Y.q(i11, t(abstractC2059a, j));
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    iE = Y.s(i11, t(abstractC2059a, j));
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    int i13 = Y.i((List) unsafe.getObject(abstractC2059a, j));
                    if (i13 > 0) {
                        iB = p005a4.o.b(i13, CodedOutputStream.u(i11), i13, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    int iG = Y.g((List) unsafe.getObject(abstractC2059a, j));
                    if (iG > 0) {
                        iB = p005a4.o.b(iG, CodedOutputStream.u(i11), iG, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    int iN = Y.n((List) unsafe.getObject(abstractC2059a, j));
                    if (iN > 0) {
                        iB = p005a4.o.b(iN, CodedOutputStream.u(i11), iN, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    int iY = Y.y((List) unsafe.getObject(abstractC2059a, j));
                    if (iY > 0) {
                        iB = p005a4.o.b(iY, CodedOutputStream.u(i11), iY, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    int iL = Y.l((List) unsafe.getObject(abstractC2059a, j));
                    if (iL > 0) {
                        iB = p005a4.o.b(iL, CodedOutputStream.u(i11), iL, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    int i14 = Y.i((List) unsafe.getObject(abstractC2059a, j));
                    if (i14 > 0) {
                        iB = p005a4.o.b(i14, CodedOutputStream.u(i11), i14, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    int iG2 = Y.g((List) unsafe.getObject(abstractC2059a, j));
                    if (iG2 > 0) {
                        iB = p005a4.o.b(iG2, CodedOutputStream.u(i11), iG2, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    int iB2 = Y.b((List) unsafe.getObject(abstractC2059a, j));
                    if (iB2 > 0) {
                        iB = p005a4.o.b(iB2, CodedOutputStream.u(i11), iB2, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    int iW = Y.w((List) unsafe.getObject(abstractC2059a, j));
                    if (iW > 0) {
                        iB = p005a4.o.b(iW, CodedOutputStream.u(i11), iW, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 44:
                    int iE2 = Y.e((List) unsafe.getObject(abstractC2059a, j));
                    if (iE2 > 0) {
                        iB = p005a4.o.b(iE2, CodedOutputStream.u(i11), iE2, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    int iG3 = Y.g((List) unsafe.getObject(abstractC2059a, j));
                    if (iG3 > 0) {
                        iB = p005a4.o.b(iG3, CodedOutputStream.u(i11), iG3, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    int i15 = Y.i((List) unsafe.getObject(abstractC2059a, j));
                    if (i15 > 0) {
                        iB = p005a4.o.b(i15, CodedOutputStream.u(i11), i15, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    int iR = Y.r((List) unsafe.getObject(abstractC2059a, j));
                    if (iR > 0) {
                        iB = p005a4.o.b(iR, CodedOutputStream.u(i11), iR, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    int iT = Y.t((List) unsafe.getObject(abstractC2059a, j));
                    if (iT > 0) {
                        iB = p005a4.o.b(iT, CodedOutputStream.u(i11), iT, iB);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iE = Y.j(i11, t(abstractC2059a, j), n(i10));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    iE = this.f29076p.f(g0.l(abstractC2059a, j), i11, m(i10));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.e(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.i(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.m(i11, E(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.x(i11, E(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.k(i11, D(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.h(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.g(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.b(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (s(i11, i10, abstractC2059a)) {
                        Object objL2 = g0.l(abstractC2059a, j);
                        iE = !(objL2 instanceof ByteString) ? CodedOutputStream.s(i11, (String) objL2) : CodedOutputStream.c(i11, (ByteString) objL2);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = Y.o(i11, g0.l(abstractC2059a, j), n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.c(i11, (ByteString) g0.l(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.v(i11, D(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.f(i11, D(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.o(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.p(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.q(i11, D(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.r(i11, E(abstractC2059a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (s(i11, i10, abstractC2059a)) {
                        iE = CodedOutputStream.j(i11, (J) g0.l(abstractC2059a, j), n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                default:
                    continue;
                    i10 += 3;
                    break;
            }
            iB = iE + iB;
            i10 += 3;
        }
    }

    public final boolean q(int i10, Object obj) {
        int i11 = this.f29062a[i10 + 2];
        long j = i11 & 1048575;
        if (j != 1048575) {
            return ((1 << (i11 >>> 20)) & g0.f29152b.g(obj, j)) != 0;
        }
        int iQ = Q(i10);
        long j10 = iQ & 1048575;
        switch (P(iQ)) {
            case 0:
                return Double.doubleToRawLongBits(g0.f29152b.e(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(g0.f29152b.f(obj, j10)) != 0;
            case 2:
                return g0.f29152b.h(obj, j10) != 0;
            case 3:
                return g0.f29152b.h(obj, j10) != 0;
            case 4:
                return g0.f29152b.g(obj, j10) != 0;
            case 5:
                return g0.f29152b.h(obj, j10) != 0;
            case 6:
                return g0.f29152b.g(obj, j10) != 0;
            case 7:
                return g0.f29152b.c(obj, j10);
            case 8:
                Object objI = g0.f29152b.i(obj, j10);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof ByteString) {
                    return !ByteString.f29007b.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return g0.f29152b.i(obj, j10) != null;
            case 10:
                return !ByteString.f29007b.equals(g0.f29152b.i(obj, j10));
            case 11:
                return g0.f29152b.g(obj, j10) != 0;
            case 12:
                return g0.f29152b.g(obj, j10) != 0;
            case 13:
                return g0.f29152b.g(obj, j10) != 0;
            case 14:
                return g0.f29152b.h(obj, j10) != 0;
            case 15:
                return g0.f29152b.g(obj, j10) != 0;
            case 16:
                return g0.f29152b.h(obj, j10) != 0;
            case 17:
                return g0.f29152b.i(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(int i10, int i11, Object obj) {
        return g0.f29152b.g(obj, (long) (this.f29062a[i11 + 2] & 1048575)) == i10;
    }

    public final void u(c0 c0Var, AbstractC2072n abstractC2072n, Object obj, C2067i c2067i, C2071m c2071m) throws Throwable {
        Object obj2;
        AbstractC2072n abstractC2072n2 = abstractC2072n;
        int[] iArr = this.f29070i;
        int i10 = this.f29071k;
        int i11 = this.j;
        Object objF = null;
        while (true) {
            try {
                int iA = c2067i.a();
                int iF = F(iA);
                if (iF < 0) {
                    if (iA == Integer.MAX_VALUE) {
                        Object objK = objF;
                        while (i11 < i10) {
                            objK = k(obj, iArr[i11], objK, c0Var, obj);
                            i11++;
                        }
                        if (objK != null) {
                            c0Var.n(obj, objK);
                            return;
                        }
                        return;
                    }
                    GeneratedMessageLite.e eVarB = !this.f29067f ? null : abstractC2072n2.b(c2071m, this.f29066e, iA);
                    if (eVarB != null) {
                        abstractC2072n.d(obj);
                        abstractC2072n2.g(eVarB);
                        throw null;
                    }
                    c0Var.getClass();
                    if (objF == null) {
                        objF = c0Var.f(obj);
                    }
                    if (!c0Var.l(objF, c2067i)) {
                        Object objK2 = objF;
                        while (i11 < i10) {
                            objK2 = k(obj, iArr[i11], objK2, c0Var, obj);
                            i11++;
                        }
                        if (objK2 != null) {
                            c0Var.n(obj, objK2);
                            return;
                        }
                        return;
                    }
                    Object objK3 = objF;
                    while (i11 < i10) {
                        objK3 = k(obj, iArr[i11], objK3, c0Var, obj);
                        i11++;
                    }
                    if (objK3 != null) {
                        c0Var.n(obj, objK3);
                    }
                    throw th;
                }
                int iQ = Q(iF);
                try {
                    int iP = P(iQ);
                    AbstractC2066h abstractC2066h = c2067i.f29175a;
                    A a10 = this.f29073m;
                    switch (iP) {
                        case 0:
                            long jC = C(iQ);
                            c2067i.w(1);
                            g0.f29152b.m(obj, jC, abstractC2066h.i());
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 1:
                            long jC2 = C(iQ);
                            c2067i.w(5);
                            g0.f29152b.n(obj, jC2, abstractC2066h.m());
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 2:
                            long jC3 = C(iQ);
                            c2067i.w(0);
                            g0.r(obj, jC3, abstractC2066h.o());
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 3:
                            long jC4 = C(iQ);
                            c2067i.w(0);
                            g0.r(obj, jC4, abstractC2066h.x());
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 4:
                            long jC5 = C(iQ);
                            c2067i.w(0);
                            g0.q(abstractC2066h.n(), jC5, obj);
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 5:
                            long jC6 = C(iQ);
                            c2067i.w(1);
                            g0.r(obj, jC6, abstractC2066h.l());
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 6:
                            long jC7 = C(iQ);
                            c2067i.w(5);
                            g0.q(abstractC2066h.k(), jC7, obj);
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 7:
                            long jC8 = C(iQ);
                            c2067i.w(0);
                            g0.f29152b.k(obj, jC8, abstractC2066h.g());
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 8:
                            I(obj, iQ, c2067i);
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 9:
                            J j = (J) y(iF, obj);
                            X<T> xN = n(iF);
                            c2067i.w(2);
                            c2067i.c(j, xN, c2071m);
                            N(obj, iF, j);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 10:
                            g0.s(C(iQ), obj, c2067i.e());
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 11:
                            long jC9 = C(iQ);
                            c2067i.w(0);
                            g0.q(abstractC2066h.w(), jC9, obj);
                            L(iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 12:
                            Object obj3 = objF;
                            c2067i.w(0);
                            int iJ = abstractC2066h.j();
                            C2078u.b bVarL = l(iF);
                            if (bVarL == null || bVarL.a(iJ)) {
                                objF = obj3;
                                g0.q(iJ, C(iQ), obj);
                                L(iF, obj);
                            } else {
                                objF = Y.D(obj, iA, iJ, obj3, c0Var);
                            }
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 13:
                            obj2 = objF;
                            long jC10 = C(iQ);
                            c2067i.w(5);
                            g0.q(abstractC2066h.p(), jC10, obj);
                            L(iF, obj);
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 14:
                            obj2 = objF;
                            long jC11 = C(iQ);
                            c2067i.w(1);
                            g0.r(obj, jC11, abstractC2066h.q());
                            L(iF, obj);
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 15:
                            obj2 = objF;
                            long jC12 = C(iQ);
                            c2067i.w(0);
                            g0.q(abstractC2066h.r(), jC12, obj);
                            L(iF, obj);
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 16:
                            obj2 = objF;
                            long jC13 = C(iQ);
                            c2067i.w(0);
                            g0.r(obj, jC13, abstractC2066h.s());
                            L(iF, obj);
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 17:
                            obj2 = objF;
                            J j10 = (J) y(iF, obj);
                            X<T> xN2 = n(iF);
                            c2067i.w(3);
                            c2067i.b(j10, xN2, c2071m);
                            N(obj, iF, j10);
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 18:
                            obj2 = objF;
                            c2067i.g(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 19:
                            obj2 = objF;
                            c2067i.l(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 20:
                            obj2 = objF;
                            c2067i.n(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 21:
                            obj2 = objF;
                            c2067i.u(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 22:
                            obj2 = objF;
                            c2067i.m(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 23:
                            obj2 = objF;
                            c2067i.k(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 24:
                            obj2 = objF;
                            c2067i.j(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 25:
                            obj2 = objF;
                            c2067i.d(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 26:
                            obj2 = objF;
                            J(obj, iQ, c2067i);
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 27:
                            obj2 = objF;
                            H(obj, iQ, c2067i, n(iF), c2071m);
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 28:
                            obj2 = objF;
                            c2067i.f(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 29:
                            obj2 = objF;
                            c2067i.t(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            List<Integer> listC = a10.c(obj, C(iQ));
                            c2067i.h(listC);
                            objF = Y.z(obj, iA, listC, l(iF), objF, c0Var);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            obj2 = objF;
                            c2067i.o(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                            obj2 = objF;
                            c2067i.p(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            obj2 = objF;
                            c2067i.q(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            obj2 = objF;
                            c2067i.r(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            obj2 = objF;
                            c2067i.g(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                            obj2 = objF;
                            c2067i.l(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            obj2 = objF;
                            c2067i.n(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            obj2 = objF;
                            c2067i.u(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            obj2 = objF;
                            c2067i.m(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            obj2 = objF;
                            c2067i.k(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            obj2 = objF;
                            c2067i.j(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            obj2 = objF;
                            c2067i.d(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            obj2 = objF;
                            c2067i.t(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case 44:
                            List<Integer> listC2 = a10.c(obj, C(iQ));
                            c2067i.h(listC2);
                            objF = Y.z(obj, iA, listC2, l(iF), objF, c0Var);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            obj2 = objF;
                            c2067i.o(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            obj2 = objF;
                            c2067i.p(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            obj2 = objF;
                            c2067i.q(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            obj2 = objF;
                            c2067i.r(a10.c(obj, C(iQ)));
                            objF = obj2;
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                            try {
                                obj2 = objF;
                                try {
                                    G(obj, C(iQ), c2067i, n(iF), c2071m);
                                    objF = obj2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    objF = obj2;
                                    c0Var.getClass();
                                    if (objF == null) {
                                        objF = c0Var.f(obj);
                                    }
                                    if (!c0Var.l(objF, c2067i)) {
                                        Object objK4 = objF;
                                        while (i11 < i10) {
                                            objK4 = k(obj, iArr[i11], objK4, c0Var, obj);
                                            i11++;
                                        }
                                        if (objK4 != null) {
                                            c0Var.n(obj, objK4);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    objF = obj2;
                                }
                                break;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                            } catch (Throwable th2) {
                                th = th2;
                                break;
                            }
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                            v(obj, iF, m(iF), c2071m, c2067i);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                            long jC14 = C(iQ);
                            c2067i.w(1);
                            g0.s(jC14, obj, Double.valueOf(abstractC2066h.i()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                            long jC15 = C(iQ);
                            c2067i.w(5);
                            g0.s(jC15, obj, Float.valueOf(abstractC2066h.m()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                            long jC16 = C(iQ);
                            c2067i.w(0);
                            g0.s(jC16, obj, Long.valueOf(abstractC2066h.o()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                            long jC17 = C(iQ);
                            c2067i.w(0);
                            g0.s(jC17, obj, Long.valueOf(abstractC2066h.x()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                            long jC18 = C(iQ);
                            c2067i.w(0);
                            g0.s(jC18, obj, Integer.valueOf(abstractC2066h.n()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                            long jC19 = C(iQ);
                            c2067i.w(1);
                            g0.s(jC19, obj, Long.valueOf(abstractC2066h.l()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                            long jC20 = C(iQ);
                            c2067i.w(5);
                            g0.s(jC20, obj, Integer.valueOf(abstractC2066h.k()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                            long jC21 = C(iQ);
                            c2067i.w(0);
                            g0.s(jC21, obj, Boolean.valueOf(abstractC2066h.g()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            I(obj, iQ, c2067i);
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            J j11 = (J) z(iA, iF, obj);
                            X<T> xN3 = n(iF);
                            c2067i.w(2);
                            c2067i.c(j11, xN3, c2071m);
                            O(obj, iA, iF, j11);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            g0.s(C(iQ), obj, c2067i.e());
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            long jC22 = C(iQ);
                            c2067i.w(0);
                            g0.s(jC22, obj, Integer.valueOf(abstractC2066h.w()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                            c2067i.w(0);
                            int iJ2 = abstractC2066h.j();
                            C2078u.b bVarL2 = l(iF);
                            if (bVarL2 == null || bVarL2.a(iJ2)) {
                                g0.s(C(iQ), obj, Integer.valueOf(iJ2));
                                M(iA, iF, obj);
                            } else {
                                objF = Y.D(obj, iA, iJ2, objF, c0Var);
                            }
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            long jC23 = C(iQ);
                            c2067i.w(5);
                            g0.s(jC23, obj, Integer.valueOf(abstractC2066h.p()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                            long jC24 = C(iQ);
                            c2067i.w(1);
                            g0.s(jC24, obj, Long.valueOf(abstractC2066h.q()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                            long jC25 = C(iQ);
                            c2067i.w(0);
                            g0.s(jC25, obj, Integer.valueOf(abstractC2066h.r()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                            long jC26 = C(iQ);
                            c2067i.w(0);
                            g0.s(jC26, obj, Long.valueOf(abstractC2066h.s()));
                            M(iA, iF, obj);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                            J j12 = (J) z(iA, iF, obj);
                            X<T> xN4 = n(iF);
                            c2067i.w(3);
                            c2067i.b(j12, xN4, c2071m);
                            O(obj, iA, iF, j12);
                            abstractC2072n2 = abstractC2072n;
                            break;
                        default:
                            if (objF == null) {
                                objF = c0Var.f(obj);
                            }
                            if (!c0Var.l(objF, c2067i)) {
                                Object objK5 = objF;
                                while (i11 < i10) {
                                    objK5 = k(obj, iArr[i11], objK5, c0Var, obj);
                                    i11++;
                                }
                                if (objK5 != null) {
                                    c0Var.n(obj, objK5);
                                    return;
                                }
                                return;
                            }
                            abstractC2072n2 = abstractC2072n;
                            break;
                    }
                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void v(Object obj, int i10, Object obj2, C2071m c2071m, C2067i c2067i) throws IOException {
        long jQ = Q(i10) & 1048575;
        Object objI = g0.f29152b.i(obj, jQ);
        E e10 = this.f29076p;
        if (objI == null) {
            objI = e10.d();
            g0.s(jQ, obj, objI);
        } else if (e10.g(objI)) {
            MapFieldLite mapFieldLiteD = e10.d();
            e10.a(mapFieldLiteD, objI);
            g0.s(jQ, obj, mapFieldLiteD);
            objI = mapFieldLiteD;
        }
        MapFieldLite mapFieldLiteE = e10.e(objI);
        D.a<?, ?> aVarC = e10.c(obj2);
        c2067i.w(2);
        AbstractC2066h abstractC2066h = c2067i.f29175a;
        int iF = abstractC2066h.f(abstractC2066h.w());
        aVarC.getClass();
        Object objI2 = "";
        Object obj3 = aVarC.f29026c;
        Object objI3 = obj3;
        while (true) {
            try {
                int iA = c2067i.a();
                if (iA == Integer.MAX_VALUE || abstractC2066h.c()) {
                    break;
                }
                if (iA == 1) {
                    objI2 = c2067i.i(aVarC.f29024a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!c2067i.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!c2067i.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI3 = c2067i.i(aVarC.f29025b, obj3.getClass(), c2071m);
                }
            } catch (Throwable th) {
                abstractC2066h.e(iF);
                throw th;
            }
        }
        mapFieldLiteE.put(objI2, objI3);
        abstractC2066h.e(iF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(Object obj, int i10, Object obj2) {
        if (q(i10, obj2)) {
            long jQ = Q(i10) & 1048575;
            Unsafe unsafe = f29061r;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f29062a[i10] + " is present but null: " + obj2);
            }
            X xN = n(i10);
            if (!q(i10, obj)) {
                if (r(object)) {
                    Object objD = xN.d();
                    xN.a(objD, object);
                    unsafe.putObject(obj, jQ, objD);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                L(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!r(object2)) {
                Object objD2 = xN.d();
                xN.a(objD2, object2);
                unsafe.putObject(obj, jQ, objD2);
                object2 = objD2;
            }
            xN.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(Object obj, int i10, Object obj2) {
        int[] iArr = this.f29062a;
        int i11 = iArr[i10];
        if (s(i11, i10, obj2)) {
            long jQ = Q(i10) & 1048575;
            Unsafe unsafe = f29061r;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            X xN = n(i10);
            if (!s(i11, i10, obj)) {
                if (r(object)) {
                    Object objD = xN.d();
                    xN.a(objD, object);
                    unsafe.putObject(obj, jQ, objD);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                M(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!r(object2)) {
                Object objD2 = xN.d();
                xN.a(objD2, object2);
                unsafe.putObject(obj, jQ, objD2);
                object2 = objD2;
            }
            xN.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(int i10, Object obj) {
        X xN = n(i10);
        long jQ = Q(i10) & 1048575;
        if (!q(i10, obj)) {
            return xN.d();
        }
        Object object = f29061r.getObject(obj, jQ);
        if (r(object)) {
            return object;
        }
        Object objD = xN.d();
        if (object != null) {
            xN.a(objD, object);
        }
        return objD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(int i10, int i11, Object obj) {
        X xN = n(i11);
        if (!s(i10, i11, obj)) {
            return xN.d();
        }
        Object object = f29061r.getObject(obj, Q(i11) & 1048575);
        if (r(object)) {
            return object;
        }
        Object objD = xN.d();
        if (object != null) {
            xN.a(objD, object);
        }
        return objD;
    }
}
