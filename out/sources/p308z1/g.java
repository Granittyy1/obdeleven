package p308z1;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.b;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: ProjectionRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f48726i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f48727k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f48729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f48730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48735h;

    /* JADX INFO: compiled from: ProjectionRenderer.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f48737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FloatBuffer f48738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48739d;

        public a(e.b bVar) {
            float[] fArr = bVar.f48724c;
            this.f48736a = fArr.length / 3;
            this.f48737b = GlUtil.c(fArr);
            this.f48738c = GlUtil.c(bVar.f48725d);
            int i10 = bVar.f48723b;
            if (i10 == 1) {
                this.f48739d = 5;
            } else if (i10 != 2) {
                this.f48739d = 4;
            } else {
                this.f48739d = 6;
            }
        }
    }

    public static boolean b(e eVar) {
        e.b[] bVarArr = eVar.f48717a.f48721a;
        if (bVarArr.length != 1 || bVarArr[0].f48722a != 0) {
            return false;
        }
        e.b[] bVarArr2 = eVar.f48718b.f48721a;
        return bVarArr2.length == 1 && bVarArr2[0].f48722a == 0;
    }

    public final void a() {
        try {
            b bVar = new b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f48730c = bVar;
            this.f48731d = GLES20.glGetUniformLocation(bVar.f17903a, "uMvpMatrix");
            this.f48732e = GLES20.glGetUniformLocation(this.f48730c.f17903a, "uTexMatrix");
            this.f48733f = this.f48730c.b("aPosition");
            this.f48734g = this.f48730c.b("aTexCoords");
            this.f48735h = GLES20.glGetUniformLocation(this.f48730c.f17903a, "uTexture");
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
