package com.voltasit.obdeleven.utils.bluetooth;

import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Task;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: DeviceBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n implements IDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IDevice.State f34366a = IDevice.State.f29313b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public G8.l f34371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.obdeleven.service.core.d f34372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34374i;
    public final byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34375k;

    public n(String str) {
        Task.forResult(null);
        this.f34373h = false;
        this.f34374i = false;
        this.j = new byte[20480];
        this.f34375k = 0;
        this.f34367b = str;
    }

    public final void a(com.obdeleven.service.core.d dVar) {
        String str = dVar.f29244c;
        this.f34372g = dVar;
        int length = str.length() / 2;
        byte[] bArrCopyOf = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArrCopyOf[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
        }
        if (length == 0) {
            return;
        }
        if (dVar.c()) {
            k(bArrCopyOf, true);
        } else {
            if (dVar.f29245d) {
                int i12 = length + 1;
                byte[] bArr = new byte[i12];
                System.arraycopy(bArrCopyOf, 0, bArr, 1, length);
                int iNextInt = new Random().nextInt(128) | 128;
                bArr[0] = (byte) iNextInt;
                for (int i13 = 1; i13 < i12; i13++) {
                    bArr[i13] = (byte) (bArr[i13] ^ iNextInt);
                    iNextInt = ((iNextInt >> 1) | (iNextInt << 7)) & 255;
                }
                bArrCopyOf = bArr;
            }
            int i14 = 0;
            for (byte b10 : bArrCopyOf) {
                for (int i15 = 0; i15 < 8; i15++) {
                    boolean z10 = ((b10 >> (7 - i15)) & 1) == 1;
                    boolean z11 = ((i14 >> 15) & 1) == 1;
                    i14 <<= 1;
                    if (z10 ^ z11) {
                        i14 ^= 4129;
                    }
                }
                i14 &= 65535;
            }
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + 2);
            bArrCopyOf[bArrCopyOf.length - 2] = (byte) i14;
            bArrCopyOf[bArrCopyOf.length - 1] = (byte) (i14 >> 8);
            k(bArrCopyOf, false);
        }
        String str2 = "DEVICE_WRITE(" + com.obdeleven.service.util.b.a(bArrCopyOf) + ")";
        Q3.d dVar2 = O.e.f4722b;
        if (dVar2 != null) {
            dVar2.E(3, "DeviceBase", str2);
        }
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final String b() {
        return this.f34369d;
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final void d(G8.l lVar) {
        this.f34371f = lVar;
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final G8.l e() {
        return this.f34371f;
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final String f() {
        return this.f34367b;
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final String getVersion() {
        return this.f34368c;
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final String i() {
        return this.f34370e;
    }

    public final void j(int i10, byte[] bArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = bArr[i11];
            if (this.f34373h) {
                l(new byte[]{b10});
            } else {
                boolean z10 = this.f34374i;
                byte[] bArr2 = this.j;
                if (!z10 && b10 == 4) {
                    l(Arrays.copyOf(bArr2, this.f34375k));
                } else if (!z10 && b10 == 5) {
                    this.f34374i = true;
                } else if (z10 || b10 != 15) {
                    this.f34374i = false;
                    int i12 = this.f34375k;
                    this.f34375k = i12 + 1;
                    bArr2[i12] = b10;
                } else {
                    this.f34375k = 0;
                }
            }
        }
    }

    public void k(byte[] bArr, boolean z10) {
        this.f34373h = z10;
        if (!z10) {
            if (bArr.length == 0) {
                return;
            }
            W7.c.f7065c.b((byte) 15);
            for (byte b10 : bArr) {
                if (b10 == 4 || b10 == 5 || b10 == 15) {
                    W7.c.f7065c.b((byte) 5);
                }
                W7.c.f7065c.b(b10);
            }
            W7.c.f7065c.b((byte) 4);
            W7.c.f7065c.c();
            return;
        }
        g gVar = W7.c.f7065c;
        gVar.f34345i = false;
        synchronized (gVar) {
            if (gVar.f34340d != 2) {
                return;
            }
            g.b bVar = gVar.f34339c;
            p293xa.r rVar = p293xa.r.f47939a;
            kotlin.jvm.internal.i.b(bVar);
            try {
                OutputStream outputStream = bVar.f34351d;
                kotlin.jvm.internal.i.b(outputStream);
                outputStream.write(bArr);
            } catch (IOException e10) {
                bVar.a();
                bVar.f34353f.d(true, e10);
            }
        }
    }

    public final void l(byte[] bArr) {
        if (this.f34372g == null) {
            return;
        }
        String str = "DEVICE_READ(" + com.obdeleven.service.util.b.a(bArr) + ")";
        Q3.d dVar = O.e.f4722b;
        if (dVar != null) {
            dVar.E(3, "DeviceBase", str);
        }
        if (!this.f34372g.c()) {
            if (bArr.length < 3) {
                return;
            }
            bArr = Arrays.copyOf(bArr, bArr.length - 2);
            if (!this.f34372g.b()) {
                byte b10 = bArr[0];
                if ((b10 & 128) != 0) {
                    int i10 = b10 & 255;
                    for (int i11 = 1; i11 < bArr.length; i11++) {
                        bArr[i11] = (byte) (bArr[i11] ^ i10);
                        i10 = ((i10 >> 1) & 255) | (i10 << 7);
                    }
                    int length = bArr.length - 1;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 1, bArr2, 0, length);
                    bArr = bArr2;
                }
            }
        }
        com.obdeleven.service.util.b.a(bArr);
        this.f34372g.d(bArr);
    }

    public final void m(boolean z10) {
        if (z10) {
            W7.c.f7066d = this;
        } else {
            W7.c.f7066d = null;
        }
    }

    public abstract Task<Void> n(float f10);
}
