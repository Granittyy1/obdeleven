package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes.dex */
public final class L<T> implements X<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f17142q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Unsafe f17143r = g0.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f17144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f17145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f17148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f17152i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f17153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N f17154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbstractC1335z f17155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0<?, ?> f17156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC1324n<?> f17157o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final D f17158p;

    public L(int[] iArr, Object[] objArr, int i10, int i11, I i12, boolean z10, int[] iArr2, int i13, int i14, N n10, AbstractC1335z abstractC1335z, c0 c0Var, AbstractC1324n abstractC1324n, D d10) {
        this.f17144a = iArr;
        this.f17145b = objArr;
        this.f17146c = i10;
        this.f17147d = i11;
        this.f17150g = i12 instanceof GeneratedMessageLite;
        this.f17151h = z10;
        this.f17149f = abstractC1324n != null && abstractC1324n.e(i12);
        this.f17152i = iArr2;
        this.j = i13;
        this.f17153k = i14;
        this.f17154l = n10;
        this.f17155m = abstractC1335z;
        this.f17156n = c0Var;
        this.f17157o = abstractC1324n;
        this.f17148e = i12;
        this.f17158p = d10;
    }

    public static <T> int A(T t8, long j) {
        return ((Integer) g0.f17233c.i(t8, j)).intValue();
    }

    public static <T> long B(T t8, long j) {
        return ((Long) g0.f17233c.i(t8, j)).longValue();
    }

    public static Field H(Class<?> cls, String str) {
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

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void O(int i10, Object obj, h0 h0Var) throws IOException {
        if (obj instanceof String) {
            ((C1320j) h0Var).f17260a.P(i10, (String) obj);
        } else {
            ((C1320j) h0Var).b(i10, (ByteString) obj);
        }
    }

    public static List s(AbstractC1311a abstractC1311a, long j) {
        return (List) g0.f17233c.i(abstractC1311a, j);
    }

    public static L x(G g10, N n10, AbstractC1335z abstractC1335z, c0 c0Var, AbstractC1324n abstractC1324n, D d10) {
        if (g10 instanceof V) {
            return y((V) g10, n10, abstractC1335z, c0Var, abstractC1324n, d10);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0286  */
    /* JADX WARN: Code duplicated, block: B:126:0x0289  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a3  */
    public static <T> L<T> y(V v10, N n10, AbstractC1335z abstractC1335z, c0<?, ?> c0Var, AbstractC1324n<?> abstractC1324n, D d10) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int i28;
        int i29;
        int i30;
        Field fieldH;
        int i31;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldH2;
        int i36;
        Object obj2;
        Field fieldH3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        char cCharAt14;
        int i41 = 0;
        boolean z10 = v10.c() == ProtoSyntax.f17167c;
        String strE = v10.e();
        int length = strE.length();
        int iCharAt4 = strE.charAt(0);
        if (iCharAt4 >= 55296) {
            int i42 = iCharAt4 & 8191;
            int i43 = 1;
            int i44 = 13;
            while (true) {
                i10 = i43 + 1;
                cCharAt14 = strE.charAt(i43);
                if (cCharAt14 < 55296) {
                    break;
                }
                i42 |= (cCharAt14 & 8191) << i44;
                i44 += 13;
                i43 = i10;
            }
            iCharAt4 = i42 | (cCharAt14 << i44);
        } else {
            i10 = 1;
        }
        int i45 = i10 + 1;
        int iCharAt5 = strE.charAt(i10);
        if (iCharAt5 >= 55296) {
            int i46 = iCharAt5 & 8191;
            int i47 = 13;
            while (true) {
                i40 = i45 + 1;
                cCharAt13 = strE.charAt(i45);
                if (cCharAt13 < 55296) {
                    break;
                }
                i46 |= (cCharAt13 & 8191) << i47;
                i47 += 13;
                i45 = i40;
            }
            iCharAt5 = i46 | (cCharAt13 << i47);
            i45 = i40;
        }
        if (iCharAt5 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            iCharAt3 = 0;
            iArr = f17142q;
            i12 = 0;
        } else {
            int i48 = i45 + 1;
            int iCharAt6 = strE.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt8 = strE.charAt(i48);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt6 = i49 | (cCharAt8 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strE.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt7 = strE.charAt(i51);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt7 = i52 | (cCharAt7 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strE.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt6 = strE.charAt(i54);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt8 = i55 | (cCharAt6 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            iCharAt = strE.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt5 = strE.charAt(i57);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt = i58 | (cCharAt5 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            int iCharAt9 = strE.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt4 = strE.charAt(i60);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt9 = i61 | (cCharAt4 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            iCharAt2 = strE.charAt(i60);
            if (iCharAt2 >= 55296) {
                int i64 = iCharAt2 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    cCharAt3 = strE.charAt(i63);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                iCharAt2 = i64 | (cCharAt3 << i65);
                i63 = i16;
            }
            int i66 = i63 + 1;
            int iCharAt10 = strE.charAt(i63);
            if (iCharAt10 >= 55296) {
                int i67 = iCharAt10 & 8191;
                int i68 = 13;
                while (true) {
                    i15 = i66 + 1;
                    cCharAt2 = strE.charAt(i66);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i15;
                }
                iCharAt10 = i67 | (cCharAt2 << i68);
                i66 = i15;
            }
            int i69 = i66 + 1;
            iCharAt3 = strE.charAt(i66);
            if (iCharAt3 >= 55296) {
                int i70 = iCharAt3 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i14 = i71 + 1;
                    cCharAt = strE.charAt(i71);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i70 |= (cCharAt & 8191) << i72;
                    i72 += 13;
                    i71 = i14;
                }
                iCharAt3 = i70 | (cCharAt << i72);
                i69 = i14;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt10];
            i11 = (iCharAt6 * 2) + iCharAt7;
            i12 = iCharAt6;
            i45 = i69;
            int i73 = iCharAt9;
            iArr = iArr2;
            i41 = iCharAt8;
            i13 = i73;
        }
        Unsafe unsafe = f17143r;
        Object[] objArrD = v10.d();
        Class<?> cls = v10.b().getClass();
        int[] iArr3 = new int[i13 * 3];
        Object[] objArr = new Object[i13 * 2];
        int i74 = iCharAt2 + iCharAt3;
        int i75 = i74;
        int i76 = iCharAt3;
        int i77 = 0;
        int i78 = 0;
        while (i45 < length) {
            int i79 = i45 + 1;
            int iCharAt11 = strE.charAt(i45);
            int i80 = length;
            if (iCharAt11 >= 55296) {
                int i81 = iCharAt11 & 8191;
                int i82 = i79;
                int i83 = 13;
                while (true) {
                    i39 = i82 + 1;
                    cCharAt12 = strE.charAt(i82);
                    i22 = i74;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i81 |= (cCharAt12 & 8191) << i83;
                    i83 += 13;
                    i82 = i39;
                    i74 = i22;
                }
                iCharAt11 = i81 | (cCharAt12 << i83);
                i23 = i39;
            } else {
                i22 = i74;
                i23 = i79;
            }
            int i84 = i23 + 1;
            int iCharAt12 = strE.charAt(i23);
            if (iCharAt12 >= 55296) {
                int i85 = iCharAt12 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i38 = i86 + 1;
                    cCharAt11 = strE.charAt(i86);
                    i24 = iCharAt3;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt11 & 8191) << i87;
                    i87 += 13;
                    i86 = i38;
                    iCharAt3 = i24;
                }
                iCharAt12 = i85 | (cCharAt11 << i87);
                i25 = i38;
            } else {
                i24 = iCharAt3;
                i25 = i84;
            }
            int i88 = iCharAt12 & 255;
            boolean z11 = z10;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i77] = i78;
                i77++;
            }
            if (i88 >= 51) {
                int i89 = i25 + 1;
                int iCharAt13 = strE.charAt(i25);
                char c10 = 55296;
                if (iCharAt13 >= 55296) {
                    int i90 = 13;
                    int i91 = iCharAt13 & 8191;
                    int i92 = i89;
                    while (true) {
                        i37 = i92 + 1;
                        cCharAt10 = strE.charAt(i92);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i91 |= (cCharAt10 & 8191) << i90;
                        i90 += 13;
                        i92 = i37;
                        c10 = 55296;
                    }
                    iCharAt13 = i91 | (cCharAt10 << i90);
                    i33 = i37;
                } else {
                    i33 = i89;
                }
                int i93 = i33;
                int i94 = i88 - 51;
                if (i94 == 9 || i94 == 17) {
                    i34 = i11 + 1;
                    objArr[((i78 / 3) * 2) + 1] = objArrD[i11];
                } else {
                    if (i94 == 12 && (iCharAt4 & 1) == 1) {
                        i34 = i11 + 1;
                        objArr[((i78 / 3) * 2) + 1] = objArrD[i11];
                    }
                    i35 = iCharAt13 * 2;
                    obj = objArrD[i35];
                    if (obj instanceof Field) {
                        fieldH2 = (Field) obj;
                    } else {
                        fieldH2 = H(cls, (String) obj);
                        objArrD[i35] = fieldH2;
                    }
                    int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH2);
                    i36 = i35 + 1;
                    obj2 = objArrD[i36];
                    if (obj2 instanceof Field) {
                        fieldH3 = (Field) obj2;
                    } else {
                        fieldH3 = H(cls, (String) obj2);
                        objArrD[i36] = fieldH3;
                    }
                    i27 = i93;
                    i28 = 0;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH3);
                    i29 = iObjectFieldOffset2;
                    i26 = iCharAt12;
                    i30 = i11;
                    cls = cls;
                }
                i11 = i34;
                i35 = iCharAt13 * 2;
                obj = objArrD[i35];
                if (obj instanceof Field) {
                    fieldH2 = (Field) obj;
                } else {
                    fieldH2 = H(cls, (String) obj);
                    objArrD[i35] = fieldH2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldH2);
                i36 = i35 + 1;
                obj2 = objArrD[i36];
                if (obj2 instanceof Field) {
                    fieldH3 = (Field) obj2;
                } else {
                    fieldH3 = H(cls, (String) obj2);
                    objArrD[i36] = fieldH3;
                }
                i27 = i93;
                i28 = 0;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH3);
                i29 = iObjectFieldOffset3;
                i26 = iCharAt12;
                i30 = i11;
                cls = cls;
            } else {
                int i95 = i11 + 1;
                Field fieldH4 = H(cls, (String) objArrD[i11]);
                if (i88 == 9 || i88 == 17) {
                    i26 = iCharAt12;
                    objArr[((i78 / 3) * 2) + 1] = fieldH4.getType();
                } else {
                    if (i88 == 27 || i88 == 49) {
                        i26 = iCharAt12;
                        i32 = i11 + 2;
                        objArr[((i78 / 3) * 2) + 1] = objArrD[i95];
                    } else if (i88 == 12 || i88 == 30 || i88 == 44) {
                        i26 = iCharAt12;
                        if ((iCharAt4 & 1) == 1) {
                            i32 = i11 + 2;
                            objArr[((i78 / 3) * 2) + 1] = objArrD[i95];
                        }
                    } else if (i88 == 50) {
                        int i96 = i76 + 1;
                        iArr[i76] = i78;
                        int i97 = (i78 / 3) * 2;
                        int i98 = i11 + 2;
                        objArr[i97] = objArrD[i95];
                        if ((iCharAt12 & 2048) != 0) {
                            i95 = i11 + 3;
                            objArr[i97 + 1] = objArrD[i98];
                            i26 = iCharAt12;
                            i76 = i96;
                        } else {
                            i76 = i96;
                            i95 = i98;
                            i26 = iCharAt12;
                        }
                    } else {
                        i26 = iCharAt12;
                    }
                    i95 = i32;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldH4);
                if ((iCharAt4 & 1) != 1 || i88 > 17) {
                    i27 = i25;
                    iObjectFieldOffset = 0;
                    i28 = 0;
                } else {
                    int i99 = i25 + 1;
                    int iCharAt14 = strE.charAt(i25);
                    if (iCharAt14 >= 55296) {
                        int i100 = iCharAt14 & 8191;
                        int i101 = 13;
                        while (true) {
                            i31 = i99 + 1;
                            cCharAt9 = strE.charAt(i99);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i100 |= (cCharAt9 & 8191) << i101;
                            i101 += 13;
                            i99 = i31;
                        }
                        iCharAt14 = i100 | (cCharAt9 << i101);
                        i99 = i31;
                    }
                    int i102 = (iCharAt14 / 32) + (i12 * 2);
                    Object obj3 = objArrD[i102];
                    if (obj3 instanceof Field) {
                        fieldH = (Field) obj3;
                    } else {
                        fieldH = H(cls, (String) obj3);
                        objArrD[i102] = fieldH;
                    }
                    i27 = i99;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH);
                    i28 = iCharAt14 % 32;
                }
                if (i88 >= 18 && i88 <= 49) {
                    iArr[i75] = iObjectFieldOffset4;
                    i75++;
                }
                int i103 = i95;
                i29 = iObjectFieldOffset4;
                i30 = i103;
            }
            int i104 = i78 + 1;
            iArr3[i78] = iCharAt11;
            int i105 = i78 + 2;
            int i106 = i26;
            String str = strE;
            iArr3[i104] = ((i106 & 512) != 0 ? 536870912 : 0) | ((i106 & 256) != 0 ? 268435456 : 0) | (i88 << 20) | i29;
            i78 += 3;
            iArr3[i105] = (i28 << 20) | iObjectFieldOffset;
            cls = cls;
            i45 = i27;
            z10 = z11;
            i41 = i41;
            i74 = i22;
            iCharAt3 = i24;
            strE = str;
            iCharAt = iCharAt;
            i11 = i30;
            length = i80;
        }
        return new L<>(iArr3, objArr, i41, iCharAt, v10.b(), z10, iArr, iCharAt3, i74, n10, abstractC1335z, c0Var, abstractC1324n, d10);
    }

    public static long z(int i10) {
        return i10 & 1048575;
    }

    public final int C(int i10) {
        if (i10 < this.f17146c || i10 > this.f17147d) {
            return -1;
        }
        int[] iArr = this.f17144a;
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

    public final <E> void D(Object obj, long j, W w3, X<E> x10, C1323m c1323m) throws IOException {
        w3.E(this.f17155m.c(obj, j), x10, c1323m);
    }

    public final <E> void E(Object obj, int i10, W w3, X<E> x10, C1323m c1323m) throws IOException {
        w3.J(this.f17155m.c(obj, i10 & 1048575), x10, c1323m);
    }

    public final void F(Object obj, int i10, W w3) throws IOException {
        if ((536870912 & i10) != 0) {
            g0.r(i10 & 1048575, obj, w3.L());
        } else if (this.f17150g) {
            g0.r(i10 & 1048575, obj, w3.x());
        } else {
            g0.r(i10 & 1048575, obj, w3.B());
        }
    }

    public final void G(Object obj, int i10, W w3) throws IOException {
        boolean z10 = (536870912 & i10) != 0;
        AbstractC1335z abstractC1335z = this.f17155m;
        if (z10) {
            w3.A(abstractC1335z.c(obj, i10 & 1048575));
        } else {
            w3.z(abstractC1335z.c(obj, i10 & 1048575));
        }
    }

    public final void I(int i10, Object obj) {
        if (this.f17151h) {
            return;
        }
        int i11 = this.f17144a[i10 + 2];
        long j = i11 & 1048575;
        g0.p(g0.f17233c.g(obj, j) | (1 << (i11 >>> 20)), j, obj);
    }

    public final void J(int i10, int i11, Object obj) {
        g0.p(i10, this.f17144a[i11 + 2] & 1048575, obj);
    }

    public final int L(int i10) {
        return this.f17144a[i10 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void M(T t8, h0 h0Var) throws IOException {
        Map.Entry entry;
        int i10;
        boolean z10 = this.f17149f;
        AbstractC1324n<?> abstractC1324n = this.f17157o;
        if (z10) {
            C1327q<T> c1327qC = abstractC1324n.c(t8);
            if (c1327qC.f()) {
                entry = null;
            } else {
                entry = (Map.Entry) c1327qC.i().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.f17144a;
        Unsafe unsafe = f17143r;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        for (int length = iArr.length; i12 < length; length = length) {
            int iL = L(i12);
            int i14 = iArr[i12];
            int iK = K(iL);
            if (this.f17151h || iK > 17) {
                i10 = 0;
            } else {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & 1048575;
                if (i16 != i11) {
                    i13 = unsafe.getInt(t8, i16);
                    i11 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            }
            if (entry != null) {
                abstractC1324n.a(entry);
                if (i14 >= 0) {
                    abstractC1324n.j(entry);
                    throw null;
                }
            }
            long j = iL & 1048575;
            switch (iK) {
                case 0:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).c(i14, g0.f17233c.e(t8, j));
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 1:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).g(g0.f17233c.f(t8, j), i14);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 2:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).j(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 3:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).q(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 4:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).i(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 5:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).f(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 6:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).e(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 7:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).a(i14, g0.f17233c.c(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 8:
                    if ((i10 & i13) != 0) {
                        O(i14, unsafe.getObject(t8, j), h0Var);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 9:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).k(i14, unsafe.getObject(t8, j), n(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 10:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).b(i14, (ByteString) unsafe.getObject(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 11:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).p(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 12:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).d(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 13:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).l(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 14:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).m(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 15:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).n(i14, unsafe.getInt(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 16:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).o(i14, unsafe.getLong(t8, j));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 17:
                    if ((i10 & i13) != 0) {
                        ((C1320j) h0Var).h(i14, unsafe.getObject(t8, j), n(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 18:
                    Y.G(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 19:
                    Y.K(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 20:
                    Y.N(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 21:
                    Y.V(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 22:
                    Y.M(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 23:
                    Y.J(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 24:
                    Y.I(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 25:
                    Y.E(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 26:
                    Y.T(iArr[i12], (List) unsafe.getObject(t8, j), h0Var);
                    break;
                case 27:
                    Y.O(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, n(i12));
                    break;
                case 28:
                    Y.F(iArr[i12], (List) unsafe.getObject(t8, j), h0Var);
                    break;
                case 29:
                    Y.U(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    Y.H(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    Y.P(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    Y.Q(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    Y.R(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    Y.S(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    Y.G(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    Y.K(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    Y.N(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    Y.V(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    Y.M(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    Y.J(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    Y.I(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    Y.E(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    Y.U(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case 44:
                    Y.H(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    Y.P(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    Y.Q(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    Y.R(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    Y.S(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    Y.L(iArr[i12], (List) unsafe.getObject(t8, j), h0Var, n(i12));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    N(h0Var, i14, unsafe.getObject(t8, j), i12);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).c(i14, ((Double) g0.f17233c.i(t8, j)).doubleValue());
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).g(((Float) g0.f17233c.i(t8, j)).floatValue(), i14);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).j(i14, B(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).q(i14, B(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).i(i14, A(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).f(i14, B(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).e(i14, A(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).a(i14, ((Boolean) g0.f17233c.i(t8, j)).booleanValue());
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i14, i12, t8)) {
                        O(i14, unsafe.getObject(t8, j), h0Var);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).k(i14, unsafe.getObject(t8, j), n(i12));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).b(i14, (ByteString) unsafe.getObject(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).p(i14, A(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).d(i14, A(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).l(i14, A(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).m(i14, B(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).n(i14, A(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).o(i14, B(t8, j));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (r(i14, i12, t8)) {
                        ((C1320j) h0Var).h(i14, unsafe.getObject(t8, j), n(i12));
                    }
                    break;
            }
            i12 += 3;
            iArr = iArr;
        }
        if (entry != null) {
            abstractC1324n.j(entry);
            throw null;
        }
        c0<?, ?> c0Var = this.f17156n;
        c0Var.r(c0Var.g(t8), h0Var);
    }

    public final <K, V> void N(h0 h0Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object objM = m(i11);
            D d10 = this.f17158p;
            C.a<?, ?> aVarC = d10.c(objM);
            MapFieldLite mapFieldLiteH = d10.h(obj);
            CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
            codedOutputStream.getClass();
            for (Map.Entry<K, V> entry : mapFieldLiteH.entrySet()) {
                codedOutputStream.R(i10, 2);
                codedOutputStream.T(C.a(aVarC, entry.getKey(), entry.getValue()));
                C.b(codedOutputStream, aVarC, entry.getKey(), entry.getValue());
            }
        }
    }

    public final boolean a(GeneratedMessageLite generatedMessageLite, Object obj, int i10) {
        return q(i10, generatedMessageLite) == q(i10, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void b(T t8) {
        int[] iArr;
        int i10;
        int i11 = this.j;
        while (true) {
            iArr = this.f17152i;
            i10 = this.f17153k;
            if (i11 >= i10) {
                break;
            }
            long jL = L(iArr[i11]) & 1048575;
            Object objI = g0.f17233c.i(t8, jL);
            if (objI != null) {
                g0.r(jL, t8, this.f17158p.b(objI));
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f17155m.a(t8, iArr[i10]);
            i10++;
        }
        this.f17156n.j(t8);
        if (this.f17149f) {
            this.f17157o.f(t8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[LOOP:2: B:60:0x00ec->B:65:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.preferences.protobuf.X] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.X] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.X] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.datastore.preferences.protobuf.X] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // androidx.datastore.preferences.protobuf.X
    public final boolean c(T t8) {
        int i10;
        List list;
        ?? N10;
        int i11;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean zQ = true;
            if (i13 >= this.j) {
                if (this.f17149f) {
                    this.f17157o.c(t8).g();
                }
                return true;
            }
            int i15 = this.f17152i[i13];
            int[] iArr = this.f17144a;
            int i16 = iArr[i15];
            int iL = L(i15);
            boolean z10 = this.f17151h;
            if (z10) {
                i10 = 0;
            } else {
                int i17 = iArr[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i14 = f17143r.getInt(t8, i18);
                    i12 = i18;
                }
            }
            if ((268435456 & iL) != 0) {
                if (!(z10 ? q(i15, t8) : (i14 & i10) != 0)) {
                    return false;
                }
            }
            int iK = K(iL);
            if (iK == 9 || iK == 17) {
                if (z10) {
                    zQ = q(i15, t8);
                } else if ((i10 & i14) == 0) {
                    zQ = false;
                }
                if (zQ) {
                    if (!n(i15).c(g0.f17233c.i(t8, iL & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iK == 27) {
                list = (List) g0.f17233c.i(t8, iL & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    N10 = n(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!N10.c(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iK == 60 || iK == 68) {
                if (r(i16, i15, t8)) {
                    if (!n(i15).c(g0.f17233c.i(t8, iL & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iK == 49) {
                list = (List) g0.f17233c.i(t8, iL & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    N10 = n(i15);
                    while (i11 < list.size()) {
                        if (!N10.c(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iK != 50) {
                continue;
            } else {
                Object objI = g0.f17233c.i(t8, iL & 1048575);
                D d10 = this.f17158p;
                MapFieldLite mapFieldLiteH = d10.h(objI);
                if (!mapFieldLiteH.isEmpty() && d10.c(m(i15)).f17099b.a() == WireFormat$JavaType.MESSAGE) {
                    ?? A10 = 0;
                    for (Object obj : mapFieldLiteH.values()) {
                        if (A10 == 0) {
                            A10 = A10;
                            A10 = T.f17169c.a(obj.getClass());
                        }
                        A10 = A10;
                        if (!A10.c(obj)) {
                            return false;
                        }
                    }
                }
            }
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final T d() {
        return (T) this.f17154l.a(this.f17148e);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void e(T t8, W w3, C1323m c1323m) throws Throwable {
        c1323m.getClass();
        t(this.f17156n, this.f17157o, t8, w3, c1323m);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final int f(AbstractC1311a abstractC1311a) {
        return this.f17151h ? p(abstractC1311a) : o(abstractC1311a);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        generatedMessageLite2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f17144a;
            if (i10 >= iArr.length) {
                if (this.f17151h) {
                    return;
                }
                Class<?> cls = Y.f17193a;
                c0<?, ?> c0Var = this.f17156n;
                c0Var.o(generatedMessageLite, c0Var.k(c0Var.g(generatedMessageLite), c0Var.g(generatedMessageLite2)));
                if (this.f17149f) {
                    Y.B(this.f17157o, generatedMessageLite, generatedMessageLite2);
                    return;
                }
                return;
            }
            int iL = L(i10);
            long j = 1048575 & iL;
            int i11 = iArr[i10];
            switch (K(iL)) {
                case 0:
                    if (q(i10, generatedMessageLite2)) {
                        g0.e eVar = g0.f17233c;
                        eVar.m(generatedMessageLite, j, eVar.e(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 1:
                    if (q(i10, generatedMessageLite2)) {
                        g0.e eVar2 = g0.f17233c;
                        eVar2.n(generatedMessageLite, j, eVar2.f(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 2:
                    if (q(i10, generatedMessageLite2)) {
                        g0.q(generatedMessageLite, j, g0.f17233c.h(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 3:
                    if (q(i10, generatedMessageLite2)) {
                        g0.q(generatedMessageLite, j, g0.f17233c.h(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 4:
                    if (q(i10, generatedMessageLite2)) {
                        g0.p(g0.f17233c.g(generatedMessageLite2, j), j, generatedMessageLite);
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 5:
                    if (q(i10, generatedMessageLite2)) {
                        g0.q(generatedMessageLite, j, g0.f17233c.h(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 6:
                    if (q(i10, generatedMessageLite2)) {
                        g0.p(g0.f17233c.g(generatedMessageLite2, j), j, generatedMessageLite);
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 7:
                    if (q(i10, generatedMessageLite2)) {
                        g0.e eVar3 = g0.f17233c;
                        eVar3.k(generatedMessageLite, j, eVar3.c(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 8:
                    if (q(i10, generatedMessageLite2)) {
                        g0.r(j, generatedMessageLite, g0.f17233c.i(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 9:
                    v(generatedMessageLite, generatedMessageLite2, i10);
                    break;
                case 10:
                    if (q(i10, generatedMessageLite2)) {
                        g0.r(j, generatedMessageLite, g0.f17233c.i(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 11:
                    if (q(i10, generatedMessageLite2)) {
                        g0.p(g0.f17233c.g(generatedMessageLite2, j), j, generatedMessageLite);
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 12:
                    if (q(i10, generatedMessageLite2)) {
                        g0.p(g0.f17233c.g(generatedMessageLite2, j), j, generatedMessageLite);
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 13:
                    if (q(i10, generatedMessageLite2)) {
                        g0.p(g0.f17233c.g(generatedMessageLite2, j), j, generatedMessageLite);
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 14:
                    if (q(i10, generatedMessageLite2)) {
                        g0.q(generatedMessageLite, j, g0.f17233c.h(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 15:
                    if (q(i10, generatedMessageLite2)) {
                        g0.p(g0.f17233c.g(generatedMessageLite2, j), j, generatedMessageLite);
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 16:
                    if (q(i10, generatedMessageLite2)) {
                        g0.q(generatedMessageLite, j, g0.f17233c.h(generatedMessageLite2, j));
                        I(i10, generatedMessageLite);
                    }
                    break;
                case 17:
                    v(generatedMessageLite, generatedMessageLite2, i10);
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
                    this.f17155m.b(generatedMessageLite, generatedMessageLite2, j);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    Class<?> cls2 = Y.f17193a;
                    g0.e eVar4 = g0.f17233c;
                    g0.r(j, generatedMessageLite, this.f17158p.a(eVar4.i(generatedMessageLite, j), eVar4.i(generatedMessageLite2, j)));
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
                    if (r(i11, i10, generatedMessageLite2)) {
                        g0.r(j, generatedMessageLite, g0.f17233c.i(generatedMessageLite2, j));
                        J(i11, i10, generatedMessageLite);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    w(generatedMessageLite, generatedMessageLite2, i10);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i11, i10, generatedMessageLite2)) {
                        g0.r(j, generatedMessageLite, g0.f17233c.i(generatedMessageLite2, j));
                        J(i11, i10, generatedMessageLite);
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    w(generatedMessageLite, generatedMessageLite2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.X
    public final int h(GeneratedMessageLite generatedMessageLite) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f17144a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iL = L(i13);
            int i14 = iArr[i13];
            long j = 1048575 & iL;
            int i15 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i10 = i12 * 53;
                    iB = C1330u.b(Double.doubleToLongBits(g0.f17233c.e(generatedMessageLite, j)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(g0.f17233c.f(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = C1330u.b(g0.f17233c.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = C1330u.b(g0.f17233c.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = g0.f17233c.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = C1330u.b(g0.f17233c.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = g0.f17233c.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = g0.f17233c.c(generatedMessageLite, j);
                    Charset charset = C1330u.f17280a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) g0.f17233c.i(generatedMessageLite, j)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objI = g0.f17233c.i(generatedMessageLite, j);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = g0.f17233c.i(generatedMessageLite, j).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = g0.f17233c.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = g0.f17233c.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = g0.f17233c.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = C1330u.b(g0.f17233c.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = g0.f17233c.g(generatedMessageLite, j);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = C1330u.b(g0.f17233c.h(generatedMessageLite, j));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objI2 = g0.f17233c.i(generatedMessageLite, j);
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
                    iB = g0.f17233c.i(generatedMessageLite, j).hashCode();
                    i12 = iB + i10;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    i10 = i12 * 53;
                    iB = g0.f17233c.i(generatedMessageLite, j).hashCode();
                    i12 = iB + i10;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C1330u.b(Double.doubleToLongBits(((Double) g0.f17233c.i(generatedMessageLite, j)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) g0.f17233c.i(generatedMessageLite, j)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C1330u.b(B(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C1330u.b(B(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = A(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C1330u.b(B(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = A(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) g0.f17233c.i(generatedMessageLite, j)).booleanValue();
                        Charset charset2 = C1330u.f17280a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = ((String) g0.f17233c.i(generatedMessageLite, j)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = g0.f17233c.i(generatedMessageLite, j).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = g0.f17233c.i(generatedMessageLite, j).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = A(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = A(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = A(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C1330u.b(B(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = A(generatedMessageLite, j);
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = C1330u.b(B(generatedMessageLite, j));
                        i12 = iB + i10;
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (r(i14, i13, generatedMessageLite)) {
                        i10 = i12 * 53;
                        iB = g0.f17233c.i(generatedMessageLite, j).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f17156n.g(generatedMessageLite).hashCode() + (i12 * 53);
        return this.f17149f ? (iHashCode2 * 53) + this.f17157o.c(generatedMessageLite).f17272a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.X
    public final void i(T t8, h0 h0Var) throws IOException {
        Map.Entry entry;
        h0Var.getClass();
        if (!this.f17151h) {
            M(t8, h0Var);
            return;
        }
        boolean z10 = this.f17149f;
        AbstractC1324n<?> abstractC1324n = this.f17157o;
        if (z10) {
            C1327q<T> c1327qC = abstractC1324n.c(t8);
            if (c1327qC.f17272a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c1327qC.i().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.f17144a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iL = L(i10);
            int i11 = iArr[i10];
            if (entry != null) {
                abstractC1324n.a(entry);
                if (i11 >= 0) {
                    abstractC1324n.j(entry);
                    throw null;
                }
            }
            switch (K(iL)) {
                case 0:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).c(i11, g0.f17233c.e(t8, iL & 1048575));
                    }
                    break;
                case 1:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).g(g0.f17233c.f(t8, iL & 1048575), i11);
                    }
                    break;
                case 2:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).j(i11, g0.f17233c.h(t8, iL & 1048575));
                    }
                    break;
                case 3:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).q(i11, g0.f17233c.h(t8, iL & 1048575));
                    }
                    break;
                case 4:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).i(i11, g0.f17233c.g(t8, iL & 1048575));
                    }
                    break;
                case 5:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).f(i11, g0.f17233c.h(t8, iL & 1048575));
                    }
                    break;
                case 6:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).e(i11, g0.f17233c.g(t8, iL & 1048575));
                    }
                    break;
                case 7:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).a(i11, g0.f17233c.c(t8, iL & 1048575));
                    }
                    break;
                case 8:
                    if (q(i10, t8)) {
                        O(i11, g0.f17233c.i(t8, iL & 1048575), h0Var);
                    }
                    break;
                case 9:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).k(i11, g0.f17233c.i(t8, iL & 1048575), n(i10));
                    }
                    break;
                case 10:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).b(i11, (ByteString) g0.f17233c.i(t8, iL & 1048575));
                    }
                    break;
                case 11:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).p(i11, g0.f17233c.g(t8, iL & 1048575));
                    }
                    break;
                case 12:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).d(i11, g0.f17233c.g(t8, iL & 1048575));
                    }
                    break;
                case 13:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).l(i11, g0.f17233c.g(t8, iL & 1048575));
                    }
                    break;
                case 14:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).m(i11, g0.f17233c.h(t8, iL & 1048575));
                    }
                    break;
                case 15:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).n(i11, g0.f17233c.g(t8, iL & 1048575));
                    }
                    break;
                case 16:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).o(i11, g0.f17233c.h(t8, iL & 1048575));
                    }
                    break;
                case 17:
                    if (q(i10, t8)) {
                        ((C1320j) h0Var).h(i11, g0.f17233c.i(t8, iL & 1048575), n(i10));
                    }
                    break;
                case 18:
                    Y.G(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case 19:
                    Y.K(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case 20:
                    Y.N(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case 21:
                    Y.V(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case 22:
                    Y.M(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case 23:
                    Y.J(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case 24:
                    Y.I(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case 25:
                    Y.E(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case 26:
                    Y.T(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var);
                    break;
                case 27:
                    Y.O(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, n(i10));
                    break;
                case 28:
                    Y.F(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var);
                    break;
                case 29:
                    Y.U(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    Y.H(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    Y.P(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    Y.Q(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    Y.R(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    Y.S(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, false);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    Y.G(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    Y.K(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    Y.N(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    Y.V(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    Y.M(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    Y.J(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    Y.I(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    Y.E(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    Y.U(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case 44:
                    Y.H(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    Y.P(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    Y.Q(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    Y.R(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    Y.S(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, true);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    Y.L(iArr[i10], (List) g0.f17233c.i(t8, iL & 1048575), h0Var, n(i10));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    N(h0Var, i11, g0.f17233c.i(t8, iL & 1048575), i10);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).c(i11, ((Double) g0.f17233c.i(t8, iL & 1048575)).doubleValue());
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).g(((Float) g0.f17233c.i(t8, iL & 1048575)).floatValue(), i11);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).j(i11, B(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).q(i11, B(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).i(i11, A(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).f(i11, B(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).e(i11, A(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).a(i11, ((Boolean) g0.f17233c.i(t8, iL & 1048575)).booleanValue());
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i11, i10, t8)) {
                        O(i11, g0.f17233c.i(t8, iL & 1048575), h0Var);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).k(i11, g0.f17233c.i(t8, iL & 1048575), n(i10));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).b(i11, (ByteString) g0.f17233c.i(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).p(i11, A(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).d(i11, A(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).l(i11, A(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).m(i11, B(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).n(i11, A(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).o(i11, B(t8, iL & 1048575));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (r(i11, i10, t8)) {
                        ((C1320j) h0Var).h(i11, g0.f17233c.i(t8, iL & 1048575), n(i10));
                    }
                    break;
            }
        }
        if (entry != null) {
            abstractC1324n.j(entry);
            throw null;
        }
        c0<?, ?> c0Var = this.f17156n;
        c0Var.r(c0Var.g(t8), h0Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.X
    public final boolean j(GeneratedMessageLite generatedMessageLite, Object obj) {
        int[] iArr = this.f17144a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zC = true;
            if (i10 >= length) {
                c0<?, ?> c0Var = this.f17156n;
                if (!c0Var.g(generatedMessageLite).equals(c0Var.g(obj))) {
                    return false;
                }
                if (!this.f17149f) {
                    return true;
                }
                AbstractC1324n<?> abstractC1324n = this.f17157o;
                return abstractC1324n.c(generatedMessageLite).equals(abstractC1324n.c(obj));
            }
            int iL = L(i10);
            long j = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar = g0.f17233c;
                        if (Double.doubleToLongBits(eVar.e(generatedMessageLite, j)) != Double.doubleToLongBits(eVar.e(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 1:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar2 = g0.f17233c;
                        if (Float.floatToIntBits(eVar2.f(generatedMessageLite, j)) != Float.floatToIntBits(eVar2.f(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 2:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar3 = g0.f17233c;
                        if (eVar3.h(generatedMessageLite, j) != eVar3.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 3:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar4 = g0.f17233c;
                        if (eVar4.h(generatedMessageLite, j) != eVar4.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 4:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar5 = g0.f17233c;
                        if (eVar5.g(generatedMessageLite, j) != eVar5.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 5:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar6 = g0.f17233c;
                        if (eVar6.h(generatedMessageLite, j) != eVar6.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 6:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar7 = g0.f17233c;
                        if (eVar7.g(generatedMessageLite, j) != eVar7.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 7:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar8 = g0.f17233c;
                        if (eVar8.c(generatedMessageLite, j) != eVar8.c(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 8:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar9 = g0.f17233c;
                        if (!Y.C(eVar9.i(generatedMessageLite, j), eVar9.i(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 9:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar10 = g0.f17233c;
                        if (!Y.C(eVar10.i(generatedMessageLite, j), eVar10.i(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 10:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar11 = g0.f17233c;
                        if (!Y.C(eVar11.i(generatedMessageLite, j), eVar11.i(obj, j))) {
                            zC = false;
                        }
                    }
                    break;
                case 11:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar12 = g0.f17233c;
                        if (eVar12.g(generatedMessageLite, j) != eVar12.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 12:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar13 = g0.f17233c;
                        if (eVar13.g(generatedMessageLite, j) != eVar13.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 13:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar14 = g0.f17233c;
                        if (eVar14.g(generatedMessageLite, j) != eVar14.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 14:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar15 = g0.f17233c;
                        if (eVar15.h(generatedMessageLite, j) != eVar15.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 15:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar16 = g0.f17233c;
                        if (eVar16.g(generatedMessageLite, j) != eVar16.g(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 16:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar17 = g0.f17233c;
                        if (eVar17.h(generatedMessageLite, j) != eVar17.h(obj, j)) {
                            zC = false;
                        }
                    }
                    break;
                case 17:
                    if (!a(generatedMessageLite, obj, i10)) {
                        zC = false;
                    } else {
                        g0.e eVar18 = g0.f17233c;
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
                    g0.e eVar19 = g0.f17233c;
                    zC = Y.C(eVar19.i(generatedMessageLite, j), eVar19.i(obj, j));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    g0.e eVar20 = g0.f17233c;
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
                    g0.e eVar21 = g0.f17233c;
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

    public final <UT, UB> UB k(Object obj, int i10, UB ub2, c0<UT, UB> c0Var) {
        C1330u.b bVarL;
        int i11 = this.f17144a[i10];
        Object objI = g0.f17233c.i(obj, L(i10) & 1048575);
        if (objI == null || (bVarL = l(i10)) == null) {
            return ub2;
        }
        D d10 = this.f17158p;
        MapFieldLite mapFieldLiteE = d10.e(objI);
        C.a<?, ?> aVarC = d10.c(m(i10));
        Iterator it = mapFieldLiteE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!bVarL.a()) {
                if (ub2 == null) {
                    ub2 = (UB) c0Var.m();
                }
                int iA = C.a(aVarC, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iA];
                Logger logger = CodedOutputStream.f17101b;
                CodedOutputStream.b bVar = new CodedOutputStream.b(iA, bArr);
                try {
                    C.b(bVar, aVarC, entry.getKey(), entry.getValue());
                    if (bVar.f17108e - bVar.f17109f != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    c0Var.d(ub2, i11, new ByteString.LiteralByteString(bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    public final C1330u.b l(int i10) {
        return (C1330u.b) this.f17145b[((i10 / 3) * 2) + 1];
    }

    public final Object m(int i10) {
        return this.f17145b[(i10 / 3) * 2];
    }

    public final X n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f17145b;
        X x10 = (X) objArr[i11];
        if (x10 != null) {
            return x10;
        }
        X<T> xA = T.f17169c.a((Class) objArr[i11 + 1]);
        objArr[i11] = xA;
        return xA;
    }

    public final int o(AbstractC1311a abstractC1311a) {
        int i10;
        int iE;
        int iC;
        Unsafe unsafe = f17143r;
        int i11 = -1;
        int i12 = 0;
        int iC2 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f17144a;
            if (i12 >= iArr.length) {
                c0<?, ?> c0Var = this.f17156n;
                int iH = c0Var.h(c0Var.g(abstractC1311a)) + iC2;
                return this.f17149f ? iH + this.f17157o.c(abstractC1311a).e() : iH;
            }
            int iL = L(i12);
            int i14 = iArr[i12];
            int iK = K(iL);
            if (iK <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & 1048575;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i13 = unsafe.getInt(abstractC1311a, i16);
                    i11 = i16;
                }
            } else {
                i10 = 0;
            }
            long j = iL & 1048575;
            switch (iK) {
                case 0:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.e(i14);
                        iC2 += iE;
                    }
                    break;
                case 1:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.i(i14);
                        iC2 += iE;
                    }
                    break;
                case 2:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.m(i14, unsafe.getLong(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case 3:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.x(i14, unsafe.getLong(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case 4:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.k(i14, unsafe.getInt(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case 5:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.h(i14);
                        iC2 += iE;
                    }
                    break;
                case 6:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.g(i14);
                        iC2 += iE;
                    }
                    break;
                case 7:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.b(i14);
                        iC2 += iE;
                    }
                    break;
                case 8:
                    if ((i10 & i13) != 0) {
                        Object object = unsafe.getObject(abstractC1311a, j);
                        iC = object instanceof ByteString ? CodedOutputStream.c(i14, (ByteString) object) : CodedOutputStream.s(i14, (String) object);
                        iC2 = iC + iC2;
                    }
                    break;
                case 9:
                    if ((i10 & i13) != 0) {
                        iE = Y.o(i14, unsafe.getObject(abstractC1311a, j), n(i12));
                        iC2 += iE;
                    }
                    break;
                case 10:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.c(i14, (ByteString) unsafe.getObject(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case 11:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.v(i14, unsafe.getInt(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case 12:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.f(i14, unsafe.getInt(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case 13:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.o(i14);
                        iC2 += iE;
                    }
                    break;
                case 14:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.p(i14);
                        iC2 += iE;
                    }
                    break;
                case 15:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.q(i14, unsafe.getInt(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case 16:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.r(i14, unsafe.getLong(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case 17:
                    if ((i10 & i13) != 0) {
                        iE = CodedOutputStream.j(i14, (I) unsafe.getObject(abstractC1311a, j), n(i12));
                        iC2 += iE;
                    }
                    break;
                case 18:
                    iE = Y.h(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 19:
                    iE = Y.f(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 20:
                    iE = Y.m(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 21:
                    iE = Y.x(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 22:
                    iE = Y.k(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 23:
                    iE = Y.h(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 24:
                    iE = Y.f(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 25:
                    iE = Y.a(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 26:
                    iE = Y.u(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 27:
                    iE = Y.p(i14, (List) unsafe.getObject(abstractC1311a, j), n(i12));
                    iC2 += iE;
                    break;
                case 28:
                    iE = Y.c(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case 29:
                    iE = Y.v(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    iE = Y.d(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iE = Y.f(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    iE = Y.h(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iE = Y.q(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    iE = Y.s(i14, (List) unsafe.getObject(abstractC1311a, j));
                    iC2 += iE;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    int i17 = Y.i((List) unsafe.getObject(abstractC1311a, j));
                    if (i17 > 0) {
                        iC2 = B6.c.c(i17, CodedOutputStream.u(i14), i17, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    int iG = Y.g((List) unsafe.getObject(abstractC1311a, j));
                    if (iG > 0) {
                        iC2 = B6.c.c(iG, CodedOutputStream.u(i14), iG, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    int iN = Y.n((List) unsafe.getObject(abstractC1311a, j));
                    if (iN > 0) {
                        iC2 = B6.c.c(iN, CodedOutputStream.u(i14), iN, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    int iY = Y.y((List) unsafe.getObject(abstractC1311a, j));
                    if (iY > 0) {
                        iC2 = B6.c.c(iY, CodedOutputStream.u(i14), iY, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    int iL2 = Y.l((List) unsafe.getObject(abstractC1311a, j));
                    if (iL2 > 0) {
                        iC2 = B6.c.c(iL2, CodedOutputStream.u(i14), iL2, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    int i18 = Y.i((List) unsafe.getObject(abstractC1311a, j));
                    if (i18 > 0) {
                        iC2 = B6.c.c(i18, CodedOutputStream.u(i14), i18, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    int iG2 = Y.g((List) unsafe.getObject(abstractC1311a, j));
                    if (iG2 > 0) {
                        iC2 = B6.c.c(iG2, CodedOutputStream.u(i14), iG2, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    int iB = Y.b((List) unsafe.getObject(abstractC1311a, j));
                    if (iB > 0) {
                        iC2 = B6.c.c(iB, CodedOutputStream.u(i14), iB, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    int iW = Y.w((List) unsafe.getObject(abstractC1311a, j));
                    if (iW > 0) {
                        iC2 = B6.c.c(iW, CodedOutputStream.u(i14), iW, iC2);
                    }
                    break;
                case 44:
                    int iE2 = Y.e((List) unsafe.getObject(abstractC1311a, j));
                    if (iE2 > 0) {
                        iC2 = B6.c.c(iE2, CodedOutputStream.u(i14), iE2, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    int iG3 = Y.g((List) unsafe.getObject(abstractC1311a, j));
                    if (iG3 > 0) {
                        iC2 = B6.c.c(iG3, CodedOutputStream.u(i14), iG3, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    int i19 = Y.i((List) unsafe.getObject(abstractC1311a, j));
                    if (i19 > 0) {
                        iC2 = B6.c.c(i19, CodedOutputStream.u(i14), i19, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    int iR = Y.r((List) unsafe.getObject(abstractC1311a, j));
                    if (iR > 0) {
                        iC2 = B6.c.c(iR, CodedOutputStream.u(i14), iR, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    int iT = Y.t((List) unsafe.getObject(abstractC1311a, j));
                    if (iT > 0) {
                        iC2 = B6.c.c(iT, CodedOutputStream.u(i14), iT, iC2);
                    }
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iE = Y.j(i14, (List) unsafe.getObject(abstractC1311a, j), n(i12));
                    iC2 += iE;
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    iE = this.f17158p.f(unsafe.getObject(abstractC1311a, j), i14, m(i12));
                    iC2 += iE;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.e(i14);
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.i(i14);
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.m(i14, B(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.x(i14, B(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.k(i14, A(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.h(i14);
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.g(i14);
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.b(i14);
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i14, i12, abstractC1311a)) {
                        Object object2 = unsafe.getObject(abstractC1311a, j);
                        iC = object2 instanceof ByteString ? CodedOutputStream.c(i14, (ByteString) object2) : CodedOutputStream.s(i14, (String) object2);
                        iC2 = iC + iC2;
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = Y.o(i14, unsafe.getObject(abstractC1311a, j), n(i12));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.c(i14, (ByteString) unsafe.getObject(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.v(i14, A(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.f(i14, A(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.o(i14);
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.p(i14);
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.q(i14, A(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.r(i14, B(abstractC1311a, j));
                        iC2 += iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (r(i14, i12, abstractC1311a)) {
                        iE = CodedOutputStream.j(i14, (I) unsafe.getObject(abstractC1311a, j), n(i12));
                        iC2 += iE;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    public final int p(AbstractC1311a abstractC1311a) {
        int iE;
        Unsafe unsafe = f17143r;
        int i10 = 0;
        int iC = 0;
        while (true) {
            int[] iArr = this.f17144a;
            if (i10 >= iArr.length) {
                c0<?, ?> c0Var = this.f17156n;
                return c0Var.h(c0Var.g(abstractC1311a)) + iC;
            }
            int iL = L(i10);
            int iK = K(iL);
            int i11 = iArr[i10];
            long j = iL & 1048575;
            if (iK >= FieldType.f17113b.a() && iK <= FieldType.f17114c.a()) {
                int i12 = iArr[i10 + 2];
            }
            switch (iK) {
                case 0:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.e(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 1:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.i(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 2:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.m(i11, g0.j(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 3:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.x(i11, g0.j(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 4:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.k(i11, g0.i(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 5:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.h(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 6:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.g(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 7:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.b(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 8:
                    if (q(i10, abstractC1311a)) {
                        Object objK = g0.k(abstractC1311a, j);
                        iE = !(objK instanceof ByteString) ? CodedOutputStream.s(i11, (String) objK) : CodedOutputStream.c(i11, (ByteString) objK);
                        break;
                    }
                    i10 += 3;
                    break;
                case 9:
                    if (q(i10, abstractC1311a)) {
                        iE = Y.o(i11, g0.k(abstractC1311a, j), n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 10:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.c(i11, (ByteString) g0.k(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 11:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.v(i11, g0.i(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 12:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.f(i11, g0.i(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 13:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.o(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 14:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.p(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 15:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.q(i11, g0.i(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 16:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.r(i11, g0.j(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case 17:
                    if (q(i10, abstractC1311a)) {
                        iE = CodedOutputStream.j(i11, (I) g0.k(abstractC1311a, j), n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 18:
                    iE = Y.h(i11, s(abstractC1311a, j));
                    break;
                case 19:
                    iE = Y.f(i11, s(abstractC1311a, j));
                    break;
                case 20:
                    iE = Y.m(i11, s(abstractC1311a, j));
                    break;
                case 21:
                    iE = Y.x(i11, s(abstractC1311a, j));
                    break;
                case 22:
                    iE = Y.k(i11, s(abstractC1311a, j));
                    break;
                case 23:
                    iE = Y.h(i11, s(abstractC1311a, j));
                    break;
                case 24:
                    iE = Y.f(i11, s(abstractC1311a, j));
                    break;
                case 25:
                    iE = Y.a(i11, s(abstractC1311a, j));
                    break;
                case 26:
                    iE = Y.u(i11, s(abstractC1311a, j));
                    break;
                case 27:
                    iE = Y.p(i11, s(abstractC1311a, j), n(i10));
                    break;
                case 28:
                    iE = Y.c(i11, s(abstractC1311a, j));
                    break;
                case 29:
                    iE = Y.v(i11, s(abstractC1311a, j));
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    iE = Y.d(i11, s(abstractC1311a, j));
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iE = Y.f(i11, s(abstractC1311a, j));
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    iE = Y.h(i11, s(abstractC1311a, j));
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iE = Y.q(i11, s(abstractC1311a, j));
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    iE = Y.s(i11, s(abstractC1311a, j));
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    int i13 = Y.i((List) unsafe.getObject(abstractC1311a, j));
                    if (i13 > 0) {
                        iC = B6.c.c(i13, CodedOutputStream.u(i11), i13, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    int iG = Y.g((List) unsafe.getObject(abstractC1311a, j));
                    if (iG > 0) {
                        iC = B6.c.c(iG, CodedOutputStream.u(i11), iG, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    int iN = Y.n((List) unsafe.getObject(abstractC1311a, j));
                    if (iN > 0) {
                        iC = B6.c.c(iN, CodedOutputStream.u(i11), iN, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    int iY = Y.y((List) unsafe.getObject(abstractC1311a, j));
                    if (iY > 0) {
                        iC = B6.c.c(iY, CodedOutputStream.u(i11), iY, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    int iL2 = Y.l((List) unsafe.getObject(abstractC1311a, j));
                    if (iL2 > 0) {
                        iC = B6.c.c(iL2, CodedOutputStream.u(i11), iL2, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    int i14 = Y.i((List) unsafe.getObject(abstractC1311a, j));
                    if (i14 > 0) {
                        iC = B6.c.c(i14, CodedOutputStream.u(i11), i14, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    int iG2 = Y.g((List) unsafe.getObject(abstractC1311a, j));
                    if (iG2 > 0) {
                        iC = B6.c.c(iG2, CodedOutputStream.u(i11), iG2, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    int iB = Y.b((List) unsafe.getObject(abstractC1311a, j));
                    if (iB > 0) {
                        iC = B6.c.c(iB, CodedOutputStream.u(i11), iB, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    int iW = Y.w((List) unsafe.getObject(abstractC1311a, j));
                    if (iW > 0) {
                        iC = B6.c.c(iW, CodedOutputStream.u(i11), iW, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 44:
                    int iE2 = Y.e((List) unsafe.getObject(abstractC1311a, j));
                    if (iE2 > 0) {
                        iC = B6.c.c(iE2, CodedOutputStream.u(i11), iE2, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    int iG3 = Y.g((List) unsafe.getObject(abstractC1311a, j));
                    if (iG3 > 0) {
                        iC = B6.c.c(iG3, CodedOutputStream.u(i11), iG3, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    int i15 = Y.i((List) unsafe.getObject(abstractC1311a, j));
                    if (i15 > 0) {
                        iC = B6.c.c(i15, CodedOutputStream.u(i11), i15, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    int iR = Y.r((List) unsafe.getObject(abstractC1311a, j));
                    if (iR > 0) {
                        iC = B6.c.c(iR, CodedOutputStream.u(i11), iR, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    int iT = Y.t((List) unsafe.getObject(abstractC1311a, j));
                    if (iT > 0) {
                        iC = B6.c.c(iT, CodedOutputStream.u(i11), iT, iC);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iE = Y.j(i11, s(abstractC1311a, j), n(i10));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    iE = this.f17158p.f(g0.k(abstractC1311a, j), i11, m(i10));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.e(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.i(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.m(i11, B(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.x(i11, B(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.k(i11, A(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.h(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.g(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.b(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (r(i11, i10, abstractC1311a)) {
                        Object objK2 = g0.k(abstractC1311a, j);
                        iE = !(objK2 instanceof ByteString) ? CodedOutputStream.s(i11, (String) objK2) : CodedOutputStream.c(i11, (ByteString) objK2);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = Y.o(i11, g0.k(abstractC1311a, j), n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.c(i11, (ByteString) g0.k(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.v(i11, A(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.f(i11, A(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.o(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.p(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.q(i11, A(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.r(i11, B(abstractC1311a, j));
                        break;
                    }
                    i10 += 3;
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (r(i11, i10, abstractC1311a)) {
                        iE = CodedOutputStream.j(i11, (I) g0.k(abstractC1311a, j), n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                default:
                    continue;
                    i10 += 3;
                    break;
            }
            iC = iE + iC;
            i10 += 3;
        }
    }

    public final boolean q(int i10, Object obj) {
        if (!this.f17151h) {
            int i11 = this.f17144a[i10 + 2];
            return (g0.f17233c.g(obj, (long) (i11 & 1048575)) & (1 << (i11 >>> 20))) != 0;
        }
        int iL = L(i10);
        long j = iL & 1048575;
        switch (K(iL)) {
            case 0:
                return g0.f17233c.e(obj, j) != 0.0d;
            case 1:
                return g0.f17233c.f(obj, j) != 0.0f;
            case 2:
                return g0.f17233c.h(obj, j) != 0;
            case 3:
                return g0.f17233c.h(obj, j) != 0;
            case 4:
                return g0.f17233c.g(obj, j) != 0;
            case 5:
                return g0.f17233c.h(obj, j) != 0;
            case 6:
                return g0.f17233c.g(obj, j) != 0;
            case 7:
                return g0.f17233c.c(obj, j);
            case 8:
                Object objI = g0.f17233c.i(obj, j);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof ByteString) {
                    return !ByteString.f17095b.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return g0.f17233c.i(obj, j) != null;
            case 10:
                return !ByteString.f17095b.equals(g0.f17233c.i(obj, j));
            case 11:
                return g0.f17233c.g(obj, j) != 0;
            case 12:
                return g0.f17233c.g(obj, j) != 0;
            case 13:
                return g0.f17233c.g(obj, j) != 0;
            case 14:
                return g0.f17233c.h(obj, j) != 0;
            case 15:
                return g0.f17233c.g(obj, j) != 0;
            case 16:
                return g0.f17233c.h(obj, j) != 0;
            case 17:
                return g0.f17233c.i(obj, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean r(int i10, int i11, Object obj) {
        return g0.f17233c.g(obj, (long) (this.f17144a[i11 + 2] & 1048575)) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x065d A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:162:0x0658, B:164:0x065d, B:167:0x0665), top: B:184:0x0658 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x066f A[LOOP:2: B:170:0x066d->B:171:0x066f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x067a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0688 A[LOOP:3: B:177:0x0686->B:178:0x0688, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x0693  */
    /* JADX WARN: Code duplicated, block: B:207:0x066b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends C1327q.a<ET>> void t(c0<UT, UB> c0Var, AbstractC1324n<ET> abstractC1324n, T t8, W w3, C1323m c1323m) throws Throwable {
        int i10;
        int i11;
        int i12;
        Object obj;
        Object obj2;
        AbstractC1324n<ET> abstractC1324n2 = abstractC1324n;
        int[] iArr = this.f17152i;
        int i13 = this.f17153k;
        int i14 = this.j;
        Object objK = null;
        while (true) {
            try {
                int iY = w3.y();
                int iC = C(iY);
                if (iC >= 0) {
                    int iL = L(iC);
                    try {
                        int iK = K(iL);
                        AbstractC1335z abstractC1335z = this.f17155m;
                        switch (iK) {
                            case 0:
                                i10 = i14;
                                obj2 = objK;
                                g0.f17233c.m(t8, z(iL), w3.readDouble());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 1:
                                i10 = i14;
                                obj2 = objK;
                                g0.f17233c.n(t8, z(iL), w3.readFloat());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 2:
                                i10 = i14;
                                obj2 = objK;
                                g0.q(t8, z(iL), w3.K());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 3:
                                i10 = i14;
                                obj2 = objK;
                                g0.q(t8, z(iL), w3.d());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 4:
                                i10 = i14;
                                obj2 = objK;
                                g0.p(w3.D(), z(iL), t8);
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 5:
                                i10 = i14;
                                obj2 = objK;
                                g0.q(t8, z(iL), w3.e());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 6:
                                i10 = i14;
                                obj2 = objK;
                                g0.p(w3.i(), z(iL), t8);
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 7:
                                i10 = i14;
                                obj2 = objK;
                                g0.f17233c.k(t8, z(iL), w3.j());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 8:
                                i10 = i14;
                                obj2 = objK;
                                F(t8, iL, w3);
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 9:
                                i10 = i14;
                                obj2 = objK;
                                if (q(iC, t8)) {
                                    g0.r(z(iL), t8, C1330u.c(g0.k(t8, z(iL)), w3.b(n(iC), c1323m)));
                                } else {
                                    g0.r(z(iL), t8, w3.b(n(iC), c1323m));
                                    I(iC, t8);
                                }
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 10:
                                i10 = i14;
                                obj2 = objK;
                                g0.r(z(iL), t8, w3.B());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 11:
                                i10 = i14;
                                obj2 = objK;
                                g0.p(w3.m(), z(iL), t8);
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 12:
                                i10 = i14;
                                obj2 = objK;
                                int iS = w3.s();
                                C1330u.b bVarL = l(iC);
                                if (bVarL == null || bVarL.a()) {
                                    g0.p(iS, z(iL), t8);
                                    I(iC, t8);
                                    objK = obj2;
                                } else {
                                    objK = Y.D(iY, iS, obj2, c0Var);
                                }
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 13:
                                i10 = i14;
                                obj2 = objK;
                                g0.p(w3.G(), z(iL), t8);
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 14:
                                i10 = i14;
                                obj2 = objK;
                                g0.q(t8, z(iL), w3.k());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 15:
                                i10 = i14;
                                obj2 = objK;
                                g0.p(w3.u(), z(iL), t8);
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 16:
                                i10 = i14;
                                obj2 = objK;
                                g0.q(t8, z(iL), w3.v());
                                I(iC, t8);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 17:
                                i10 = i14;
                                obj2 = objK;
                                if (q(iC, t8)) {
                                    g0.r(z(iL), t8, C1330u.c(g0.k(t8, z(iL)), w3.N(n(iC), c1323m)));
                                } else {
                                    g0.r(z(iL), t8, w3.N(n(iC), c1323m));
                                    I(iC, t8);
                                }
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 18:
                                i10 = i14;
                                obj2 = objK;
                                w3.I(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 19:
                                i10 = i14;
                                obj2 = objK;
                                w3.C(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 20:
                                i10 = i14;
                                obj2 = objK;
                                w3.n(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 21:
                                i10 = i14;
                                obj2 = objK;
                                w3.l(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 22:
                                i10 = i14;
                                obj2 = objK;
                                w3.p(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 23:
                                i10 = i14;
                                obj2 = objK;
                                w3.M(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 24:
                                i10 = i14;
                                obj2 = objK;
                                w3.t(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 25:
                                i10 = i14;
                                obj2 = objK;
                                w3.w(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 26:
                                i10 = i14;
                                obj2 = objK;
                                G(t8, iL, w3);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 27:
                                i10 = i14;
                                obj2 = objK;
                                E(t8, iL, w3, n(iC), c1323m);
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 28:
                                i10 = i14;
                                obj2 = objK;
                                w3.H(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 29:
                                i10 = i14;
                                obj2 = objK;
                                w3.h(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                i10 = i14;
                                List<Integer> listC = abstractC1335z.c(t8, z(iL));
                                w3.q(listC);
                                objK = Y.z(iY, listC, l(iC), objK, c0Var);
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.f(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.o(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.c(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.g(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.I(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.C(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.n(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.l(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.p(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.M(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.t(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.w(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.h(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case 44:
                                i10 = i14;
                                List<Integer> listC2 = abstractC1335z.c(t8, z(iL));
                                w3.q(listC2);
                                objK = Y.z(iY, listC2, l(iC), objK, c0Var);
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.f(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.o(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.c(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                i10 = i14;
                                obj2 = objK;
                                w3.g(abstractC1335z.c(t8, z(iL)));
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                Object obj3 = objK;
                                try {
                                    i10 = i14;
                                    obj2 = obj3;
                                    try {
                                        D(t8, z(iL), w3, n(iC), c1323m);
                                        objK = obj2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        objK = obj2;
                                        try {
                                            c0Var.getClass();
                                            if (objK == null) {
                                                objK = c0Var.f(t8);
                                            }
                                            if (!c0Var.l(objK, w3)) {
                                                for (i12 = i10; i12 < i13; i12++) {
                                                    objK = k(t8, iArr[i12], objK, c0Var);
                                                }
                                                if (objK != null) {
                                                    c0Var.n(t8, objK);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        objK = obj2;
                                        for (i11 = i10; i11 < i13; i11++) {
                                            objK = k(t8, iArr[i11], objK, c0Var);
                                        }
                                        if (objK != null) {
                                            c0Var.n(t8, objK);
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    i10 = i14;
                                    obj2 = obj3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i10 = i14;
                                    obj2 = obj3;
                                }
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                obj = objK;
                                u(t8, iC, m(iC), c1323m, w3);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                obj = objK;
                                g0.r(z(iL), t8, Double.valueOf(w3.readDouble()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                obj = objK;
                                g0.r(z(iL), t8, Float.valueOf(w3.readFloat()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                obj = objK;
                                g0.r(z(iL), t8, Long.valueOf(w3.K()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                obj = objK;
                                g0.r(z(iL), t8, Long.valueOf(w3.d()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                obj = objK;
                                g0.r(z(iL), t8, Integer.valueOf(w3.D()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorError /* 56 */:
                                obj = objK;
                                g0.r(z(iL), t8, Long.valueOf(w3.e()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                obj = objK;
                                g0.r(z(iL), t8, Integer.valueOf(w3.i()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                obj = objK;
                                g0.r(z(iL), t8, Boolean.valueOf(w3.j()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                obj = objK;
                                F(t8, iL, w3);
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = obj;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                try {
                                    if (r(iY, iC, t8)) {
                                        obj = objK;
                                        try {
                                            g0.r(z(iL), t8, C1330u.c(g0.k(t8, z(iL)), w3.b(n(iC), c1323m)));
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            i10 = i14;
                                            objK = obj;
                                            c0Var.getClass();
                                            if (objK == null) {
                                                objK = c0Var.f(t8);
                                            }
                                            if (!c0Var.l(objK, w3)) {
                                                while (i12 < i13) {
                                                    objK = k(t8, iArr[i12], objK, c0Var);
                                                }
                                                if (objK != null) {
                                                    c0Var.n(t8, objK);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            i10 = i14;
                                            objK = obj;
                                        }
                                    } else {
                                        obj = objK;
                                        g0.r(z(iL), t8, w3.b(n(iC), c1323m));
                                        I(iC, t8);
                                    }
                                    J(iY, iC, t8);
                                    i10 = i14;
                                    obj2 = obj;
                                    objK = obj2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                    i10 = i14;
                                    c0Var.getClass();
                                    if (objK == null) {
                                        objK = c0Var.f(t8);
                                    }
                                    if (!c0Var.l(objK, w3)) {
                                        while (i12 < i13) {
                                            objK = k(t8, iArr[i12], objK, c0Var);
                                        }
                                        if (objK != null) {
                                            c0Var.n(t8, objK);
                                            return;
                                        }
                                        return;
                                    }
                                    abstractC1324n2 = abstractC1324n;
                                    i14 = i10;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i10 = i14;
                                }
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                g0.r(z(iL), t8, w3.B());
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = objK;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                g0.r(z(iL), t8, Integer.valueOf(w3.m()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = objK;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                int iS2 = w3.s();
                                C1330u.b bVarL2 = l(iC);
                                if (bVarL2 != null && !bVarL2.a()) {
                                    objK = Y.D(iY, iS2, objK, c0Var);
                                    i10 = i14;
                                    abstractC1324n2 = abstractC1324n;
                                    i14 = i10;
                                }
                                g0.r(z(iL), t8, Integer.valueOf(iS2));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = objK;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                g0.r(z(iL), t8, Integer.valueOf(w3.G()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = objK;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                g0.r(z(iL), t8, Long.valueOf(w3.k()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = objK;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                g0.r(z(iL), t8, Integer.valueOf(w3.u()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = objK;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                g0.r(z(iL), t8, Long.valueOf(w3.v()));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = objK;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                g0.r(z(iL), t8, w3.N(n(iC), c1323m));
                                J(iY, iC, t8);
                                i10 = i14;
                                obj2 = objK;
                                objK = obj2;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                            default:
                                if (objK == null) {
                                    try {
                                        objK = c0Var.m();
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        i10 = i14;
                                        c0Var.getClass();
                                        if (objK == null) {
                                            objK = c0Var.f(t8);
                                        }
                                        if (!c0Var.l(objK, w3)) {
                                            while (i12 < i13) {
                                                objK = k(t8, iArr[i12], objK, c0Var);
                                            }
                                            if (objK != null) {
                                                c0Var.n(t8, objK);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                                if (!c0Var.l(objK, w3)) {
                                    while (i14 < i13) {
                                        objK = k(t8, iArr[i14], objK, c0Var);
                                        i14++;
                                    }
                                    if (objK != null) {
                                        c0Var.n(t8, objK);
                                        return;
                                    }
                                    return;
                                }
                                i10 = i14;
                                abstractC1324n2 = abstractC1324n;
                                i14 = i10;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                        i10 = i14;
                    }
                } else {
                    if (iY == Integer.MAX_VALUE) {
                        while (i14 < i13) {
                            objK = k(t8, iArr[i14], objK, c0Var);
                            i14++;
                        }
                        if (objK != null) {
                            c0Var.n(t8, objK);
                            return;
                        }
                        return;
                    }
                    try {
                        GeneratedMessageLite.e eVarB = !this.f17149f ? null : abstractC1324n2.b(c1323m, this.f17148e, iY);
                        if (eVarB != null) {
                            abstractC1324n.d(t8);
                            abstractC1324n2.g(eVarB);
                            throw null;
                        }
                        c0Var.getClass();
                        if (objK == null) {
                            objK = c0Var.f(t8);
                        }
                        if (!c0Var.l(objK, w3)) {
                            while (i14 < i13) {
                                objK = k(t8, iArr[i14], objK, c0Var);
                                i14++;
                            }
                            if (objK != null) {
                                c0Var.n(t8, objK);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        i10 = i14;
                        while (i11 < i13) {
                            objK = k(t8, iArr[i11], objK, c0Var);
                        }
                        if (objK != null) {
                            c0Var.n(t8, objK);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                i10 = i14;
            }
            while (i11 < i13) {
                objK = k(t8, iArr[i11], objK, c0Var);
            }
            if (objK != null) {
                c0Var.n(t8, objK);
            }
            throw th;
        }
    }

    public final <K, V> void u(Object obj, int i10, Object obj2, C1323m c1323m, W w3) throws IOException {
        long jL = L(i10) & 1048575;
        Object objI = g0.f17233c.i(obj, jL);
        D d10 = this.f17158p;
        if (objI == null) {
            objI = d10.d();
            g0.r(jL, obj, objI);
        } else if (d10.g(objI)) {
            MapFieldLite mapFieldLiteD = d10.d();
            d10.a(mapFieldLiteD, objI);
            g0.r(jL, obj, mapFieldLiteD);
            objI = mapFieldLiteD;
        }
        w3.r(d10.e(objI), d10.c(obj2), c1323m);
    }

    public final void v(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i10) {
        long jL = L(i10) & 1048575;
        if (q(i10, generatedMessageLite2)) {
            g0.e eVar = g0.f17233c;
            Object objI = eVar.i(generatedMessageLite, jL);
            Object objI2 = eVar.i(generatedMessageLite2, jL);
            if (objI != null && objI2 != null) {
                g0.r(jL, generatedMessageLite, C1330u.c(objI, objI2));
                I(i10, generatedMessageLite);
            } else if (objI2 != null) {
                g0.r(jL, generatedMessageLite, objI2);
                I(i10, generatedMessageLite);
            }
        }
    }

    public final void w(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i10) {
        int iL = L(i10);
        int i11 = this.f17144a[i10];
        long j = iL & 1048575;
        if (r(i11, i10, generatedMessageLite2)) {
            g0.e eVar = g0.f17233c;
            Object objI = eVar.i(generatedMessageLite, j);
            Object objI2 = eVar.i(generatedMessageLite2, j);
            if (objI != null && objI2 != null) {
                g0.r(j, generatedMessageLite, C1330u.c(objI, objI2));
                J(i11, i10, generatedMessageLite);
            } else if (objI2 != null) {
                g0.r(j, generatedMessageLite, objI2);
                J(i11, i10, generatedMessageLite);
            }
        }
    }
}
