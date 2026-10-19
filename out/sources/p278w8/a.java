package p278w8;

import android.view.View;
import com.voltas.crop.CropImageActivity;

/* JADX INFO: compiled from: CropImageActivity.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f47793b;

    public a(CropImageActivity cropImageActivity) {
        this.f47793b = cropImageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CropImageActivity cropImageActivity = this.f47793b;
        cropImageActivity.setResult(0);
        cropImageActivity.finish();
    }
}
