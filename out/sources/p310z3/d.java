package p310z3;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: GifHeaderParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f48805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f48806c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f48804a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48807d = 0;

    public final boolean a() {
        return this.f48806c.f48795b != 0;
    }

    public final c b() {
        byte[] bArr;
        if (this.f48805b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f48806c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f48806c.f48799f = this.f48805b.getShort();
            this.f48806c.f48800g = this.f48805b.getShort();
            int iC = c();
            c cVar = this.f48806c;
            cVar.f48801h = (iC & 128) != 0;
            cVar.f48802i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f48806c.j = c();
            c cVar2 = this.f48806c;
            c();
            cVar2.getClass();
            if (this.f48806c.f48801h && !a()) {
                c cVar3 = this.f48806c;
                cVar3.f48794a = e(cVar3.f48802i);
                c cVar4 = this.f48806c;
                cVar4.f48803k = cVar4.f48794a[cVar4.j];
            }
        } else {
            this.f48806c.f48795b = 1;
        }
        if (!a()) {
            boolean z10 = false;
            while (!z10 && !a() && this.f48806c.f48796c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f48806c.f48797d = new b();
                        c();
                        int iC4 = c();
                        b bVar = this.f48806c.f48797d;
                        int i11 = (iC4 & 28) >> 2;
                        bVar.f48790g = i11;
                        if (i11 == 0) {
                            bVar.f48790g = 1;
                        }
                        bVar.f48789f = (iC4 & 1) != 0;
                        short s10 = this.f48805b.getShort();
                        if (s10 < 2) {
                            s10 = 10;
                        }
                        b bVar2 = this.f48806c.f48797d;
                        bVar2.f48792i = s10 * 10;
                        bVar2.f48791h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i12 = 0;
                        while (true) {
                            bArr = this.f48804a;
                            if (i12 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i12]);
                            i12++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b10 = bArr[1];
                                    byte b11 = bArr[2];
                                    this.f48806c.getClass();
                                }
                                if (this.f48807d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    c cVar5 = this.f48806c;
                    if (cVar5.f48797d == null) {
                        cVar5.f48797d = new b();
                    }
                    this.f48806c.f48797d.f48784a = this.f48805b.getShort();
                    this.f48806c.f48797d.f48785b = this.f48805b.getShort();
                    this.f48806c.f48797d.f48786c = this.f48805b.getShort();
                    this.f48806c.f48797d.f48787d = this.f48805b.getShort();
                    int iC5 = c();
                    boolean z11 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    b bVar3 = this.f48806c.f48797d;
                    bVar3.f48788e = (iC5 & 64) != 0;
                    if (z11) {
                        bVar3.f48793k = e(iPow);
                    } else {
                        bVar3.f48793k = null;
                    }
                    this.f48806c.f48797d.j = this.f48805b.position();
                    c();
                    f();
                    if (!a()) {
                        c cVar6 = this.f48806c;
                        cVar6.f48796c++;
                        cVar6.f48798e.add(cVar6.f48797d);
                    }
                } else if (iC2 != 59) {
                    this.f48806c.f48795b = 1;
                } else {
                    z10 = true;
                }
            }
            c cVar7 = this.f48806c;
            if (cVar7.f48796c < 0) {
                cVar7.f48795b = 1;
            }
        }
        return this.f48806c;
    }

    public final int c() {
        try {
            return this.f48805b.get() & 255;
        } catch (Exception unused) {
            this.f48806c.f48795b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f48807d = iC;
        if (iC <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f48807d;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f48805b.get(this.f48804a, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f48806c.f48795b = 1;
                return;
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f48805b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f48806c.f48795b = 1;
        }
        return iArr;
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f48805b.position(Math.min(this.f48805b.position() + iC, this.f48805b.limit()));
        } while (iC > 0);
    }
}
