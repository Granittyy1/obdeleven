package p308z1;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p114j1.k;
import p114j1.r;
import p114j1.v;
import p297y1.n;

/* JADX INFO: compiled from: SceneRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements n, a {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f48749k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f48752n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f48741b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f48742c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f48743d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f48744e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v<Long> f48745f = new v<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v<e> f48746g = new v<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f48747h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f48748i = new float[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f48750l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48751m = -1;

    public final SurfaceTexture a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.a();
            this.f48743d.a();
            GlUtil.a();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.a();
            int i10 = iArr[0];
            GLES20.glBindTexture(36197, i10);
            GlUtil.a();
            GLES20.glTexParameteri(36197, 10240, 9729);
            GlUtil.a();
            GLES20.glTexParameteri(36197, 10241, 9729);
            GlUtil.a();
            GLES20.glTexParameteri(36197, 10242, 33071);
            GlUtil.a();
            GLES20.glTexParameteri(36197, 10243, 33071);
            GlUtil.a();
            this.j = i10;
        } catch (GlUtil.GlException e10) {
            k.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.j);
        this.f48749k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: z1.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f48740b.f48741b.set(true);
            }
        });
        return this.f48749k;
    }

    @Override // p308z1.a
    public final void c(long j, float[] fArr) {
        this.f48744e.f48708c.a(fArr, j);
    }

    @Override // p308z1.a
    public final void e() {
        this.f48745f.b();
        c cVar = this.f48744e;
        cVar.f48708c.b();
        cVar.f48709d = false;
        this.f48742c.set(true);
    }

    @Override // p297y1.n
    public final void g(long j, long j10, p078g1.n nVar, MediaFormat mediaFormat) {
        int i10;
        int i11;
        ArrayList<e.a> arrayListA;
        this.f48745f.a(Long.valueOf(j), j10);
        byte[] bArr = nVar.f35314z;
        int i12 = nVar.f35276A;
        byte[] bArr2 = this.f48752n;
        int i13 = this.f48751m;
        this.f48752n = bArr;
        if (i12 == -1) {
            i12 = this.f48750l;
        }
        this.f48751m = i12;
        if (i13 == i12 && Arrays.equals(bArr2, this.f48752n)) {
            return;
        }
        byte[] bArr3 = this.f48752n;
        e eVar = null;
        if (bArr3 != null) {
            int i14 = this.f48751m;
            r rVar = new r(bArr3);
            try {
                rVar.H(4);
                int iH = rVar.h();
                rVar.G(0);
                if (iH == 1886547818) {
                    rVar.H(8);
                    int i15 = rVar.f41063b;
                    int i16 = rVar.f41064c;
                    while (true) {
                        if (i15 < i16) {
                            int iH2 = rVar.h() + i15;
                            if (iH2 > i15 && iH2 <= i16) {
                                int iH3 = rVar.h();
                                if (iH3 != 2037673328 && iH3 != 1836279920) {
                                    rVar.G(iH2);
                                    i15 = iH2;
                                }
                                rVar.F(iH2);
                                arrayListA = f.a(rVar);
                            }
                        }
                        arrayListA = null;
                    }
                } else {
                    arrayListA = f.a(rVar);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    e.a aVar = arrayListA.get(0);
                    eVar = new e(aVar, aVar, i14);
                } else if (size == 2) {
                    eVar = new e(arrayListA.get(0), arrayListA.get(1), i14);
                }
            }
        }
        if (eVar == null || !g.b(eVar)) {
            int i17 = this.f48751m;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f10 = radians / 36;
            float f11 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 36; i18 < i21; i21 = 36) {
                float f12 = radians / 2.0f;
                float f13 = (i18 * f10) - f12;
                int i22 = i18 + 1;
                float f14 = (i22 * f10) - f12;
                int i23 = 0;
                while (i23 < 73) {
                    float f15 = f14;
                    int i24 = i22;
                    float f16 = f13;
                    int i25 = i19;
                    int i26 = i20;
                    int i27 = 2;
                    int i28 = 0;
                    while (i28 < i27) {
                        float f17 = i23 * f11;
                        float f18 = f11;
                        int i29 = i23;
                        double d10 = 50.0f;
                        int i30 = i17;
                        double d11 = (3.1415927f + f17) - (radians2 / 2.0f);
                        float f19 = radians;
                        double d12 = i28 == 0 ? f16 : f15;
                        int i31 = i28;
                        float f20 = f10;
                        fArr[i25] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                        float[] fArr3 = fArr2;
                        int i32 = i18;
                        fArr[i25 + 1] = (float) (Math.sin(d12) * d10);
                        int i33 = i25 + 3;
                        fArr[i25 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                        fArr3[i26] = f17 / radians2;
                        int i34 = i26 + 2;
                        fArr3[i26 + 1] = ((i32 + i31) * f20) / f19;
                        if (i29 == 0 && i31 == 0) {
                            i11 = i31;
                            i10 = i29;
                        } else {
                            i10 = i29;
                            if (i10 == 72) {
                                i11 = i31;
                                if (i11 == 1) {
                                }
                                int i35 = i11 + 1;
                                i23 = i10;
                                fArr2 = fArr3;
                                f11 = f18;
                                i17 = i30;
                                radians = f19;
                                i18 = i32;
                                f10 = f20;
                                i28 = i35;
                            } else {
                                i11 = i31;
                            }
                            i27 = 2;
                            i26 = i34;
                            i25 = i33;
                            int i36 = i11 + 1;
                            i23 = i10;
                            fArr2 = fArr3;
                            f11 = f18;
                            i17 = i30;
                            radians = f19;
                            i18 = i32;
                            f10 = f20;
                            i28 = i36;
                        }
                        System.arraycopy(fArr, i25, fArr, i33, 3);
                        i25 += 6;
                        fArr3 = fArr3;
                        i27 = 2;
                        System.arraycopy(fArr3, i26, fArr3, i34, 2);
                        i26 += 4;
                        int i37 = i11 + 1;
                        i23 = i10;
                        fArr2 = fArr3;
                        f11 = f18;
                        i17 = i30;
                        radians = f19;
                        i18 = i32;
                        f10 = f20;
                        i28 = i37;
                    }
                    i23++;
                    i19 = i25;
                    i20 = i26;
                    f14 = f15;
                    i22 = i24;
                    f13 = f16;
                    i17 = i17;
                }
                i18 = i22;
            }
            e.a aVar2 = new e.a(new e.b(0, 1, fArr, fArr2));
            eVar = new e(aVar2, aVar2, i17);
        }
        this.f48746g.a(eVar, j10);
    }
}
