package p308z1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.RunnableC1240q;
import androidx.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p114j1.k;
import p114j1.v;
import p297y1.n;
import p297y1.w;

/* JADX INFO: compiled from: SphericalGLSurfaceView.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends GLSurfaceView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f48753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SensorManager f48754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sensor f48755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f48756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f48757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f48758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SurfaceTexture f48759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Surface f48760i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f48761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f48762l;

    /* JADX INFO: compiled from: SphericalGLSurfaceView.java */
    public final class a implements GLSurfaceView.Renderer, d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f48763b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float[] f48766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float[] f48767f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float[] f48768g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f48769h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f48770i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f48764c = new float[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f48765d = new float[16];
        public final float[] j = new float[16];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float[] f48771k = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f48766e = fArr;
            float[] fArr2 = new float[16];
            this.f48767f = fArr2;
            float[] fArr3 = new float[16];
            this.f48768g = fArr3;
            this.f48763b = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f48770i = 3.1415927f;
        }

        @Override // z1.d.a
        public final synchronized void a(float f10, float[] fArr) {
            float[] fArr2 = this.f48766e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f11 = -f10;
            this.f48770i = f11;
            Matrix.setRotateM(this.f48767f, 0, -this.f48769h, (float) Math.cos(f11), (float) Math.sin(this.f48770i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Long lD;
            synchronized (this) {
                Matrix.multiplyMM(this.f48771k, 0, this.f48766e, 0, this.f48768g, 0);
                Matrix.multiplyMM(this.j, 0, this.f48767f, 0, this.f48771k, 0);
            }
            Matrix.multiplyMM(this.f48765d, 0, this.f48764c, 0, this.j, 0);
            i iVar = this.f48763b;
            float[] fArr2 = this.f48765d;
            GLES20.glClear(16384);
            try {
                GlUtil.a();
            } catch (GlUtil.GlException e10) {
                k.d("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (iVar.f48741b.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = iVar.f48749k;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    GlUtil.a();
                } catch (GlUtil.GlException e11) {
                    k.d("SceneRenderer", "Failed to draw a frame", e11);
                }
                if (iVar.f48742c.compareAndSet(true, false)) {
                    Matrix.setIdentityM(iVar.f48747h, 0);
                }
                long timestamp = iVar.f48749k.getTimestamp();
                v<Long> vVar = iVar.f48745f;
                synchronized (vVar) {
                    lD = vVar.d(timestamp, false);
                }
                Long l10 = lD;
                if (l10 != null) {
                    c cVar = iVar.f48744e;
                    float[] fArr3 = iVar.f48747h;
                    float[] fArrF = cVar.f48708c.f(l10.longValue());
                    if (fArrF != null) {
                        float f10 = fArrF[0];
                        float f11 = -fArrF[1];
                        float f12 = -fArrF[2];
                        float length = Matrix.length(f10, f11, f12);
                        float[] fArr4 = cVar.f48707b;
                        if (length != 0.0f) {
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
                        } else {
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!cVar.f48709d) {
                            c.a(cVar.f48706a, cVar.f48707b);
                            cVar.f48709d = true;
                        }
                        Matrix.multiplyMM(fArr3, 0, cVar.f48706a, 0, cVar.f48707b, 0);
                    }
                }
                e eVarF = iVar.f48746g.f(timestamp);
                if (eVarF != null) {
                    g gVar = iVar.f48743d;
                    gVar.getClass();
                    if (g.b(eVarF)) {
                        gVar.f48728a = eVarF.f48719c;
                        gVar.f48729b = new g.a(eVarF.f48717a.f48721a[0]);
                        if (!eVarF.f48720d) {
                            e.b bVar = eVarF.f48718b.f48721a[0];
                            float[] fArr5 = bVar.f48724c;
                            int length2 = fArr5.length;
                            GlUtil.c(fArr5);
                            GlUtil.c(bVar.f48725d);
                        }
                    }
                }
            }
            Matrix.multiplyMM(iVar.f48748i, 0, fArr2, 0, iVar.f48747h, 0);
            g gVar2 = iVar.f48743d;
            int i10 = iVar.j;
            float[] fArr6 = iVar.f48748i;
            g.a aVar = gVar2.f48729b;
            if (aVar == null) {
                return;
            }
            int i11 = gVar2.f48728a;
            if (i11 == 1) {
                fArr = g.j;
            } else {
                fArr = i11 == 2 ? g.f48727k : g.f48726i;
            }
            GLES20.glUniformMatrix3fv(gVar2.f48732e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(gVar2.f48731d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(gVar2.f48735h, 0);
            try {
                GlUtil.a();
            } catch (GlUtil.GlException e12) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
            }
            GLES20.glVertexAttribPointer(gVar2.f48733f, 3, 5126, false, 12, (Buffer) aVar.f48737b);
            try {
                GlUtil.a();
            } catch (GlUtil.GlException e13) {
                Log.e("ProjectionRenderer", "Failed to load position data", e13);
            }
            GLES20.glVertexAttribPointer(gVar2.f48734g, 2, 5126, false, 8, (Buffer) aVar.f48738c);
            try {
                GlUtil.a();
            } catch (GlUtil.GlException e14) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e14);
            }
            GLES20.glDrawArrays(aVar.f48739d, 0, aVar.f48736a);
            try {
                GlUtil.a();
            } catch (GlUtil.GlException e15) {
                Log.e("ProjectionRenderer", "Failed to render", e15);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f48764c, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            j jVar = j.this;
            jVar.f48757f.post(new w(jVar, 1, this.f48763b.a()));
        }
    }

    /* JADX INFO: compiled from: SphericalGLSurfaceView.java */
    public interface b {
        void b();

        void c(Surface surface);
    }

    public j(Context context) {
        super(context, null);
        this.f48753b = new CopyOnWriteArrayList<>();
        this.f48757f = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f48754c = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f48755d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f48758g = iVar;
        a aVar = new a(iVar);
        View.OnTouchListener kVar = new k(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f48756e = new d(windowManager.getDefaultDisplay(), kVar, aVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(kVar);
    }

    public final void a() {
        boolean z10 = this.j && this.f48761k;
        Sensor sensor = this.f48755d;
        if (sensor == null || z10 == this.f48762l) {
            return;
        }
        d dVar = this.f48756e;
        SensorManager sensorManager = this.f48754c;
        if (z10) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.f48762l = z10;
    }

    public p308z1.a getCameraMotionListener() {
        return this.f48758g;
    }

    public n getVideoFrameMetadataListener() {
        return this.f48758g;
    }

    public Surface getVideoSurface() {
        return this.f48760i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48757f.post(new RunnableC1240q(6, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f48761k = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f48761k = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f48758g.f48750l = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.j = z10;
        a();
    }
}
