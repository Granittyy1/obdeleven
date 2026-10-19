package p085g9;

import B8.E0;
import J4.i;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.parse.ParseFile;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p255u9.h;

/* JADX INFO: compiled from: GaugeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityC1347l f35644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35645c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f35647e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f35643a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35646d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f35648f = new ArrayList();

    /* JADX INFO: compiled from: GaugeAdapter.java */
    public class a extends RecyclerView.B implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f35649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProgressBar f35650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f35651d;

        public a(View view) {
            super(view);
            this.f35649b = (ImageView) view.findViewById(R.id.itemGauge_image);
            this.f35650c = (ProgressBar) view.findViewById(R.id.itemGauge_progress);
            this.f35651d = (TextView) view.findViewById(R.id.itemGauge_name);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            j jVar = c.this.f35647e;
            if (jVar == null || adapterPosition == -1) {
                return;
            }
            jVar.onItemClick(null, this.itemView, adapterPosition, getItemId());
        }
    }

    public c(ActivityC1347l activityC1347l, int i10) {
        this.f35644b = activityC1347l;
        this.f35645c = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f35643a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        View view = aVar.itemView;
        String strB = i.b(i10, "gaugeListImageTransition_");
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.v(view, strB);
        aVar.f35650c.setVisibility(0);
        h hVar = (h) this.f35643a.get(i10);
        ParseFile parseFile = hVar.getParseFile("picture");
        String url = parseFile != null ? parseFile.getUrl() : "";
        ImageView imageView = aVar.f35649b;
        imageView.setVisibility(0);
        d<Drawable> dVarM = b.d(imageView).m(url);
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.gauge_default)).f(R.drawable.gauge_default).j(R.drawable.gauge_default);
        kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
        d<Drawable> dVarA = dVarM.a(dVarJ);
        dVarA.y(new p085g9.a(aVar));
        dVarA.x(imageView);
        aVar.f35651d.setText(hVar.getString("name"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f35644b).inflate(R.layout.item_gauge, viewGroup, false);
        viewInflate.getLayoutParams().height = this.f35645c;
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        a aVar = (a) b10;
        synchronized (this) {
            try {
                if (this.f35646d) {
                    long size = ((long) this.f35648f.size()) * 25;
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f35644b, android.R.anim.slide_in_left);
                    animationLoadAnimation.setStartOffset(size);
                    animationLoadAnimation.setAnimationListener(new b(this, aVar));
                    this.f35648f.add(aVar.itemView);
                    aVar.itemView.startAnimation(animationLoadAnimation);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.B b10) {
        a aVar = (a) b10;
        this.f35648f.remove(aVar.itemView);
        aVar.itemView.clearAnimation();
    }
}
