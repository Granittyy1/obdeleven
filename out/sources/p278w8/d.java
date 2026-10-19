package p278w8;

import com.voltas.crop.CropImageView;

/* JADX INFO: compiled from: ImageViewTouchBase.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f47797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f47798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f47799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f47800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f47801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CropImageView f47802g;

    public d(CropImageView cropImageView, long j, float f10, float f11, float f12, float f13) {
        this.f47802g = cropImageView;
        this.f47797b = j;
        this.f47798c = f10;
        this.f47799d = f11;
        this.f47800e = f12;
        this.f47801f = f13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float fMin = Math.min(300.0f, System.currentTimeMillis() - this.f47797b);
        float f10 = (this.f47799d * fMin) + this.f47798c;
        CropImageView cropImageView = this.f47802g;
        cropImageView.f(f10, this.f47800e, this.f47801f);
        if (fMin < 300.0f) {
            cropImageView.f29631k.post(this);
        }
    }
}
