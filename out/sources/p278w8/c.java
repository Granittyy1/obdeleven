package p278w8;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import com.voltas.crop.CropImageActivity;
import com.voltas.crop.d;
import com.voltasit.obdeleven.domain.usecases.device.u;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import p131k5.RunnableC2545o;

/* JADX INFO: compiled from: CropImageActivity.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f47795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f47796c;

    public c(CropImageActivity cropImageActivity, Bitmap bitmap) {
        this.f47796c = cropImageActivity;
        this.f47795b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        CropImageActivity cropImageActivity = this.f47796c;
        Uri uri = cropImageActivity.f29572k;
        Bitmap bitmap = this.f47795b;
        if (uri != null) {
            OutputStream outputStreamOpenOutputStream = null;
            try {
                try {
                    outputStreamOpenOutputStream = cropImageActivity.getContentResolver().openOutputStream(cropImageActivity.f29572k);
                    if (outputStreamOpenOutputStream != null) {
                        bitmap.compress(cropImageActivity.f29571i ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 90, outputStreamOpenOutputStream);
                    }
                } catch (IOException e10) {
                    cropImageActivity.c(e10);
                    u.h("Cannot open file: " + cropImageActivity.f29572k, e10);
                }
                d.a(outputStreamOpenOutputStream);
                File fileB = d.b(cropImageActivity, cropImageActivity.getContentResolver(), cropImageActivity.j);
                File fileB2 = d.b(cropImageActivity, cropImageActivity.getContentResolver(), cropImageActivity.f29572k);
                if (fileB != null && fileB2 != null) {
                    try {
                        ExifInterface exifInterface = new ExifInterface(fileB.getAbsolutePath());
                        ExifInterface exifInterface2 = new ExifInterface(fileB2.getAbsolutePath());
                        exifInterface2.setAttribute("Orientation", exifInterface.getAttribute("Orientation"));
                        exifInterface2.saveAttributes();
                    } catch (IOException e11) {
                        u.h("Error copying Exif data", e11);
                    }
                }
                cropImageActivity.setResult(-1, new Intent().putExtra("output", cropImageActivity.f29572k));
            } catch (Throwable th) {
                d.a(outputStreamOpenOutputStream);
                throw th;
            }
        }
        cropImageActivity.f29565c.post(new RunnableC2545o(cropImageActivity, 3, bitmap));
        cropImageActivity.finish();
    }
}
