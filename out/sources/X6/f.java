package X6;

import W6.n;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.voltasit.obdeleven.R;
import java.util.HashMap;

/* JADX INFO: compiled from: ImageBindingWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FiamFrameLayout f7351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f7352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f7353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f7354g;

    @Override // X6.c
    public final View b() {
        return this.f7352e;
    }

    @Override // X6.c
    public final ImageView d() {
        return this.f7353f;
    }

    @Override // X6.c
    public final ViewGroup e() {
        return this.f7351d;
    }

    @Override // X6.c
    public final ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, U6.c cVar) {
        View viewInflate = this.f7336c.inflate(R.layout.image, (ViewGroup) null);
        this.f7351d = (FiamFrameLayout) viewInflate.findViewById(R.id.image_root);
        this.f7352e = (ViewGroup) viewInflate.findViewById(R.id.image_content_root);
        this.f7353f = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f7354g = (Button) viewInflate.findViewById(R.id.collapse_button);
        ImageView imageView = this.f7353f;
        n nVar = this.f7335b;
        imageView.setMaxHeight(nVar.a());
        this.f7353f.setMaxWidth(nVar.b());
        p083g7.h hVar = this.f7334a;
        if (hVar.f35627a.equals(MessageType.IMAGE_ONLY)) {
            p083g7.g gVar = (p083g7.g) hVar;
            ImageView imageView2 = this.f7353f;
            p083g7.f fVar = gVar.f35625d;
            imageView2.setVisibility((fVar == null || TextUtils.isEmpty(fVar.f35624a)) ? 8 : 0);
            this.f7353f.setOnClickListener((View.OnClickListener) map.get(gVar.f35626e));
        }
        this.f7351d.setDismissListener(cVar);
        this.f7354g.setOnClickListener(cVar);
        return null;
    }
}
