package io.intercom.android.sdk.lightcompressor.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: OutputSurface.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OutputSurface implements SurfaceTexture.OnFrameAvailableListener {
    private boolean mFrameAvailable;
    private final Object mFrameSyncObject = new Object();
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private TextureRenderer mTextureRender;

    public OutputSurface() {
        setup();
    }

    private final void setup() {
        TextureRenderer textureRenderer = new TextureRenderer();
        this.mTextureRender = textureRenderer;
        textureRenderer.surfaceCreated();
        SurfaceTexture surfaceTexture = new SurfaceTexture(textureRenderer.getTextureId());
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mSurfaceTexture);
    }

    public final void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            while (!this.mFrameAvailable) {
                try {
                    this.mFrameSyncObject.wait(100);
                    if (!this.mFrameAvailable) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            this.mFrameAvailable = false;
            r rVar = r.f47939a;
        }
        TextureRenderer textureRenderer = this.mTextureRender;
        if (textureRenderer != null) {
            textureRenderer.checkGlError("before updateTexImage");
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final void drawImage() {
        TextureRenderer textureRenderer = this.mTextureRender;
        if (textureRenderer != null) {
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            i.b(surfaceTexture);
            textureRenderer.drawFrame(surfaceTexture);
        }
    }

    public final Surface getSurface() {
        return this.mSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            if (this.mFrameAvailable) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.mFrameAvailable = true;
            this.mFrameSyncObject.notifyAll();
            r rVar = r.f47939a;
        }
    }

    public final void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }
}
