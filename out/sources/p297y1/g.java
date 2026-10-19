package p297y1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;
import java.util.Locale;
import p114j1.A;
import p114j1.k;

/* JADX INFO: compiled from: PlaceholderSurface.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f48106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f48107f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f48109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48110d;

    /* JADX INFO: compiled from: PlaceholderSurface.java */
    public static class a extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.media3.common.util.a f48111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f48112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Error f48113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public RuntimeException f48114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g f48115f;

        public final void a(int i10) throws GlUtil.GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.f48111b.getClass();
            androidx.media3.common.util.a aVar = this.f48111b;
            aVar.getClass();
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.b("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr = new int[2];
            GlUtil.b("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
            aVar.f17899d = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, androidx.media3.common.util.a.f17896h, 0, eGLConfigArr, 0, 1, iArr2, 0);
            boolean z10 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
            int i11 = A.f40996a;
            GlUtil.b(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(aVar.f17899d, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            GlUtil.b("eglCreateContext failed", eGLContextEglCreateContext != null);
            aVar.f17900e = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = aVar.f17899d;
            if (i10 == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.b("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            GlUtil.b("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            aVar.f17901f = eGLSurfaceEglCreatePbufferSurface;
            int[] iArr3 = aVar.f17898c;
            GLES20.glGenTextures(1, iArr3, 0);
            GlUtil.a();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            aVar.f17902g = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(aVar);
            SurfaceTexture surfaceTexture2 = this.f48111b.f17902g;
            surfaceTexture2.getClass();
            this.f48115f = new g(this, surfaceTexture2, i10 != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            this.f48111b.getClass();
            androidx.media3.common.util.a aVar = this.f48111b;
            aVar.f17897b.removeCallbacks(aVar);
            try {
                SurfaceTexture surfaceTexture = aVar.f17902g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, aVar.f17898c, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = aVar.f17899d;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = aVar.f17899d;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = aVar.f17901f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(aVar.f17899d, aVar.f17901f);
                }
                EGLContext eGLContext = aVar.f17900e;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(aVar.f17899d, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = aVar.f17899d;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(aVar.f17899d);
                }
                aVar.f17899d = null;
                aVar.f17900e = null;
                aVar.f17901f = null;
                aVar.f17902g = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } catch (Throwable th) {
                        try {
                            k.d("PlaceholderSurface", "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e10) {
                    k.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f48114e = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    k.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f48113d = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    k.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f48114e = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public g(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f48109c = aVar;
        this.f48108b = z10;
    }

    public static synchronized boolean a(Context context) {
        String strEglQueryString;
        int i10;
        try {
            if (!f48107f) {
                int i11 = A.f40996a;
                if (i11 >= 24 && ((i11 >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i10 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i10 = 0;
                }
                f48106e = i10;
                f48107f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f48106e != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f48109c) {
            try {
                if (!this.f48110d) {
                    a aVar = this.f48109c;
                    aVar.f48112c.getClass();
                    aVar.f48112c.sendEmptyMessage(2);
                    this.f48110d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
