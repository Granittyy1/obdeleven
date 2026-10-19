package p128k2;

import I4.q;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41484b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f41483a = i10;
        this.f41484b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f41483a) {
            case 0:
                androidx.media3.ui.c cVar = (androidx.media3.ui.c) this.f41484b;
                cVar.getClass();
                int i18 = i13 - i11;
                int i19 = i17 - i15;
                if (i12 - i10 != i16 - i14 || i18 != i19) {
                    PopupWindow popupWindow = cVar.f18967l;
                    if (popupWindow.isShowing()) {
                        cVar.q();
                        int width = cVar.getWidth() - popupWindow.getWidth();
                        int i20 = cVar.f18968m;
                        popupWindow.update(view, width - i20, (-popupWindow.getHeight()) - i20, -1, -1);
                    }
                }
                break;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f41484b;
                carouselLayoutManager.getClass();
                if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
                    view.post(new q(3, carouselLayoutManager));
                }
                break;
        }
    }
}
