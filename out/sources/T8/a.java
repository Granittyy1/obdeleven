package T8;

import T3.c;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.presentation.components.coverLayout.MainCoverLayout;
import kotlin.jvm.internal.i;
import p255u9.E;

/* JADX INFO: compiled from: MainCoverLayout.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainCoverLayout f6049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f6050b;

    public a(MainCoverLayout mainCoverLayout, E e10) {
        this.f6049a = mainCoverLayout;
        this.f6050b = e10;
    }

    @Override // T3.c
    public final void b(Object obj) {
        E e10 = this.f6050b;
        MainCoverLayout mainCoverLayout = this.f6049a;
        mainCoverLayout.setupCarDescription(e10);
        ShapeableImageView shapeableImageView = mainCoverLayout.f31376c;
        i.b(shapeableImageView);
        shapeableImageView.setVisibility(8);
    }

    @Override // T3.c
    public final void c(GlideException glideException) {
        MainCoverLayout mainCoverLayout = this.f6049a;
        mainCoverLayout.setupCarDescription(this.f6050b);
        ShapeableImageView shapeableImageView = mainCoverLayout.f31376c;
        i.b(shapeableImageView);
        shapeableImageView.setVisibility(8);
    }
}
