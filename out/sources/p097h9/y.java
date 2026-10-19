package p097h9;

import U3.c;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import p255u9.j;

/* JADX INFO: compiled from: ManualStepAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends c<Bitmap> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.b f36254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f36255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f36256g;

    public y(z.b bVar, j jVar, boolean z10) {
        this.f36254e = bVar;
        this.f36255f = jVar;
        this.f36256g = z10;
    }

    @Override // U3.g
    public final void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        z.b bVar = this.f36254e;
        if (bVar.itemView.getTag() != this.f36255f.getParseFile("picture")) {
            return;
        }
        if (this.f36256g) {
            ShapeableImageView shapeableImageView = bVar.f36263c;
            shapeableImageView.setImageBitmap(bitmap);
            shapeableImageView.setVisibility(0);
        } else {
            ImageView imageView = bVar.f36262b;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
        bVar.f36264d.setVisibility(8);
    }

    @Override // U3.c, U3.g
    public final void h(Drawable drawable) {
        z.b bVar = this.f36254e;
        if (bVar.itemView.getTag() != this.f36255f.getParseFile("picture")) {
            return;
        }
        bVar.f36264d.setVisibility(8);
    }

    @Override // U3.g
    public final void j(Drawable drawable) {
    }
}
