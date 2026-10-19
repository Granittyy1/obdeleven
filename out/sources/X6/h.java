package X6;

import W6.n;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.voltasit.obdeleven.R;
import java.util.HashMap;

/* JADX INFO: compiled from: ModalBindingWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FiamRelativeLayout f7358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f7359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScrollView f7360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f7361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f7362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f7363i;
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f7364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p083g7.i f7365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f7366m;

    /* JADX INFO: compiled from: ModalBindingWrapper.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            h.this.f7363i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    @Override // X6.c
    public final n a() {
        return this.f7335b;
    }

    @Override // X6.c
    public final View b() {
        return this.f7359e;
    }

    @Override // X6.c
    public final ImageView d() {
        return this.f7363i;
    }

    @Override // X6.c
    public final ViewGroup e() {
        return this.f7358d;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00df  */
    @Override // X6.c
    public final ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, U6.c cVar) {
        p083g7.d dVar;
        View viewInflate = this.f7336c.inflate(R.layout.modal, (ViewGroup) null);
        this.f7360f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f7361g = (Button) viewInflate.findViewById(R.id.button);
        this.f7362h = viewInflate.findViewById(R.id.collapse_button);
        this.f7363i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.f7364k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f7358d = (FiamRelativeLayout) viewInflate.findViewById(R.id.modal_root);
        this.f7359e = (ViewGroup) viewInflate.findViewById(R.id.modal_content_root);
        p083g7.h hVar = this.f7334a;
        if (hVar.f35627a.equals(MessageType.MODAL)) {
            p083g7.i iVar = (p083g7.i) hVar;
            this.f7365l = iVar;
            p083g7.f fVar = iVar.f35632f;
            if (fVar == null || TextUtils.isEmpty(fVar.f35624a)) {
                this.f7363i.setVisibility(8);
            } else {
                this.f7363i.setVisibility(0);
            }
            p083g7.n nVar = iVar.f35630d;
            if (nVar != null) {
                String str = nVar.f35636a;
                if (TextUtils.isEmpty(str)) {
                    this.f7364k.setVisibility(8);
                } else {
                    this.f7364k.setVisibility(0);
                    this.f7364k.setText(str);
                }
                String str2 = nVar.f35637b;
                if (!TextUtils.isEmpty(str2)) {
                    this.f7364k.setTextColor(Color.parseColor(str2));
                }
            }
            p083g7.n nVar2 = iVar.f35631e;
            if (nVar2 != null) {
                String str3 = nVar2.f35636a;
                if (TextUtils.isEmpty(str3)) {
                    this.f7360f.setVisibility(8);
                    this.j.setVisibility(8);
                } else {
                    this.f7360f.setVisibility(0);
                    this.j.setVisibility(0);
                    this.j.setTextColor(Color.parseColor(nVar2.f35637b));
                    this.j.setText(str3);
                }
            } else {
                this.f7360f.setVisibility(8);
                this.j.setVisibility(8);
            }
            p083g7.a aVar = this.f7365l.f35633g;
            if (aVar == null || (dVar = aVar.f35605b) == null || TextUtils.isEmpty(dVar.f35616a.f35636a)) {
                this.f7361g.setVisibility(8);
            } else {
                c.h(this.f7361g, dVar);
                Button button = this.f7361g;
                View.OnClickListener onClickListener = (View.OnClickListener) map.get(this.f7365l.f35633g);
                if (button != null) {
                    button.setOnClickListener(onClickListener);
                }
                this.f7361g.setVisibility(0);
            }
            ImageView imageView = this.f7363i;
            n nVar3 = this.f7335b;
            imageView.setMaxHeight(nVar3.a());
            this.f7363i.setMaxWidth(nVar3.b());
            this.f7362h.setOnClickListener(cVar);
            this.f7358d.setDismissListener(cVar);
            c.g(this.f7359e, this.f7365l.f35634h);
        }
        return this.f7366m;
    }
}
