package p310z3;

import E3.h;
import O3.b;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: StandardGifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f48808a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0562a f48810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f48811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f48812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f48813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f48814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f48815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f48816i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f48818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f48819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f48820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f48822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f48823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f48824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f48825s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f48809b = new int[256];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f48826t = Bitmap.Config.ARGB_8888;

    public e(a.InterfaceC0562a interfaceC0562a, c cVar, ByteBuffer byteBuffer, int i10) {
        this.f48810c = interfaceC0562a;
        this.f48818l = new c();
        synchronized (this) {
            try {
                if (i10 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
                }
                int iHighestOneBit = Integer.highestOneBit(i10);
                this.f48821o = 0;
                this.f48818l = cVar;
                this.f48817k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f48811d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f48811d.order(ByteOrder.LITTLE_ENDIAN);
                this.f48820n = false;
                Iterator it = cVar.f48798e.iterator();
                while (it.hasNext()) {
                    if (((b) it.next()).f48790g == 3) {
                        this.f48820n = true;
                        break;
                    }
                }
                this.f48822p = iHighestOneBit;
                int i11 = cVar.f48799f;
                this.f48824r = i11 / iHighestOneBit;
                int i12 = cVar.f48800g;
                this.f48823q = i12 / iHighestOneBit;
                int i13 = i11 * i12;
                h hVar = ((b) this.f48810c).f4803b;
                this.f48816i = hVar == null ? new byte[i13] : (byte[]) hVar.d(byte[].class, i13);
                a.InterfaceC0562a interfaceC0562a2 = this.f48810c;
                int i14 = this.f48824r * this.f48823q;
                h hVar2 = ((b) interfaceC0562a2).f4803b;
                this.j = hVar2 == null ? new int[i14] : (int[]) hVar2.d(int[].class, i14);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p310z3.a
    public final synchronized Bitmap a() {
        try {
            if (this.f48818l.f48796c <= 0 || this.f48817k < 0) {
                if (Log.isLoggable("e", 3)) {
                    int i10 = this.f48818l.f48796c;
                }
                this.f48821o = 1;
            }
            int i11 = this.f48821o;
            if (i11 != 1 && i11 != 2) {
                this.f48821o = 0;
                if (this.f48812e == null) {
                    h hVar = ((b) this.f48810c).f4803b;
                    this.f48812e = hVar == null ? new byte[255] : (byte[]) hVar.d(byte[].class, 255);
                }
                b bVar = (b) this.f48818l.f48798e.get(this.f48817k);
                int i12 = this.f48817k - 1;
                b bVar2 = i12 >= 0 ? (b) this.f48818l.f48798e.get(i12) : null;
                int[] iArr = bVar.f48793k;
                if (iArr == null) {
                    iArr = this.f48818l.f48794a;
                }
                this.f48808a = iArr;
                if (iArr == null) {
                    Log.isLoggable("e", 3);
                    this.f48821o = 1;
                    return null;
                }
                if (bVar.f48789f) {
                    System.arraycopy(iArr, 0, this.f48809b, 0, iArr.length);
                    int[] iArr2 = this.f48809b;
                    this.f48808a = iArr2;
                    iArr2[bVar.f48791h] = 0;
                    if (bVar.f48790g == 2 && this.f48817k == 0) {
                        this.f48825s = Boolean.TRUE;
                    }
                }
                return e(bVar, bVar2);
            }
            Log.isLoggable("e", 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        this.f48817k = (this.f48817k + 1) % this.f48818l.f48796c;
    }

    public final Bitmap c() {
        Boolean bool = this.f48825s;
        Bitmap bitmapB = ((b) this.f48810c).f4802a.b(this.f48824r, this.f48823q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f48826t);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    public final void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f48826t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v32, types: [short] */
    /* JADX WARN: Type inference failed for: r5v34 */
    public final Bitmap e(b bVar, b bVar2) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        short s10;
        int i18;
        Bitmap bitmap;
        int i19;
        int[] iArr = this.j;
        a.InterfaceC0562a interfaceC0562a = this.f48810c;
        byte b11 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f48819m;
            if (bitmap2 != null) {
                ((b) interfaceC0562a).f4802a.c(bitmap2);
            }
            this.f48819m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f48790g == 3 && this.f48819m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i18 = bVar2.f48790g) > 0) {
            if (i18 == 2) {
                if (bVar.f48789f) {
                    i19 = 0;
                } else {
                    c cVar = this.f48818l;
                    i19 = cVar.f48803k;
                    if (bVar.f48793k != null && cVar.j == bVar.f48791h) {
                        i19 = 0;
                    }
                }
                int i20 = bVar2.f48787d;
                int i21 = this.f48822p;
                int i22 = i20 / i21;
                int i23 = bVar2.f48785b / i21;
                int i24 = bVar2.f48786c / i21;
                int i25 = bVar2.f48784a / i21;
                int i26 = this.f48824r;
                int i27 = (i23 * i26) + i25;
                int i28 = (i22 * i26) + i27;
                while (i27 < i28) {
                    int i29 = i27 + i24;
                    for (int i30 = i27; i30 < i29; i30++) {
                        iArr[i30] = i19;
                    }
                    i27 += this.f48824r;
                }
            } else if (i18 == 3 && (bitmap = this.f48819m) != null) {
                int i31 = this.f48824r;
                bitmap.getPixels(iArr, 0, i31, 0, 0, i31, this.f48823q);
            }
        }
        this.f48811d.position(bVar.j);
        int i32 = bVar.f48786c * bVar.f48787d;
        byte[] bArr = this.f48816i;
        if (bArr == null || bArr.length < i32) {
            h hVar = ((b) interfaceC0562a).f4803b;
            this.f48816i = hVar == null ? new byte[i32] : (byte[]) hVar.d(byte[].class, i32);
        }
        byte[] bArr2 = this.f48816i;
        if (this.f48813f == null) {
            this.f48813f = new short[4096];
        }
        short[] sArr = this.f48813f;
        if (this.f48814g == null) {
            this.f48814g = new byte[4096];
        }
        byte[] bArr3 = this.f48814g;
        if (this.f48815h == null) {
            this.f48815h = new byte[4097];
        }
        byte[] bArr4 = this.f48815h;
        int i33 = this.f48811d.get() & 255;
        int i34 = 1 << i33;
        int i35 = i34 + 1;
        int i36 = i34 + 2;
        int i37 = i33 + 1;
        int i38 = (1 << i37) - 1;
        for (int i39 = 0; i39 < i34; i39++) {
            sArr[i39] = 0;
            bArr3[i39] = (byte) i39;
        }
        byte[] bArr5 = this.f48812e;
        int i40 = i37;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = i36;
        int i50 = i38;
        int i51 = -1;
        while (true) {
            if (i41 >= i32) {
                b10 = b11;
                break;
            }
            if (i42 == 0) {
                int i52 = this.f48811d.get() & 255;
                if (i52 > 0) {
                    ByteBuffer byteBuffer = this.f48811d;
                    byteBuffer.get(this.f48812e, 0, Math.min(i52, byteBuffer.remaining()));
                }
                if (i52 <= 0) {
                    this.f48821o = 3;
                    b10 = 0;
                    break;
                }
                i42 = i52;
                i43 = 0;
            } else {
                i37 = i37;
                i41 = i41;
            }
            i45 += (bArr5[i43] & 255) << i44;
            i43++;
            i42--;
            i51 = i51;
            int i53 = i44 + 8;
            i49 = i49;
            i40 = i40;
            i41 = i41;
            bArr5 = bArr5;
            i48 = i48;
            while (true) {
                if (i53 < i40) {
                    i44 = i53;
                    b11 = 0;
                    break;
                }
                iArr = iArr;
                int i54 = i45 & i50;
                i45 >>= i40;
                i53 -= i40;
                if (i54 == i34) {
                    i49 = i36;
                    i50 = i38;
                    i40 = i37;
                    i51 = -1;
                } else {
                    if (i54 == i35) {
                        iArr = iArr;
                        i44 = i53;
                        b11 = 0;
                        break;
                    }
                    if (i51 == -1) {
                        bArr2[i46] = bArr3[i54];
                        i46++;
                        i41++;
                        i48 = i54;
                        i51 = i48;
                        i53 = i53;
                    } else {
                        if (i54 >= i49) {
                            bArr4[i47] = (byte) i48;
                            i47++;
                            s10 = i51;
                        } else {
                            s10 = i54;
                        }
                        while (s10 >= i34) {
                            bArr4[i47] = bArr3[s10];
                            i47++;
                            s10 = sArr[s10];
                        }
                        int i55 = bArr3[s10] & 255;
                        byte b12 = (byte) i55;
                        bArr2[i46] = b12;
                        while (true) {
                            i46++;
                            i41++;
                            if (i47 <= 0) {
                                break;
                            }
                            i47--;
                            bArr2[i46] = bArr4[i47];
                        }
                        if (i49 < 4096) {
                            sArr[i49] = (short) i51;
                            bArr3[i49] = b12;
                            i49++;
                            if ((i49 & i50) == 0 && i49 < 4096) {
                                i40++;
                                i50 += i49;
                            }
                        }
                        i51 = i54;
                        i53 = i53;
                        i48 = i55;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i46, i32, b10);
        if (bVar.f48788e || this.f48822p != 1) {
            int[] iArr2 = this.j;
            int i56 = bVar.f48787d;
            int i57 = this.f48822p;
            int i58 = i56 / i57;
            int i59 = bVar.f48785b / i57;
            int i60 = bVar.f48786c / i57;
            int i61 = bVar.f48784a / i57;
            boolean z10 = this.f48817k == 0;
            int i62 = this.f48824r;
            int i63 = this.f48823q;
            byte[] bArr6 = this.f48816i;
            int[] iArr3 = this.f48808a;
            Boolean bool = this.f48825s;
            int i64 = 8;
            int i65 = 0;
            int i66 = 0;
            int i67 = 1;
            while (i65 < i58) {
                Boolean bool2 = bool;
                if (bVar.f48788e) {
                    if (i66 >= i58) {
                        int i68 = i67 + 1;
                        i10 = i58;
                        if (i68 == 2) {
                            i66 = 4;
                        } else if (i68 == 3) {
                            i64 = 4;
                            i67 = i68;
                            i66 = 2;
                        } else if (i68 == 4) {
                            i67 = i68;
                            i66 = 1;
                            i64 = 2;
                        }
                        i67 = i68;
                    } else {
                        i10 = i58;
                    }
                    i11 = i66 + i64;
                } else {
                    i10 = i58;
                    i11 = i66;
                    i66 = i65;
                }
                int i69 = i66 + i59;
                boolean z11 = i57 == 1;
                if (i69 < i63) {
                    int i70 = i69 * i62;
                    int i71 = i70 + i61;
                    int i72 = i71 + i60;
                    int i73 = i70 + i62;
                    if (i73 < i72) {
                        i72 = i73;
                    }
                    int i74 = i65 * i57 * bVar.f48786c;
                    if (z11) {
                        bool = bool2;
                        int i75 = i71;
                        while (i75 < i72) {
                            int i76 = i60;
                            int i77 = iArr3[bArr6[i74] & 255];
                            if (i77 != 0) {
                                iArr2[i75] = i77;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i74 += i57;
                            i75++;
                            i60 = i76;
                        }
                        i12 = i60;
                    } else {
                        i12 = i60;
                        int i78 = ((i72 - i71) * i57) + i74;
                        bool = bool2;
                        int i79 = i71;
                        while (i79 < i72) {
                            int i80 = i72;
                            int i81 = bVar.f48786c;
                            int i82 = i61;
                            int i83 = i62;
                            int i84 = i74;
                            int i85 = 0;
                            int i86 = 0;
                            int i87 = 0;
                            int i88 = 0;
                            int i89 = 0;
                            while (true) {
                                if (i84 >= this.f48822p + i74) {
                                    i16 = i63;
                                    break;
                                }
                                byte[] bArr7 = this.f48816i;
                                i16 = i63;
                                if (i84 >= bArr7.length || i84 >= i78) {
                                    break;
                                }
                                int i90 = this.f48808a[bArr7[i84] & 255];
                                if (i90 != 0) {
                                    i85 += (i90 >> 24) & 255;
                                    i86 += (i90 >> 16) & 255;
                                    i87 += (i90 >> 8) & 255;
                                    i88 += i90 & 255;
                                    i89++;
                                }
                                i84++;
                                i63 = i16;
                            }
                            int i91 = i81 + i74;
                            for (int i92 = i91; i92 < this.f48822p + i91; i92++) {
                                byte[] bArr8 = this.f48816i;
                                if (i92 >= bArr8.length || i92 >= i78) {
                                    break;
                                }
                                int i93 = this.f48808a[bArr8[i92] & 255];
                                if (i93 != 0) {
                                    i85 += (i93 >> 24) & 255;
                                    i86 += (i93 >> 16) & 255;
                                    i87 += (i93 >> 8) & 255;
                                    i88 += i93 & 255;
                                    i89++;
                                }
                            }
                            int i94 = i89 == 0 ? 0 : ((i85 / i89) << 24) | ((i86 / i89) << 16) | ((i87 / i89) << 8) | (i88 / i89);
                            if (i94 != 0) {
                                iArr2[i79] = i94;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i74 += i57;
                            i79++;
                            i72 = i80;
                            i61 = i82;
                            i62 = i83;
                            i63 = i16;
                        }
                    }
                    i13 = i61;
                    i14 = i62;
                    i15 = i63;
                } else {
                    i12 = i60;
                    i13 = i61;
                    i14 = i62;
                    i15 = i63;
                    bool = bool2;
                }
                i65++;
                i58 = i10;
                i66 = i11;
                i59 = i59;
                i60 = i12;
                i61 = i13;
                i62 = i14;
                i63 = i15;
            }
            Boolean bool3 = bool;
            if (this.f48825s == null) {
                this.f48825s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr4 = this.j;
            int i95 = bVar.f48787d;
            int i96 = bVar.f48785b;
            int i97 = bVar.f48786c;
            int i98 = bVar.f48784a;
            byte b13 = this.f48817k == 0 ? (byte) 1 : b10;
            int i99 = this.f48824r;
            byte[] bArr9 = this.f48816i;
            int[] iArr5 = this.f48808a;
            byte b14 = -1;
            for (int i100 = b10; i100 < i95; i100++) {
                int i101 = (i100 + i96) * i99;
                int i102 = i101 + i98;
                int i103 = i102 + i97;
                int i104 = i101 + i99;
                if (i104 < i103) {
                    i103 = i104;
                }
                int i105 = bVar.f48786c * i100;
                while (i102 < i103) {
                    int i106 = i95;
                    byte b15 = bArr9[i105];
                    int i107 = i96;
                    int i108 = b15 & 255;
                    if (i108 != b14) {
                        int i109 = iArr5[i108];
                        if (i109 != 0) {
                            iArr4[i102] = i109;
                        } else {
                            b14 = b15;
                        }
                    }
                    i105++;
                    i102++;
                    i95 = i106;
                    i96 = i107;
                }
            }
            Boolean bool4 = this.f48825s;
            this.f48825s = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || !(this.f48825s != null || b13 == 0 || b14 == -1));
        }
        if (this.f48820n && ((i17 = bVar.f48790g) == 0 || i17 == 1)) {
            if (this.f48819m == null) {
                this.f48819m = c();
            }
            Bitmap bitmap3 = this.f48819m;
            int i110 = this.f48824r;
            bitmap3.setPixels(iArr, 0, i110, 0, 0, i110, this.f48823q);
        }
        Bitmap bitmapC = c();
        int i111 = this.f48824r;
        bitmapC.setPixels(iArr, 0, i111, 0, 0, i111, this.f48823q);
        return bitmapC;
    }
}
