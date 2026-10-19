package p097h9;

import B8.E0;
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
import com.parse.ParseFile;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import com.voltasit.obdeleven.interfaces.SimpleAnimationListener;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p255u9.i;

/* JADX INFO: compiled from: ManualAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityC1347l f36183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f36185d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<i> f36182a = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36186e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f36187f = new ArrayList();

    /* JADX INFO: compiled from: ManualAdapter.java */
    public class a extends RecyclerView.B implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f36188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProgressBar f36189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f36190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f36191e;

        public a(View view) {
            super(view);
            this.f36188b = (ImageView) view.findViewById(R.id.itemManual_image);
            this.f36189c = (ProgressBar) view.findViewById(R.id.itemManual_progress);
            this.f36190d = (TextView) view.findViewById(R.id.itemManual_name);
            this.f36191e = (ImageView) view.findViewById(R.id.manualListItem_flag);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            x xVar = d.this.f36185d;
            if (xVar == null || adapterPosition == -1) {
                return;
            }
            xVar.onItemClick(null, this.itemView, adapterPosition, getItemId());
        }
    }

    public d(ActivityC1347l activityC1347l, int i10) {
        this.f36183b = activityC1347l;
        this.f36184c = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f36182a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        View view = aVar.itemView;
        String strB = J4.i.b(i10, "manualListImageTransition_");
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.v(view, strB);
        i iVar = this.f36182a.get(i10);
        aVar.f36189c.setVisibility(0);
        TextView textView = aVar.f36190d;
        textView.setVisibility(0);
        ImageView imageView = aVar.f36191e;
        imageView.setVisibility(0);
        ParseFile parseFile = iVar.getParseFile("picture");
        String url = parseFile != null ? parseFile.getUrl() : "";
        ImageView imageView2 = aVar.f36188b;
        imageView2.setVisibility(0);
        com.bumptech.glide.d<Drawable> dVarM = b.d(imageView2).m(url);
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.manual_default)).f(R.drawable.manual_default).j(R.drawable.manual_default);
        kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
        com.bumptech.glide.d<Drawable> dVarA = dVarM.a(dVarJ);
        dVarA.y(new c(aVar));
        dVarA.x(imageView2);
        textView.setText(iVar.getString("name"));
        String strA = iVar.a();
        for (ApplicationLanguage applicationLanguage : ApplicationLanguage.values()) {
            if (applicationLanguage.c().equals(strA)) {
                imageView.setImageResource(applicationLanguage.d());
            }
        }
        applicationLanguage = ApplicationLanguage.f30004b;
        imageView.setImageResource(applicationLanguage.d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f36183b).inflate(R.layout.manuallist_item, viewGroup, false);
        viewInflate.getLayoutParams().height = this.f36184c;
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        final a aVar = (a) b10;
        if (this.f36186e) {
            ArrayList arrayList = this.f36187f;
            long size = ((long) arrayList.size()) * 25;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f36183b, android.R.anim.slide_in_left);
            animationLoadAnimation.setStartOffset(size);
            animationLoadAnimation.setAnimationListener(new SimpleAnimationListener() { // from class: h9.a
                @Override // com.voltasit.obdeleven.interfaces.SimpleAnimationListener
                public final void a(SimpleAnimationListener.AnimationState animationState) {
                    SimpleAnimationListener.AnimationState animationState2 = SimpleAnimationListener.AnimationState.f31115c;
                    d dVar = this.f36178a;
                    if (animationState == animationState2) {
                        dVar.f36187f.remove(aVar.itemView);
                    } else {
                        dVar.getClass();
                    }
                }
            });
            arrayList.add(aVar.itemView);
            aVar.itemView.startAnimation(animationLoadAnimation);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.B b10) {
        a aVar = (a) b10;
        this.f36187f.remove(aVar.itemView);
        aVar.itemView.clearAnimation();
    }
}
