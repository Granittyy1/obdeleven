package androidx.media3.common.util;

import android.opengl.GLES20;
import java.util.HashMap;

/* JADX INFO: compiled from: GlProgram.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f17904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0184b[] f17905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f17906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f17907e;

    /* JADX INFO: compiled from: GlProgram.java */
    public static final class a {
    }

    /* JADX INFO: renamed from: androidx.media3.common.util.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GlProgram.java */
    public static final class C0184b {
    }

    public b(String str, String str2) throws GlUtil.GlException {
        byte[] bArr;
        byte[] bArr2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f17903a = iGlCreateProgram;
        GlUtil.a();
        a(str, iGlCreateProgram, 35633);
        a(str2, iGlCreateProgram, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int i10 = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i11 = 1;
        GlUtil.b("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f17906d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f17904b = new a[iArr2[0]];
        int i12 = 0;
        while (i12 < iArr2[0]) {
            int i13 = this.f17903a;
            int[] iArr3 = new int[i11];
            GLES20.glGetProgramiv(i13, 35722, iArr3, 0);
            int i14 = iArr3[0];
            byte[] bArr3 = new byte[i14];
            GLES20.glGetActiveAttrib(i13, i12, i14, new int[i11], 0, new int[i11], 0, new int[i11], 0, bArr3, 0);
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    bArr2 = bArr3;
                    i15 = i14;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i15] == 0) {
                        break;
                    }
                    i15++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i15);
            GLES20.glGetAttribLocation(i13, str3);
            a aVar = new a();
            this.f17904b[i12] = aVar;
            this.f17906d.put(str3, aVar);
            i12++;
            i11 = 1;
        }
        this.f17907e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f17903a, 35718, iArr4, 0);
        this.f17905c = new C0184b[iArr4[0]];
        for (int i16 = 0; i16 < iArr4[i10]; i16++) {
            int i17 = this.f17903a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i17, 35719, iArr5, i10);
            int i18 = iArr5[i10];
            byte[] bArr4 = new byte[i18];
            GLES20.glGetActiveUniform(i17, i16, i18, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    bArr = bArr4;
                    i19 = i18;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i19] == 0) {
                        break;
                    }
                    i19++;
                    bArr4 = bArr;
                }
            }
            i10 = 0;
            String str4 = new String(bArr, 0, i19);
            GLES20.glGetUniformLocation(i17, str4);
            C0184b c0184b = new C0184b();
            this.f17905c[i16] = c0184b;
            this.f17907e.put(str4, c0184b);
        }
        GlUtil.a();
    }

    public static void a(String str, int i10, int i11) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.b(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.a();
    }

    public final int b(String str) throws GlUtil.GlException {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f17903a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GlUtil.a();
        return iGlGetAttribLocation;
    }
}
