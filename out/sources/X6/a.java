package X6;

import W6.n;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.voltasit.obdeleven.R;
import java.util.HashMap;

/* JADX INFO: compiled from: BannerBindingWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FiamFrameLayout f7325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f7326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f7327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ResizableImageView f7328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f7329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public U6.c f7330i;

    @Override // X6.c
    public final n a() {
        return this.f7335b;
    }

    @Override // X6.c
    public final View b() {
        return this.f7326e;
    }

    @Override // X6.c
    public final View.OnClickListener c() {
        return this.f7330i;
    }

    @Override // X6.c
    public final ImageView d() {
        return this.f7328g;
    }

    @Override // X6.c
    public final ViewGroup e() {
        return this.f7325d;
    }

    @Override // X6.c
    public final ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, U6.c cVar) {
        View viewInflate = this.f7336c.inflate(R.layout.banner, (ViewGroup) null);
        this.f7325d = (FiamFrameLayout) viewInflate.findViewById(R.id.banner_root);
        this.f7326e = (ViewGroup) viewInflate.findViewById(R.id.banner_content_root);
        this.f7327f = (TextView) viewInflate.findViewById(R.id.banner_body);
        this.f7328g = (ResizableImageView) viewInflate.findViewById(R.id.banner_image);
        this.f7329h = (TextView) viewInflate.findViewById(R.id.banner_title);
        p083g7.h hVar = this.f7334a;
        if (hVar.f35627a.equals(MessageType.BANNER)) {
            p083g7.c cVar2 = (p083g7.c) hVar;
            String str = cVar2.f35615h;
            if (!TextUtils.isEmpty(str)) {
                c.g(this.f7326e, str);
            }
            ResizableImageView resizableImageView = this.f7328g;
            p083g7.f fVar = cVar2.f35613f;
            resizableImageView.setVisibility((fVar == null || TextUtils.isEmpty(fVar.f35624a)) ? 8 : 0);
            p083g7.n nVar = cVar2.f35611d;
            if (nVar != null) {
                String str2 = nVar.f35636a;
                if (!TextUtils.isEmpty(str2)) {
                    this.f7329h.setText(str2);
                }
                String str3 = nVar.f35637b;
                if (!TextUtils.isEmpty(str3)) {
                    this.f7329h.setTextColor(Color.parseColor(str3));
                }
            }
            p083g7.n nVar2 = cVar2.f35612e;
            if (nVar2 != null) {
                String str4 = nVar2.f35636a;
                if (!TextUtils.isEmpty(str4)) {
                    this.f7327f.setText(str4);
                }
                String str5 = nVar2.f35637b;
                if (!TextUtils.isEmpty(str5)) {
                    this.f7327f.setTextColor(Color.parseColor(str5));
                }
            }
            n nVar3 = this.f7335b;
            int iMin = Math.min(nVar3.f7029d.intValue(), nVar3.f7028c.intValue());
            ViewGroup.LayoutParams layoutParams = this.f7325d.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.width = iMin;
            this.f7325d.setLayoutParams(layoutParams);
            this.f7328g.setMaxHeight(nVar3.a());
            this.f7328g.setMaxWidth(nVar3.b());
            this.f7330i = cVar;
            this.f7325d.setDismissListener(cVar);
            this.f7326e.setOnClickListener((View.OnClickListener) map.get(cVar2.f35614g));
        }
        return null;
    }
}
