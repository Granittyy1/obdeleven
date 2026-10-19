package coil.compose;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: ImageRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements p004a3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncImagePainter f22766b;

    public e(AsyncImagePainter asyncImagePainter) {
        this.f22766b = asyncImagePainter;
    }

    @Override // p004a3.b
    public final void onStart(Drawable drawable) {
        AsyncImagePainter asyncImagePainter = this.f22766b;
        asyncImagePainter.k(new AsyncImagePainter.a.c(drawable != null ? asyncImagePainter.j(drawable) : null));
    }

    @Override // p004a3.b
    public final void onError(Drawable drawable) {
    }

    @Override // p004a3.b
    public final void onSuccess(Drawable drawable) {
    }
}
