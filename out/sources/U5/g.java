package U5;

import android.view.View;
import com.braze.models.cards.ShortNewsCard;
import com.braze.ui.widget.ShortNewsCardView;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6516d;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f6514b = i10;
        this.f6515c = obj;
        this.f6516d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f6516d;
        Object obj2 = this.f6515c;
        switch (this.f6514b) {
            case 0:
                int[] iArr = Snackbar.f27427E;
                Snackbar snackbar = (Snackbar) obj2;
                snackbar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                snackbar.b(1);
                break;
            default:
                ((ShortNewsCardView) obj2).lambda$onSetCard$0((ShortNewsCard) obj, view);
                break;
        }
    }
}
