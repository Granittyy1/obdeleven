package com.voltas.crop;

import com.voltas.crop.CropImageActivity.a;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: CropImageActivity.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f29613b;

    /* JADX INFO: compiled from: CropImageActivity.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f29614b;

        public a(CountDownLatch countDownLatch) {
            this.f29614b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (bVar.f29613b.f29576o.getScale() == 1.0f) {
                bVar.f29613b.f29576o.a();
            }
            this.f29614b.countDown();
        }
    }

    public b(CropImageActivity cropImageActivity) {
        this.f29613b = cropImageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CropImageActivity cropImageActivity = this.f29613b;
        cropImageActivity.f29565c.post(new a(countDownLatch));
        try {
            countDownLatch.await();
            cropImageActivity.f29565c.post(new c(cropImageActivity.new a()));
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
