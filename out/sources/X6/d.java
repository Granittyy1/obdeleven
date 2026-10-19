package X6;

import W6.n;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import com.voltasit.obdeleven.R;
import java.util.HashMap;

/* JADX INFO: compiled from: CardBindingWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FiamCardView f7337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p008a7.a f7338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScrollView f7339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f7340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f7341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f7342i;
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f7343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p083g7.e f7344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public U6.c f7345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f7346n;

    /* JADX INFO: compiled from: CardBindingWrapper.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            d.this.f7342i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    @Override // X6.c
    public final n a() {
        return this.f7335b;
    }

    @Override // X6.c
    public final View b() {
        return this.f7338e;
    }

    @Override // X6.c
    public final View.OnClickListener c() {
        return this.f7345m;
    }

    @Override // X6.c
    public final ImageView d() {
        return this.f7342i;
    }

    @Override // X6.c
    public final ViewGroup e() {
        return this.f7337d;
    }

    @Override // X6.c
    public final ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, U6.c cVar) {
        p083g7.d dVar;
        String str;
        View viewInflate = this.f7336c.inflate(R.layout.card, (ViewGroup) null);
        this.f7339f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f7340g = (Button) viewInflate.findViewById(R.id.primary_button);
        this.f7341h = (Button) viewInflate.findViewById(R.id.secondary_button);
        this.f7342i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.f7343k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f7337d = (FiamCardView) viewInflate.findViewById(R.id.card_root);
        this.f7338e = (p008a7.a) viewInflate.findViewById(R.id.card_content_root);
        p083g7.h hVar = this.f7334a;
        if (hVar.f35627a.equals(MessageType.CARD)) {
            p083g7.e eVar = (p083g7.e) hVar;
            this.f7344l = eVar;
            TextView textView = this.f7343k;
            p083g7.n nVar = eVar.f35618d;
            textView.setText(nVar.f35636a);
            this.f7343k.setTextColor(Color.parseColor(nVar.f35637b));
            p083g7.n nVar2 = eVar.f35619e;
            if (nVar2 == null || (str = nVar2.f35636a) == null) {
                this.f7339f.setVisibility(8);
                this.j.setVisibility(8);
            } else {
                this.f7339f.setVisibility(0);
                this.j.setVisibility(0);
                this.j.setText(str);
                this.j.setTextColor(Color.parseColor(nVar2.f35637b));
            }
            p083g7.e eVar2 = this.f7344l;
            if (eVar2.f35623i == null && eVar2.j == null) {
                this.f7342i.setVisibility(8);
            } else {
                this.f7342i.setVisibility(0);
            }
            p083g7.e eVar3 = this.f7344l;
            p083g7.a aVar = eVar3.f35621g;
            c.h(this.f7340g, aVar.f35605b);
            Button button = this.f7340g;
            View.OnClickListener onClickListener = (View.OnClickListener) map.get(aVar);
            if (button != null) {
                button.setOnClickListener(onClickListener);
            }
            this.f7340g.setVisibility(0);
            p083g7.a aVar2 = eVar3.f35622h;
            if (aVar2 == null || (dVar = aVar2.f35605b) == null) {
                this.f7341h.setVisibility(8);
            } else {
                c.h(this.f7341h, dVar);
                Button button2 = this.f7341h;
                View.OnClickListener onClickListener2 = (View.OnClickListener) map.get(aVar2);
                if (button2 != null) {
                    button2.setOnClickListener(onClickListener2);
                }
                this.f7341h.setVisibility(0);
            }
            ImageView imageView = this.f7342i;
            n nVar3 = this.f7335b;
            imageView.setMaxHeight(nVar3.a());
            this.f7342i.setMaxWidth(nVar3.b());
            this.f7345m = cVar;
            this.f7337d.setDismissListener(cVar);
            c.g(this.f7338e, this.f7344l.f35620f);
        }
        return this.f7346n;
    }
}
